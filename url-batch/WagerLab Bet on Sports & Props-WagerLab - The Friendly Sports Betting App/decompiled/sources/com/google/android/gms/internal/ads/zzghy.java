package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzghy {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb;

    static {
        Object zza2 = zza();
        zzb = zza2;
        if (zza2 != null) {
            zzc("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (zza2 == null) {
            return;
        }
        zzb(zza2);
    }

    private static Object zza() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzb(Object obj) {
        try {
            Method zzc = zzc("getStackTraceDepth", Throwable.class);
            if (zzc == null) {
                return null;
            }
            zzc.invoke(obj, new Throwable());
            return zzc;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method zzc(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
