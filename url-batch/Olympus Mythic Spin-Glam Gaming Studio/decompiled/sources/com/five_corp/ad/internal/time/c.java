package com.five_corp.ad.internal.time;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class c {
    public final a b;
    public b f;
    public final Object e = new Object();
    public boolean g = false;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final long c = System.currentTimeMillis() + 10000;
    public final long d = 1000;

    public c(a aVar, b bVar) {
        this.b = aVar;
        this.f = bVar;
    }

    public final void a() {
        long j = this.c;
        this.b.getClass();
        if (j >= System.currentTimeMillis()) {
            synchronized (this.e) {
                try {
                    if (this.f == null) {
                        return;
                    }
                    c();
                    return;
                } finally {
                }
            }
        }
        synchronized (this.e) {
            try {
                b bVar = this.f;
                if (bVar == null) {
                    return;
                }
                this.f = null;
                this.g = true;
                bVar.a();
            } finally {
            }
        }
    }

    public final boolean b() {
        synchronized (this.e) {
            try {
                if (this.g) {
                    return false;
                }
                this.f = null;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.a.postDelayed(new Runnable() { // from class: com.five_corp.ad.internal.time.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.this.a();
            }
        }, this.d);
    }
}
