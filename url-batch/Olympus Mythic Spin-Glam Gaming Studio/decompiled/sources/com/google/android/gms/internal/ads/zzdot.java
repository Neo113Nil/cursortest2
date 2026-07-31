package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzdot implements zzcyo {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zziol zzd;
    private final zzdrb zze;

    zzdot(Map map, Map map2, Map map3, zziol zziolVar, zzdrb zzdrbVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zziolVar;
        this.zze = zzdrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    @Nullable
    public final zzemq zza(int i, String str) {
        zzemq zza;
        zzemq zzemqVar = (zzemq) this.zza.get(str);
        if (zzemqVar != null) {
            return zzemqVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzeow zzeowVar = (zzeow) this.zzc.get(str);
            if (zzeowVar != null) {
                return zzcyt.zza(zzeowVar);
            }
            zza = (zzemq) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zza = ((zzcyo) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return zzcyt.zzb(zza);
    }
}
