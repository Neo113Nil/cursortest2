package com.ironsource.adqualitysdk.sdk.i;

import com.chartboost.sdk.InPlay.CBInPlay;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｱ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1322 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1308 f3662;

    public C1322(C1308 c1308) {
        this.f3662 = c1308;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1308 c1308 = this.f3662;
        CBInPlay cBInPlay = (CBInPlay) arrayList.get(0);
        c1308.getClass();
        return cBInPlay.getLocation();
    }
}
