package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4727k3 implements InterfaceC4654g1 {

    @NotNull
    private final N3 a;

    @Nullable
    private final Md b;

    @NotNull
    private final IronSource.a c;

    /* renamed from: com.ironsource.k3$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C4727k3(@NotNull N3 adFormatConfigurations, @Nullable Md md, @NotNull IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormatConfigurations;
        this.b = md;
        this.c = adFormat;
    }

    @Override // com.ironsource.InterfaceC4654g1
    @Nullable
    public InterfaceC4769m9 a(@NotNull Fd providerName) {
        NetworkSettings b;
        C4649fe f;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Md md = this.b;
        if (md == null || (b = md.b(providerName.value())) == null) {
            return null;
        }
        int i = a.a[this.c.ordinal()];
        if (i == 1) {
            U2 c = this.a.c();
            if (c != null) {
                return new Z2(new C4618e1(b, b.getBannerSettings(), this.c), c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (f = this.a.f()) != null) {
                return new Wd(new C4618e1(b, b.getRewardedVideoSettings(), this.c), f);
            }
            return null;
        }
        E9 d = this.a.d();
        if (d != null) {
            return new H9(new C4618e1(b, b.getInterstitialSettings(), this.c), d);
        }
        return null;
    }
}
