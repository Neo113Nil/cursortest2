package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class k extends PriorityQueue {
    public final int a;

    public k(int i) {
        super(1, new l());
        this.a = i;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean add = super.add((k) gVar);
        if (super.size() > this.a) {
            poll();
        }
        return add;
    }
}
