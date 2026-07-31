package yads;

import android.os.Build;
import android.os.Bundle;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes3.dex */
public final class o2 {
    public final AdActivity a;
    public final x8 b;

    public o2(AdActivity adActivity, x8 x8Var) {
        this.a = adActivity;
        this.b = x8Var;
    }

    public final void a(int i) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.a.setRequestedOrientation(i);
            }
        } catch (Exception unused) {
            boolean z = ob1.a;
        }
    }

    public final void a(int i, Bundle bundle) {
        x8 x8Var = this.b;
        if (x8Var != null) {
            x8Var.a(i, bundle);
        }
    }
}
