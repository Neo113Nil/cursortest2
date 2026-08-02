package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdwu implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;

    public zzdwu(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzexn) this.zza).zza();
        Context zza2 = ((zzcos) this.zzb).zza();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        Map zzb = ((zzgxm) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzea)).booleanValue()) {
            zzbep zzbepVar = new zzbep(new zzbev(zza2));
            zzbepVar.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzdwv
                @Override // com.google.android.gms.internal.ads.zzbeo
                public final void zza(zzbge zzbgeVar) {
                    zzbgeVar.zzh(zza);
                }
            });
            emptySet = Collections.singleton(new zzdkg(new zzdwx(zzbepVar, zzb), zzfzqVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgxq.zzb(emptySet);
        return emptySet;
    }
}
