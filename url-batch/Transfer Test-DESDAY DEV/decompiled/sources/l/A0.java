package l;

/* loaded from: classes.dex */
public final class A0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f2854b;

    public /* synthetic */ A0(E0 e02, int i) {
        this.f2853a = i;
        this.f2854b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2853a) {
            case 0:
                C0233r0 c0233r0 = this.f2854b.f2869c;
                if (c0233r0 != null) {
                    c0233r0.setListSelectionHidden(true);
                    c0233r0.requestLayout();
                    break;
                }
                break;
            default:
                E0 e02 = this.f2854b;
                C0233r0 c0233r02 = e02.f2869c;
                if (c0233r02 != null && c0233r02.isAttachedToWindow() && e02.f2869c.getCount() > e02.f2869c.getChildCount() && e02.f2869c.getChildCount() <= e02.f2876m) {
                    e02.f2889z.setInputMethodMode(2);
                    e02.i();
                    break;
                }
                break;
        }
    }
}
