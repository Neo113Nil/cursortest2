package yads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public abstract class mv1 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        if (a.compareAndSet(false, true)) {
            ab1.b("Yandex Mobile Ads 8.1.0 initialized successfully", new Object[0]);
        }
    }
}
