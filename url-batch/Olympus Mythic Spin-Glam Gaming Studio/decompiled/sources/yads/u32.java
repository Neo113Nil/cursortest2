package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes14.dex */
public final class u32 implements ww0 {
    public final g52 a;
    public final oc2 b;
    public final yj2 c;
    public final s2 d;
    public zq2 e;

    public u32(g52 g52Var, x63 x63Var) {
        oc2 a = lc2.a(false);
        yj2 yj2Var = x63Var.a;
        s2 s2Var = x63Var.b;
        this.a = g52Var;
        this.b = a;
        this.c = yj2Var;
        this.d = s2Var;
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/u32;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_u32_invalidate_8ef1fcf8133544d22e579d9012233705();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/u32;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_u32_pause_efe4c6ae3b7dbacca3ca9a45e2b7e19a();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/u32;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_u32_resume_1b77afe91b62b3c54cc31c4b70fa5e47();
    }

    public void safedk_u32_invalidate_8ef1fcf8133544d22e579d9012233705() {
        zq2 zq2Var = this.e;
        if (zq2Var != null) {
            zq2Var.c.a();
        }
        this.e = null;
    }

    public void safedk_u32_pause_efe4c6ae3b7dbacca3ca9a45e2b7e19a() {
        zq2 zq2Var = this.e;
        if (zq2Var != null) {
            zq2Var.c.b();
        }
    }

    public void safedk_u32_resume_1b77afe91b62b3c54cc31c4b70fa5e47() {
        zq2 zq2Var = this.e;
        if (zq2Var != null) {
            zq2Var.c.d();
        }
    }

    public void safedk_u32_start_14d36bf655b331db393f6d6464635341() {
        g52 g52Var = this.a;
        yj2 yj2Var = this.c;
        s2 s2Var = this.d;
        zq2 zq2Var = new zq2(g52Var, new wq2(s2Var), this.b, new xq2(yj2Var), new t32(this));
        zq2Var.a();
        this.e = zq2Var;
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/u32;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_u32_start_14d36bf655b331db393f6d6464635341();
    }
}
