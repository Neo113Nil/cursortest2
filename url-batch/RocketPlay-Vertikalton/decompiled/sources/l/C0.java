package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f3288b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f3287a = i;
        this.f3288b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3287a) {
            case 0:
                C0278t0 c0278t0 = this.f3288b.f3301c;
                if (c0278t0 != null) {
                    c0278t0.setListSelectionHidden(true);
                    c0278t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f3288b;
                C0278t0 c0278t02 = g02.f3301c;
                if (c0278t02 != null && c0278t02.isAttachedToWindow() && g02.f3301c.getCount() > g02.f3301c.getChildCount() && g02.f3301c.getChildCount() <= g02.f3308m) {
                    g02.f3321z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
