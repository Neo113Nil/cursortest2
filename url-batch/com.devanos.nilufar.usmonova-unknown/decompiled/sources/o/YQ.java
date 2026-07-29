package o;

import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class YQ {
    public static int c = Integer.MIN_VALUE;
    public final int a;
    public final DisplayMetrics b;

    public YQ(DisplayMetrics displayMetrics) {
        int i = c;
        c = i + 1;
        this.a = i;
        this.b = displayMetrics;
    }
}
