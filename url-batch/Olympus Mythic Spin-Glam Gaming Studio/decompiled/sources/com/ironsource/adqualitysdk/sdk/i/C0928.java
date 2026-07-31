package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0928 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0795 f2225;

    public C0928(C0795 c0795) {
        this.f2225 = c0795;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0795 c0795 = this.f2225;
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = (AppLovinCommunicatorMessage) arrayList.get(0);
        c0795.getClass();
        return appLovinCommunicatorMessage.getMessageData();
    }
}
