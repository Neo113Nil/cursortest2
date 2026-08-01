package g;

import K.C0001a0;
import K.T;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0110A f2337b;

    public /* synthetic */ p(LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A, int i) {
        this.f2336a = i;
        this.f2337b = layoutInflaterFactory2C0110A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f2336a) {
            case 0:
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A = this.f2337b;
                if ((layoutInflaterFactory2C0110A.f2216a0 & 1) != 0) {
                    layoutInflaterFactory2C0110A.u(0);
                }
                if ((layoutInflaterFactory2C0110A.f2216a0 & 4096) != 0) {
                    layoutInflaterFactory2C0110A.u(108);
                }
                layoutInflaterFactory2C0110A.f2215Z = false;
                layoutInflaterFactory2C0110A.f2216a0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0110A layoutInflaterFactory2C0110A2 = this.f2337b;
                layoutInflaterFactory2C0110A2.f2237w.showAtLocation(layoutInflaterFactory2C0110A2.f2236v, 55, 0, 0);
                C0001a0 c0001a0 = layoutInflaterFactory2C0110A2.f2239y;
                if (c0001a0 != null) {
                    c0001a0.b();
                }
                if (!(layoutInflaterFactory2C0110A2.f2191A && (viewGroup = layoutInflaterFactory2C0110A2.f2192B) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0110A2.f2236v.setAlpha(1.0f);
                    layoutInflaterFactory2C0110A2.f2236v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0110A2.f2236v.setAlpha(0.0f);
                    C0001a0 a2 = T.a(layoutInflaterFactory2C0110A2.f2236v);
                    a2.a(1.0f);
                    layoutInflaterFactory2C0110A2.f2239y = a2;
                    a2.d(new r(0, this));
                    break;
                }
        }
    }
}
