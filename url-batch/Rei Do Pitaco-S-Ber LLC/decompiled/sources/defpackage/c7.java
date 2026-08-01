package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class c7 extends gc {
    public int m;
    public int n;
    public d7 o;

    public boolean getAllowsGoneWidget() {
        return this.o.t0;
    }

    public int getMargin() {
        return this.o.u0;
    }

    public int getType() {
        return this.m;
    }

    @Override // defpackage.gc
    public final void h(tc tcVar, boolean z) {
        int i = this.m;
        this.n = i;
        if (z) {
            if (i == 5) {
                this.n = 1;
            } else if (i == 6) {
                this.n = 0;
            }
        } else if (i == 5) {
            this.n = 0;
        } else if (i == 6) {
            this.n = 1;
        }
        if (tcVar instanceof d7) {
            ((d7) tcVar).s0 = this.n;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.t0 = z;
    }

    public void setDpMargin(int i) {
        this.o.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.o.u0 = i;
    }

    public void setType(int i) {
        this.m = i;
    }
}
