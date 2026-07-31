package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public final class s32 implements ww0 {
    public s3 a;
    public zj2 b;
    public final oc2 c;
    public final yc0 d;

    public s32(s3 s3Var, x63 x63Var, zj2 zj2Var) {
        oc2 a = lc2.a(false);
        yc0 yc0Var = x63Var.c;
        this.a = s3Var;
        this.b = zj2Var;
        this.c = a;
        this.d = yc0Var;
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/s32;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_s32_invalidate_9e9c0705c867c9b722ed1a94ed520867();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/s32;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_s32_pause_7fd9888eb0693d4b84a39d373c28d8fb();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/s32;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_s32_resume_31f42d688e0034b333ab9bcc29915d9d();
    }

    public void safedk_s32_invalidate_9e9c0705c867c9b722ed1a94ed520867() {
        this.c.a();
        this.c.e = null;
        this.a = null;
        this.b = null;
    }

    public void safedk_s32_pause_7fd9888eb0693d4b84a39d373c28d8fb() {
        this.c.b();
    }

    public void safedk_s32_resume_31f42d688e0034b333ab9bcc29915d9d() {
        this.c.d();
    }

    public void safedk_s32_start_5cc3da185b50b92c574922684c0f7917() {
        q32 q32Var = new q32(this);
        long a = this.d.a();
        r32 r32Var = new r32(this, a);
        oc2 oc2Var = this.c;
        oc2Var.e = r32Var;
        oc2Var.a(a, q32Var);
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/s32;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_s32_start_5cc3da185b50b92c574922684c0f7917();
    }
}
