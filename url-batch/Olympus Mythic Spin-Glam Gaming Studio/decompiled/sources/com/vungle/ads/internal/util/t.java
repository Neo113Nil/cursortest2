package com.vungle.ads.internal.util;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes14.dex */
public abstract class t {
    public static void b(String tag, String message) {
        boolean z;
        Regex regex;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z = u.a;
        if (z) {
            Intrinsics.checkNotNullParameter(message, "<this>");
            regex = u.b;
            Log.e(tag, regex.replace(message, "xxx.xxx.xxx.xxx"));
        }
    }

    public static void c(String tag, String message) {
        boolean z;
        Regex regex;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z = u.a;
        if (z) {
            Intrinsics.checkNotNullParameter(message, "<this>");
            regex = u.b;
            Log.w(tag, regex.replace(message, "xxx.xxx.xxx.xxx"));
        }
    }

    public static void a(String message) {
        boolean z;
        Regex regex;
        Intrinsics.checkNotNullParameter("VungleWebClient", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z = u.a;
        if (z) {
            Intrinsics.checkNotNullParameter(message, "<this>");
            regex = u.b;
            Log.i("VungleWebClient", regex.replace(message, "xxx.xxx.xxx.xxx"));
        }
    }

    public static int a(String tag, String message) {
        boolean z;
        Regex regex;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z = u.a;
        if (!z) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(message, "<this>");
        regex = u.b;
        return Log.d(tag, regex.replace(message, "xxx.xxx.xxx.xxx"));
    }

    public static void a(String tag, String message, Throwable throwable) {
        boolean z;
        Regex regex;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z = u.a;
        if (z) {
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNullParameter(message, "<this>");
            regex = u.b;
            sb.append(regex.replace(message, "xxx.xxx.xxx.xxx"));
            sb.append("; error: ");
            sb.append(throwable.getLocalizedMessage());
            Log.e(tag, sb.toString());
        }
    }

    public static void a(String tag, Function0 message) {
        boolean z;
        Regex regex;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        z = u.a;
        if (z) {
            String str = (String) message.mo4828invoke();
            Intrinsics.checkNotNullParameter(str, "<this>");
            regex = u.b;
            Log.w(tag, regex.replace(str, "xxx.xxx.xxx.xxx"));
        }
    }
}
