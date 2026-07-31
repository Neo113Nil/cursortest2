package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbil;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdzj implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzdzj(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar4;
    }

    public static zzdzj zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzdzj(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzffs) this.zza).zza();
        Context zza2 = ((zzcok) this.zzb).zza();
        zzhdi zzc = zzfoy.zzc();
        Map zzb = ((zzioa) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgk)).booleanValue()) {
            zzbif zzbifVar = new zzbif(new zzbik(zza2));
            zzbifVar.zzb(new zzbie() { // from class: com.google.android.gms.internal.ads.zzdzk
                @Override // com.google.android.gms.internal.ads.zzbie
                public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                    zzaVar.zzh(zza);
                }
            });
            emptySet = Collections.singleton(new zzdlo(new zzdzm(zzbifVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzioe.zzb(emptySet);
        return emptySet;
    }
}
