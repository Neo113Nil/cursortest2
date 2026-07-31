package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᗁ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0932 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2229;

    public C0932(C0795 c0795) {
        this.f2229 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2229;
        Context context = (Context) arrayList.get(0);
        c0795.getClass();
        return AppLovinBroadcastManager.getInstance(context);
    }
}
