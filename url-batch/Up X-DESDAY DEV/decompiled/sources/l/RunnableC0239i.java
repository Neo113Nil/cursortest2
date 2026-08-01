package l;

import android.view.View;
import k.InterfaceC0156k;
import k.MenuC0158m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0239i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0235g f2970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0243k f2971b;

    public RunnableC0239i(C0243k c0243k, C0235g c0235g) {
        this.f2971b = c0243k;
        this.f2970a = c0235g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0156k interfaceC0156k;
        C0243k c0243k = this.f2971b;
        MenuC0158m menuC0158m = c0243k.f2990c;
        if (menuC0158m != null && (interfaceC0156k = menuC0158m.f2669e) != null) {
            interfaceC0156k.e(menuC0158m);
        }
        View view = (View) c0243k.h;
        if (view != null && view.getWindowToken() != null) {
            C0235g c0235g = this.f2970a;
            if (!c0235g.b()) {
                if (c0235g.f2730e != null) {
                    c0235g.d(0, 0, false, false);
                }
            }
            c0243k.f3003s = c0235g;
        }
        c0243k.f3005u = null;
    }
}
