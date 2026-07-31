package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.common.AdRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yads.b10;
import yads.c10;
import yads.d8;
import yads.h10;
import yads.nt3;
import yads.us3;
import yads.y02;
import yads.z10;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/common/AdRequest;", "adRequest", "Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequest;Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NativeAdLoader {
    private final h10 a;
    private final h b = new h();
    private final y02 c = new y02();

    public NativeAdLoader(@NotNull Context context) {
        this.a = new h10(context, new nt3(context));
    }

    public final void loadAd(@NotNull AdRequest adRequest, @NotNull NativeAdOptions options, @NotNull NativeAdLoadListener listener) {
        d8 a = this.b.a(adRequest, options);
        us3 us3Var = new us3(listener);
        h10 h10Var = this.a;
        z10.a(h10Var.c, new b10(us3Var), new c10(h10Var, a, us3Var, null));
    }
}
