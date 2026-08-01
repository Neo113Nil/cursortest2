package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public z0 f626a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f628c;

    public G(View view, r rVar) {
        this.f627b = view;
        this.f628c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        z0 g2 = z0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f628c;
        if (i < 30) {
            H.a(windowInsets, this.f627b);
            if (g2.equals(this.f626a)) {
                return rVar.c(view, g2).f();
            }
        }
        this.f626a = g2;
        z0 c2 = rVar.c(view, g2);
        if (i >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = T.f633a;
        F.c(view);
        return c2.f();
    }
}
