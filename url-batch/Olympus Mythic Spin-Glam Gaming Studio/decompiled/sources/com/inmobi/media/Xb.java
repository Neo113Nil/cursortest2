package com.inmobi.media;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class Xb {
    public static byte a;

    public static final void a(byte b, String tag, String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (str == null) {
            return;
        }
        if (b == 1) {
            byte b2 = a;
            if (2 == b2 || 1 == b2 || 3 == b2) {
                Log.e("[InMobi]", str);
                return;
            }
            return;
        }
        if (b != 2) {
            if (b == 3) {
                a(tag, str);
            }
        } else {
            byte b3 = a;
            if (2 == b3 || 3 == b3) {
                Log.d("[InMobi]", str);
            }
        }
    }

    public static void a(String str, String str2) {
        if (str2.length() > 4000) {
            String substring = str2.substring(0, 4000);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Log.d(str, substring);
            String substring2 = str2.substring(4000);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            a(str, substring2);
            return;
        }
        Log.d(str, str2);
    }
}
