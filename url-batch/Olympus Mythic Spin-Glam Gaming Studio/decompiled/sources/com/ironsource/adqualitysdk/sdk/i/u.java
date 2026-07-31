package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.video.playback.model.MediaFile;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class u implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f167;

    public u(H h) {
        this.f167 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f167;
        MediaFile mediaFile = (MediaFile) arrayList.get(0);
        h.getClass();
        return mediaFile.getUrl();
    }
}
