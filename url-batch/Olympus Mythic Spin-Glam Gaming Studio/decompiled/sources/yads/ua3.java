package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class ua3 {
    public static volatile boolean a;
    public static final Object b = new Object();

    public static void a(Context context, mt1 mt1Var) {
        bu2 a2;
        if (a) {
            return;
        }
        synchronized (b) {
            try {
                if (!a && (a2 = uw2.a().a(context)) != null && a2.g0) {
                    Thread.setDefaultUncaughtExceptionHandler(new ta3(mt1Var, Thread.getDefaultUncaughtExceptionHandler(), a2));
                    a = true;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
