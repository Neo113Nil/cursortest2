package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.rewarded.EventListener;
import com.smaato.sdk.rewarded.viewmodel.RewardedAdEventListenerNotifications;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕐ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0908 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f2201;

    public C0908(C0563 c0563) {
        this.f2201 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f2201;
        RewardedAdEventListenerNotifications rewardedAdEventListenerNotifications = (RewardedAdEventListenerNotifications) arrayList.get(0);
        EventListener eventListener = (EventListener) arrayList.get(1);
        c0563.getClass();
        rewardedAdEventListenerNotifications.setEventListener(eventListener);
        return null;
    }
}
