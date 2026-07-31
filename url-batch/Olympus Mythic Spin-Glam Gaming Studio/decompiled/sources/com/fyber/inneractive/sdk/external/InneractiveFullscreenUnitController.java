package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.i;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class InneractiveFullscreenUnitController extends s0 implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {
    public InneractiveFullScreenAdRewardedListener b;
    protected com.fyber.inneractive.sdk.interfaces.f mRenderer;
    public boolean a = false;
    public final g c = new g(this);

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError() {
            super("Ad Expired");
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.p);
        p0.startActivity(p1);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.mRenderer;
        if (fVar != null) {
            fVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.b;
    }

    public boolean isAvailable() {
        i0 i0Var = (i0) v.a(this.mAdSpot);
        return i0Var != null && i0Var.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        if (activity == null) {
            IAlog.f("show() called with a null activity", new Object[0]);
            return;
        }
        if (this.a) {
            IAlog.f("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
            return;
        }
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        x adContent = adSpot.getAdContent();
        com.fyber.inneractive.sdk.interfaces.f fVar = null;
        if (adContent != null) {
            u uVar = u.IA_PUBLISHER_REQUESTED_SHOW;
            InneractiveAdRequest inneractiveAdRequest = adContent.a;
            com.fyber.inneractive.sdk.response.e eVar = adContent.b;
            JSONArray b = adContent.c.b();
            w wVar = new w(eVar);
            wVar.c = uVar;
            wVar.a = inneractiveAdRequest;
            wVar.d = b;
            wVar.a((String) null);
        }
        if (!adSpot.isReady()) {
            InneractiveUnitController.EventsListener eventsListener = this.mEventsListener;
            if (eventsListener != null) {
                ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(adSpot, new AdExpiredError());
                return;
            }
            return;
        }
        if (this.mRenderer == null) {
            i iVar = com.fyber.inneractive.sdk.factories.h.a;
            InneractiveAdSpot adSpot2 = getAdSpot();
            Iterator it = iVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.fyber.inneractive.sdk.factories.g gVar = (com.fyber.inneractive.sdk.factories.g) it.next();
                if (gVar.a(adSpot2)) {
                    fVar = gVar.b(adSpot2);
                    break;
                }
            }
            this.mRenderer = fVar;
        }
        selectContentController();
        adSpot.getLocalUniqueId();
        Intent intent = new Intent(activity, (Class<?>) InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", adSpot.getLocalUniqueId());
        try {
            IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(activity), adSpot.getLocalUniqueId());
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(activity));
        }
        this.a = true;
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.mRenderer;
        if (fVar2 != null) {
            fVar2.a(this.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.s0 s0Var = inneractiveAdSpot.getAdContent().d;
        if (s0Var != null) {
            r0 r0Var = (r0) s0Var;
            if (r0Var.e == null) {
                l0 l0Var = r0Var.c;
                if (l0Var != null && UnitDisplayType.INTERSTITIAL.equals(l0Var.b)) {
                    return true;
                }
                t0 t0Var = r0Var.f;
                return t0Var != null && (UnitDisplayType.REWARDED.equals(t0Var.j) || UnitDisplayType.INTERSTITIAL.equals(t0Var.j) || UnitDisplayType.VERTICAL.equals(t0Var.j));
            }
        }
        IAlog.f("%s : supports() called with unit config null", IAlog.a(this));
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }
}
