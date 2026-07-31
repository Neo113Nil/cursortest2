package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes3.dex */
public abstract class jl2 {
    public static final qv1 a;

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
    }

    public static void a(String str, Object... objArr) {
        boolean z;
        if (!ob1.a) {
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
        if (ob1.a) {
            Log.w("Yandex Mobile Ads", format);
        }
        if (su1.a.a()) {
            a.a(ru1.c, "Yandex Mobile Ads", format);
        }
    }
}
