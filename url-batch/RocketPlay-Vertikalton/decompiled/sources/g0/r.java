package g0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public U.g f2972a;

    /* renamed from: b, reason: collision with root package name */
    public int f2973b;

    /* renamed from: c, reason: collision with root package name */
    public int f2974c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2975e;

    public r() {
        d();
    }

    public final void a() {
        this.f2974c = this.d ? this.f2972a.g() : this.f2972a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2974c = this.f2972a.m() + this.f2972a.b(view);
        } else {
            this.f2974c = this.f2972a.e(view);
        }
        this.f2973b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2972a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2973b = i;
        if (!this.d) {
            int e2 = this.f2972a.e(view);
            int k2 = e2 - this.f2972a.k();
            this.f2974c = e2;
            if (k2 > 0) {
                int g2 = (this.f2972a.g() - Math.min(0, (this.f2972a.g() - m2) - this.f2972a.b(view))) - (this.f2972a.c(view) + e2);
                if (g2 < 0) {
                    this.f2974c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2972a.g() - m2) - this.f2972a.b(view);
        this.f2974c = this.f2972a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2974c - this.f2972a.c(view);
            int k3 = this.f2972a.k();
            int min = c2 - (Math.min(this.f2972a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2974c = Math.min(g3, -min) + this.f2974c;
            }
        }
    }

    public final void d() {
        this.f2973b = -1;
        this.f2974c = Integer.MIN_VALUE;
        this.d = false;
        this.f2975e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2973b + ", mCoordinate=" + this.f2974c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2975e + '}';
    }
}
