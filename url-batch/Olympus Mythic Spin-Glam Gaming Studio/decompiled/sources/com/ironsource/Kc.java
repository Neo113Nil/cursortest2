package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Kc implements Jc {

    @Nullable
    private E2 a;

    @NotNull
    private WeakReference<G2> b = new WeakReference<>(null);

    public final void a(@NotNull E2 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.a = loadListener;
    }

    @Override // com.ironsource.Jc
    public void onBannerClick() {
        G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerClick();
        }
    }

    @Override // com.ironsource.Jc
    public void onBannerInitFailed(@Nullable String str) {
    }

    @Override // com.ironsource.Jc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Jc
    public void onBannerLoadFail(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        E2 e2 = this.a;
        if (e2 != null) {
            e2.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Jc
    public void onBannerLoadSuccess(@NotNull K9 adInstance, @NotNull C4661g8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        E2 e2 = this.a;
        if (e2 != null) {
            e2.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Jc
    public void onBannerShowSuccess() {
        G2 g2 = this.b.get();
        if (g2 != null) {
            g2.onBannerShowSuccess();
        }
    }

    public final void a(@NotNull G2 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
