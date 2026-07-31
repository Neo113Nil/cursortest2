package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3931d2 extends AbstractC3905c2 {
    public final BannerAdEventListener a;

    public C3931d2(BannerAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.a = adEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map params) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(params, "params");
        this.a.onAdClicked(ad, params);
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo info) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.a.onAdLoadSucceeded(ad, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo info) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        this.a.onAdFetchSuccessful(ad, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullExpressionValue(AbstractC3905c2.class.getSimpleName(), "getSimpleName(...)");
        this.a.onAdLoadFailed(ad, status);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String data) {
        InMobiBanner ad = (InMobiBanner) obj;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.a, ad, data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
