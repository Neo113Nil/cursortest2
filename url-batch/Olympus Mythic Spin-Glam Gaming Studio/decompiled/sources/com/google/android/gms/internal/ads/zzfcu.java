package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfcu implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzfcu(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar3;
    }

    public static zzfcu zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzfcu(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfcs zzb() {
        return new zzfcs((zzcer) this.zza.zzb(), zzfoy.zzc(), ((zzcok) this.zzb).zza());
    }
}
