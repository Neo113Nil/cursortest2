package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzhpp {
    public static zzhpp zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhpk(cls.getSimpleName()) : new zzhpm(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
