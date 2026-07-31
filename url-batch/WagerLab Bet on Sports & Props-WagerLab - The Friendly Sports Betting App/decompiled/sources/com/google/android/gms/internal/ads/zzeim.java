package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeim implements zzedz {
    private final Context zza;
    private final zzdpi zzb;
    private final zzdor zzc;
    private final zzfdc zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjo zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjH)).booleanValue();
    private final zzecy zzi;
    private final zzdsg zzj;
    private final zzdsm zzk;

    public zzeim(Context context, VersionInfoParcel versionInfoParcel, zzfdc zzfdcVar, Executor executor, zzdor zzdorVar, zzdpi zzdpiVar, zzbjo zzbjoVar, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzd = zzfdcVar;
        this.zzc = zzdorVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpiVar;
        this.zzg = zzbjoVar;
        this.zzi = zzecyVar;
        this.zzj = zzdsgVar;
        this.zzk = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        zzfco zzfcoVar = zzfcjVar.zzs;
        return (zzfcoVar == null || zzfcoVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final ListenableFuture zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        final zzdpm zzdpmVar = new zzdpm();
        ListenableFuture zza = zzgot.zza(null);
        zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeim.this.zzc(zzfcjVar, zzfcuVar, zzdpmVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture zzj = zzgot.zzj(zza, zzgobVar, executor);
        Objects.requireNonNull(zzdpmVar);
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdpm.this.zzb();
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfcj zzfcjVar, zzfcu zzfcuVar, zzdpm zzdpmVar, Object obj) {
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdpi zzdpiVar = this.zzb;
        zzfdc zzfdcVar = this.zzd;
        final zzcek zza = zzdpiVar.zza(zzfdcVar.zzf, zzfcjVar, zzfcuVar.zzb.zzb);
        zza.zzaw(zzfcjVar.zzW);
        Context context = this.zza;
        zzdpmVar.zza(context, zza.zzE());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdru.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzbzm zzbzmVar = new zzbzm();
        zzdor zzdorVar = this.zzc;
        zzcri zzcriVar = new zzcri(zzfcuVar, zzfcjVar, null);
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbjo zzbjoVar = this.zzg;
        boolean z = this.zzh;
        zzecy zzecyVar = this.zzi;
        zzdsg zzdsgVar = this.zzj;
        final zzdon zzf = zzdorVar.zzf(zzcriVar, new zzdoo(new zzeii(context, zzdpiVar, zzfdcVar, versionInfoParcel, zzfcjVar, zzbzmVar, zza, zzbjoVar, z, zzecyVar, zzdsgVar, this.zzk), zza));
        zzbzmVar.zzc(zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            zzdsgVar.zze().putLong(zzdru.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzbke.zzb(zza, zzf.zzk());
        zzf.zzd().zzq(new zzcwm() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // com.google.android.gms.internal.ads.zzcwm
            public final /* synthetic */ void zzdw() {
                zzcek zzcekVar = zzcek.this;
                if (zzcekVar.zzP() != null) {
                    zzcekVar.zzP().zzq();
                }
            }
        }, zzbzh.zzg);
        zzdph zzl = zzf.zzl();
        if (true != z) {
            zzbjoVar = null;
        }
        zzl.zzi(zza, true, zzbjoVar, zzdsgVar.zze());
        zzfco zzfcoVar = zzfcjVar.zzs;
        String str = zzfcoVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && zzf.zzo().zza(true)) {
            str = zzcgb.zza(str, zzcgb.zzb(zzfcjVar));
        }
        zzf.zzl();
        return zzgot.zzk(zzdph.zzj(zza, zzfcoVar.zzb, str, zzdsgVar.zze(), zzdorVar.zzd()), new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj2) {
                zzcek zzcekVar = zza;
                if (zzfcjVar.zzM) {
                    zzcekVar.zzav();
                }
                zzdon zzdonVar = zzf;
                zzcekVar.zzJ();
                zzcekVar.onPause();
                return zzdonVar.zzh();
            }
        }, this.zze);
    }
}
