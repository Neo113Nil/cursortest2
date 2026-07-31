package sg.bigo.ads.bx;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class a {
    private static final AtomicInteger a = new AtomicInteger();

    public static int a() {
        return a.incrementAndGet();
    }

    public static void a(int i) {
        a.set(i);
    }
}
