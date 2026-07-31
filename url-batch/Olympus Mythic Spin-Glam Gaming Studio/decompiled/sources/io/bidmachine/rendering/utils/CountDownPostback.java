package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class CountDownPostback implements Runnable {
    private final Runnable a;
    private final AtomicInteger b;

    public CountDownPostback(int i, @NonNull Runnable runnable) {
        this.a = runnable;
        this.b = new AtomicInteger(i);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.b.decrementAndGet() > 0) {
            return;
        }
        this.a.run();
    }
}
