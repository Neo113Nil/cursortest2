package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJPlacement;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔉ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0883 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0721 f2149;

    public C0883(C0721 c0721) {
        this.f2149 = c0721;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0721 c0721 = this.f2149;
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        c0721.getClass();
        return tJPlacement.getListener();
    }
}
