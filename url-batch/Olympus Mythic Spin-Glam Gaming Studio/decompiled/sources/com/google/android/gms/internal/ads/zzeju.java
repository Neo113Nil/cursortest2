package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzeju implements zzinw {
    private final zziof zza;

    private zzeju(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzeju zzc(zziof zziofVar) {
        return new zzeju(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejt zzb() {
        return new zzejt(((zzcok) this.zza).zza());
    }
}
