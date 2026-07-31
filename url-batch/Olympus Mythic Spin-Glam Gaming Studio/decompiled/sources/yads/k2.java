package yads;

import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes5.dex */
public final class k2 implements f2 {
    @Override // yads.f2
    public final e2 a(AdActivity adActivity, RelativeLayout relativeLayout, o2 o2Var, z1 z1Var, Window window, w1 w1Var) {
        if (w1Var == null) {
            return null;
        }
        return new j2(adActivity, w1Var, w1Var.d);
    }
}
