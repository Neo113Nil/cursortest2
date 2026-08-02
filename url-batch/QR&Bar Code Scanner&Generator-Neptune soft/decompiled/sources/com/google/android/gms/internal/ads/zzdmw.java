package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdmw implements zzczh {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgxv zzd;
    private final zzdpb zze;

    zzdmw(Map map, Map map2, Map map3, zzgxv zzgxvVar, zzdpb zzdpbVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgxvVar;
        this.zze = zzdpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczh
    public final zzehc zza(int i, String str) {
        zzehc zza;
        zzehc zzehcVar = (zzehc) this.zza.get(str);
        if (zzehcVar != null) {
            return zzehcVar;
        }
        if (i == 1) {
            if (this.zze.zze() == null || (zza = ((zzczh) this.zzd.zzb()).zza(i, str)) == null) {
                return null;
            }
            return zzczl.zza(zza);
        }
        if (i != 4) {
            return null;
        }
        zzejp zzejpVar = (zzejp) this.zzc.get(str);
        if (zzejpVar != null) {
            return new zzehd(zzejpVar, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzczj
                @Override // com.google.android.gms.internal.ads.zzfsm
                public final Object apply(Object obj) {
                    return new zzczl((List) obj);
                }
            });
        }
        zzehc zzehcVar2 = (zzehc) this.zzb.get(str);
        if (zzehcVar2 == null) {
            return null;
        }
        return zzczl.zza(zzehcVar2);
    }
}
