package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒥ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0816 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2010;

    public C0816(C0759 c0759) {
        this.f2010 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0759 c0759 = this.f2010;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c0759.getClass();
        return Integer.valueOf(campaignEx.getLinkType());
    }
}
