package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeyx {
    static zzeyv zza(Context context, zzfdj zzfdjVar, zzfeb zzfebVar) {
        return zzc(context, zzfdjVar, zzfebVar);
    }

    static zzeyv zzb(Context context, zzfdj zzfdjVar, zzfeb zzfebVar) {
        return zzc(context, zzfdjVar, zzfebVar);
    }

    private static zzeyv zzc(Context context, zzfdj zzfdjVar, zzfeb zzfebVar) {
        zzcel zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfn)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z = false;
        if (zzh != null && zzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfD)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfm)).booleanValue() || z) {
                zzfea zza = zzfebVar.zza(zzfdr.AppOpen, context, zzfdjVar, new zzexz(new zzexw()));
                return new zzeyb(new zzeyl(new zzeyk()), new zzeyh(zza.zza, zzcfv.zza), zza.zzb, zza.zza.zza().zzf, zzcfv.zza);
            }
        }
        return new zzeyk();
    }
}
