package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.n0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.web.g0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class u implements g0 {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        String str2;
        v vVar = this.a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(vVar));
        Context w = this.a.w();
        v vVar2 = this.a;
        com.fyber.inneractive.sdk.interfaces.e eVar = vVar2.k;
        if (eVar != null) {
            w = vVar2.c(eVar.getLayout());
        }
        Context context = w;
        v vVar3 = this.a;
        if (!vVar3.f) {
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No context or no native click detected"));
        }
        com.fyber.inneractive.sdk.flow.x xVar = vVar3.b;
        com.fyber.inneractive.sdk.response.e eVar2 = xVar == null ? null : ((q0) xVar).b;
        if (eVar2 != null && (str2 = eVar2.l) != null && str2.trim().length() > 0) {
            IAlog.d("AD_CLICKED", new Object[0]);
            z0.b(str2);
        }
        v vVar4 = this.a;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = vVar4.G == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY;
        com.fyber.inneractive.sdk.cache.session.e eVar3 = IAConfigManager.N.w.a;
        if (eVar3 != null) {
            com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar3, aVar, cVar));
        }
        return this.a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z) {
        if (z) {
            v vVar = this.a;
            if (!vVar.s) {
                vVar.s = true;
                com.fyber.inneractive.sdk.interfaces.e eVar = vVar.k;
                if (eVar != null) {
                    vVar.d(eVar.isCloseButtonDisplay());
                }
            }
            v vVar2 = this.a;
            if (!vVar2.q) {
                vVar2.q = true;
                v1 v1Var = new v1(TimeUnit.MILLISECONDS, vVar2.r);
                vVar2.m = v1Var;
                v1Var.e = new n0(vVar2);
                v1Var.d = false;
                v1Var.c.sendEmptyMessage(1932593528);
            }
            com.fyber.inneractive.sdk.interfaces.e eVar2 = this.a.k;
            if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
                return;
            }
            v vVar3 = this.a;
            vVar3.p = false;
            com.fyber.inneractive.sdk.interfaces.e eVar3 = vVar3.k;
            if (eVar3 != null) {
                eVar3.disableCloseButton();
            }
            com.fyber.inneractive.sdk.util.a aVar = vVar3.v;
            aVar.d = 0L;
            aVar.e = 0L;
            aVar.f = 0L;
            aVar.b = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        v vVar = this.a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(vVar));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        v vVar = this.a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(vVar));
        v vVar2 = this.a;
        vVar2.D = true;
        vVar2.Q();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        v vVar = this.a;
        vVar.w();
        vVar.c(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        v vVar = this.a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(vVar));
        v vVar2 = this.a;
        if (vVar2.D) {
            vVar2.D = false;
            vVar2.Q();
            return;
        }
        if (vVar2.G == UnitDisplayType.REWARDED) {
            vVar2.P();
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.a.k;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g0
    public final void b() {
        this.a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.a.a(new WebViewRendererProcessHasGoneError());
        this.a.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        v vVar = this.a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(vVar));
        com.fyber.inneractive.sdk.interfaces.e eVar = this.a.k;
        if (eVar == null || eVar.getLayout() == null) {
            return;
        }
        v vVar2 = this.a;
        if (!vVar2.E) {
            com.fyber.inneractive.sdk.network.b0.a(vVar2.k.getLayout().getContext(), str, str2, this.a.b);
            v vVar3 = this.a;
            vVar3.E = true;
            IAlog.a("%sreporting auto redirect", IAlog.a(vVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(vVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z) {
        String str;
        if (z) {
            v vVar = this.a;
            if (!vVar.y) {
                vVar.y = true;
                if (vVar.b != null) {
                    IAmraidWebViewController iAmraidWebViewController = vVar.z;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    com.fyber.inneractive.sdk.response.e eVar = ((q0) vVar.b).b;
                    if (eVar != null && (str = eVar.k) != null && str.trim().length() > 0) {
                        IAlog.e("%sfiring impression!", IAlog.a(vVar));
                        IAlog.d("AD_IMPRESSION", new Object[0]);
                        z0.b(str);
                    }
                    com.fyber.inneractive.sdk.web.m mVar = vVar.z.b;
                    if (mVar != null) {
                        mVar.a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    com.fyber.inneractive.sdk.cache.session.enums.c cVar = vVar.G == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY;
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.N.w.a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                    vVar.E();
                    vVar.J();
                }
            }
        }
        v vVar2 = this.a;
        vVar2.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(vVar2), Boolean.valueOf(z));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z, Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.a.k;
        if (eVar != null) {
            eVar.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.a.k;
        if (eVar == null || eVar.getLayout() == null) {
            return false;
        }
        v vVar = this.a;
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(vVar.c(vVar.k.getLayout()), str);
        if (startRichMediaIntent) {
            this.a.c(false);
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        this.a.e(false);
        v vVar = this.a;
        InneractiveUnitController.EventsListener eventsListener = vVar.c;
        if (eventsListener != null) {
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(vVar.a, mraidVideoFailedToDisplayError);
        }
    }
}
