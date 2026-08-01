package g;

import K.S;
import K.Z;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0122A f2343b;

    public /* synthetic */ p(LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A, int i) {
        this.f2342a = i;
        this.f2343b = layoutInflaterFactory2C0122A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2342a) {
            case 0:
                LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = this.f2343b;
                if ((layoutInflaterFactory2C0122A.f2221a0 & 1) != 0) {
                    layoutInflaterFactory2C0122A.u(0);
                }
                if ((layoutInflaterFactory2C0122A.f2221a0 & 4096) != 0) {
                    layoutInflaterFactory2C0122A.u(108);
                }
                layoutInflaterFactory2C0122A.f2220Z = false;
                layoutInflaterFactory2C0122A.f2221a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A2 = this.f2343b;
                layoutInflaterFactory2C0122A2.f2242w.showAtLocation(layoutInflaterFactory2C0122A2.f2241v, 55, 0, 0);
                Z z2 = layoutInflaterFactory2C0122A2.f2244y;
                if (z2 != null) {
                    z2.b();
                }
                if (!(layoutInflaterFactory2C0122A2.f2196A && (viewGroup = layoutInflaterFactory2C0122A2.f2197B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0122A2.f2241v.setAlpha(1.0f);
                    layoutInflaterFactory2C0122A2.f2241v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0122A2.f2241v.setAlpha(0.0f);
                    Z a2 = S.a(layoutInflaterFactory2C0122A2.f2241v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0122A2.f2244y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
