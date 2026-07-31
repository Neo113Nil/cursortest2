package yads;

import android.content.Context;
import android.text.format.DateFormat;

/* loaded from: classes14.dex */
public final class u53 {
    public static String a(Context context) {
        return DateFormat.is24HourFormat(context) ? "24" : "12";
    }
}
