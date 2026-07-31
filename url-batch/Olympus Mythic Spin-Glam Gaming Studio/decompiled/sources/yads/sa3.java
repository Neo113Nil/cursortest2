package yads;

import android.content.res.Resources;
import kotlin.math.MathKt;

/* loaded from: classes3.dex */
public abstract class sa3 {
    public static final int a(int i) {
        return i >= 0 ? MathKt.roundToInt(i / Resources.getSystem().getDisplayMetrics().density) : i;
    }
}
