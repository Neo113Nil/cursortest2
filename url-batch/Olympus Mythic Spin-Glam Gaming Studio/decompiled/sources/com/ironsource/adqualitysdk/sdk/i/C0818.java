package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒧ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0818 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2022;

    public C0818(C0759 c0759) {
        this.f2022 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0759 c0759 = this.f2022;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c0759.getClass();
        return campaignEx.getClickURL();
    }
}
