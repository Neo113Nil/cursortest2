package yads;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;

/* loaded from: classes5.dex */
public final class hq1 implements eo1 {
    public MediatedRewardedAdapter a;

    @Override // yads.eo1
    public final void a(Object obj) {
        ((MediatedRewardedAdapter) obj).onInvalidate();
    }

    @Override // yads.eo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        MediatedRewardedAdapter mediatedRewardedAdapter = (MediatedRewardedAdapter) aVar;
        this.a = mediatedRewardedAdapter;
        mediatedRewardedAdapter.loadRewardedAd(context, (MediatedRewardedAdapterListener) obj, map, map2);
    }
}
