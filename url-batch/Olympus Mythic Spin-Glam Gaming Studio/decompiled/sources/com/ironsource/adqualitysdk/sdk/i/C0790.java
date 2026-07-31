package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐪ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0790 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f1860;

    public C0790(C1011 c1011) {
        this.f1860 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f1860;
        IUnityAdsListener iUnityAdsListener = (IUnityAdsListener) arrayList.get(0);
        c1011.getClass();
        UnityAds.setListener(iUnityAdsListener);
        return null;
    }
}
