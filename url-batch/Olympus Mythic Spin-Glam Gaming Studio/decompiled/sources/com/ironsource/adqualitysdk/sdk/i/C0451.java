package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.RewardInfo;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʏ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0451 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f338;

    public C0451(C1301 c1301) {
        this.f338 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f338;
        RewardInfo rewardInfo = (RewardInfo) arrayList.get(0);
        c1301.getClass();
        return rewardInfo.getRewardName();
    }
}
