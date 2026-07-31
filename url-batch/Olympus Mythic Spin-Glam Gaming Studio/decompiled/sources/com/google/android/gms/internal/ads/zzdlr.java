package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdlr implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzdlr(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzdlr zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzdlr(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlq((Context) this.zza.zzb(), ((zzioi) this.zzb).zzb(), ((zzczc) this.zzc).zza());
    }
}
