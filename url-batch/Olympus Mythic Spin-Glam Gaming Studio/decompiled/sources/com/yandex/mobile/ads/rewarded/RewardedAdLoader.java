package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.common.AdRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yads.aq3;
import yads.hr2;
import yads.mt3;
import yads.nt3;
import yads.p10;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/mobile/ads/rewarded/RewardedAdLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/common/AdRequest;", "adRequest", "Lcom/yandex/mobile/ads/rewarded/RewardedAdLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "loadAd", "(Lcom/yandex/mobile/ads/common/AdRequest;Lcom/yandex/mobile/ads/rewarded/RewardedAdLoadListener;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
/* loaded from: classes9.dex */
public final class RewardedAdLoader {
    private final p10 a;
    private final aq3 b = new aq3();
    private final hr2 c = new hr2();

    public RewardedAdLoader(@NotNull Context context) {
        this.a = new p10(context, new nt3(context));
    }

    public final void loadAd(@NotNull AdRequest adRequest, @NotNull RewardedAdLoadListener listener) {
        this.a.a.a(this.b.a(adRequest), new mt3(listener));
    }
}
