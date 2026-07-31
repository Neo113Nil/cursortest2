package com.monetization.ads.mediation.banner;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import java.util.Map;
import yads.eo1;

/* loaded from: classes15.dex */
public final class b implements eo1 {
    @Override // yads.eo1
    public final void a(Object obj) {
        ((MediatedBannerAdapter) obj).onInvalidate();
    }

    @Override // yads.eo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedBannerAdapter) aVar).loadBanner(context, (MediatedBannerAdapter.MediatedBannerAdapterListener) obj, map, map2);
    }
}
