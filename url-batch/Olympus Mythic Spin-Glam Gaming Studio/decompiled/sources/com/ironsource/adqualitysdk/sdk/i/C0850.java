package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓙ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0850 implements AppLovinCommunicatorSubscriber {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f2075;

    public C0850(String str) {
        this.f2075 = str;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return this.f2075;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }
}
