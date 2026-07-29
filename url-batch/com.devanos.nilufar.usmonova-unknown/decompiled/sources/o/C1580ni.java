package o;

import android.content.Context;

/* renamed from: o.ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1580ni {
    public final Context a;

    public C1580ni(Context context) {
        this.a = context;
    }

    public final String a() {
        Context context = this.a;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "1.0.0" : str;
        } catch (Exception unused) {
            return "1.0.0";
        }
    }
}
