/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package java.lang;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

/**
 * Implementing this interface allows an object to be the target of
 * the "for-each loop" statement. See
 * <strong>
 * <a href="{@docRoot}/../technotes/guides/language/foreach.html">For-each Loop</a>
 * </strong>
 *
 * @param <T> the type of elements returned by the iterator
 *
 * @since 1.5
 * @jls 14.14.2 The enhanced for statement
 */
public interface Iterable<T> {
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    Iterator<T> iterator();

    /**
     * performs the given action for each element of the {@code iterable}
     * until all elements have been processed or the action throws an
     * exception.  unless otherwise specified by the implementing class,
     * actions are performed in the order of iteration (if an iteration order
     * is specified).  exceptions thrown by the action are relayed to the
     * caller.
     *
     * @implspec
     * <p>the default implementation behaves as if:
     * <pre>{@code
     *     for (t t : this)
     *         action.accept(t);
     * }</pre>
     *
     * @param action the action to be performed for each element
     * @throws nullpointerexception if the specified action is null
     * @since 1.8
     */
    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }

    /**
     * Creates a {@link Spliterator} over the elements described by this
     * {@code Iterable}.
     *
     * @implSpec
     * The default implementation creates an
     * <em><a href="Spliterator.html#binding">early-binding</a></em>
     * spliterator from the iterable's {@code Iterator}.  The spliterator
     * inherits the <em>fail-fast</em> properties of the iterable's iterator.
     *
     * @implNote
     * The default implementation should usually be overridden.  The
     * spliterator returned by the default implementation has poor splitting
     * capabilities, is unsized, and does not report any spliterator
     * characteristics. Implementing classes can nearly always provide a
     * better implementation.
     *
     * @return a {@code Spliterator} over the elements described by this
     * {@code Iterable}.
     * @since 1.8
     */
    default Spliterator<T> spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }
}
