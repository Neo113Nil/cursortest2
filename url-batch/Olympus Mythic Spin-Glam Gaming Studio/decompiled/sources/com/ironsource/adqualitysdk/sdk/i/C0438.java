package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.RewardInfo;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɻ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0438 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f307;

    public C0438(C1301 c1301) {
        this.f307 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f307;
        RewardInfo rewardInfo = (RewardInfo) arrayList.get(0);
        c1301.getClass();
        return rewardInfo.getRewardAmount();
    }
}
