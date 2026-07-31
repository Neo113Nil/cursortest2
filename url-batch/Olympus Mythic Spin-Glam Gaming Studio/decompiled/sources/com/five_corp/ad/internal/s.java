package com.five_corp.ad.internal;

import android.util.Log;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class s {
    public static final String a;
    public static final Pattern b;
    public static final Pattern c;

    static {
        String cls = s.class.toString();
        Intrinsics.checkNotNullExpressionValue(cls, "toString(...)");
        a = cls;
        b = Pattern.compile("^[a-zA-Z0-9 \\-]+$");
        c = Pattern.compile("^[a-zA-Z0-9.\\-]+$");
    }

    public static final boolean a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String obj = StringsKt.trim(name).toString();
        if (obj.length() == 0) {
            Log.e(a, "Mediation name cannot be empty");
            return false;
        }
        if (obj.length() <= 32) {
            if (!Intrinsics.areEqual(name, obj)) {
                Log.e(a, "Mediation name cannot have leading or trailing whitespace");
                return false;
            }
            if (b.matcher(obj).matches()) {
                return true;
            }
            Log.e(a, "Mediation name contains invalid characters (allowed: a-z, A-Z, 0-9, space, hyphen)");
            return false;
        }
        Log.e(a, "Mediation name too long: " + obj.length() + " characters (max: 32)");
        return false;
    }

    public static final boolean b(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        String obj = StringsKt.trim(version).toString();
        if (obj.length() == 0) {
            Log.e(a, "Mediation version cannot be empty");
            return false;
        }
        if (obj.length() <= 32) {
            if (!Intrinsics.areEqual(version, obj)) {
                Log.e(a, "Mediation version cannot have leading or trailing whitespace");
                return false;
            }
            if (c.matcher(obj).matches()) {
                return true;
            }
            Log.e(a, "Mediation version contains invalid characters (allowed: a-z, A-Z, 0-9, dot, hyphen)");
            return false;
        }
        Log.e(a, "Mediation version too long: " + obj.length() + " characters (max: 32)");
        return false;
    }
}
