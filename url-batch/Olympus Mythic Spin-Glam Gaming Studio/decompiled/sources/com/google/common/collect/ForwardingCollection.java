package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class ForwardingCollection extends ForwardingObject implements Collection {
    @Override // com.google.common.collect.ForwardingObject
    protected abstract Collection delegate();

    protected ForwardingCollection() {
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return delegate().iterator();
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        return delegate().add(obj);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        return delegate().addAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return delegate().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    protected boolean standardContainsAll(Collection<?> collection) {
        return Collections2.containsAllImpl(this, collection);
    }

    protected boolean standardAddAll(Collection<Object> collection) {
        return Iterators.addAll(this, collection.iterator());
    }

    protected boolean standardRetainAll(Collection<?> collection) {
        return Iterators.retainAll(iterator(), collection);
    }

    protected void standardClear() {
        Iterators.clear(iterator());
    }

    protected boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    protected String standardToString() {
        return Collections2.toStringImpl(this);
    }

    protected Object[] standardToArray() {
        return toArray(new Object[size()]);
    }

    protected <T> T[] standardToArray(T[] tArr) {
        return (T[]) ObjectArrays.toArrayImpl(this, tArr);
    }
}
