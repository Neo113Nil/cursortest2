package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: o.pZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1703pZ implements View.OnApplyWindowInsetsListener {
    public C1142h10 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ QF c;

    public ViewOnApplyWindowInsetsListenerC1703pZ(View view, QF qf) {
        this.b = view;
        this.c = qf;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1142h10 c = C1142h10.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        QF qf = this.c;
        if (i < 30) {
            AbstractC1769qZ.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return ((X4) qf).a(view, c).b();
            }
        }
        this.a = c;
        C1142h10 a = ((X4) qf).a(view, c);
        if (i >= 30) {
            return a.b();
        }
        AbstractC1637oZ.c(view);
        return a.b();
    }
}
