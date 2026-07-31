package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴵ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0979 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0610 f2346;

    public C0979(C0610 c0610) {
        this.f2346 = c0610;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0610 c0610 = this.f2346;
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        c0610.getClass();
        return advertisement.getCampaign();
    }
}
