package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.interstitial.EventListener;
import com.smaato.sdk.interstitial.viewmodel.EventListenerNotificationsInterface;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔾ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0900 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f2194;

    public C0900(C0563 c0563) {
        this.f2194 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f2194;
        EventListenerNotificationsInterface eventListenerNotificationsInterface = (EventListenerNotificationsInterface) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        c0563.getClass();
        eventListenerNotificationsInterface.setEventListener(eventListener);
        return null;
    }
}
