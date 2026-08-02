package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgxa {
    public static zzgxa zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgwv(cls.getSimpleName()) : new zzgwx(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
