package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.ad.OguryBannerAdView;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c1 implements ah {
    public final /* synthetic */ d1 a;

    public c1(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // com.ogury.ad.internal.ah
    public final void a(Context context, List ads) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ads, "ads");
        d1 d1Var = this.a;
        x0 x0Var = d1Var.g;
        if (x0Var != null) {
            OguryBannerAdView bannerView = d1Var.b;
            Intrinsics.checkNotNullParameter(bannerView, "bannerView");
            Intrinsics.checkNotNullParameter(ads, "ads");
            x0Var.h = bannerView;
            try {
                b bVar = (b) ads.remove(0);
                Intrinsics.checkNotNullParameter(ads, "<this>");
                CollectionsKt.removeAll(ads, (Function1) l8.a);
                if (!bVar.v) {
                    x0Var.a(bVar, bannerView, ads, false);
                    return;
                }
                x0Var.b.a(x0Var.a, bVar, new ArrayList());
                if (ads.isEmpty()) {
                    return;
                }
                x0Var.a((b) ads.remove(0), bannerView, ads, true);
            } catch (Throwable th) {
                Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, th);
                x0Var.b();
            }
        }
    }
}
