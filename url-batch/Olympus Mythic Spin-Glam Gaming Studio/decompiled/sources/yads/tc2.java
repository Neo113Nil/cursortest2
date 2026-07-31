package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class tc2 {
    public final Context a;

    public tc2(Context context) {
        this.a = context.getApplicationContext();
    }

    public final boolean a(String str) {
        return this.a.checkCallingOrSelfPermission(str) == 0;
    }
}
