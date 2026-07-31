package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import java.util.Map;
import yads.eo1;

/* loaded from: classes8.dex */
public final class c implements eo1 {
    public MediatedAppOpenAdAdapter a;

    @Override // yads.eo1
    public final void a(Object obj) {
        ((MediatedAppOpenAdAdapter) obj).onInvalidate();
    }

    @Override // yads.eo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedAppOpenAdAdapter mediatedAppOpenAdAdapter = (MediatedAppOpenAdAdapter) aVar;
        this.a = mediatedAppOpenAdAdapter;
        mediatedAppOpenAdAdapter.loadAppOpenAd(context, (MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener) obj, map, map2);
    }
}
