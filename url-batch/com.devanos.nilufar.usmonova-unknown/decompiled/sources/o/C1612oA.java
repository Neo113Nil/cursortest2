package o;

import android.database.DataSetObserver;

/* renamed from: o.oA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612oA extends DataSetObserver {
    public final /* synthetic */ AbstractC1809rA a;

    public C1612oA(AbstractC1809rA abstractC1809rA) {
        this.a = abstractC1809rA;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC1809rA abstractC1809rA = this.a;
        if (abstractC1809rA.F.isShowing()) {
            abstractC1809rA.d();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
