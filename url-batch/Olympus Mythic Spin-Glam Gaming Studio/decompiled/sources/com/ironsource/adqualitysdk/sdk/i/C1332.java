package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｿ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1332 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1207 f3676;

    public C1332(C1207 c1207) {
        this.f3676 = c1207;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1207 c1207 = this.f3676;
        WebTrafficObject webTrafficObject = (WebTrafficObject) arrayList.get(0);
        c1207.getClass();
        return webTrafficObject.urls;
    }
}
