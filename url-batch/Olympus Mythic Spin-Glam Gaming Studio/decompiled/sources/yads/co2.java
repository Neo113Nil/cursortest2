package yads;

import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes4.dex */
public final class co2 implements mf3 {
    public final zo0 a;
    public final we3 b;
    public final gg3 c;
    public final bo2 d;
    public rf3 e;

    public co2(zo0 zo0Var, we3 we3Var, dg3 dg3Var) {
        gg3 gg3Var = new gg3(new s52(zo0Var), dg3Var);
        this.a = zo0Var;
        this.b = we3Var;
        this.c = gg3Var;
        this.d = new bo2(this);
    }

    @Override // yads.mf3
    public final void a(rf3 rf3Var) {
        this.e = rf3Var;
    }

    @Override // yads.mf3
    public final void play() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/co2;->play()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_co2_play_e3c4a55257f9f7c5f042533588412756();
    }

    public void safedk_co2_play_e3c4a55257f9f7c5f042533588412756() {
        this.a.a(this.d);
        this.a.a((t62) this.b.d);
    }

    public void safedk_co2_stop_160789550c28565a3b4399ed4b0aac45() {
        this.c.a();
        this.a.c();
        this.a.f();
    }

    @Override // yads.mf3
    public final void stop() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/co2;->stop()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_co2_stop_160789550c28565a3b4399ed4b0aac45();
    }
}
