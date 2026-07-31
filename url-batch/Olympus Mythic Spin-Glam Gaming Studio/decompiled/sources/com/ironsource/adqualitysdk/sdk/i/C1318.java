package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｭ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1318 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f3644;

    public C1318(C1301 c1301) {
        this.f3644 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f3644;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c1301.getClass();
        return Integer.valueOf(campaignEx.getAdType());
    }
}
