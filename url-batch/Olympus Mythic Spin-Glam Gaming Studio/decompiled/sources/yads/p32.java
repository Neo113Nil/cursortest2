package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public final class p32 implements ww0 {
    public final sr2 a;
    public final gw b;
    public final long c;
    public final oc2 d;
    public final o32 e;

    public p32(t8 t8Var, sr2 sr2Var, x63 x63Var) {
        gw gwVar = x63Var.e;
        e00 e00Var = t8Var.a;
        Long l = t8Var.j;
        long longValue = (l == null ? e00Var == e00.f ? 5000L : 0L : l).longValue();
        oc2 a = lc2.a(false);
        this.a = sr2Var;
        this.b = gwVar;
        this.c = longValue;
        this.d = a;
        this.e = new o32(this);
    }

    @Override // yads.ww0
    public final void invalidate() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/p32;->invalidate()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_p32_invalidate_b82091a193f09ecb309a39055f555cea();
    }

    @Override // yads.ww0
    public final void pause() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/p32;->pause()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_p32_pause_71b855e79696f464f21e222bd180a5e1();
    }

    @Override // yads.ww0
    public final void resume() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/p32;->resume()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_p32_resume_df2325b45fc9ce185d49d40ebdb012ee();
    }

    public void safedk_p32_invalidate_b82091a193f09ecb309a39055f555cea() {
        this.d.a();
    }

    public void safedk_p32_pause_71b855e79696f464f21e222bd180a5e1() {
        this.d.b();
    }

    public void safedk_p32_resume_df2325b45fc9ce185d49d40ebdb012ee() {
        this.d.d();
    }

    public void safedk_p32_start_b8122868242ea093ece04a3423f3e9b8() {
        long max = Math.max(0L, this.c - this.b.a);
        oc2 oc2Var = this.d;
        oc2Var.e = this.b;
        oc2Var.a(max, this.e);
    }

    @Override // yads.ww0
    public final void start() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/p32;->start()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_p32_start_b8122868242ea093ece04a3423f3e9b8();
    }
}
