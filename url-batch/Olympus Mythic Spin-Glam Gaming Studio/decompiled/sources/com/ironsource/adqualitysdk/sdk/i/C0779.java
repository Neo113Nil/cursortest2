package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐟ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0779 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f1825;

    public C0779(C1011 c1011) {
        this.f1825 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f1825;
        IUnityAdsListener iUnityAdsListener = (IUnityAdsListener) arrayList.get(0);
        c1011.getClass();
        UnityAds.removeListener(iUnityAdsListener);
        return null;
    }
}
