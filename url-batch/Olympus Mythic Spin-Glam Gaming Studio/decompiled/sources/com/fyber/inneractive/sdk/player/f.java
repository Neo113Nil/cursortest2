package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.v;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class f implements com.fyber.inneractive.sdk.player.controller.p, com.fyber.inneractive.sdk.player.controller.o {
    public com.fyber.inneractive.sdk.player.controller.q a;
    public t0 b;
    public InneractiveAdRequest c;
    public com.fyber.inneractive.sdk.measurement.e d;
    public com.fyber.inneractive.sdk.measurement.f e;
    public q l;
    public int m;
    public final x0 n;
    public com.fyber.inneractive.sdk.model.vast.r o;
    public p f = null;
    public boolean g = true;
    public boolean h = false;
    public volatile boolean i = false;
    public boolean j = false;
    public int k = 0;
    public final c p = new c(this);

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        Boolean c;
        boolean booleanValue;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.controller.q qVar2 = null;
        if (rVar != null) {
            try {
                c = ((v) rVar.a(v.class)).c("use_fmp_cache_mechanism");
            } catch (Throwable th) {
                if (IAlog.a <= 3) {
                    IAlog.a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
            }
            if (c != null) {
                booleanValue = c.booleanValue();
                qVar2 = new com.fyber.inneractive.sdk.player.controller.f(context, booleanValue, rVar);
                qVar2 = qVar2 == null ? new com.fyber.inneractive.sdk.player.controller.a(context) : qVar2;
                this.a = qVar2;
                if (!qVar2.b.contains(this)) {
                    qVar2.b.add(this);
                }
                qVar = this.a;
                if (!qVar.c.contains(this)) {
                    qVar.c.add(this);
                }
                this.a.f = this.p;
                this.n = new x0(eVar);
            }
        }
        booleanValue = false;
        qVar2 = new com.fyber.inneractive.sdk.player.controller.f(context, booleanValue, rVar);
        if (qVar2 == null) {
        }
        this.a = qVar2;
        if (!qVar2.b.contains(this)) {
        }
        qVar = this.a;
        if (!qVar.c.contains(this)) {
        }
        this.a.f = this.p;
        this.n = new x0(eVar);
    }

    public abstract void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", oVar.getMessage());
        a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, oVar), new JSONObject());
        if (this.h) {
            IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, oVar), new JSONObject());
        }
    }

    public abstract void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, x... xVarArr);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z) {
        try {
            t0 t0Var = this.b;
            com.fyber.inneractive.sdk.response.g gVar = t0Var != null ? (com.fyber.inneractive.sdk.response.g) t0Var.b : null;
            u uVar = u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.c;
            t0 t0Var2 = this.b;
            JSONArray b = t0Var2 == null ? null : t0Var2.c.b();
            w wVar = new w(gVar);
            wVar.c = uVar;
            wVar.a = inneractiveAdRequest;
            wVar.d = b;
            if (this.o != null && gVar != null) {
                wVar.f.put(new com.fyber.inneractive.sdk.network.x().a(String.valueOf(z), "waudio").a(this.o.g, "url").a(this.o.e, VastAttributes.BITRATE).a(TextUtils.isEmpty(this.o.d) ? "na" : this.o.d, "mime").a(this.o.a, "delivery").a(Integer.valueOf(this.k), "media_file_index").a(this.a.d(), "player").a);
            }
            wVar.a((String) null);
        } catch (Exception unused) {
        }
    }

    public static boolean a(f fVar) {
        com.fyber.inneractive.sdk.response.e eVar;
        int c = fVar.a.c();
        s0 s0Var = ((n) fVar).t;
        t0 t0Var = fVar.b;
        return a(c, s0Var, (t0Var == null || (eVar = t0Var.b) == null) ? -1 : ((com.fyber.inneractive.sdk.response.g) eVar).v, fVar.n.a());
    }

    public static boolean a(int i, s0 s0Var, int i2, boolean z) {
        UnitDisplayType unitDisplayType;
        if (s0Var != null && ((r0) s0Var).e != null) {
            return false;
        }
        if (i2 == 1 || InneractiveAdManager.isCurrentUserAChild() || z) {
            return true;
        }
        if (i <= 15999) {
            return false;
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = s0Var != null ? ((r0) s0Var).f : null;
        return (t0Var == null || t0Var.h == Skip.DEFAULT || (unitDisplayType = t0Var.j) == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? false : true;
    }

    public final void a() {
        com.fyber.inneractive.sdk.measurement.f fVar = this.e;
        if (fVar != null) {
            if (fVar.a != null) {
                IAlog.a("%s destroy", "OMVideo");
                try {
                    fVar.a.finish();
                } catch (Throwable th) {
                    fVar.a(th);
                }
            }
            fVar.b = null;
            fVar.a = null;
            fVar.c = null;
        }
    }

    public static boolean a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        mVar.getClass();
        if (mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP && IAConfigManager.N.D.n() && rVar != null && rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class) != null) {
            Boolean c = ((com.fyber.inneractive.sdk.config.global.features.o) rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class)).c("enable_app_info_button");
            if (c != null ? c.booleanValue() : true) {
                return true;
            }
        }
        return false;
    }
}
