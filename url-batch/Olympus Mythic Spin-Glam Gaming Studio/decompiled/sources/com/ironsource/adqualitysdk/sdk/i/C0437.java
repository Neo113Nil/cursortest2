package com.ironsource.adqualitysdk.sdk.i;

import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɺ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0437 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0427 f306;

    public C0437(C0427 c0427) {
        this.f306 = c0427;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0427 c0427 = this.f306;
        OguryRewardedAd oguryRewardedAd = (OguryRewardedAd) arrayList.get(0);
        OguryRewardedAdListener oguryRewardedAdListener = (OguryRewardedAdListener) arrayList.get(1);
        c0427.getClass();
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        return null;
    }
}
