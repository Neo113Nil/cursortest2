package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class l extends s {
    public static final g1 J;
    public final LayoutInflater A;
    public final com.fyber.inneractive.sdk.flow.g B;
    public boolean C;
    public v1 D;
    public k E;
    public int F;
    public int G;
    public View H;
    public boolean I;
    public final a z;

    static {
        g1 g1Var = new g1();
        g1Var.c = true;
        J = g1Var;
    }

    public l(Context context, com.fyber.inneractive.sdk.flow.g gVar, a aVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context, rVar, str);
        this.C = false;
        this.I = true;
        this.B = gVar;
        this.A = LayoutInflater.from(context);
        this.z = aVar;
    }

    public abstract void a(int i);

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        Integer num;
        this.H = bVar2.e;
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            bVar.a(viewGroup, bVar2);
            this.s.setVisibility(0);
            com.fyber.inneractive.sdk.model.vast.i iVar = bVar2.f;
            com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Static;
            if (iVar2 == iVar) {
                a(getEndCardView(), 4);
            }
            if ((iVar2 == iVar || iVar == com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) && (num = bVar2.d) != null) {
                b(iVar != iVar2 ? 8 : 4, num.intValue());
            }
        }
    }

    public void b(int i, int i2) {
        if (this.C || this.D != null) {
            return;
        }
        IAlog.a("Start Autoclick timer - %d seconds", Integer.valueOf(i2));
        v1 v1Var = new v1(TimeUnit.SECONDS, i2);
        this.D = v1Var;
        v1Var.e = new j(this, i);
        v1Var.d = false;
        v1Var.c.sendEmptyMessage(1932593528);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s, com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        p();
        this.C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.H;
    }

    public String getLocalizedCtaButtonText() {
        com.fyber.inneractive.sdk.config.global.r rVar = this.w;
        com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
        if (dVar == null) {
            return null;
        }
        dVar.d(IAConfigManager.N.o);
        com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
        if (aVar == null || !aVar.d) {
            return null;
        }
        return aVar.a;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public int getMaxTickFactor() {
        return 1000;
    }

    public int getSingleTickTime() {
        return 1000 / getTickFraction();
    }

    public int getTickFraction() {
        return 5;
    }

    public void h(boolean z) {
        String string = getContext().getString(R.string.ia_video_app_info_text);
        com.fyber.inneractive.sdk.config.global.r rVar = this.w;
        if (rVar != null) {
            Boolean c = ((v) rVar.a(v.class)).c("show_ad_identifier_original_design");
            this.I = c != null ? c.booleanValue() : true;
            string = ((com.fyber.inneractive.sdk.config.global.features.o) this.w.a(com.fyber.inneractive.sdk.config.global.features.o.class)).a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        }
        if (z && this.I) {
            b(false);
            a(true, string);
            c(true);
        } else if (z) {
            b(false);
            a(true, string);
            c(false);
        } else if (!this.I) {
            b(true);
            c(false);
        } else {
            a(false, (String) null);
            b(false);
            c(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        if (this.D != null) {
            IAlog.a("Autoclick paused", new Object[0]);
            v1 v1Var = this.D;
            v1Var.d = true;
            t1 t1Var = v1Var.c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        if (this.D != null) {
            IAlog.a("Autoclick resumed", new Object[0]);
            v1 v1Var = this.D;
            v1Var.d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.u = this.z.a(this.d, this.o, this.p, this.t, this.b, this.m);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.View
    public final void onWindowFocusChanged(boolean z) {
    }

    public final void p() {
        if (this.D != null) {
            IAlog.a("Autoclick is removed ", new Object[0]);
            this.D.e = null;
            this.D = null;
        }
    }

    public void setEndCardView(View view) {
        this.H = view;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i, int i2) {
        this.z.a(this.d, this.o, this.p, this.q, h1Var, i, i2, this.b, ((r0) this.c).f.f.intValue());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void a(int i, int i2) {
        Runnable runnable = this.E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.E = null;
        }
        this.G = getMaxTickFactor() + i2;
        int maxTickFactor = (getMaxTickFactor() / getTickFractions()) + i2;
        int i3 = this.G;
        if (i3 <= 0 || i3 > i) {
            return;
        }
        int i4 = this.F;
        if (maxTickFactor < i4 && i4 > 0) {
            a(i3);
            return;
        }
        this.F = maxTickFactor;
        a(maxTickFactor);
        k kVar = new k(this);
        this.E = kVar;
        postDelayed(kVar, this.l);
    }
}
