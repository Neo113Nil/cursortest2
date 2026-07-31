package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbdt implements Callable {
    protected final zzbcg zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzaya zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbdt(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2) {
        this.zza = zzbcgVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzayaVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zzbcg zzbcgVar = this.zza;
            Method zzo = zzbcgVar.zzo(this.zzb, this.zzc);
            this.zze = zzo;
            if (zzo == null) {
                return null;
            }
            zza();
            zzbax zzh = zzbcgVar.zzh();
            if (zzh == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzh.zza(this.zzg, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
