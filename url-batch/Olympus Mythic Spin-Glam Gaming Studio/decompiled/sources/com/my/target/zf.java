package com.my.target;

import android.os.Handler;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class zf implements Closeable {
    public static final zf e = new zf(o0.g, 1000);
    private final Handler a;
    public final int b;
    private final WeakHashMap c = new WeakHashMap();
    private final Runnable d = new Runnable() { // from class: com.my.target.zf$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            zf.this.c();
        }
    };

    private zf(Handler handler, int i) {
        this.a = handler;
        this.b = i;
    }

    public static zf a(int i) {
        return new zf(o0.g, i);
    }

    public void b(Runnable runnable) {
        synchronized (this) {
            try {
                this.c.remove(runnable);
                if (this.c.size() == 0) {
                    this.a.removeCallbacks(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void c() {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList(this.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                if (this.c.keySet().size() > 0) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.clear();
        this.a.removeCallbacks(this.d);
    }

    public static zf a(Handler handler, int i) {
        return new zf(handler, i);
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            try {
                int size = this.c.size();
                if (this.c.put(runnable, Boolean.TRUE) == null && size == 0) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b() {
        this.a.postDelayed(this.d, this.b);
    }
}
