package com.ironsource.adqualitysdk.sdk.i;

import com.qq.e.ads.rewardvideo.RewardVideoAD;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʸ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0469 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1248 f357;

    public C0469(C1248 c1248) {
        this.f357 = c1248;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1248 c1248 = this.f357;
        RewardVideoAD rewardVideoAD = (RewardVideoAD) arrayList.get(0);
        c1248.getClass();
        return Integer.valueOf(rewardVideoAD.getRewardAdType());
    }
}
