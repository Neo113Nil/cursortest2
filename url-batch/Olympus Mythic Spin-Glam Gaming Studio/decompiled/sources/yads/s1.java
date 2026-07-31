package yads;

import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes3.dex */
public final class s1 implements f2 {
    @Override // yads.f2
    public final e2 a(AdActivity adActivity, RelativeLayout relativeLayout, o2 o2Var, z1 z1Var, Window window, w1 w1Var) {
        Intent intent = adActivity.getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("extra_browser_url") : null;
        if (stringExtra == null || stringExtra.length() <= 0) {
            return null;
        }
        try {
            return new r1(adActivity, relativeLayout, o2Var, window, stringExtra);
        } catch (zn3 unused) {
            return null;
        }
    }
}
