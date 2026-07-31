package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfdf implements zzinw {
    private final zziof zza;

    private zzfdf(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzfdf zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfdf(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfde zzb() {
        return new zzfde(zzfoy.zzc(), ((zzcok) this.zza).zza());
    }
}
