package l;

/* loaded from: classes.dex */
public final class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0 f2853b;

    public /* synthetic */ C0(G0 g02, int i) {
        this.f2852a = i;
        this.f2853b = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2852a) {
            case 0:
                C0251t0 c0251t0 = this.f2853b.f2868c;
                if (c0251t0 != null) {
                    c0251t0.setListSelectionHidden(true);
                    c0251t0.requestLayout();
                    break;
                }
                break;
            default:
                G0 g02 = this.f2853b;
                C0251t0 c0251t02 = g02.f2868c;
                if (c0251t02 != null && c0251t02.isAttachedToWindow() && g02.f2868c.getCount() > g02.f2868c.getChildCount() && g02.f2868c.getChildCount() <= g02.f2875m) {
                    g02.f2888z.setInputMethodMode(2);
                    g02.i();
                    break;
                }
                break;
        }
    }
}
