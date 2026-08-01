package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public w0 f353a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f355c;

    public F(View view, r rVar) {
        this.f354b = view;
        this.f355c = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 g2 = w0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f355c;
        if (i < 30) {
            G.a(windowInsets, this.f354b);
            if (g2.equals(this.f353a)) {
                return rVar.c(view, g2).f();
            }
        }
        this.f353a = g2;
        w0 c2 = rVar.c(view, g2);
        if (i >= 30) {
            return c2.f();
        }
        WeakHashMap weakHashMap = S.f360a;
        E.c(view);
        return c2.f();
    }
}
