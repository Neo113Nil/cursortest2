package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ノ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1145 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f2898;

    public C1145(C1027 c1027) {
        this.f2898 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1027 c1027 = this.f2898;
        ImpressionDataListener impressionDataListener = (ImpressionDataListener) arrayList.get(0);
        c1027.getClass();
        IronSource.removeImpressionDataListener(impressionDataListener);
        return null;
    }
}
