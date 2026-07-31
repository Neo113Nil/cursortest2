package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdsn implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdsn(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdsn zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdsn(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdsm((zzdxg) this.zza.zzb(), ((zzdps) this.zzb).zza());
    }
}
