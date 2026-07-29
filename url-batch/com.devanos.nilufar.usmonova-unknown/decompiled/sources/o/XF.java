package o;

/* loaded from: classes.dex */
public final class XF implements Z9 {
    public final C0380Oo h;
    public final /* synthetic */ YF i;

    public XF(YF yf, C0380Oo c0380Oo) {
        AbstractC0048Bt.n(c0380Oo, "onBackPressedCallback");
        this.i = yf;
        this.h = c0380Oo;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.Tp, o.lp] */
    @Override // o.Z9
    public final void cancel() {
        YF yf = this.i;
        D6 d6 = yf.b;
        C0380Oo c0380Oo = this.h;
        d6.remove(c0380Oo);
        if (AbstractC0048Bt.h(yf.c, c0380Oo)) {
            c0380Oo.a();
            yf.c = null;
        }
        c0380Oo.b.remove(this);
        ?? r0 = c0380Oo.c;
        if (r0 != 0) {
            r0.invoke();
        }
        c0380Oo.c = null;
    }
}
