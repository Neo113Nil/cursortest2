package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbbx implements Comparator {
    public zzbbx(zzbby zzbbyVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbm zzbbmVar = (zzbbm) obj;
        zzbbm zzbbmVar2 = (zzbbm) obj2;
        if (zzbbmVar.zzd() >= zzbbmVar2.zzd()) {
            if (zzbbmVar.zzd() > zzbbmVar2.zzd()) {
                return 1;
            }
            if (zzbbmVar.zzb() >= zzbbmVar2.zzb()) {
                if (zzbbmVar.zzb() > zzbbmVar2.zzb()) {
                    return 1;
                }
                float zza = (zzbbmVar.zza() - zzbbmVar.zzd()) * (zzbbmVar.zzc() - zzbbmVar.zzb());
                float zza2 = (zzbbmVar2.zza() - zzbbmVar2.zzd()) * (zzbbmVar2.zzc() - zzbbmVar2.zzb());
                if (zza <= zza2) {
                    return zza < zza2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
