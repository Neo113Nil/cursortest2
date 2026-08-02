package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzegw implements zzeet {
    private final Context zza;
    private final zzdpl zzb;
    private final zzdgp zzc;
    private final zzffg zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbja zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhZ)).booleanValue();
    private final zzeds zzi;

    public zzegw(Context context, VersionInfoParcel versionInfoParcel, zzffg zzffgVar, Executor executor, zzdgp zzdgpVar, zzdpl zzdplVar, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zza = context;
        this.zzd = zzffgVar;
        this.zzc = zzdgpVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdplVar;
        this.zzg = zzbjaVar;
        this.zzi = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final ListenableFuture zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        final zzdpp zzdppVar = new zzdpp();
        ListenableFuture zzn = zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzegw.this.zzc(zzfelVar, zzfexVar, zzdppVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // java.lang.Runnable
            public final void run() {
                zzdpp.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        zzfeq zzfeqVar = zzfelVar.zzs;
        return (zzfeqVar == null || zzfeqVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(final zzfel zzfelVar, zzfex zzfexVar, zzdpp zzdppVar, Object obj) throws Exception {
        final zzcej zza = this.zzb.zza(this.zzd.zze, zzfelVar, zzfexVar.zzb.zzb);
        zza.zzac(zzfelVar.zzW);
        zzdppVar.zza(this.zza, (View) zza);
        zzbzt zzbztVar = new zzbzt();
        final zzdfp zze = this.zzc.zze(new zzcsk(zzfexVar, zzfelVar, null), new zzdfs(new zzegv(this.zza, this.zzf, zzbztVar, zzfelVar, zza, this.zzd, this.zzh, this.zzg, this.zzi), zza));
        zzbztVar.zzc(zze);
        zze.zzc().zzo(new zzcxk() { // from class: com.google.android.gms.internal.ads.zzegr
            @Override // com.google.android.gms.internal.ads.zzcxk
            public final void zzr() {
                zzcej zzcejVar = zzcej.this;
                if (zzcejVar.zzN() != null) {
                    zzcejVar.zzN().zzr();
                }
            }
        }, zzbzo.zzf);
        String str = zzfelVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeC)).booleanValue() && zze.zzl().zze(true)) {
            str = zzcfu.zzb(str, zzcfu.zza(zzfelVar));
        }
        zze.zzi().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzi();
        return zzgcj.zzm(zzdpk.zzj(zza, zzfelVar.zzs.zzb, str), new zzful(this) { // from class: com.google.android.gms.internal.ads.zzegs
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj2) {
                zzcej zzcejVar = zza;
                if (zzfelVar.zzM) {
                    zzcejVar.zzah();
                }
                zzdfp zzdfpVar = zze;
                zzcejVar.zzab();
                zzcejVar.onPause();
                return zzdfpVar.zzg();
            }
        }, this.zze);
    }
}
