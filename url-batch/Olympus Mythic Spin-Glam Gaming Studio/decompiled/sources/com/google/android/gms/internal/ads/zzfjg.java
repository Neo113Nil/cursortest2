package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfjg implements zzeuq {
    private final Context zza;
    private final Executor zzb;
    private final zzcob zzc;
    private final zzeua zzd;
    private final zzfkh zze;

    @Nullable
    private zzbkb zzf;
    private final zzfrj zzg;
    private final zzflv zzh;
    private ListenableFuture zzi;

    public zzfjg(Context context, Executor executor, zzcob zzcobVar, zzeua zzeuaVar, zzfkh zzfkhVar, zzflv zzflvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcobVar;
        this.zzd = zzeuaVar;
        this.zzh = zzflvVar;
        this.zze = zzfkhVar;
        this.zzg = zzcobVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeuo zzeuoVar, zzeup zzeupVar) {
        zzdoe zzh;
        zzfrg zzfrgVar;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfjg.this.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdn)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfiz) zzeuoVar).zza;
        Bundle zza = zzdzu.zza(new Pair(zzdzs.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdzs.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzflv zzflvVar = this.zzh;
        zzflvVar.zzg(str);
        zzflvVar.zzc(zzrVar);
        zzflvVar.zza(zzmVar);
        zzflvVar.zzv(zza);
        Context context = this.zza;
        zzflw zzB = zzflvVar.zzB();
        zzfqw zzo = zzfqw.zzo(context, zzfrf.zzg(zzB), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjC)).booleanValue()) {
            zzdod zzm = this.zzc.zzm();
            zzdcy zzdcyVar = new zzdcy();
            zzdcyVar.zza(context);
            zzdcyVar.zzb(zzB);
            zzm.zze(zzdcyVar.zze());
            zzdjo zzdjoVar = new zzdjo();
            zzeua zzeuaVar = this.zzd;
            Executor executor = this.zzb;
            zzdjoVar.zzm(zzeuaVar, executor);
            zzdjoVar.zze(zzeuaVar, executor);
            zzm.zzf(zzdjoVar.zzn());
            zzm.zzd(new zzesg(this.zzf));
            zzh = zzm.zzh();
        } else {
            zzdjo zzdjoVar2 = new zzdjo();
            zzfkh zzfkhVar = this.zze;
            if (zzfkhVar != null) {
                Executor executor2 = this.zzb;
                zzdjoVar2.zza(zzfkhVar, executor2);
                zzdjoVar2.zzb(zzfkhVar, executor2);
                zzdjoVar2.zzc(zzfkhVar, executor2);
            }
            zzdod zzm2 = this.zzc.zzm();
            zzdcy zzdcyVar2 = new zzdcy();
            zzdcyVar2.zza(context);
            zzdcyVar2.zzb(zzB);
            zzm2.zze(zzdcyVar2.zze());
            zzeua zzeuaVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdjoVar2.zzm(zzeuaVar2, executor3);
            zzdjoVar2.zza(zzeuaVar2, executor3);
            zzdjoVar2.zzb(zzeuaVar2, executor3);
            zzdjoVar2.zzc(zzeuaVar2, executor3);
            zzdjoVar2.zzf(zzeuaVar2, executor3);
            zzdjoVar2.zzg(zzeuaVar2, executor3);
            zzdjoVar2.zze(zzeuaVar2, executor3);
            zzdjoVar2.zzk(zzeuaVar2, executor3);
            zzdjoVar2.zzd(zzeuaVar2, executor3);
            zzm2.zzf(zzdjoVar2.zzn());
            zzm2.zzd(new zzesg(this.zzf));
            zzh = zzm2.zzh();
        }
        zzdoe zzdoeVar = zzh;
        if (((Boolean) zzbla.zzc.zze()).booleanValue()) {
            zzfrg zzc = zzdoeVar.zzc();
            zzc.zzi(4);
            zzc.zzc(zzmVar.zzp);
            zzc.zzd(zzmVar.zzm);
            zzfrgVar = zzc;
        } else {
            zzfrgVar = null;
        }
        zzczp zzb = zzdoeVar.zzb();
        ListenableFuture zzc2 = zzb.zzc(zzb.zzb());
        this.zzi = zzc2;
        zzhcy.zzr(zzc2, new zzfje(this, zzeupVar, zzfrgVar, zzo, zzdoeVar), this.zzb);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeuq
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public final void zzc(zzbkb zzbkbVar) {
        this.zzf = zzbkbVar;
    }

    final /* synthetic */ void zzd() {
        this.zzd.zzdJ(zzfmy.zzd(6, null, null));
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ zzeua zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfkh zzg() {
        return this.zze;
    }

    final /* synthetic */ zzfrj zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(ListenableFuture listenableFuture) {
        this.zzi = null;
    }
}
