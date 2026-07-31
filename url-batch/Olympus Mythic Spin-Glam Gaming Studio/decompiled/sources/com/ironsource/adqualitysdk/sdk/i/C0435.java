package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɭ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0435 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f304;

    public C0435(C1301 c1301) {
        this.f304 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f304;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c1301.getClass();
        return campaignEx.getNativeVideoTrackingString();
    }
}
