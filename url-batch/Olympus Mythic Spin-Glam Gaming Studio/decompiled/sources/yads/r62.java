package yads;

import android.content.Context;
import com.safedk.android.analytics.brandsafety.creatives.VideoEventsManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public final class r62 implements mf3 {
    public final zo0 a;
    public final t41 b;
    public final pf3 c;
    public final jc3 d;
    public rf3 e;

    public r62(Context context, t8 t8Var, yu2 yu2Var, zo0 zo0Var, we3 we3Var, u72 u72Var, sf3 sf3Var, wj3 wj3Var, dg3 dg3Var, t41 t41Var) {
        pf3 pf3Var = new pf3(context, yu2Var, sf3Var);
        this.a = zo0Var;
        this.b = t41Var;
        this.c = pf3Var;
        jc3 jc3Var = new jc3(context, yu2Var, new s52(zo0Var), u72Var, we3Var, new a72(u72Var), new tg3(), wj3Var, dg3Var, new q62(this), t8Var, true);
        this.d = jc3Var;
        jg3 jg3Var = jc3Var.g;
        jg3Var.i.setValue(jg3Var, jg3.k[0], sf3Var);
    }

    @Override // yads.mf3
    public final void a(rf3 rf3Var) {
        this.e = rf3Var;
    }

    @Override // yads.mf3
    public final void play() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/r62;->play()V");
        VideoEventsManager.onPlayerPlay(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_r62_play_f73a6a0f37e0b630dc450ff07c231697();
    }

    public void safedk_r62_play_f73a6a0f37e0b630dc450ff07c231697() {
        this.d.a();
    }

    public void safedk_r62_stop_785ab28c747827120bbd445f4e248169() {
        jc3 jc3Var = this.d;
        jc3Var.h.a();
        jc3Var.a.pauseAd();
        this.a.f();
    }

    @Override // yads.mf3
    public final void stop() {
        Logger.d("Yandex|SafeDK: Execution> Lyads/r62;->stop()V");
        VideoEventsManager.onPlayerStop(com.safedk.android.utils.h.y, this, "exo-player");
        safedk_r62_stop_785ab28c747827120bbd445f4e248169();
    }
}
