package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｼ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1330 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1207 f3674;

    public C1330(C1207 c1207) {
        this.f3674 = c1207;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1207 c1207 = this.f3674;
        OfferCacheEntity offerCacheEntity = (OfferCacheEntity) arrayList.get(0);
        c1207.getClass();
        return offerCacheEntity.clickThroughUrl;
    }
}
