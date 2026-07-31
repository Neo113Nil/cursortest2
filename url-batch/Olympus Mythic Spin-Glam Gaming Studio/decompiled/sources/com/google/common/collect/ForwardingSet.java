package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class ForwardingSet extends ForwardingCollection implements Set {
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract Set delegate();

    protected ForwardingSet() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    protected boolean standardRemoveAll(Collection<?> collection) {
        return Sets.removeAllImpl(this, (Collection) Preconditions.checkNotNull(collection));
    }

    protected boolean standardEquals(Object obj) {
        return Sets.equalsImpl(this, obj);
    }

    protected int standardHashCode() {
        return Sets.hashCodeImpl(this);
    }
}
