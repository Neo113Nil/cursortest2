package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzepe implements zzemw {
    private final Context zza;
    private final zzdpa zzb;
    private final Executor zzc;

    public zzepe(Context context, zzdpa zzdpaVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdpaVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzflo zzfloVar, int i) {
        return zzfloVar.zza.zza.zzh.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        zzflw zzflwVar = zzfloVar.zza.zza;
        String jSONObject = zzfldVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfldVar.zzs);
        zzfmuVar.zzo(this.zza, zzflwVar.zzd, jSONObject, zzm, (zzbwa) zzemtVar.zzc, zzflwVar.zzj, zzflwVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd, zzeqf {
        zzdqr zzag;
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        zzbwf zzD = zzfmuVar.zzD();
        zzbwg zzE = zzfmuVar.zzE();
        zzbwj zzu = zzfmuVar.zzu();
        if (zzu != null && zzc(zzfloVar, 6)) {
            zzag = zzdqr.zzaf(zzu);
        } else if (zzD != null && zzc(zzfloVar, 6)) {
            zzag = zzdqr.zzai(zzD);
        } else if (zzD != null && zzc(zzfloVar, 2)) {
            zzag = zzdqr.zzah(zzD);
        } else if (zzE != null && zzc(zzfloVar, 6)) {
            zzag = zzdqr.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfloVar, 1)) {
                throw new zzeqf(1, "No native ad mappers");
            }
            zzag = zzdqr.zzag(zzE);
        }
        if (zzag != null) {
            zzflw zzflwVar = zzfloVar.zza.zza;
            if (zzflwVar.zzh.contains(Integer.toString(zzag.zzx()))) {
                zzdqt zze = this.zzb.zze(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdrc(zzag), new zzdsv(zzE, zzD, zzu));
                ((zzeof) zzemtVar.zzc).zzb(zze.zzf());
                zze.zza().zzq(new zzctr(zzfmuVar), this.zzc);
                return zze.zzh();
            }
        }
        throw new zzeqf(1, "No corresponding native ad listener");
    }
}
