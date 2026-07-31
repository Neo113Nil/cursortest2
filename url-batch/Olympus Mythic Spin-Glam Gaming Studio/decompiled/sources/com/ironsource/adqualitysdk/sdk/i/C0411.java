package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ǐ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0411 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1249 f236;

    public C0411(C1249 c1249) {
        this.f236 = c1249;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1249 c1249 = this.f236;
        MediaFile mediaFile = (MediaFile) arrayList.get(0);
        c1249.getClass();
        return mediaFile.getText();
    }
}
