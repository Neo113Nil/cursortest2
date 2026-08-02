package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbdb implements Comparator {
    public zzbdb(zzbdc zzbdcVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbcq zzbcqVar = (zzbcq) obj;
        zzbcq zzbcqVar2 = (zzbcq) obj2;
        if (zzbcqVar.zzd() >= zzbcqVar2.zzd()) {
            if (zzbcqVar.zzd() > zzbcqVar2.zzd()) {
                return 1;
            }
            if (zzbcqVar.zzb() >= zzbcqVar2.zzb()) {
                if (zzbcqVar.zzb() > zzbcqVar2.zzb()) {
                    return 1;
                }
                float zza = (zzbcqVar.zza() - zzbcqVar.zzd()) * (zzbcqVar.zzc() - zzbcqVar.zzb());
                float zza2 = (zzbcqVar2.zza() - zzbcqVar2.zzd()) * (zzbcqVar2.zzc() - zzbcqVar2.zzb());
                if (zza <= zza2) {
                    return zza < zza2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
