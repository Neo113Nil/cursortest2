package v;

import s.C0296a;
import s.C0299d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320a extends AbstractC0322c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0296a f3839j;

    public boolean getAllowsGoneWidget() {
        return this.f3839j.f3593t0;
    }

    public int getMargin() {
        return this.f3839j.f3594u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0322c
    public final void h(C0299d c0299d, boolean z2) {
        int i = this.h;
        this.i = i;
        if (z2) {
            if (i == 5) {
                this.i = 1;
            } else if (i == 6) {
                this.i = 0;
            }
        } else if (i == 5) {
            this.i = 0;
        } else if (i == 6) {
            this.i = 1;
        }
        if (c0299d instanceof C0296a) {
            ((C0296a) c0299d).f3592s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3839j.f3593t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3839j.f3594u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3839j.f3594u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
