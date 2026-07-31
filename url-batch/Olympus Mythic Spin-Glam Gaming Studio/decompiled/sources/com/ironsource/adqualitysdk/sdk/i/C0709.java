package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ধ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0709 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0529 f1574;

    public C0709(C0529 c0529) {
        this.f1574 = c0529;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0529 c0529 = this.f1574;
        InneractiveContentController inneractiveContentController = (InneractiveContentController) arrayList.get(0);
        VideoContentListener videoContentListener = (VideoContentListener) arrayList.get(1);
        c0529.getClass();
        inneractiveContentController.setEventsListener(videoContentListener);
        return null;
    }
}
