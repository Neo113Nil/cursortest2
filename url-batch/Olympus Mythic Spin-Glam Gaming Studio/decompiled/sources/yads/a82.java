package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes5.dex */
public final class a82 implements ww0, e82 {
    public final d82 a;
    public final sr2 b;
    public final kc2 c;

    public a82(d82 d82Var, sr2 sr2Var) {
        kc2 kc2Var = new kc2();
        this.a = d82Var;
        this.b = sr2Var;
        this.c = kc2Var;
    }

    @Override // yads.e82
    public final void a() {
    }

    @Override // yads.e82
    public final void a(boolean z) {
        if (z) {
            return;
        }
        kc2 kc2Var = this.c;
        z72 z72Var = new z72(this);
        jc2 jc2Var = jc2.c;
        if (kc2Var.a) {
            kc2Var.b = jc2Var;
        } else {
            z72Var.mo4828invoke();
        }
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/a82;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_a82_invalidate_1a337de2300fd7ac7bd2a7baccc29416();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/a82;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_a82_pause_580e21c14b0ce078c5c4c9be19aafd5a();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/a82;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_a82_resume_a305ce6394d2ccbe7786d3eebb3737dc();
    }

    public void safedk_a82_invalidate_1a337de2300fd7ac7bd2a7baccc29416() {
        this.a.a.remove(this);
    }

    public void safedk_a82_pause_580e21c14b0ce078c5c4c9be19aafd5a() {
        this.c.a = true;
    }

    public void safedk_a82_resume_a305ce6394d2ccbe7786d3eebb3737dc() {
        kc2 kc2Var = this.c;
        y72 y72Var = new y72(this);
        kc2Var.a = false;
        int ordinal = kc2Var.b.ordinal();
        if (ordinal == 1) {
            kc2Var.b = jc2.b;
            y72Var.mo4828invoke();
        } else {
            if (ordinal != 2) {
                return;
            }
            kc2Var.b = jc2.b;
            y72Var.mo4828invoke();
        }
    }

    public void safedk_a82_start_9bf4241fcbcc982f4a9d35ea918401fa() {
        this.a.a.add(this);
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/a82;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_a82_start_9bf4241fcbcc982f4a9d35ea918401fa();
    }
}
