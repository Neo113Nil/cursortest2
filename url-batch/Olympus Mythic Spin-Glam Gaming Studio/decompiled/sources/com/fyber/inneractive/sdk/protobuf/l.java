package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class l implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ s c;

    public l(s sVar) {
        this.c = sVar;
        this.b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return Byte.valueOf(this.c.d(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
