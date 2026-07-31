package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzgvg {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb;

    static {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (Throwable th) {
            zze(th);
        }
        zzb = obj;
        if (obj != null) {
            zzd("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (obj == null) {
            return;
        }
        zzc(obj);
    }

    public static void zza(Throwable th, Class cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void zzb(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    private static Method zzc(Object obj) {
        try {
            Method zzd = zzd("getStackTraceDepth", Throwable.class);
            if (zzd == null) {
                return null;
            }
            zzd.invoke(obj, new Throwable());
            return zzd;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method zzd(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (Throwable th) {
            zze(th);
            return null;
        }
    }

    private static void zze(Throwable th) {
        if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
            throw ((Error) th);
        }
    }
}
