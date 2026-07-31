package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdyg implements zzdzj {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdxh zza;
    private final zzgpd zzb;
    private final zzfdc zzc;
    private final ScheduledExecutorService zzd;
    private final zzebk zze;
    private final zzfib zzf;
    private final Context zzg;

    zzdyg(Context context, zzfdc zzfdcVar, zzdxh zzdxhVar, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzebk zzebkVar, zzfib zzfibVar) {
        this.zzg = context;
        this.zzc = zzfdcVar;
        this.zza = zzdxhVar;
        this.zzb = zzgpdVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzebkVar;
        this.zzf = zzfibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final ListenableFuture zza(zzbuv zzbuvVar) {
        Context context = this.zzg;
        ListenableFuture zza = this.zza.zza(zzbuvVar);
        zzfhr zzn = zzfhr.zzn(context, 11);
        zzfia.zzb(zza, zzn);
        ListenableFuture zzj = zzgot.zzj(zza, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzdyg.this.zzb((zzdzl) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgb)).booleanValue()) {
            zzj = zzgot.zzh(zzgot.zzi(zzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgc)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzdye.zza, zzbzh.zzg);
        }
        zzfia.zzd(zzj, this.zzf, zzn);
        zzgot.zzq(zzj, new zzdyd(this), zzbzh.zzg);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzb(zzdzl zzdzlVar) {
        return zzgot.zza(new zzfcu(new zzfcr(this.zzc), zzfct.zza(new InputStreamReader(zzdzlVar.zza()), zzdzlVar.zzb().zzm)));
    }

    final /* synthetic */ zzebk zzc() {
        return this.zze;
    }
}
