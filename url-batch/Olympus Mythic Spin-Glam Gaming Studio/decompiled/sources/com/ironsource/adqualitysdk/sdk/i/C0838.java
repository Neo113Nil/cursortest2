package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementVideoListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0838 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0721 f2049;

    public C0838(C0721 c0721) {
        this.f2049 = c0721;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0721 c0721 = this.f2049;
        TJPlacement tJPlacement = (TJPlacement) arrayList.get(0);
        TJPlacementVideoListener tJPlacementVideoListener = (TJPlacementVideoListener) arrayList.get(1);
        c0721.getClass();
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        return null;
    }
}
