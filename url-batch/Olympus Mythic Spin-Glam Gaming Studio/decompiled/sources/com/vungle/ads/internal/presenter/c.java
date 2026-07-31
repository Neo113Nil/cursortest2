package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class c implements b {
    public final b a;

    public c(b adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.a = adPlayCallback;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        this.a.onAdClick(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        this.a.onAdLeftApplication(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
        this.a.onAdRewarded(str);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.onFailure(error);
    }
}
