package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class tp1 extends MediatedBannerAdapter {
    public final MediatedNativeAdapter a;
    public final wp1 b;
    public final Object c = new Object();
    public MediatedBannerAdapter.MediatedBannerAdapterListener d;
    public volatile boolean e;

    public tp1(MediatedNativeAdapter mediatedNativeAdapter, wp1 wp1Var) {
        this.a = mediatedNativeAdapter;
        this.b = wp1Var;
    }

    @Override // com.monetization.ads.mediation.base.a
    public final MediatedAdObject getAdObject() {
        return this.a.getAdObject();
    }

    @Override // com.monetization.ads.mediation.base.a
    public final MediatedAdapterInfo getAdapterInfo() {
        return this.a.getAdapterInfo();
    }

    @Override // com.monetization.ads.mediation.base.a
    public final boolean getShouldTrackImpressionAutomatically() {
        return this.a.getShouldTrackImpressionAutomatically();
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter
    public final void loadBanner(Context context, MediatedBannerAdapter.MediatedBannerAdapterListener mediatedBannerAdapterListener, Map map, Map map2) {
        if (this.e) {
            mediatedBannerAdapterListener.onAdFailedToLoad(new MediatedAdRequestError(1, "Load already in progress"));
            return;
        }
        synchronized (this.c) {
            if (this.e) {
                mediatedBannerAdapterListener.onAdFailedToLoad(new MediatedAdRequestError(1, "Load already in progress"));
                return;
            }
            this.e = true;
            this.d = mediatedBannerAdapterListener;
            Unit unit = Unit.INSTANCE;
            this.a.loadAd(context, new pp1(context, this.b, new qp1(this), new rp1(this), new sp1(this), this.c), map, map2);
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter
    public final void onInvalidate() {
        synchronized (this.c) {
            this.d = null;
            this.e = false;
            Unit unit = Unit.INSTANCE;
        }
    }
}
