package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.UnityAdsLoadOptions;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾟ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1355 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f3711;

    public C1355(C1011 c1011) {
        this.f3711 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f3711;
        UnityAdsLoadOptions unityAdsLoadOptions = (UnityAdsLoadOptions) arrayList.get(0);
        c1011.getClass();
        return unityAdsLoadOptions.getData();
    }
}
