package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes8.dex */
public abstract class ab1 {
    public static final qv1 a;
    public static final String b;
    public static boolean c;

    static {
        qv1 qv1Var;
        qv1 qv1Var2 = qv1.b;
        if (qv1Var2 == null) {
            synchronized (qv1.c) {
                qv1Var = qv1.b;
                if (qv1Var == null) {
                    qv1Var = new qv1();
                    qv1.b = qv1Var;
                }
            }
            qv1Var2 = qv1Var;
        }
        a = qv1Var2;
        b = "YandexAds";
        c = true;
    }

    public static final void a(String str, Object... objArr) {
        boolean z;
        if (!c) {
            synchronized (su1.a) {
                z = su1.b;
            }
            if (!z) {
                return;
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String a2 = a(format);
        if (c) {
            Log.e(b, a2);
        }
        if (su1.a.a()) {
            a.a(ru1.d, b, a2);
        }
    }

    public static final void b(String str, Object... objArr) {
        boolean z;
        if (!c) {
            synchronized (su1.a) {
                z = su1.b;
            }
            if (!z) {
                return;
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String a2 = a(format);
        if (c) {
            Log.i(b, a2);
        }
        if (su1.a.a()) {
            a.a(ru1.b, b, a2);
        }
    }

    public static final void c(String str, Object... objArr) {
        boolean z;
        if (!c) {
            synchronized (su1.a) {
                z = su1.b;
            }
            if (!z) {
                return;
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String a2 = a(format);
        if (c) {
            Log.w(b, a2);
        }
        if (su1.a.a()) {
            a.a(ru1.c, b, a2);
        }
    }

    public static String a(String str) {
        return "[Integration] " + str;
    }
}
