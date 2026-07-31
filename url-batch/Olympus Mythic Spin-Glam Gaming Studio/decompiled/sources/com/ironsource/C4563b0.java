package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4563b0 implements InterfaceC4536a0 {

    @NotNull
    private final InterfaceC4937vc a;

    /* renamed from: com.ironsource.b0$a */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = 1000;

        private a() {
        }
    }

    public C4563b0(@NotNull InterfaceC4937vc networkLoadApi) {
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.a = networkLoadApi;
    }

    @Override // com.ironsource.InterfaceC4536a0
    @NotNull
    public String a() {
        return this.a.a();
    }

    @Override // com.ironsource.InterfaceC4536a0
    public void a(@NotNull K9 adInstance, @NotNull Map<String, String> loadParams) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.a.a(adInstance, new C4973xc(null, false, 3, null));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("1000: loadAd failed: ");
            sb.append(message);
            String sb2 = sb.toString();
            Ic b = adInstance.b();
            if (b instanceof C4569b6) {
                Ic b2 = adInstance.b();
                Intrinsics.checkNotNull(b2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C4569b6) b2).onInterstitialLoadFailed(sb2);
            } else if (b instanceof Kc) {
                Ic b3 = adInstance.b();
                Intrinsics.checkNotNull(b3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Kc) b3).onBannerLoadFail(sb2);
            }
        }
    }
}
