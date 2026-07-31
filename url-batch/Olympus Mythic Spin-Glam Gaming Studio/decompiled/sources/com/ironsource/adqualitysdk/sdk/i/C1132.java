package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.〵, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1132 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f2881;

    public C1132(C1027 c1027) {
        this.f2881 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1027 c1027 = this.f2881;
        LevelPlayImpressionData levelPlayImpressionData = (LevelPlayImpressionData) arrayList.get(0);
        c1027.getClass();
        return levelPlayImpressionData.getAllData();
    }
}
