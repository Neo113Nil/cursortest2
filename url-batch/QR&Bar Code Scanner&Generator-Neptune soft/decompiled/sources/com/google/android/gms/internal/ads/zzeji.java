package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeji implements zzehj {
    private final Context zza;
    private final zzdmh zzb;
    private final zzcgv zzc;
    private final Executor zzd;

    public zzeji(Context context, zzcgv zzcgvVar, zzdmh zzdmhVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcgvVar;
        this.zzb = zzdmhVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, final zzehf zzehfVar) throws zzfek, zzekr {
        zzdlh zze = this.zzb.zze(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzdlk(new zzdmp() { // from class: com.google.android.gms.internal.ads.zzejh
            @Override // com.google.android.gms.internal.ads.zzdmp
            public final void zza(boolean z, Context context, zzddn zzddnVar) {
                zzeji.this.zzc(zzehfVar, z, context, zzddnVar);
            }
        }, null));
        zze.zzd().zzj(new zzcuq((zzffa) zzehfVar.zzb), this.zzd);
        ((zzeix) zzehfVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        ((zzffa) zzehfVar.zzb).zzn(this.zza, zzfdwVar.zza.zza.zzd, zzfdkVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfdkVar.zzt), (zzbvq) zzehfVar.zzc);
    }

    final /* synthetic */ void zzc(zzehf zzehfVar, boolean z, Context context, zzddn zzddnVar) throws zzdmo {
        try {
            ((zzffa) zzehfVar.zzb).zzu(z);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaB)).intValue()) {
                ((zzffa) zzehfVar.zzb).zzv();
            } else {
                ((zzffa) zzehfVar.zzb).zzw(context);
            }
        } catch (zzfek e) {
            com.google.android.gms.ads.internal.util.zze.zzi("Cannot show interstitial.");
            throw new zzdmo(e.getCause());
        }
    }
}
