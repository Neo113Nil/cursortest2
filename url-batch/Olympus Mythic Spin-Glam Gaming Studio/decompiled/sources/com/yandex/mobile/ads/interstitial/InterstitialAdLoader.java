package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.common.AdRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yads.aq3;
import yads.js3;
import yads.nt3;
import yads.v00;
import yads.wb1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/common/AdRequest;", "adRequest", "Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequest;Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoadListener;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
/* loaded from: classes4.dex */
public final class InterstitialAdLoader {
    private final aq3 a;
    private final v00 b;
    private final wb1 c;

    public InterstitialAdLoader(@NotNull Context context) {
        nt3 nt3Var = new nt3(context);
        this.a = new aq3();
        this.b = new v00(context, nt3Var);
        this.c = new wb1();
    }

    public final void loadAd(@NotNull AdRequest adRequest, @NotNull InterstitialAdLoadListener listener) {
        this.b.a.a(this.a.a(adRequest), new js3(listener));
    }
}
