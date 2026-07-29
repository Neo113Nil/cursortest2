package o;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class W4 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ LayoutInflaterFactory2C1213i5 i;

    public /* synthetic */ W4(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5, int i) {
        this.h = i;
        this.i = layoutInflaterFactory2C1213i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.h) {
            case 0:
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = this.i;
                if ((layoutInflaterFactory2C1213i5.g0 & 1) != 0) {
                    layoutInflaterFactory2C1213i5.u(0);
                }
                if ((layoutInflaterFactory2C1213i5.g0 & 4096) != 0) {
                    layoutInflaterFactory2C1213i5.u(108);
                }
                layoutInflaterFactory2C1213i5.f0 = false;
                layoutInflaterFactory2C1213i5.g0 = 0;
                break;
            default:
                LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i52 = this.i;
                layoutInflaterFactory2C1213i52.D.showAtLocation(layoutInflaterFactory2C1213i52.C, 55, 0, 0);
                C0942e00 c0942e00 = layoutInflaterFactory2C1213i52.F;
                if (c0942e00 != null) {
                    c0942e00.b();
                }
                if (!layoutInflaterFactory2C1213i52.G || (viewGroup = layoutInflaterFactory2C1213i52.H) == null || !viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C1213i52.C.setAlpha(1.0f);
                    layoutInflaterFactory2C1213i52.C.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C1213i52.C.setAlpha(0.0f);
                    C0942e00 a = AZ.a(layoutInflaterFactory2C1213i52.C);
                    a.a(1.0f);
                    layoutInflaterFactory2C1213i52.F = a;
                    a.d(new Y4(0, this));
                    break;
                }
        }
    }
}
