package com.fyber.inneractive.sdk.config;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class q0 implements Iterable {
    public final LinkedList a = new LinkedList();
    public boolean b = true;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
