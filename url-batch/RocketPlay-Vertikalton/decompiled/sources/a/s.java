package a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1.l f1610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1.l f1611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0173a f1612c;
    public final /* synthetic */ InterfaceC0173a d;

    public s(h1.l lVar, h1.l lVar2, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
        this.f1610a = lVar;
        this.f1611b = lVar2;
        this.f1612c = interfaceC0173a;
        this.d = interfaceC0173a2;
    }

    public final void onBackCancelled() {
        this.d.c();
    }

    public final void onBackInvoked() {
        this.f1612c.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        i1.f.e(backEvent, "backEvent");
        this.f1611b.g(new C0061b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        i1.f.e(backEvent, "backEvent");
        this.f1610a.g(new C0061b(backEvent));
    }
}
