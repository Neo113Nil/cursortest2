package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class k80 {
    public static boolean a = true;

    public static void a(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            e0.d(window, z);
        } else {
            if (i >= 30) {
                e0.c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            j80.b(viewGroup, z);
        } else if (a) {
            try {
                j80.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
