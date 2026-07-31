package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ȋ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0415 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f240;

    public C0415(C1249 c1249) {
        this.f240 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f240;
        VastAdSource vastAdSource = (VastAdSource) arrayList.get(0);
        c1249.getClass();
        return vastAdSource.getCreatives();
    }
}
