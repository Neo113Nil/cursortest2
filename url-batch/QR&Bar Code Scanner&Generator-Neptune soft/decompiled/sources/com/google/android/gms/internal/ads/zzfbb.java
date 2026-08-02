package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfbb {
    static zzfaz zza(Context context, zzffm zzffmVar, zzfge zzfgeVar) {
        return zzc(context, zzffmVar, zzfgeVar);
    }

    static zzfaz zzb(Context context, zzffm zzffmVar, zzfge zzfgeVar) {
        return zzc(context, zzffmVar, zzfgeVar);
    }

    private static zzfaz zzc(Context context, zzffm zzffmVar, zzfge zzfgeVar) {
        zzcfs zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfu)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z = false;
        if (zzh != null && zzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfK)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzft)).booleanValue() || z) {
                zzfgd zza = zzfgeVar.zza(zzffu.AppOpen, context, zzffmVar, new zzfad(new zzfaa()));
                return new zzfaf(new zzfap(new zzfao()), new zzfal(zza.zza, zzchc.zza), zza.zzb, zza.zza.zza().zzf, zzchc.zza);
            }
        }
        return new zzfao();
    }
}
