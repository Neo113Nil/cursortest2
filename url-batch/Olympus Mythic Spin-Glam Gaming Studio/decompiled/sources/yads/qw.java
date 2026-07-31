package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class qw {
    public static volatile sw a;
    public static final Object b = new Object();

    public static sw a(Context context) {
        if (a == null) {
            synchronized (b) {
                try {
                    if (a == null) {
                        a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sw swVar = a;
        if (swVar != null) {
            return swVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
