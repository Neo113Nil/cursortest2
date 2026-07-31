package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϲ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0532 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0498 f590;

    public C0532(C0498 c0498) {
        this.f590 = c0498;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0498 c0498 = this.f590;
        PresageOptinVideo presageOptinVideo = (PresageOptinVideo) arrayList.get(0);
        PresageOptinVideoCallback presageOptinVideoCallback = (PresageOptinVideoCallback) arrayList.get(1);
        c0498.getClass();
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        return null;
    }
}
