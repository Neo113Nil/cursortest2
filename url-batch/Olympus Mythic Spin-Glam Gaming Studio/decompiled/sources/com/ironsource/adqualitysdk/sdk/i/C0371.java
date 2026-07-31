package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ı, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0371 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f188;

    public C0371(C1011 c1011) {
        this.f188 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f188;
        AdObject adObject = (AdObject) arrayList.get(0);
        c1011.getClass();
        return adObject.getLoadOptions();
    }
}
