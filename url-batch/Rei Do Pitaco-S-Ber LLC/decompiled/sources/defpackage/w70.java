package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class w70 implements View.OnApplyWindowInsetsListener {
    public db0 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ hv c;

    public w70(View view, hv hvVar) {
        this.b = view;
        this.c = hvVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        db0 g = db0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        hv hvVar = this.c;
        if (i < 30) {
            x70.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return hvVar.k(view, g).f();
            }
        }
        this.a = g;
        db0 k = hvVar.k(view, g);
        if (i >= 30) {
            return k.f();
        }
        WeakHashMap weakHashMap = f80.a;
        view.requestApplyInsets();
        return k.f();
    }
}
