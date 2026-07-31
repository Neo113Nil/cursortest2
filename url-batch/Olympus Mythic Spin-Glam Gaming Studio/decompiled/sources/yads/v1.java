package yads;

import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes4.dex */
public abstract class v1 {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e2 a(AdActivity adActivity, RelativeLayout relativeLayout, z1 z1Var, w1 w1Var) {
        x8 x8Var;
        h2 a;
        f2 f2Var;
        Window window = adActivity.getWindow();
        e2 e2Var = null;
        if (w1Var != null) {
            try {
                x8Var = w1Var.c;
            } catch (Exception unused) {
                boolean z = ob1.a;
            }
            o2 o2Var = new o2(adActivity, x8Var);
            a = h2.b.a();
            synchronized (a) {
                try {
                    Intent intent = adActivity.getIntent();
                    String stringExtra = intent != null ? intent.getStringExtra("window_type") : null;
                    if (stringExtra != null && (f2Var = (f2) a.a.get(stringExtra)) != null) {
                        e2Var = f2Var.a(adActivity, relativeLayout, o2Var, z1Var, window, w1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return e2Var;
        }
        x8Var = null;
        o2 o2Var2 = new o2(adActivity, x8Var);
        a = h2.b.a();
        synchronized (a) {
        }
    }
}
