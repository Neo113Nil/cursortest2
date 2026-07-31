package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.RewardInfo;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʔ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0452 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1301 f339;

    public C0452(C1301 c1301) {
        this.f339 = c1301;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1301 c1301 = this.f339;
        RewardInfo rewardInfo = (RewardInfo) arrayList.get(0);
        c1301.getClass();
        return Boolean.valueOf(rewardInfo.isCompleteView());
    }
}
