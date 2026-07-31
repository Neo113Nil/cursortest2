package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4602d3 implements Eb {

    @NotNull
    private final BannerAdRequest a;

    @NotNull
    private final BannerAdLoaderListener b;

    @NotNull
    private final InterfaceC4654g1 c;

    @NotNull
    private final InterfaceC4850r1 d;

    public C4602d3(@NotNull BannerAdRequest adRequest, @NotNull BannerAdLoaderListener publisherListener, @NotNull InterfaceC4654g1 adapterConfigProvider, @NotNull InterfaceC4850r1 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.Eb
    @NotNull
    public Bb a() throws Exception {
        IronSourceError a;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC4868s1 a2 = this.d.a(new C4761m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Cb a3 = new Db(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C4736kc.e.a().c().get()).a();
            new C4566b3(a3, this.a.getSize()).a();
            C4955wc c4955wc = new C4955wc();
            C4798o2 c4798o2 = new C4798o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.checkNotNull(a3);
            R7 r7 = R7.a;
            return new C4539a3(bannerAdRequest, size, c4798o2, a3, c4955wc, a2, new C4584c3(r7, this.b), new I2(a2, r7.d()), null, null, 768, null);
        } catch (Exception e) {
            C4782n4.d().a(e);
            if (e instanceof C4881se) {
                a = ((C4881se) e).a();
            } else {
                C4908u5 c4908u5 = C4908u5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                a = c4908u5.a(message);
            }
            return new C4890t5(a, new C4584c3(R7.a, this.b), a2);
        }
    }

    public /* synthetic */ C4602d3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC4654g1 interfaceC4654g1, InterfaceC4850r1 interfaceC4850r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC4654g1, (i & 8) != 0 ? new C4833q1(IronSource.a.BANNER) : interfaceC4850r1);
    }
}
