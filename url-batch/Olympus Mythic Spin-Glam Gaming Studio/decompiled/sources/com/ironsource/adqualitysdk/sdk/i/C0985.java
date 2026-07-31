package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴻ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0985 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2355;

    public C0985(C0759 c0759) {
        this.f2355 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0759 c0759 = this.f2355;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c0759.getClass();
        return campaignEx.getNativeVideoTrackingString();
    }
}
