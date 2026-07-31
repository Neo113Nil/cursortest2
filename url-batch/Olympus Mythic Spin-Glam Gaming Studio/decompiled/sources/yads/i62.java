package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class i62 implements ww0, s62 {
    public final j62 a;
    public s3 b;
    public zj2 c;
    public final Long d;
    public final kc2 e;

    public i62(t8 t8Var, j62 j62Var, s3 s3Var, zj2 zj2Var) {
        Long l = t8Var.s;
        kc2 kc2Var = new kc2();
        this.a = j62Var;
        this.b = s3Var;
        this.c = zj2Var;
        this.d = l;
        this.e = kc2Var;
    }

    @Override // yads.s62
    public final void a(long j, long j2) {
        if (this.e.a) {
            return;
        }
        zj2 zj2Var = this.c;
        if (zj2Var != null) {
            zj2Var.a(j, j2);
        }
        Long l = this.d;
        if (l == null || j2 <= l.longValue()) {
            return;
        }
        zj2 zj2Var2 = this.c;
        if (zj2Var2 != null) {
            zj2Var2.a();
        }
        s3 s3Var = this.b;
        if (s3Var != null) {
            s3Var.b();
        }
        this.a.a.remove(this);
        this.b = null;
        this.c = null;
    }

    @Override // yads.s62
    public final void b() {
        kc2 kc2Var = this.e;
        jc2 jc2Var = jc2.c;
        e62 e62Var = new e62(this);
        if (kc2Var.a) {
            kc2Var.b = jc2Var;
        } else {
            e62Var.mo4828invoke();
        }
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i62;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i62_invalidate_9d8b85cb7ed1effd0b42224207b75058();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i62;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i62_pause_6feacf8e6c6c36c72b0623a8d36565fe();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i62;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i62_resume_4ccbb4923082acc448c4f97dd769eac4();
    }

    public void safedk_i62_invalidate_9d8b85cb7ed1effd0b42224207b75058() {
        this.a.a.remove(this);
        this.b = null;
        this.c = null;
    }

    public void safedk_i62_pause_6feacf8e6c6c36c72b0623a8d36565fe() {
        this.e.a = true;
    }

    public void safedk_i62_resume_4ccbb4923082acc448c4f97dd769eac4() {
        kc2 kc2Var = this.e;
        g62 g62Var = new g62(this);
        h62 h62Var = new h62(this);
        kc2Var.a = false;
        int ordinal = kc2Var.b.ordinal();
        if (ordinal == 1) {
            kc2Var.b = jc2.b;
            g62Var.mo4828invoke();
        } else {
            if (ordinal != 2) {
                return;
            }
            kc2Var.b = jc2.b;
            h62Var.mo4828invoke();
            if (Unit.INSTANCE == null) {
                g62Var.mo4828invoke();
            }
        }
    }

    public void safedk_i62_start_20cb73c982461947226125980930b227() {
        this.a.a.add(this);
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/i62;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_i62_start_20cb73c982461947226125980930b227();
    }

    @Override // yads.s62
    public final void a() {
        kc2 kc2Var = this.e;
        jc2 jc2Var = jc2.d;
        f62 f62Var = new f62(this);
        if (kc2Var.a) {
            kc2Var.b = jc2Var;
        } else {
            f62Var.mo4828invoke();
        }
    }
}
