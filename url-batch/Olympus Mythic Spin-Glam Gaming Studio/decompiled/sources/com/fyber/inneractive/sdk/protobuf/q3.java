package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class q3 implements Iterator {
    public final Iterator a;

    public q3(r3 r3Var) {
        this.a = r3Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
