package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.亠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1160 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f2918;

    public C1160(C1027 c1027) {
        this.f2918 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1027 c1027 = this.f2918;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c1027.getClass();
        return impressionData.getAllData();
    }
}
