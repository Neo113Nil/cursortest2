package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfzq implements zzfzp {
    private final String zza;
    private final String zzb;
    private final zzfym zzc;
    private final zzarw zzd;
    private final zzgdy zze;

    public zzfzq(String str, String str2, zzarw zzarwVar, zzfym zzfymVar, zzgdy zzgdyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzarwVar;
        this.zzc = zzfymVar;
        this.zze = zzgdyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method zzc = this.zzc.zzc(this.zza, this.zzb);
            if (zzc != null) {
                zza(zzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }

    protected abstract void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException;
}
