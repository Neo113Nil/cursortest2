package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgpm {
    public static zzgpm zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgph(cls.getSimpleName()) : new zzgpj(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
