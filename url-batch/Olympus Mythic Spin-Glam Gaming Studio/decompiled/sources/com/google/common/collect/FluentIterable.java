package com.google.common.collect;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class FluentIterable implements Iterable {
    private final Optional iterableDelegate = Optional.absent();

    protected FluentIterable() {
    }

    private Iterable getDelegate() {
        return (Iterable) this.iterableDelegate.or((Optional) this);
    }

    public static FluentIterable concat(Iterable iterable, Iterable iterable2) {
        return concatNoDefensiveCopy(iterable, iterable2);
    }

    private static FluentIterable concatNoDefensiveCopy(final Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            Preconditions.checkNotNull(iterable);
        }
        return new FluentIterable() { // from class: com.google.common.collect.FluentIterable.3
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return Iterators.concat(new AbstractIndexedListIterator(iterableArr.length) { // from class: com.google.common.collect.FluentIterable.3.1
                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public Iterator get(int i) {
                        return iterableArr[i].iterator();
                    }
                });
            }
        };
    }

    public String toString() {
        return Iterables.toString(getDelegate());
    }
}
