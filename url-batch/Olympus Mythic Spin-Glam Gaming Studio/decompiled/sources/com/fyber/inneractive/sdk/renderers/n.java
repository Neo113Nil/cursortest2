package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.ironsource.B5;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* loaded from: classes4.dex */
public final class n extends com.fyber.inneractive.sdk.flow.b0 implements com.fyber.inneractive.sdk.interfaces.d, com.fyber.inneractive.sdk.util.a0 {
    public k A;
    public ImageView B;
    public InneractiveAdViewUnitController l;
    public IAmraidWebViewController m;
    public h n;
    public ViewGroup p;
    public l q;
    public i s;
    public d y;
    public j z;
    public long k = 0;
    public boolean o = false;
    public long r = 0;
    public int t = 0;
    public long u = 0;
    public boolean v = false;
    public boolean w = true;
    public boolean x = false;

    public final void I() {
        if (this.s != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.s);
            this.s = null;
        }
    }

    public final void J() {
        d dVar = this.y;
        if (dVar != null) {
            dVar.g = false;
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.j);
        }
        if (this.m != null) {
            I();
            com.fyber.inneractive.sdk.flow.x xVar = this.b;
            if (xVar != null) {
                ((q0) xVar).destroy();
            }
            this.m = null;
            this.b = null;
            ViewGroup viewGroup = this.p;
            if (viewGroup != null) {
                viewGroup.removeView(this.q);
            }
            l lVar = this.q;
            if (lVar != null) {
                lVar.removeAllViews();
                this.q = null;
            }
        }
        this.v = false;
    }

    public final int K() {
        l0 l0Var;
        int intValue;
        int i = this.t;
        if (i == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i <= 0) {
            s0 s0Var = this.a.getAdContent().d;
            if (s0Var != null && (l0Var = ((r0) s0Var).c) != null) {
                Integer num = l0Var.a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    intValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.t));
        intValue = this.t;
        return intValue * 1000;
    }

    public final boolean L() {
        s0 s0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        return (xVar == null || (s0Var = ((q0) xVar).d) == null || ((r0) s0Var).c == null || ((r0) s0Var).c.b == null || !((r0) s0Var).c.b.isFullscreenUnit()) ? false : true;
    }

    public final void M() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.b == null) {
            return;
        }
        IAlog.a("%srefreshing ad", IAlog.a(this));
        if ((!this.m.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) && (inneractiveAdViewUnitController = this.l) != null) {
            this.r = 0L;
            inneractiveAdViewUnitController.refreshAd();
        }
    }

    public final void N() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.b) == null || !mVar.getIsVisible() || this.r == 0 || this.m.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
            return;
        }
        if (!this.w) {
            if (this.k < System.currentTimeMillis() - this.r) {
                this.u = 1L;
            } else {
                this.u = this.k - (System.currentTimeMillis() - this.r);
            }
        }
        IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.u));
        a(false, this.u);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof q0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) ? false : true;
        }
        return true;
    }

    public final void d(boolean z) {
        if (this.s != null) {
            this.w = z;
            I();
            this.u = this.k - (System.currentTimeMillis() - this.r);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.u), Long.valueOf(this.k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null && (mVar = iAmraidWebViewController.b) != null) {
            j jVar = this.z;
            if (jVar != null) {
                mVar.removeOnLayoutChangeListener(jVar);
            }
            k kVar = this.A;
            if (kVar != null) {
                mVar.removeOnAttachStateChangeListener(kVar);
            }
        }
        this.B = null;
        I();
        J();
        this.n = null;
        com.fyber.inneractive.sdk.util.z.a.a.remove(this);
        i iVar = this.s;
        if (iVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(iVar);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void l() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int n() {
        return this.m.e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void s() {
        d dVar = this.y;
        if (dVar != null) {
            dVar.g = false;
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.j);
        }
        l lVar = this.q;
        if (lVar != null) {
            lVar.removeAllViews();
            this.q = null;
        }
        ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View x() {
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int y() {
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.m.e0) : com.fyber.inneractive.sdk.util.o.c(this.m.b.getHeight());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int z() {
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.m.d0) : com.fyber.inneractive.sdk.util.o.c(this.m.b.getWidth());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.rtb.watermark.b bVar;
        int i;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        l lVar;
        InneractiveAdSpot inneractiveAdSpot = this.a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.o = false;
        this.e = false;
        if (viewGroup != null) {
            this.p = viewGroup;
            this.l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.x) {
            J();
            if (!(this.a.getAdContent() instanceof q0)) {
                IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.a.getAdContent());
                return;
            }
            this.b = (q0) this.a.getAdContent();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).i : null;
        this.m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.n == null) {
                this.n = new h(this);
            }
            iAmraidWebViewController.setListener(this.n);
            InneractiveAdRequest inneractiveAdRequest = ((q0) this.b).a;
            int i2 = -1;
            if (L()) {
                l lVar2 = new l(this.p.getContext(), 1.5f);
                this.q = lVar2;
                IAmraidWebViewController iAmraidWebViewController2 = this.m;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.b;
                if (mVar != null) {
                    lVar2.addView(mVar, layoutParams);
                    com.fyber.inneractive.sdk.util.l0.a.a(lVar2.getContext(), iAmraidWebViewController2.b, iAmraidWebViewController2);
                    com.fyber.inneractive.sdk.web.m mVar2 = iAmraidWebViewController2.b;
                    if (mVar2 != null) {
                        mVar2.setTapListener(iAmraidWebViewController2);
                    }
                }
                this.p.addView(this.q, new ViewGroup.LayoutParams(-2, -2));
            } else {
                this.q = new l(this.p.getContext(), 0.0f);
                q0 q0Var = (q0) this.b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) q0Var.b;
                h1 a = a(fVar.e, fVar.f, q0Var.d);
                this.m.setAdDefaultSize(a.a, a.b);
                IAmraidWebViewController iAmraidWebViewController3 = this.m;
                View view = iAmraidWebViewController3.b;
                if (view != null || com.fyber.inneractive.sdk.util.o.a == null) {
                    ViewParent parent = view != null ? view.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    RelativeLayout.LayoutParams a2 = com.fyber.inneractive.sdk.util.v.a(a.a, a.b, 13);
                    IAmraidWebViewController iAmraidWebViewController4 = this.m;
                    l lVar3 = this.q;
                    com.fyber.inneractive.sdk.web.m mVar3 = iAmraidWebViewController4.b;
                    if (mVar3 != null) {
                        lVar3.addView(mVar3, a2);
                        com.fyber.inneractive.sdk.util.l0.a.a(lVar3.getContext(), iAmraidWebViewController4.b, iAmraidWebViewController4);
                        com.fyber.inneractive.sdk.web.m mVar4 = iAmraidWebViewController4.b;
                        if (mVar4 != null) {
                            mVar4.setTapListener(iAmraidWebViewController4);
                        }
                    }
                    this.p.addView(this.q);
                    l lVar4 = this.q;
                    ViewGroup.LayoutParams layoutParams2 = lVar4.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    lVar4.setLayoutParams(layoutParams2);
                    InneractiveAdSpot inneractiveAdSpot2 = this.a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.p) != null) {
                        Context context = viewGroup2.getContext();
                        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, this.a.getAdContent().a, this.a.getAdContent().b, this.a.getAdContent().c);
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, this.p, false);
                        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        IFyberAdIdentifier iFyberAdIdentifier = gVar.d;
                        iFyberAdIdentifier.k = corner;
                        iFyberAdIdentifier.a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        IAmraidWebViewController iAmraidWebViewController5 = this.m;
                        if (iAmraidWebViewController5 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController5.b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && x() != null) {
                            ViewGroup.LayoutParams layoutParams3 = x().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController6 = this.m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController6.a(viewGroup4, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
                        }
                    }
                    InneractiveAdSpot inneractiveAdSpot3 = this.a;
                    if (inneractiveAdSpot3 != null && (inneractiveAdSpot3 instanceof h0) && this.m != null && this.q != null && view != null && (bVar = ((h0) inneractiveAdSpot3).m) != null) {
                        ImageView imageView = bVar.a;
                        this.B = imageView;
                        if (imageView != null) {
                            if (L()) {
                                i = -1;
                            } else {
                                i2 = a.a;
                                i = a.b;
                            }
                            if (this.z == null) {
                                j jVar = new j(this);
                                this.z = jVar;
                                view.addOnLayoutChangeListener(jVar);
                            }
                            if (this.A == null) {
                                k kVar = new k(this);
                                this.A = kVar;
                                view.addOnAttachStateChangeListener(kVar);
                            }
                            this.B.setLayoutParams(com.fyber.inneractive.sdk.util.v.a(i2, i, 13));
                            this.q.addView(this.B);
                            IAmraidWebViewController iAmraidWebViewController7 = this.m;
                            h1 h1Var = new h1(i2, i);
                            iAmraidWebViewController7.o0 = bVar;
                            iAmraidWebViewController7.p0 = h1Var;
                            ImageView imageView2 = bVar.a;
                            if (imageView2 != null) {
                                iAmraidWebViewController7.a(imageView2, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark);
                            }
                        }
                    }
                } else if (this.x) {
                    FrameLayout frameLayout = new FrameLayout(this.p.getContext());
                    frameLayout.setBackgroundResource(R.color.ia_blank_background);
                    this.p.removeAllViews();
                    this.p.addView(frameLayout, new FrameLayout.LayoutParams(a.a, a.b, 17));
                } else {
                    this.x = true;
                    iAmraidWebViewController3.b = iAmraidWebViewController3.a(((q0) this.b).c);
                    try {
                        iAmraidWebViewController3.h();
                        DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(iAmraidWebViewController3.b, iAmraidWebViewController3.p, iAmraidWebViewController3.q, POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
                    } catch (Throwable unused) {
                        FrameLayout frameLayout2 = new FrameLayout(this.p.getContext());
                        frameLayout2.setBackgroundResource(R.color.ia_blank_background);
                        this.p.removeAllViews();
                        this.p.addView(frameLayout2, new FrameLayout.LayoutParams(a.a, a.b, 17));
                    }
                }
            }
            com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
            com.fyber.inneractive.sdk.response.f fVar2 = xVar2 != null ? (com.fyber.inneractive.sdk.response.f) ((q0) xVar2).b : null;
            if (fVar2 != null && (lVar = this.q) != null) {
                d dVar = new d(fVar2, lVar, new g(this));
                this.y = dVar;
                dVar.h = false;
                dVar.d = 1;
                dVar.e = 0.0f;
                int i3 = fVar2.s;
                if (i3 >= 1) {
                    dVar.d = Math.min(i3, 100);
                }
                float f = fVar2.t;
                if (f >= -1.0f) {
                    dVar.e = f;
                }
                if (dVar.e >= 0.0f) {
                    IAlog.a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    dVar.c = 0.0f;
                    dVar.f = System.currentTimeMillis();
                    dVar.g = true;
                    dVar.a();
                }
            }
        } else {
            IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", xVar);
        }
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.a;
        if (b0Var.a.contains(this)) {
            return;
        }
        b0Var.a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void p() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.b) == null) {
            return;
        }
        if (!mVar.getIsVisible() || com.fyber.inneractive.sdk.util.z.a.b || this.m.p() || this.m.N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
            IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
            this.u = 1L;
            return;
        }
        IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
        long K = K();
        this.k = K;
        if (K != 0) {
            a(false, 10000L);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int d() {
        return this.m.d0;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    public final void a(boolean z, long j) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.m mVar;
        if (!TextUtils.isEmpty(this.a.getMediationNameString()) || j == 0 || (this.a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.t == -1 || (iAmraidWebViewController = this.m) == null || (mVar = iAmraidWebViewController.b) == null) {
            return;
        }
        if (!mVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.r = System.currentTimeMillis();
        this.k = z ? this.k : j;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j), Long.valueOf(this.k));
        if (j > 1) {
            i iVar = this.s;
            if (iVar != null) {
                com.fyber.inneractive.sdk.util.r.b.removeCallbacks(iVar);
            }
            I();
            i iVar2 = new i(this);
            this.s = iVar2;
            com.fyber.inneractive.sdk.util.r.b.postDelayed(iVar2, j);
            return;
        }
        M();
    }

    public static h1 a(int i, int i2, s0 s0Var) {
        int a;
        int a2;
        l0 l0Var;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i > 0 && i2 > 0) {
            a = com.fyber.inneractive.sdk.util.o.a(i);
            a2 = com.fyber.inneractive.sdk.util.o.a(i2);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (s0Var != null && (l0Var = ((r0) s0Var).c) != null) {
                unitDisplayType = l0Var.b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                a = com.fyber.inneractive.sdk.util.o.a(m.RECTANGLE_WIDTH.value);
                a2 = com.fyber.inneractive.sdk.util.o.a(m.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.k.m()) {
                a = com.fyber.inneractive.sdk.util.o.a(m.BANNER_TABLET_WIDTH.value);
                a2 = com.fyber.inneractive.sdk.util.o.a(m.BANNER_TABLET_HEIGHT.value);
            } else {
                a = com.fyber.inneractive.sdk.util.o.a(m.BANNER_WIDTH.value);
                a2 = com.fyber.inneractive.sdk.util.o.a(m.BANNER_HEIGHT.value);
            }
        }
        IAlog.e("View layout params: final scaled width and height: %d, %d", Integer.valueOf(a), Integer.valueOf(a2));
        return new h1(a, a2);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i) {
        this.t = i;
    }
}
