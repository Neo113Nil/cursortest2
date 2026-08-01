package l;

import android.view.View;
import k.InterfaceC0200k;
import k.MenuC0202m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0255i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0251g f3430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0259k f3431b;

    public RunnableC0255i(C0259k c0259k, C0251g c0251g) {
        this.f3431b = c0259k;
        this.f3430a = c0251g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0200k interfaceC0200k;
        C0259k c0259k = this.f3431b;
        MenuC0202m menuC0202m = c0259k.f3450c;
        if (menuC0202m != null && (interfaceC0200k = menuC0202m.f3190e) != null) {
            interfaceC0200k.e(menuC0202m);
        }
        View view = (View) c0259k.h;
        if (view != null && view.getWindowToken() != null) {
            C0251g c0251g = this.f3430a;
            if (!c0251g.b()) {
                if (c0251g.f3251e != null) {
                    c0251g.d(0, 0, false, false);
                }
            }
            c0259k.f3463s = c0251g;
        }
        c0259k.f3465u = null;
    }
}
