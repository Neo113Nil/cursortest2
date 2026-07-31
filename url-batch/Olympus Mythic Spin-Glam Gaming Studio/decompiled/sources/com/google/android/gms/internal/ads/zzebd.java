package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzebd implements zzinw {
    private final zziof zza;

    private zzebd(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzebd zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebd(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zze = zzeay.zze((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(zze);
        return zze;
    }
}
