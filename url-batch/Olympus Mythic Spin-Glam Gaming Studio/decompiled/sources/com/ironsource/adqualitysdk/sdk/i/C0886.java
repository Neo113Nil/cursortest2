package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔥ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0886 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f2152;

    public C0886(C1249 c1249) {
        this.f2152 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f2152;
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(0);
        c1249.getClass();
        return new C1260(c1249, videoAdListener, c1189);
    }
}
