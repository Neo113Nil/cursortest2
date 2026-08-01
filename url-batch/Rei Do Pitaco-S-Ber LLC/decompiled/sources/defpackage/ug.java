package defpackage;

import android.content.Context;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ug {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ug(Context context) {
        boolean S = m60.S(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        int A = g8.A(context, R.attr.elevationOverlayColor, 0);
        int A2 = g8.A(context, R.attr.elevationOverlayAccentColor, 0);
        int A3 = g8.A(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = S;
        this.b = A;
        this.c = A2;
        this.d = A3;
        this.e = f2;
    }
}
