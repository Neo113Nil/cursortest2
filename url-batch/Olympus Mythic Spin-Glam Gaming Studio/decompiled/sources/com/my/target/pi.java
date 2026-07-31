package com.my.target;

import android.content.pm.ApplicationInfo;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public abstract class pi {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ e1 a;

        a(e1 e1Var) {
            this.a = e1Var;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) this.a.apply(view, windowInsets);
        }
    }

    public static boolean a(ApplicationInfo applicationInfo) {
        return applicationInfo.targetSdkVersion >= 35 && Build.VERSION.SDK_INT >= 35;
    }

    public static void a(View view, e1 e1Var) {
        view.setOnApplyWindowInsetsListener(new a(e1Var));
    }

    public static oi a(WindowInsets windowInsets) {
        int displayCutout;
        int systemBars;
        Insets insets;
        displayCutout = WindowInsets.Type.displayCutout();
        systemBars = WindowInsets.Type.systemBars();
        insets = windowInsets.getInsets(displayCutout | systemBars);
        return oi.a(insets);
    }
}
