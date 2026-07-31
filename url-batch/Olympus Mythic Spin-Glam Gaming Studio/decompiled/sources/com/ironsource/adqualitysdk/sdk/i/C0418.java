package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ȓ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0418 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f243;

    public C0418(C1301 c1301) {
        this.f243 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f243;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c1301.getClass();
        return campaignEx.getPackageName();
    }
}
