package com.onevcat.uniwebview.internal.obfuscated;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058o {
    public static final C0058o b = new C0058o();
    public int a;

    public C0058o() {
        Intrinsics.checkNotNullParameter("UniWebView", "tag");
        this.a = 80;
    }

    public final void a(EnumC0054n enumC0054n, String str) {
        if (enumC0054n.a < this.a) {
            return;
        }
        if (enumC0054n == EnumC0054n.CRITICAL) {
            Log.e("UniWebView", "<UniWebView-Android> " + a(str));
        } else if (enumC0054n == EnumC0054n.WARNING) {
            Log.w("UniWebView", "<UniWebView-Android> " + a(str));
        } else {
            Log.d("UniWebView", "<UniWebView-Android> " + a(str));
        }
    }

    public final void a(EnumC0054n enumC0054n, Function0 function0) {
        if (enumC0054n.a < this.a) {
            return;
        }
        a(enumC0054n, (String) function0.invoke());
    }

    public final void a(String format, String arg) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(arg, "arg");
        EnumC0054n enumC0054n = EnumC0054n.DEBUG;
        if (10 < this.a) {
            return;
        }
        a(enumC0054n, StringsKt.replace$default(format, "%s", a(arg), false, 4, (Object) null));
    }

    public static void a(EnumC0054n level, String mark, String message) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(message, "message");
        int ordinal = level.ordinal();
        if (ordinal == 3) {
            Log.w("UniWebView", mark + " <UniWebView-Web> " + a(message));
        } else if (ordinal != 4) {
            Log.d("UniWebView", mark + " <UniWebView-Web> " + a(message));
        } else {
            Log.e("UniWebView", mark + " <UniWebView-Web> " + a(message));
        }
    }

    public static String a(String str) {
        if (str.length() <= 5000) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 5000);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return sb.append(substring).append("...truncated").toString();
    }
}
