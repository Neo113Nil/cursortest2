package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.ce, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4595ce implements Eb {

    @NotNull
    private final RewardedAdRequest a;

    @NotNull
    private final RewardedAdLoaderListener b;

    @NotNull
    private final InterfaceC4654g1 c;

    @NotNull
    private final InterfaceC4850r1 d;

    public C4595ce(@NotNull RewardedAdRequest adRequest, @NotNull RewardedAdLoaderListener publisherListener, @NotNull InterfaceC4654g1 adapterConfigProvider, @NotNull InterfaceC4850r1 analyticsFactory) {
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
        IronSourceError d;
        String instanceId = this.a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC4868s1 a = this.d.a(new C4761m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Cb a2 = new Db(this.a.getAdm(), this.a.getProviderName$mediationsdk_release(), this.c, C4736kc.e.a().c().get()).a();
            new C4559ae(a2).a();
            C4955wc c4955wc = new C4955wc();
            C4798o2 c4798o2 = new C4798o2(this.a.getAdm(), this.a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.a;
            Intrinsics.checkNotNull(a2);
            R7 r7 = R7.a;
            return new Zd(rewardedAdRequest, a2, new C4577be(r7, this.b), c4798o2, c4955wc, a, new Ud(a, r7.d()), null, null, 384, null);
        } catch (Exception e) {
            C4782n4.d().a(e);
            if (e instanceof C4881se) {
                d = ((C4881se) e).a();
            } else {
                C4908u5 c4908u5 = C4908u5.a;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                d = c4908u5.d(message);
            }
            return new C4948w5(this.a, new C4577be(R7.a, this.b), a, d);
        }
    }

    public /* synthetic */ C4595ce(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC4654g1 interfaceC4654g1, InterfaceC4850r1 interfaceC4850r1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC4654g1, (i & 8) != 0 ? new C4833q1(IronSource.a.REWARDED_VIDEO) : interfaceC4850r1);
    }
}
