package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes15.dex */
public final class c82 implements ww0, e82 {
    public final d82 a;
    public s3 b;
    public final yc0 c;
    public zj2 d;
    public final oc2 e;

    public c82(d82 d82Var, s3 s3Var, yc0 yc0Var, zj2 zj2Var) {
        oc2 a = lc2.a(false);
        this.a = d82Var;
        this.b = s3Var;
        this.c = yc0Var;
        this.d = zj2Var;
        this.e = a;
    }

    @Override // yads.e82
    public final void a() {
        zj2 zj2Var = this.d;
        if (zj2Var != null) {
            zj2Var.a();
        }
        s3 s3Var = this.b;
        if (s3Var != null) {
            s3Var.b();
        }
        this.a.a.remove(this);
        this.b = null;
        this.d = null;
    }

    @Override // yads.e82
    public final void a(boolean z) {
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/c82;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_c82_invalidate_76535c877696e6deae668d8c881b9136();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/c82;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_c82_pause_31ddba3fcf1f5fd75776e5d8a9a3717f();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/c82;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_c82_resume_401da0d11a30bc0f6fdb8ab7f16d9d40();
    }

    public void safedk_c82_invalidate_76535c877696e6deae668d8c881b9136() {
        this.e.a();
        this.e.e = null;
        this.a.a.remove(this);
        this.b = null;
        this.d = null;
    }

    public void safedk_c82_pause_31ddba3fcf1f5fd75776e5d8a9a3717f() {
        this.e.b();
    }

    public void safedk_c82_resume_401da0d11a30bc0f6fdb8ab7f16d9d40() {
        this.e.d();
    }

    public void safedk_c82_start_16a4a0f61958adec11de898314e760c9() {
        this.a.a.add(this);
        yc0 yc0Var = this.c;
        Long valueOf = yc0Var != null ? Long.valueOf(yc0Var.a()) : null;
        if (valueOf != null) {
            b82 b82Var = new b82(this, valueOf.longValue());
            oc2 oc2Var = this.e;
            oc2Var.e = b82Var;
            oc2Var.a(valueOf.longValue(), b82Var);
        }
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/c82;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_c82_start_16a4a0f61958adec11de898314e760c9();
    }
}
