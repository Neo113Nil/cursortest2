package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٴ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0645 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0610 f1302;

    public C0645(C0610 c0610) {
        this.f1302 = c0610;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0610 c0610 = this.f1302;
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        c0610.getClass();
        return advertisement.getDownloadableUrls();
    }
}
