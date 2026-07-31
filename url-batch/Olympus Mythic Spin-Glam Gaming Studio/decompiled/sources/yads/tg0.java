package yads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class tg0 {
    public final et2 a = new et2();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r8 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r8.getCurrentModeType() == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sg0 a(Context context) {
        boolean z;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point a = this.a.a(context);
        int i = a.x;
        int i2 = a.y;
        float f = displayMetrics.density;
        float f2 = i;
        float f3 = i2;
        float coerceAtMost = RangesKt.coerceAtMost(f2 / f, f3 / f);
        float f4 = f * 160;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        double sqrt = Math.sqrt((f6 * f6) + (f5 * f5));
        boolean z2 = false;
        if (pa.a(13)) {
            Object systemService = context.getSystemService("uimode");
            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
            if (uiModeManager != null) {
            }
        } else if (sqrt >= 15.0d) {
            try {
                z = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
            } catch (Throwable unused) {
                boolean z3 = ob1.a;
                z = false;
            }
        }
        return z2 ? sg0.d : (sqrt >= 7.0d || coerceAtMost >= 600.0f) ? sg0.c : sg0.b;
    }
}
