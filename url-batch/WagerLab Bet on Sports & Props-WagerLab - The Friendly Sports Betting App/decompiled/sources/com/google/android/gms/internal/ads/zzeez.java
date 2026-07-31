package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeez implements zzedz {
    private final zzcpp zza;
    private final Context zzb;
    private final zzdpi zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final zzggr zzf;
    private final zzdsg zzg;

    public zzeez(zzcpp zzcppVar, Context context, Executor executor, zzdpi zzdpiVar, zzfdc zzfdcVar, zzggr zzggrVar, zzdsg zzdsgVar) {
        this.zzb = context;
        this.zza = zzcppVar;
        this.zze = executor;
        this.zzc = zzdpiVar;
        this.zzd = zzfdcVar;
        this.zzf = zzggrVar;
        this.zzg = zzdsgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final ListenableFuture zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeez.this.zzc(zzfcuVar, zzfcjVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ ListenableFuture zzc(zzfcu zzfcuVar, zzfcj zzfcjVar, Object obj) {
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zza = zzfdi.zza(context, zzfcjVar.zzu);
        final zzcek zza2 = this.zzc.zza(zza, zzfcjVar, zzfcuVar.zzb.zzb);
        zza2.zzaw(zzfcjVar.zzW);
        View zza3 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziC)).booleanValue() && zzfcjVar.zzag) ? zzcqe.zza(context, zza2.zzE(), zzfcjVar) : new zzdpl(context, zza2.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfcjVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcpp zzcppVar = this.zza;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        Objects.requireNonNull(zza2);
        final zzcol zzf = zzcppVar.zzf(zzcriVar, new zzcor(zza3, zza2, new zzcqq() { // from class: com.google.android.gms.internal.ads.zzeeu
            @Override // com.google.android.gms.internal.ads.zzcqq
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcek.this.zzh();
            }
        }, zzfdi.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdph zzj = zzf.zzj();
        zzdsg zzdsgVar = this.zzg;
        zzj.zzi(zza2, false, null, zzdsgVar.zze());
        zzcwk zzd = zzf.zzd();
        zzcwm zzcwmVar = new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeev
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcek.this;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        };
        zzgpd zzgpdVar = zzbzh.zzg;
        zzd.zzq(zzcwmVar, zzgpdVar);
        zzfco zzfcoVar = zzfcjVar.zzs;
        String str = zzfcoVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && zzf.zzm().zza(true)) {
            str = zzcgb.zza(str, zzcgb.zzb(zzfcjVar));
        }
        zzf.zzj();
        ListenableFuture zzj2 = zzdph.zzj(zza2, zzfcoVar.zzb, str, zzdsgVar.zze(), zzcppVar.zze());
        if (zzfcjVar.zzM) {
            Objects.requireNonNull(zza2);
            zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcek.this.zzav();
                }
            }, this.zze);
        }
        zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeew
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeez.this.zzd(zza2);
            }
        }, this.zze);
        return zzgot.zzk(zzj2, new zzggr() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcol.this.zzi();
            }
        }, zzgpdVar);
    }

    final /* synthetic */ void zzd(zzcek zzcekVar) {
        zzcekVar.zzJ();
        zzfdc zzfdcVar = this.zzd;
        zzcfq zzh = zzcekVar.zzh();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfdcVar.zza;
        if (zzgaVar != null && zzh != null) {
            zzh.zzc(zzgaVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbw)).booleanValue() || zzcekVar.isAttachedToWindow()) {
            return;
        }
        zzcekVar.onPause();
        zzcekVar.zzaG(true);
    }
}
