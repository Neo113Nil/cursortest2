package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class r implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.l f1216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.l f1217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a f1218c;
    public final /* synthetic */ f1.a d;

    public r(f1.l lVar, f1.l lVar2, f1.a aVar, f1.a aVar2) {
        this.f1216a = lVar;
        this.f1217b = lVar2;
        this.f1218c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.c();
    }

    public final void onBackInvoked() {
        this.f1218c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        g1.f.e(backEvent, "backEvent");
        this.f1217b.g(new C0056b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        g1.f.e(backEvent, "backEvent");
        this.f1216a.g(new C0056b(backEvent));
    }
}
