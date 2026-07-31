package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* loaded from: classes15.dex */
public abstract class o implements com.fyber.inneractive.sdk.interfaces.a, com.fyber.inneractive.sdk.interfaces.b {
    public com.fyber.inneractive.sdk.interfaces.c a;
    public n b;
    public com.fyber.inneractive.sdk.config.global.r c;
    public com.fyber.inneractive.sdk.network.m d;
    public final String e;
    public boolean f = false;

    public o(String str) {
        this.e = str;
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (IAlog.a <= 3) {
            Thread.dumpStack();
        }
        IAlog.e("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.b != null) {
            if (eVar != null && eVar.i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.i + ": " + eVar.j));
            }
            ((e0) this.b).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    public void b(InneractiveAdRequest inneractiveAdRequest) {
    }

    public final com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.a;
        if (cVar == null) {
            return null;
        }
        k kVar = (k) cVar;
        x xVar = kVar.c;
        return xVar != null ? xVar.b : kVar.b;
    }

    public String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a(InneractiveAdRequest inneractiveAdRequest) {
        x xVar;
        com.fyber.inneractive.sdk.response.e eVar;
        s0 s0Var;
        IAlog.e("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.c cVar = this.a;
        if (cVar != null) {
            n nVar = this.b;
            if (nVar != null && (xVar = ((k) cVar).c) != null) {
                e0 e0Var = (e0) nVar;
                if (e0Var.a.n.get()) {
                    IAlog.a("%s: onAdLoaded: spot is already destroyed", h0.a(e0Var.a));
                    h0 h0Var = e0Var.a;
                    p pVar = h0Var.l;
                    h0Var.a(xVar);
                } else {
                    h0 h0Var2 = e0Var.a;
                    if (!h0Var2.j && (s0Var = h0Var2.f) != null && s0Var.supportsRefresh()) {
                        if (e0Var.a.f.canRefreshAd()) {
                            h0 h0Var3 = e0Var.a;
                            h0Var3.e = xVar;
                            xVar.a = inneractiveAdRequest;
                            g0 g0Var = h0Var3.i;
                            if (g0Var != null) {
                                g0Var.onAdRefreshed(h0Var3);
                            } else {
                                s0 s0Var2 = h0Var3.f;
                                if (s0Var2 instanceof InneractiveAdViewUnitController) {
                                    ((InneractiveAdViewUnitController) s0Var2).onAdRefreshed(h0Var3);
                                }
                            }
                        } else {
                            IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", h0.a(e0Var.a));
                            h0 h0Var4 = e0Var.a;
                            h0Var4.i.onAdRefreshFailed(h0Var4, InneractiveErrorCode.CANCELLED);
                        }
                    } else {
                        h0 h0Var5 = e0Var.a;
                        h0Var5.e = xVar;
                        xVar.a = inneractiveAdRequest;
                        Iterator it = h0Var5.g.iterator();
                        while (it.hasNext()) {
                            s0 s0Var3 = (s0) it.next();
                            if (s0Var3.supports(h0Var5)) {
                                h0Var5.f = s0Var3;
                                h0 h0Var6 = e0Var.a;
                                InneractiveAdSpot.RequestListener requestListener = h0Var6.b;
                                if (requestListener != null) {
                                    if (requestListener instanceof InneractiveAdSpot.NativeAdRequestListener) {
                                        InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                        s0 s0Var4 = h0Var6.f;
                                        if ((xVar instanceof w0) && (s0Var4 instanceof NativeAdUnitController)) {
                                            w0 w0Var = (w0) xVar;
                                            w0Var.v = (NativeAdUnitController) s0Var4;
                                            nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(h0Var6, w0Var);
                                        } else {
                                            IAlog.b("%s: Invalid native response: controller or/and content mismatch", IAlog.a(h0Var6));
                                            nativeAdRequestListener.onInneractiveFailedAdRequest(h0Var6, InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                        }
                                    } else {
                                        requestListener.onInneractiveSuccessfulAdRequest(h0Var6);
                                    }
                                }
                                e0Var.a.j = false;
                            }
                        }
                        e0Var.a.e.destroy();
                        IAlog.a("%sCannot find appropriate unit controller for unit: %s", h0.a(e0Var.a), e0Var.a.e.d);
                        m mVar = e0Var.a.h;
                        com.fyber.inneractive.sdk.response.e c = mVar != null ? mVar.c() : null;
                        e0Var.a(inneractiveAdRequest, c, new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.COULD_NOT_SELECT_UNIT_CONTROLLER, new Exception("Cannot find appropriate unit controller for unit: " + e0Var.a.e.d)));
                        h0 h0Var7 = e0Var.a;
                        h0Var7.e = null;
                        h0Var7.j = false;
                    }
                    String str = e0Var.a.a;
                    com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.d;
                    dVar.a(str).e();
                    dVar.a(str).b();
                    h0 h0Var8 = e0Var.a;
                    x xVar2 = h0Var8.e;
                    if (xVar2 != null && (eVar = xVar2.b) != null && eVar.n != null) {
                        x xVar3 = h0Var8.e;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3.b;
                        new com.fyber.inneractive.sdk.metrics.c(eVar2, h0Var8.c, h0Var8.a, eVar2.n, xVar3.c.b()).a();
                    }
                }
            } else {
                IAlog.b("%sgot onAdLoaded! but content or listener is null", d());
            }
            this.a = null;
        }
        b(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        x xVar;
        IAlog.e("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.a;
        InneractiveAdRequest inneractiveAdRequest = (cVar == null || (xVar = ((k) cVar).c) == null) ? null : xVar.a;
        com.fyber.inneractive.sdk.response.e c = c();
        IAlog.e("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        n nVar = this.b;
        if (nVar != null) {
            ((e0) nVar).a(inneractiveAdRequest, c, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
            a(inneractiveAdRequest, c);
        }
    }

    public void a(boolean z) {
        this.f = true;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.a;
        if (cVar == null || !z) {
            return;
        }
        cVar.cancel();
        x xVar = ((k) this.a).c;
        if (xVar != null) {
            xVar.destroy();
        }
        this.a = null;
    }
}
