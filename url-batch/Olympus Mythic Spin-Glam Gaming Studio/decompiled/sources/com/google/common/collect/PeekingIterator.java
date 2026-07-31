package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes3.dex */
public interface PeekingIterator extends Iterator {
    @Override // java.util.Iterator
    Object next();

    Object peek();
}
