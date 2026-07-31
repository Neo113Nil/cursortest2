package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;
import com.pubmatic.sdk.common.POBCommonConstants;

/* loaded from: classes4.dex */
public class r extends e implements com.fyber.inneractive.sdk.interfaces.d, InneractiveNativeVideoContentController.Renderer, m0 {
    public FrameLayout l;
    public com.fyber.inneractive.sdk.player.ui.m m;
    public VideoContentListener n;
    public ViewGroup p;
    public f0 q;
    public p t;
    public final o o = new o(this);
    public float r = 0.0f;
    public final Rect s = new Rect();
    public boolean u = false;
    public final q v = new q(this);

    public void I() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            t0 t0Var = (t0) xVar;
            if (t0Var.j) {
                return;
            }
            t0Var.j = true;
            E();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.p);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int d() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.n = null;
        s();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void l() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int n() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void p() {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) bVar;
            IAlog.a("%sfullscreenExited called", IAlog.a(sVar));
            sVar.E = false;
            sVar.j(sVar.D);
            com.fyber.inneractive.sdk.player.f fVar = sVar.a;
            if (fVar == null || (qVar = fVar.a) == null) {
                return;
            }
            sVar.a(qVar.e);
            sVar.a(sVar.a.a.b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void s() {
        ViewGroup viewGroup;
        p pVar = this.t;
        if (pVar != null && (viewGroup = this.p) != null) {
            viewGroup.removeCallbacks(pVar);
            this.t = null;
        }
        l0.a.a(this.p);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.p);
        if (this.k != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.k;
            sVar.getClass();
            sVar.g = null;
            ((com.fyber.inneractive.sdk.player.controller.s) this.k).destroy();
            this.k = null;
        }
        if (this.m != null) {
            ViewGroup viewGroup2 = this.p;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutTransition(null);
                this.p.removeView(this.l);
            }
            this.m.destroy();
            this.m = null;
        }
        this.l = null;
        this.q = null;
        this.p = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context w() {
        return c((View) this.p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public View x() {
        return this.l;
    }

    public boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof t0;
    }

    public void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.flow.x xVar;
        InneractiveAdSpot inneractiveAdSpot = this.a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!a(selectedUnitController)) {
            IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        } else {
            this.n = a(selectedUnitController.getSelectedContentController());
        }
        this.u = false;
        this.l = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
        com.fyber.inneractive.sdk.player.t tVar = xVar2 != null ? ((t0) xVar2).i : null;
        Context context = viewGroup.getContext();
        f0 a = a(tVar);
        this.q = a;
        if (a == null || (xVar = this.b) == null) {
            return;
        }
        this.m = a.a(context, ((t0) xVar).c);
        this.k = (com.fyber.inneractive.sdk.player.controller.s) this.q.a(this.a, (t0) this.b);
        ViewGroup viewGroup2 = this.p;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.l, new ViewGroup.LayoutParams(-1, -2));
            this.p.setLayoutTransition(null);
        }
        this.l.addView((View) this.m, new FrameLayout.LayoutParams(-2, -2, 17));
        com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.k;
        q qVar = this.v;
        sVar.getClass();
        sVar.g = qVar;
        com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.k;
        this.q.b();
        sVar2.b(false);
        this.q.a(this.o);
        ViewGroup viewGroup3 = this.p;
        if (viewGroup3 != null) {
            n0 n0Var = l0.a;
            n0Var.getClass();
            n0Var.a(viewGroup3.getContext(), viewGroup3, this);
        }
    }

    public boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof InneractiveAdViewUnitController;
    }

    public VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (inneractiveContentController instanceof InneractiveAdViewVideoContentController) {
            return (VideoContentListener) ((InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
        }
        IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), inneractiveContentController != null ? inneractiveContentController.getClass().getSimpleName() : POBCommonConstants.NULL_VALUE);
        return null;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.r == f && this.s.equals(rect)) {
            return;
        }
        this.r = f;
        this.s.set(rect);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).D = false;
            ((com.fyber.inneractive.sdk.player.ui.e) this.m).f();
            ((com.fyber.inneractive.sdk.player.controller.s) this.k).a(f);
        }
        if (f > 0.0f) {
            p pVar = this.t;
            if (pVar != null && (viewGroup2 = this.p) != null) {
                viewGroup2.removeCallbacks(pVar);
                this.t = null;
            }
            p pVar2 = new p(this);
            this.t = pVar2;
            ViewGroup viewGroup3 = this.p;
            if (viewGroup3 != null) {
                viewGroup3.postDelayed(pVar2, 100L);
                return;
            }
            return;
        }
        p pVar3 = this.t;
        if (pVar3 == null || (viewGroup = this.p) == null) {
            return;
        }
        viewGroup.removeCallbacks(pVar3);
        this.t = null;
    }

    public f0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar == null || tVar.f == null) {
            return null;
        }
        return new a(tVar);
    }
}
