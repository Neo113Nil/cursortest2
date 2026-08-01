package v;

import s.C0293a;
import s.C0296d;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317a extends AbstractC0319c {
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public C0293a f3817j;

    public boolean getAllowsGoneWidget() {
        return this.f3817j.f3598t0;
    }

    public int getMargin() {
        return this.f3817j.f3599u0;
    }

    public int getType() {
        return this.h;
    }

    @Override // v.AbstractC0319c
    public final void h(C0296d c0296d, boolean z2) {
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
        if (c0296d instanceof C0293a) {
            ((C0293a) c0296d).f3597s0 = this.i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f3817j.f3598t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f3817j.f3599u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3817j.f3599u0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
