package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class t5 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) u5.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
