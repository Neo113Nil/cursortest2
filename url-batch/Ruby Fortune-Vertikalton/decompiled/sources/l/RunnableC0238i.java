package l;

import android.view.View;
import k.InterfaceC0155k;
import k.MenuC0157m;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0238i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C0234g f2986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0244l f2987b;

    public RunnableC0238i(C0244l c0244l, C0234g c0234g) {
        this.f2987b = c0244l;
        this.f2986a = c0234g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0155k interfaceC0155k;
        C0244l c0244l = this.f2987b;
        MenuC0157m menuC0157m = c0244l.f3007c;
        if (menuC0157m != null && (interfaceC0155k = menuC0157m.f2685e) != null) {
            interfaceC0155k.g(menuC0157m);
        }
        View view = (View) c0244l.h;
        if (view != null && view.getWindowToken() != null) {
            C0234g c0234g = this.f2986a;
            if (!c0234g.b()) {
                if (c0234g.f2746e != null) {
                    c0234g.d(0, 0, false, false);
                }
            }
            c0244l.f3020s = c0234g;
        }
        c0244l.f3022u = null;
    }
}
