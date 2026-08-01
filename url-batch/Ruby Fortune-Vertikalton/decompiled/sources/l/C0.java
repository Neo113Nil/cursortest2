package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2844b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2843a = i;
        this.f2844b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2843a) {
            case 0:
                C0261t0 c0261t0 = this.f2844b.f2859c;
                if (c0261t0 != null) {
                    c0261t0.setListSelectionHidden(true);
                    c0261t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2844b;
                C0261t0 c0261t02 = g02.f2859c;
                if (c0261t02 != null && c0261t02.isAttachedToWindow() && g02.f2859c.getCount() > g02.f2859c.getChildCount() && g02.f2859c.getChildCount() <= g02.f2866m) {
                    g02.f2879z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
