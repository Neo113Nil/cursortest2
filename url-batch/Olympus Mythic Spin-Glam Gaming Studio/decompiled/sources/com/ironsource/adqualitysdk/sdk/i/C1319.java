package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.InPlay.CBInPlay;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｮ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1319 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1308 f3645;

    public C1319(C1308 c1308) {
        this.f3645 = c1308;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1308 c1308 = this.f3645;
        CBInPlay cBInPlay = (CBInPlay) arrayList.get(0);
        c1308.getClass();
        return cBInPlay.getAppName();
    }
}
