package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfbe implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzfbe(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfaz zzb() {
        Context context = (Context) this.zza.zzb();
        zzffm zzffmVar = (zzffm) this.zzb.zzb();
        zzfge zzfgeVar = (zzfge) this.zzc.zzb();
        zzcfs zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfu)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z = false;
        if (zzh != null && zzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfw)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzft)).booleanValue() || z) {
                zzfgd zza = zzfgeVar.zza(zzffu.Rewarded, context, zzffmVar, new zzfad(new zzfaa()));
                return new zzfaf(new zzfap(new zzfao()), new zzfal(zza.zza, zzchc.zza), zza.zzb, zza.zza.zza().zzf, zzchc.zza);
            }
        }
        return new zzfao();
    }
}
