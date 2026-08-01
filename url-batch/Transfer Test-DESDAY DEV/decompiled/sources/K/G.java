package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public z0 f365a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0019s f367c;

    public G(View view, InterfaceC0019s interfaceC0019s) {
        this.f366b = view;
        this.f367c = interfaceC0019s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z0 g2 = z0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0019s interfaceC0019s = this.f367c;
        if (i < 30) {
            H.a(windowInsets, this.f366b);
            if (g2.equals(this.f365a)) {
                return interfaceC0019s.c(view, g2).f();
            }
        }
        this.f365a = g2;
        z0 c2 = interfaceC0019s.c(view, g2);
        if (i >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = T.f372a;
        F.c(view);
        return c2.f();
    }
}
