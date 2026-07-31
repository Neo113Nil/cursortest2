package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5475l0 {
    public C5204ad a;
    public long b;
    public boolean c;
    public final Ll d;

    public C5475l0(String str, long j, Ll ll) {
        this.b = j;
        try {
            this.a = new C5204ad(str);
        } catch (Throwable unused) {
            this.a = new C5204ad();
        }
        this.d = ll;
    }

    public final synchronized void a(Pair pair) {
        if (this.d.b(this.a, (String) pair.first, (String) pair.second)) {
            this.c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.a.size() + ". Is changed " + this.c + ". Current revision " + this.b;
    }

    public final synchronized C5449k0 a() {
        try {
            if (this.c) {
                this.b++;
                this.c = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new C5449k0(Cb.b(this.a), this.b);
    }
}
