package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0920Zt implements InterfaceC01403z {
    public final /* synthetic */ C0376Ef A00;
    public final /* synthetic */ C01363u A01;

    public C0920Zt(C0376Ef c0376Ef, C01363u c01363u) {
        this.A00 = c0376Ef;
        this.A01 = c01363u;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01403z
    public final Object A4W(int i) {
        C01343s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01403z
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

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01403z
    public final Object A5i(int i) {
        C01343s compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC01403z
    public final boolean ADx(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
