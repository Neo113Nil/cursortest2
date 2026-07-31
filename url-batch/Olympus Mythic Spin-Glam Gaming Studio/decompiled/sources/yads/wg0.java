package yads;

import android.app.Activity;
import android.app.Dialog;
import android.view.WindowInsetsController;

/* loaded from: classes9.dex */
public abstract class wg0 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        r0 = r0.getInsetsController();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        r2 = r2.getInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Dialog dialog) {
        Activity a;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        int systemBarsAppearance;
        if (!pa.a(30) || (a = h1.a()) == null || (r0 = a.getWindow()) == null || (r2 = dialog.getWindow()) == null || insetsController == null || insetsController2 == null) {
            return;
        }
        systemBarsAppearance = insetsController.getSystemBarsAppearance();
        insetsController2.setSystemBarsAppearance(systemBarsAppearance, 24);
    }
}
