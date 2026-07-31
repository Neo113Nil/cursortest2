package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public final class f {
    public static final f b = new f();
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    public f() {
        for (int i = 0; i < 2; i++) {
            this.a.offer(ByteBuffer.allocateDirect(16384));
        }
    }
}
