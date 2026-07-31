package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ӱ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0583 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0547 f971;

    public C0583(C0547 c0547) {
        this.f971 = c0547;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0547 c0547 = this.f971;
        PAGRewardItem pAGRewardItem = (PAGRewardItem) arrayList.get(0);
        c0547.getClass();
        return pAGRewardItem.getRewardName();
    }
}
