package com.my.target;

import android.os.SystemClock;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class k2 {
    private boolean a = false;
    private int b = 0;
    private long c = 0;

    public synchronized void a() {
        this.b++;
    }

    public synchronized void b() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            c();
        }
    }

    public synchronized void c() {
        this.a = false;
        this.c = SystemClock.elapsedRealtime() + 800;
    }

    public synchronized boolean d() {
        return this.b > 0;
    }

    public synchronized boolean e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.a && elapsedRealtime >= this.c) {
            this.a = true;
            return true;
        }
        return false;
    }
}
