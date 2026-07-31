package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.Map;

/* loaded from: classes12.dex */
public final class ip1 implements eo1 {
    @Override // yads.eo1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // yads.eo1
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map map, Map map2) {
        ((MediatedNativeAdapter) aVar).loadAd(context, (MediatedNativeAdapterListener) obj, map, map2);
    }
}
