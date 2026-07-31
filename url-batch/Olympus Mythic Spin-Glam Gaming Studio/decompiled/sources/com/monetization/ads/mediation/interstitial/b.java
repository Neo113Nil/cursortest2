package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import java.util.Map;
import yads.eo1;

/* loaded from: classes14.dex */
public final class b implements eo1 {
    public MediatedInterstitialAdapter a;

    @Override // yads.eo1
    public final void a(Object obj) {
        ((MediatedInterstitialAdapter) obj).onInvalidate();
    }

    @Override // yads.eo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedInterstitialAdapter mediatedInterstitialAdapter = (MediatedInterstitialAdapter) aVar;
        this.a = mediatedInterstitialAdapter;
        mediatedInterstitialAdapter.loadInterstitial(context, (MediatedInterstitialAdapter.MediatedInterstitialAdapterListener) obj, map, map2);
    }
}
