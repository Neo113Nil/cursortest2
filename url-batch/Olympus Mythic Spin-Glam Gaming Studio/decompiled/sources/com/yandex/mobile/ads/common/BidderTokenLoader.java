package com.yandex.mobile.ads.common;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import yads.e00;
import yads.f00;
import yads.l03;
import yads.nt3;
import yads.ua;
import yads.vq3;
import yads.vw2;
import yads.wo;
import yads.wq3;
import yads.wt2;
import yads.xt2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenLoader;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "request", "Lcom/yandex/mobile/ads/common/BidderTokenLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "loadBidderToken", "(Lcom/yandex/mobile/ads/common/BidderTokenRequest;Lcom/yandex/mobile/ads/common/BidderTokenLoadListener;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BidderTokenLoader {
    private final Context a;

    public BidderTokenLoader(@NotNull Context context) {
        this.a = context;
    }

    public final void loadBidderToken(@NotNull BidderTokenRequest request, @NotNull BidderTokenLoadListener listener) {
        e00 e00Var;
        vw2 vw2Var;
        nt3 nt3Var = new nt3(this.a);
        vq3 vq3Var = new vq3(listener);
        int i = wq3.a[request.getAdType().ordinal()];
        if (i == 1) {
            e00Var = e00.d;
        } else if (i == 2) {
            e00Var = e00.e;
        } else if (i == 3) {
            e00Var = e00.f;
        } else if (i == 4) {
            e00Var = e00.g;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            e00Var = e00.i;
        }
        BannerAdSize bannerAdSize = request.getCom.ironsource.mediationsdk.j.h java.lang.String();
        l03 l03Var = bannerAdSize != null ? a.a(bannerAdSize).a : null;
        Map<String, String> parameters = request.getParameters();
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        ua a = vw2Var2.a();
        wo woVar = new wo(e00Var, l03Var, parameters, a != null ? new f00(a.a, a.b, a.c) : null);
        xt2 xt2Var = new xt2(this.a, nt3Var);
        BuildersKt__Builders_commonKt.launch$default(xt2Var.a, null, null, new wt2(xt2Var, woVar, vq3Var, null), 3, null);
    }
}
