package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2850b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2849a = i;
        this.f2850b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2849a) {
            case 0:
                C0262t0 c0262t0 = this.f2850b.f2865c;
                if (c0262t0 != null) {
                    c0262t0.setListSelectionHidden(true);
                    c0262t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2850b;
                C0262t0 c0262t02 = g02.f2865c;
                if (c0262t02 != null && c0262t02.isAttachedToWindow() && g02.f2865c.getCount() > g02.f2865c.getChildCount() && g02.f2865c.getChildCount() <= g02.f2872m) {
                    g02.f2885z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
