package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class AbstractSequentialIterator extends UnmodifiableIterator {
    private Object nextOrNull;

    protected abstract Object computeNext(Object obj);

    protected AbstractSequentialIterator(Object obj) {
        this.nextOrNull = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.nextOrNull;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.nextOrNull = computeNext(obj);
        return obj;
    }
}
