package io.bidmachine;

import android.content.Context;
import android.os.Build;

/* loaded from: classes5.dex */
final class q {
    private static final String a = Build.MANUFACTURER + Build.MODEL;

    q() {
    }

    String a(Context context, String str) {
        return n.a(context, str + a);
    }

    void a(Context context, String str, String str2) {
        n.a(context, str + a, str2);
    }
}
