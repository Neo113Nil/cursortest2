package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdsj {
    final /* synthetic */ zzdsk zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdsj(zzdsk zzdskVar) {
        this.zza = zzdskVar;
    }

    static /* bridge */ /* synthetic */ zzdsj zza(zzdsj zzdsjVar) {
        Map map;
        zzdsk zzdskVar = zzdsjVar.zza;
        Map map2 = zzdsjVar.zzb;
        map = zzdskVar.zzc;
        map2.putAll(map);
        return zzdsjVar;
    }

    public final zzdsj zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsj zzc(zzfel zzfelVar) {
        zzb("aai", zzfelVar.zzw);
        zzb("request_id", zzfelVar.zzan);
        zzb("ad_format", zzfel.zza(zzfelVar.zzb));
        return this;
    }

    public final zzdsj zzd(zzfeo zzfeoVar) {
        zzb("gqi", zzfeoVar.zzb);
        return this;
    }

    public final String zze() {
        zzdsp zzdspVar;
        zzdspVar = this.zza.zza;
        return zzdspVar.zzb(this.zzb);
    }

    public final void zzf() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // java.lang.Runnable
            public final void run() {
                zzdsj.this.zzh();
            }
        });
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsi
            @Override // java.lang.Runnable
            public final void run() {
                zzdsj.this.zzi();
            }
        });
    }

    final /* synthetic */ void zzh() {
        zzdsp zzdspVar;
        zzdspVar = this.zza.zza;
        zzdspVar.zzf(this.zzb);
    }

    final /* synthetic */ void zzi() {
        zzdsp zzdspVar;
        zzdspVar = this.zza.zza;
        zzdspVar.zze(this.zzb);
    }
}
