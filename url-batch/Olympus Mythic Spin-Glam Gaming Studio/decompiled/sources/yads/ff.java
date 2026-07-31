package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class ff {
    public static final String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            boolean z = ob1.a;
            return null;
        }
    }

    public static final String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
