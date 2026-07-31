package com.my.tracker.obfuscated;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class w2 {
    final Handler a = m.a;
    final AtomicBoolean b;
    final Runnable c;
    final long d;

    private w2(long j, final Runnable runnable) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.b = atomicBoolean;
        this.d = j;
        this.c = new Runnable() { // from class: com.my.tracker.obfuscated.w2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                w2.this.a(runnable);
            }
        };
        atomicBoolean.set(false);
    }

    public static w2 a(long j, Runnable runnable) {
        return new w2(j, runnable);
    }

    private void c() {
        this.a.removeCallbacks(this.c);
        this.b.set(true);
        this.a.postDelayed(this.c, this.d);
    }

    public boolean b() {
        boolean z;
        synchronized (this.b) {
            z = !this.b.get();
        }
        return z;
    }

    public void d() {
        synchronized (this.b) {
            try {
                if (a()) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.b) {
            try {
                if (this.b.get()) {
                    return;
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        synchronized (this.b) {
            this.b.set(false);
            this.a.removeCallbacks(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        synchronized (this.b) {
            try {
                if (this.b.get()) {
                    c();
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = !b();
        }
        return z;
    }
}
