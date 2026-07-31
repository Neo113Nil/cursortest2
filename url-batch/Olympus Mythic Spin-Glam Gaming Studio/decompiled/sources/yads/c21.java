package yads;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class c21 {
    public static final AtomicLong a = new AtomicLong();

    public static final long a() {
        return a.getAndIncrement();
    }
}
