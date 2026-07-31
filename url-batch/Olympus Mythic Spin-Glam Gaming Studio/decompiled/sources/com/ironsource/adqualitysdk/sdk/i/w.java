package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class w implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f169;

    public w(H h) {
        this.f169 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f169;
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        h.getClass();
        return videoAd.getInfo();
    }
}
