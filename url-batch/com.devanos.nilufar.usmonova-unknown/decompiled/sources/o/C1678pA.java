package o;

import android.widget.AbsListView;

/* renamed from: o.pA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1678pA implements AbsListView.OnScrollListener {
    public final /* synthetic */ AbstractC1809rA a;

    public C1678pA(AbstractC1809rA abstractC1809rA) {
        this.a = abstractC1809rA;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AbstractC1809rA abstractC1809rA = this.a;
        RunnableC1546nA runnableC1546nA = abstractC1809rA.x;
        if (i != 1 || abstractC1809rA.F.getInputMethodMode() == 2 || abstractC1809rA.F.getContentView() == null) {
            return;
        }
        abstractC1809rA.B.removeCallbacks(runnableC1546nA);
        runnableC1546nA.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
