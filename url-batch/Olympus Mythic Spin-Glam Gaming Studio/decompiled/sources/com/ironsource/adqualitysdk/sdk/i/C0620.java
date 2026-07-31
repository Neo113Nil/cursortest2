package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ץ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0620 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f1124;

    public C0620(C1301 c1301) {
        this.f1124 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f1124;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c1301.getClass();
        return campaignEx.getVideoUrlEncode();
    }
}
