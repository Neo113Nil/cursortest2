package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzfao implements zzinw {
    private final zziof zza;

    private zzfao(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzfao zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfao(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfam zzb() {
        return new zzfam(zzfoy.zzc(), ((zzddg) this.zza).zza());
    }
}
