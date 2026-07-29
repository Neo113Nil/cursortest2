package o;

/* renamed from: o.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1770qa implements Runnable {
    public final /* synthetic */ C1835ra h;
    public final /* synthetic */ C1284jC i;
    public final /* synthetic */ MenuC0825cC j;
    public final /* synthetic */ Y1 k;

    public RunnableC1770qa(Y1 y1, C1835ra c1835ra, C1284jC c1284jC, MenuC0825cC menuC0825cC) {
        this.k = y1;
        this.h = c1835ra;
        this.i = c1284jC;
        this.j = menuC0825cC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC1901sa viewOnKeyListenerC1901sa = (ViewOnKeyListenerC1901sa) this.k.i;
        C1835ra c1835ra = this.h;
        if (c1835ra != null) {
            viewOnKeyListenerC1901sa.G = true;
            c1835ra.b.c(false);
            viewOnKeyListenerC1901sa.G = false;
        }
        C1284jC c1284jC = this.i;
        if (c1284jC.isEnabled() && c1284jC.hasSubMenu()) {
            this.j.q(c1284jC, null, 4);
        }
    }
}
