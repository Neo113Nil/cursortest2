package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzepl {
    private final Context zza;
    private final zzfrg zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzcyo zze;
    private final zzeqb zzf;
    private final zzfta zzg;
    private final zzhdr zzh = zzhdr.zze();
    private final AtomicBoolean zzi = new AtomicBoolean();
    private zzepm zzj;
    private zzflo zzk;

    zzepl(Context context, zzfrg zzfrgVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzcyo zzcyoVar, zzeqb zzeqbVar, zzfta zzftaVar) {
        this.zza = context;
        this.zzb = zzfrgVar;
        this.zzc = executor;
        this.zzd = scheduledExecutorService;
        this.zze = zzcyoVar;
        this.zzf = zzeqbVar;
        this.zzg = zzftaVar;
    }

    private final synchronized ListenableFuture zzd(zzfld zzfldVar) {
        Iterator it = zzfldVar.zza.iterator();
        while (it.hasNext()) {
            zzemq zza = this.zze.zza(zzfldVar.zzb, (String) it.next());
            if (zza != null && zza.zza(this.zzk, zzfldVar)) {
                ListenableFuture zzi = zzhcy.zzi(zza.zzb(this.zzk, zzfldVar), zzfldVar.zzR, TimeUnit.MILLISECONDS, this.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkr)).booleanValue()) {
                    zzfqw zzn = zzfqw.zzn(this.zza, 12);
                    zzn.zzi(zzfldVar.zzE);
                    zzn.zza();
                    zzfrf.zzd(zzi, this.zzb, zzn);
                }
                return zzi;
            }
        }
        return zzhcy.zzc(new zzefb(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(@Nullable zzfld zzfldVar) {
        ListenableFuture zzd = zzd(zzfldVar);
        this.zzf.zze(this.zzk, zzfldVar, zzd, this.zzg);
        zzhcy.zzr(zzd, new zzepk(this, zzfldVar), this.zzc);
    }

    public final synchronized ListenableFuture zza(zzflo zzfloVar) {
        try {
            if (!this.zzi.getAndSet(true)) {
                List list = zzfloVar.zzb.zza;
                if (list.isEmpty()) {
                    this.zzh.zzb(new zzeqf(3, zzeqi.zzb(zzfloVar)));
                } else {
                    this.zzk = zzfloVar;
                    zzeqb zzeqbVar = this.zzf;
                    this.zzj = new zzepm(zzfloVar, zzeqbVar, this.zzh);
                    zzeqbVar.zzc(list);
                    zzfld zza = this.zzj.zza();
                    while (zza != null) {
                        zzb(zza);
                        zza = this.zzj.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    final /* synthetic */ zzepm zzc() {
        return this.zzj;
    }
}
