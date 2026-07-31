package yads;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes15.dex */
public final class ax0 {
    public final e00 a;

    public ax0(e00 e00Var) {
        this.a = e00Var;
    }

    public static void b(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: yads.ax0$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ax0.b(view, windowInsetsCompat);
            }
        });
    }

    public static void c(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: yads.ax0$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ax0.c(view, windowInsetsCompat);
            }
        });
    }

    public final void a(Window window, RelativeLayout relativeLayout) {
        WindowCompat.setDecorFitsSystemWindows(window, false);
        if (pa.a(30)) {
            window.getAttributes().layoutInDisplayCutoutMode = 3;
        }
        if (this.a == e00.i) {
            b(relativeLayout);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a(relativeLayout);
        } else {
            c(relativeLayout);
        }
    }

    public static final WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        return WindowInsetsCompat.CONSUMED;
    }

    public static final WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        return windowInsetsCompat;
    }

    public static void a(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: yads.ax0$$ExternalSyntheticLambda2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ax0.a(view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
