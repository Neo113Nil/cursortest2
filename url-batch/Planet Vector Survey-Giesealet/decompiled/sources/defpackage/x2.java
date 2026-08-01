package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        x60 x60Var = f3.L0;
        synchronized (x60Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = x60Var.a;
                int i2 = x60Var.b;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        f3 f3Var = (f3) objArr[i3];
                        boolean showLayoutBounds = f3Var.getShowLayoutBounds();
                        Class cls = f3.I0;
                        f3Var.setShowLayoutBounds(nk.v());
                        if (showLayoutBounds != f3Var.getShowLayoutBounds()) {
                            f3.p(f3Var.getRoot());
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        f3.p(((f3) objArr[i3]).getRoot());
                        i3++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
