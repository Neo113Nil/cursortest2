package o;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class UF implements OnBackAnimationCallback {
    public final /* synthetic */ InterfaceC2114vp a;
    public final /* synthetic */ InterfaceC2114vp b;
    public final /* synthetic */ InterfaceC1455lp c;
    public final /* synthetic */ InterfaceC1455lp d;

    public UF(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2, InterfaceC1455lp interfaceC1455lp, InterfaceC1455lp interfaceC1455lp2) {
        this.a = interfaceC2114vp;
        this.b = interfaceC2114vp2;
        this.c = interfaceC1455lp;
        this.d = interfaceC1455lp2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0048Bt.n(backEvent, "backEvent");
        this.b.invoke(new N7(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0048Bt.n(backEvent, "backEvent");
        this.a.invoke(new N7(backEvent));
    }
}
