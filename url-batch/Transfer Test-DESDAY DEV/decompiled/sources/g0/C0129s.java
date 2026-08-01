package g0;

import android.view.View;

/* renamed from: g0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129s {

    /* renamed from: a, reason: collision with root package name */
    public U.g f2536a;

    /* renamed from: b, reason: collision with root package name */
    public int f2537b;

    /* renamed from: c, reason: collision with root package name */
    public int f2538c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2539e;

    public C0129s() {
        d();
    }

    public final void a() {
        this.f2538c = this.d ? this.f2536a.g() : this.f2536a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2538c = this.f2536a.m() + this.f2536a.b(view);
        } else {
            this.f2538c = this.f2536a.e(view);
        }
        this.f2537b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2536a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2537b = i;
        if (!this.d) {
            int e2 = this.f2536a.e(view);
            int k2 = e2 - this.f2536a.k();
            this.f2538c = e2;
            if (k2 > 0) {
                int g2 = (this.f2536a.g() - Math.min(0, (this.f2536a.g() - m2) - this.f2536a.b(view))) - (this.f2536a.c(view) + e2);
                if (g2 < 0) {
                    this.f2538c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2536a.g() - m2) - this.f2536a.b(view);
        this.f2538c = this.f2536a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2538c - this.f2536a.c(view);
            int k3 = this.f2536a.k();
            int min = c2 - (Math.min(this.f2536a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2538c = Math.min(g3, -min) + this.f2538c;
            }
        }
    }

    public final void d() {
        this.f2537b = -1;
        this.f2538c = Integer.MIN_VALUE;
        this.d = false;
        this.f2539e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2537b + ", mCoordinate=" + this.f2538c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2539e + '}';
    }
}
