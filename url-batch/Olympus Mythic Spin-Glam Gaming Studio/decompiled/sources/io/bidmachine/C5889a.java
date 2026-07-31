package io.bidmachine;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.bidmachine.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C5889a extends ThreadPoolExecutor {
    private static volatile C5889a a;

    C5889a(int i) {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static C5889a a() {
        if (a == null) {
            synchronized (C5889a.class) {
                try {
                    if (a == null) {
                        a = new C5889a(Runtime.getRuntime().availableProcessors() * 2);
                    }
                } finally {
                }
            }
        }
        return a;
    }
}
