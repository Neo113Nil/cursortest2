package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.core.HyprMXController;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮞ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1222 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1207 f3214;

    public C1222(C1207 c1207) {
        this.f3214 = c1207;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1207 c1207 = this.f3214;
        HyprMXController hyprMXController = (HyprMXController) arrayList.get(0);
        c1207.getClass();
        return hyprMXController.getPlacementController();
    }
}
