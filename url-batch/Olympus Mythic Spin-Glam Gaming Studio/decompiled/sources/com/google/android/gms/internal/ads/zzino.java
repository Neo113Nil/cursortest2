package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public abstract class zzino {
    public static zzino zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzinj(cls.getSimpleName()) : new zzinl(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
