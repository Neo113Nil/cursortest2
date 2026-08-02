package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0921Zu implements InterfaceC01383w {
    public final /* synthetic */ C0377Eg A00;
    public final /* synthetic */ C01363u A01;

    public C0921Zu(C0377Eg c0377Eg, C01363u c01363u) {
        this.A00 = c0377Eg;
        this.A01 = c01363u;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01383w
    public final Object A4W(int i) {
        C01343s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01383w
    public final List<Object> A5h(String str, int i) {
        List<C01343s> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(A03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01383w
    public final boolean ADx(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
