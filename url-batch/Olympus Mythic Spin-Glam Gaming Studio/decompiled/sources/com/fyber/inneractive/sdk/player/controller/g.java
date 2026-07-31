package com.fyber.inneractive.sdk.player.controller;

import android.media.AudioManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class g extends z implements com.fyber.inneractive.sdk.flow.storepromo.loader.b {
    public boolean A;
    public final boolean B;
    public final boolean z;

    public g(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z, boolean z2, String str) {
        super(fVar, sVar, s0Var, rVar, z, str);
        this.z = false;
        this.A = false;
        com.fyber.inneractive.sdk.player.f fVar2 = this.a;
        com.fyber.inneractive.sdk.flow.storepromo.b bVar = fVar2 != null ? ((com.fyber.inneractive.sdk.player.n) fVar2).w : null;
        if (bVar != null) {
            bVar.e = this;
        }
        this.z = false;
        this.B = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean A() {
        return !this.z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void E() {
        q qVar;
        super.E();
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar == null || (qVar = fVar.a) == null || qVar.e != com.fyber.inneractive.sdk.player.enums.b.Completed || !this.z) {
            return;
        }
        this.d.m();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a() {
        if (!this.h) {
            f();
            return;
        }
        if (this.d.c()) {
            return;
        }
        this.d.a(false);
        Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        E();
        D();
        this.k = false;
        this.h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z) {
        super.b(z);
        if (this.z) {
            this.d.m();
            this.d.g(false);
            this.f = 0;
        }
        C();
        this.d.e(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void f() {
        int i;
        int i2;
        AudioManager audioManager;
        super.f();
        com.fyber.inneractive.sdk.player.f fVar = this.a;
        if (fVar != null && fVar.a != null && !this.A) {
            try {
                audioManager = (AudioManager) this.d.getContext().getSystemService("audio");
                i = audioManager.getRingerMode();
            } catch (Throwable unused) {
                i = 0;
            }
            try {
                i2 = audioManager.getStreamVolume(2);
            } catch (Throwable unused2) {
                i2 = 0;
                if (this.z) {
                }
                if (i2 > 0) {
                    IAlog.a("%s setting default volume. unmuting player", IAlog.a(this));
                    i(false);
                }
                this.d.setMuteButtonState(p());
                this.A = true;
                h(false);
            }
            if ((this.z && ((r0) this.b).f.d.booleanValue()) || this.B || p()) {
                f(false);
            } else if (i2 > 0 && i == 2) {
                IAlog.a("%s setting default volume. unmuting player", IAlog.a(this));
                i(false);
            }
            this.d.setMuteButtonState(p());
            this.A = true;
        }
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.N.t.b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(3:8|(1:10)(1:55)|(1:54))(1:56)|13|14|15|(3:17|18|(2:20|21)(4:(1:27)|(1:(1:(2:37|(1:42)(2:40|41)))(2:31|32))(1:(2:46|(1:48)(2:49|50)))|35|36))|52|18|(0)(0)))|57|6|(0)(0)|13|14|15|(0)|52|18|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #0 {Exception -> 0x007a, blocks: (B:15:0x0065, B:17:0x006d), top: B:14:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.fyber.inneractive.sdk.player.controller.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o() {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        int i;
        x0 a;
        com.fyber.inneractive.sdk.config.l a2;
        int i2;
        t0 t0Var;
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            if (new ArrayList(cVar2.c.values()).size() > 0) {
                cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
                if (cVar == null) {
                    Integer a3 = cVar.a("skip_time_sec");
                    i = a3 != null ? a3.intValue() : 5;
                    if (i < 0 || i > 8) {
                        i = 5;
                    }
                } else {
                    i = -1;
                }
                a = x0.a(this.a);
                com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.N.t.b;
                s0 s0Var = this.b;
                Skip skip = this.x;
                boolean isCurrentUserAChild = InneractiveAdManager.isCurrentUserAChild();
                a2 = oVar.a("vast_configuration");
                a2.getClass();
                if (a2.a.containsKey("skip_d")) {
                    i2 = Integer.parseInt((String) a2.a.get("skip_d"));
                    int max = Math.max(i2, -1);
                    if (a.a()) {
                        return a.a;
                    }
                    if (skip == null && s0Var != null && (t0Var = ((r0) s0Var).f) != null) {
                        skip = t0Var.h;
                    }
                    if (isCurrentUserAChild) {
                        if (i > -1 && i <= 8) {
                            return i;
                        }
                        if (max <= -1 || max > 8) {
                            int intValue = skip.value().intValue();
                            if (intValue <= -1 || intValue > 8) {
                                return 5;
                            }
                            return skip.value().intValue();
                        }
                    } else if (max <= -1 || max > 5) {
                        if (skip == Skip.DEFAULT) {
                            return 99999;
                        }
                        return skip.value().intValue();
                    }
                    return max;
                }
                i2 = -1;
                int max2 = Math.max(i2, -1);
                if (a.a()) {
                }
            }
        }
        cVar = null;
        if (cVar == null) {
        }
        a = x0.a(this.a);
        com.fyber.inneractive.sdk.config.o oVar2 = IAConfigManager.N.t.b;
        s0 s0Var2 = this.b;
        Skip skip2 = this.x;
        boolean isCurrentUserAChild2 = InneractiveAdManager.isCurrentUserAChild();
        a2 = oVar2.a("vast_configuration");
        a2.getClass();
        if (a2.a.containsKey("skip_d")) {
        }
        i2 = -1;
        int max22 = Math.max(i2, -1);
        if (a.a()) {
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() {
        g0 g0Var = this.g;
        if (g0Var != null) {
            g0Var.g();
        }
        this.r = true;
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        g0 g0Var = this.g;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        this.d.g(true);
        C();
        h();
        f();
        h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        if (this.z) {
            this.d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z) {
        e(z);
        super.a(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void b(g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        TapAction tapAction = ((r0) this.b).f.i;
        if (tapAction == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
            return;
        }
        if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            return;
        }
        if (((com.fyber.inneractive.sdk.config.global.features.v) this.c.a(com.fyber.inneractive.sdk.config.global.features.v.class)).c().equals(com.fyber.inneractive.sdk.config.global.features.u.OPEN) || ((this.t != com.fyber.inneractive.sdk.ignite.m.NONE && IAConfigManager.N.D.n()) || ((sVar = this.d) != null && sVar.b()))) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) {
        a(11, g1Var);
    }
}
