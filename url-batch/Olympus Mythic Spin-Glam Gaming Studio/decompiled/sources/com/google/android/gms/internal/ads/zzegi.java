package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzegi implements zzeho {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzefj zza;
    private final zzhdi zzb;
    private final zzflw zzc;
    private final ScheduledExecutorService zzd;
    private final zzekb zze;
    private final zzfrg zzf;
    private final Context zzg;

    zzegi(Context context, zzflw zzflwVar, zzefj zzefjVar, zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, zzekb zzekbVar, zzfrg zzfrgVar) {
        this.zzg = context;
        this.zzc = zzflwVar;
        this.zza = zzefjVar;
        this.zzb = zzhdiVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzekbVar;
        this.zzf = zzfrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeho
    public final ListenableFuture zza(zzcbv zzcbvVar) {
        Context context = this.zzg;
        ListenableFuture zza = this.zza.zza(zzcbvVar);
        zzfqw zzn = zzfqw.zzn(context, 11);
        zzfrf.zzb(zza, zzn);
        ListenableFuture zzj = zzhcy.zzj(zza, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzegh
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzegi.this.zzb((zzehq) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgI)).booleanValue()) {
            zzj = zzhcy.zzh(zzhcy.zzi(zzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgJ)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzegg.zza, zzcgj.zzh);
        }
        zzfrf.zzd(zzj, this.zzf, zzn);
        zzhcy.zzr(zzj, new zzegf(this), zzcgj.zzh);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzb(zzehq zzehqVar) {
        return zzhcy.zza(new zzflo(new zzfll(this.zzc), zzfln.zza(new InputStreamReader(zzehqVar.zza()), zzehqVar.zzb().zzm)));
    }

    final /* synthetic */ zzekb zzc() {
        return this.zze;
    }
}
