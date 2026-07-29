package o;

/* renamed from: o.nA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1546nA implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1809rA i;

    public /* synthetic */ RunnableC1546nA(AbstractC1809rA abstractC1809rA, int i) {
        this.h = i;
        this.i = abstractC1809rA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                C1713pj c1713pj = this.i.j;
                if (c1713pj != null) {
                    c1713pj.setListSelectionHidden(true);
                    c1713pj.requestLayout();
                    break;
                }
                break;
            default:
                AbstractC1809rA abstractC1809rA = this.i;
                C1713pj c1713pj2 = abstractC1809rA.j;
                if (c1713pj2 != null && c1713pj2.isAttachedToWindow() && abstractC1809rA.j.getCount() > abstractC1809rA.j.getChildCount() && abstractC1809rA.j.getChildCount() <= abstractC1809rA.t) {
                    abstractC1809rA.F.setInputMethodMode(2);
                    abstractC1809rA.d();
                    break;
                }
                break;
        }
    }
}
