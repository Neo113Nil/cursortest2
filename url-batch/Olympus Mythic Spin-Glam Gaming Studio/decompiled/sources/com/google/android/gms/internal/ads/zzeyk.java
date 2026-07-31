package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzeyk implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzeyk(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar4;
    }

    public static zzeyk zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzeyk(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzexw(((zzexe) this.zza).zzb(), 2147483647L, (Clock) this.zzb.zzb(), zzfoy.zzc(), (zzeaj) this.zzc.zzb());
    }
}
