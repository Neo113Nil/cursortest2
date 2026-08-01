package l;

import android.view.View;
import k.InterfaceC0162k;
import k.MenuC0164m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0214i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0210g f3014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0218k f3015b;

    public RunnableC0214i(C0218k c0218k, C0210g c0210g) {
        this.f3015b = c0218k;
        this.f3014a = c0210g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0162k interfaceC0162k;
        C0218k c0218k = this.f3015b;
        MenuC0164m menuC0164m = c0218k.f3018c;
        if (menuC0164m != null && (interfaceC0162k = menuC0164m.f2759e) != null) {
            interfaceC0162k.p(menuC0164m);
        }
        View view = (View) c0218k.h;
        if (view != null && view.getWindowToken() != null) {
            C0210g c0210g = this.f3014a;
            if (!c0210g.b()) {
                if (c0210g.f2820e != null) {
                    c0210g.d(0, 0, false, false);
                }
            }
            c0218k.f3031s = c0210g;
        }
        c0218k.f3033u = null;
    }
}
