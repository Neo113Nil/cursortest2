package g;

import K.C0001a0;
import K.T;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0109A f2334b;

    public /* synthetic */ p(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A, int i) {
        this.f2333a = i;
        this.f2334b = layoutInflaterFactory2C0109A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2333a) {
            case 0:
                LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = this.f2334b;
                if ((layoutInflaterFactory2C0109A.f2213a0 & 1) != 0) {
                    layoutInflaterFactory2C0109A.u(0);
                }
                if ((layoutInflaterFactory2C0109A.f2213a0 & 4096) != 0) {
                    layoutInflaterFactory2C0109A.u(108);
                }
                layoutInflaterFactory2C0109A.f2212Z = false;
                layoutInflaterFactory2C0109A.f2213a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A2 = this.f2334b;
                layoutInflaterFactory2C0109A2.f2234w.showAtLocation(layoutInflaterFactory2C0109A2.f2233v, 55, 0, 0);
                C0001a0 c0001a0 = layoutInflaterFactory2C0109A2.f2236y;
                if (c0001a0 != null) {
                    c0001a0.b();
                }
                if (!(layoutInflaterFactory2C0109A2.f2188A && (viewGroup = layoutInflaterFactory2C0109A2.f2189B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0109A2.f2233v.setAlpha(1.0f);
                    layoutInflaterFactory2C0109A2.f2233v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0109A2.f2233v.setAlpha(0.0f);
                    C0001a0 a2 = T.a(layoutInflaterFactory2C0109A2.f2233v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0109A2.f2236y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
