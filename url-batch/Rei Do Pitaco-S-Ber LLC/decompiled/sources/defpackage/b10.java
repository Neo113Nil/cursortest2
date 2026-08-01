package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b10 {
    public final a10 a;

    public b10(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new z00(nestedScrollView);
        } else {
            this.a = new iw(11);
        }
    }
}
