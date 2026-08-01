package f0;

import android.view.View;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public T.g f2149a;

    /* renamed from: b, reason: collision with root package name */
    public int f2150b;

    /* renamed from: c, reason: collision with root package name */
    public int f2151c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2152e;

    public r() {
        d();
    }

    public final void a() {
        this.f2151c = this.d ? this.f2149a.g() : this.f2149a.k();
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.f2151c = this.f2149a.m() + this.f2149a.b(view);
        } else {
            this.f2151c = this.f2149a.e(view);
        }
        this.f2150b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f2149a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f2150b = i;
        if (!this.d) {
            int e2 = this.f2149a.e(view);
            int k2 = e2 - this.f2149a.k();
            this.f2151c = e2;
            if (k2 > 0) {
                int g2 = (this.f2149a.g() - Math.min(0, (this.f2149a.g() - m2) - this.f2149a.b(view))) - (this.f2149a.c(view) + e2);
                if (g2 < 0) {
                    this.f2151c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f2149a.g() - m2) - this.f2149a.b(view);
        this.f2151c = this.f2149a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f2151c - this.f2149a.c(view);
            int k3 = this.f2149a.k();
            int min = c2 - (Math.min(this.f2149a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f2151c = Math.min(g3, -min) + this.f2151c;
            }
        }
    }

    public final void d() {
        this.f2150b = -1;
        this.f2151c = Integer.MIN_VALUE;
        this.d = false;
        this.f2152e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2150b + ", mCoordinate=" + this.f2151c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f2152e + '}';
    }
}
