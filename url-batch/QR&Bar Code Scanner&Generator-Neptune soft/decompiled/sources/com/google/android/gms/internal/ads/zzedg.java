package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzedg implements zzedi {
    private final Map zza;
    private final zzfzq zzb;
    private final zzdft zzc;

    public zzedg(Map map, zzfzq zzfzqVar, zzdft zzdftVar) {
        this.zza = map;
        this.zzb = zzfzqVar;
        this.zzc = zzdftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedi
    public final zzfzp zzb(final zzcbc zzcbcVar) {
        this.zzc.zzbE(zzcbcVar);
        zzfzp zzh = zzfzg.zzh(new zzebh(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhb)).split(",")) {
            final zzgxv zzgxvVar = (zzgxv) this.zza.get(str.trim());
            if (zzgxvVar != null) {
                zzh = zzfzg.zzg(zzh, zzebh.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzede
                    @Override // com.google.android.gms.internal.ads.zzfyn
                    public final zzfzp zza(Object obj) {
                        zzgxv zzgxvVar2 = zzgxv.this;
                        return ((zzedi) zzgxvVar2.zzb()).zzb(zzcbcVar);
                    }
                }, this.zzb);
            }
        }
        zzfzg.zzr(zzh, new zzedf(this), zzchc.zzf);
        return zzh;
    }
}
