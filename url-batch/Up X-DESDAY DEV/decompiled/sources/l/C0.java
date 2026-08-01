package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2828b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2827a = i;
        this.f2828b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2827a) {
            case 0:
                C0262t0 c0262t0 = this.f2828b.f2843c;
                if (c0262t0 != null) {
                    c0262t0.setListSelectionHidden(true);
                    c0262t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2828b;
                C0262t0 c0262t02 = g02.f2843c;
                if (c0262t02 != null && c0262t02.isAttachedToWindow() && g02.f2843c.getCount() > g02.f2843c.getChildCount() && g02.f2843c.getChildCount() <= g02.f2850m) {
                    g02.f2863z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
