package com.ironsource.adqualitysdk.sdk.i;

import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import com.yandex.mobile.ads.common.VideoController;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class A implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ H f90;

    public A(H h) {
        this.f90 = h;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        H h = this.f90;
        VideoController videoController = (VideoController) arrayList.get(0);
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(1));
        h.getClass();
        videoController.setVideoEventListener(null);
        return null;
    }
}
