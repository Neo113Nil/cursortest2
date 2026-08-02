package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class BQ extends C0725Sb {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public BQ(C01333r c01333r, int i, List<C0661Pp> list, RE re, Bundle bundle) {
        super(c01333r, i, list, re, bundle);
        c01333r.A1f(this);
        this.A03 = new U0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A23 = this.A0C.A23();
        if (this.A05 == null || A23 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A23 < curPos - 1) {
            int curPos2 = A23 + 1;
            A0U(curPos2);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A24();
        int lastVisibleItem = this.A0C.A25();
        int firstVisibleItem = this.A0C.A23();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i);
    }

    @Override // com.meta.analytics.dsp.uinode.C0725Sb, com.meta.analytics.dsp.uinode.AbstractC01604t
    public final void A0L(C0372Eb c0372Eb, int i) {
    }

    @Override // com.meta.analytics.dsp.uinode.C0725Sb, com.meta.analytics.dsp.uinode.AbstractC01604t
    public final void A0M(C0372Eb c0372Eb, int i, int i2) {
        if (this.A0C.A23() != -1) {
            TS ts = (TS) this.A0C.A1m(this.A0C.A23());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (ts != null && ts.A18() && !ts.A17()) {
                ts.A15();
            }
            A01(i);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C0725Sb
    public final void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.meta.analytics.dsp.uinode.C0725Sb
    public final void A0Z(TS ts, boolean z) {
        A0X(ts, z);
        if (!z && ts.A17()) {
            ts.A14();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C0725Sb
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final RE A0b() {
        return this.A04;
    }

    public final void A0c(RE re) {
        this.A04 = re;
    }

    public final void A0d(List<C0661Pp> list) {
        this.A05 = list;
    }
}
