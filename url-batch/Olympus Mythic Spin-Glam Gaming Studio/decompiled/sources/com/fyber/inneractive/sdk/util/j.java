package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public final class j {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final i b;

    public j(int i, i iVar) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(iVar.a());
        }
        this.b = iVar;
    }
}
