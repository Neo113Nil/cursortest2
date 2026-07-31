package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicator;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖬ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0923 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2218;

    public C0923(C0795 c0795) {
        this.f2218 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2218;
        Context context = (Context) arrayList.get(0);
        String str = (String) arrayList.get(1);
        String str2 = (String) arrayList.get(2);
        c0795.getClass();
        AppLovinCommunicator.getInstance(context).subscribe(new C0850(str), str2);
        return null;
    }
}
