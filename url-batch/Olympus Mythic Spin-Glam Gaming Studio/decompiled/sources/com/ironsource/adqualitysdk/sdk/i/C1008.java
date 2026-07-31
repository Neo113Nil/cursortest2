package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1008 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f2440;

    public C1008(C0563 c0563) {
        this.f2440 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f2440;
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        c0563.getClass();
        return videoClicks.clickTrackings;
    }
}
