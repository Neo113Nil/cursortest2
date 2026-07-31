package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzebg implements zzinw {
    private final zziof zza;

    private zzebg(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzebg zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebg(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzh = zzeay.zzh((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(zzh);
        return zzh;
    }
}
