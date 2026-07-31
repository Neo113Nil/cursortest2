package yads;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: classes3.dex */
public abstract class jj {
    public static final int a(Context context, int i) {
        int i2;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            i2 = obtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            i2 = -16777216;
        }
        obtainStyledAttributes.recycle();
        return i2;
    }
}
