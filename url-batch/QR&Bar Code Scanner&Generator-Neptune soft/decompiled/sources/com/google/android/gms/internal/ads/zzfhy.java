package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfhy {
    final /* synthetic */ zzfhz zza;
    private final Object zzb;
    private final String zzc;
    private final zzfzp zzd;
    private final List zze;
    private final zzfzp zzf;

    private zzfhy(zzfhz zzfhzVar, Object obj, String str, zzfzp zzfzpVar, List list, zzfzp zzfzpVar2) {
        this.zza = zzfhzVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfzpVar;
        this.zze = list;
        this.zzf = zzfzpVar2;
    }

    public final zzfhm zza() {
        zzfia zzfiaVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzfhm zzfhmVar = new zzfhm(obj, str, this.zzf);
        zzfiaVar = this.zza.zzd;
        zzfiaVar.zza(zzfhmVar);
        this.zzd.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhs
            @Override // java.lang.Runnable
            public final void run() {
                zzfia zzfiaVar2;
                zzfhy zzfhyVar = zzfhy.this;
                zzfhm zzfhmVar2 = zzfhmVar;
                zzfiaVar2 = zzfhyVar.zza.zzd;
                zzfiaVar2.zzc(zzfhmVar2);
            }
        }, zzchc.zzf);
        zzfzg.zzr(zzfhmVar, new zzfhw(this, zzfhmVar), zzchc.zzf);
        return zzfhmVar;
    }

    public final zzfhy zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfhy zzc(Class cls, zzfyn zzfynVar) {
        zzfzq zzfzqVar;
        zzfhz zzfhzVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfzp zzfzpVar = this.zzd;
        List list = this.zze;
        zzfzp zzfzpVar2 = this.zzf;
        zzfzqVar = zzfhzVar.zzb;
        return new zzfhy(zzfhzVar, obj, str, zzfzpVar, list, zzfzg.zzg(zzfzpVar2, cls, zzfynVar, zzfzqVar));
    }

    public final zzfhy zzd(final zzfzp zzfzpVar) {
        return zzg(new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfht
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzp.this;
            }
        }, zzchc.zzf);
    }

    public final zzfhy zze(final zzfhk zzfhkVar) {
        return zzf(new zzfyn() { // from class: com.google.android.gms.internal.ads.zzfhv
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzg.zzi(zzfhk.this.zza(obj));
            }
        });
    }

    public final zzfhy zzf(zzfyn zzfynVar) {
        zzfzq zzfzqVar;
        zzfzqVar = this.zza.zzb;
        return zzg(zzfynVar, zzfzqVar);
    }

    public final zzfhy zzg(zzfyn zzfynVar, Executor executor) {
        return new zzfhy(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfzg.zzn(this.zzf, zzfynVar, executor));
    }

    public final zzfhy zzh(String str) {
        return new zzfhy(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfhy zzi(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzfhz zzfhzVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfzp zzfzpVar = this.zzd;
        List list = this.zze;
        zzfzp zzfzpVar2 = this.zzf;
        scheduledExecutorService = zzfhzVar.zzc;
        return new zzfhy(zzfhzVar, obj, str, zzfzpVar, list, zzfzg.zzo(zzfzpVar2, j, timeUnit, scheduledExecutorService));
    }
}
