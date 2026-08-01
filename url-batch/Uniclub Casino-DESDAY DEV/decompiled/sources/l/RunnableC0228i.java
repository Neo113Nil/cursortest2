package l;

import android.view.View;
import k.InterfaceC0166k;
import k.MenuC0168m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0228i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0224g f2995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0232k f2996b;

    public RunnableC0228i(C0232k c0232k, C0224g c0224g) {
        this.f2996b = c0232k;
        this.f2995a = c0224g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0166k interfaceC0166k;
        C0232k c0232k = this.f2996b;
        MenuC0168m menuC0168m = c0232k.f3015c;
        if (menuC0168m != null && (interfaceC0166k = menuC0168m.f2694e) != null) {
            interfaceC0166k.e(menuC0168m);
        }
        View view = (View) c0232k.h;
        if (view != null && view.getWindowToken() != null) {
            C0224g c0224g = this.f2995a;
            if (!c0224g.b()) {
                if (c0224g.f2755e != null) {
                    c0224g.d(0, 0, false, false);
                }
            }
            c0232k.f3028s = c0224g;
        }
        c0232k.f3030u = null;
    }
}
