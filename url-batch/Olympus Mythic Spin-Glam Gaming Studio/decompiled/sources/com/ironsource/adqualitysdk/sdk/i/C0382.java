package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ŀ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0382 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f202;

    public C0382(C1249 c1249) {
        this.f202 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f202;
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(1);
        c1249.getClass();
        videoAd.setAdListener(videoAdListener);
        return null;
    }
}
