package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcow implements zzinw {
    private final zziof zza;

    private zzcow(zzcod zzcodVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcow zzc(zzcod zzcodVar, zziof zziofVar) {
        return new zzcow(zzcodVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcsi zzb() {
        zzcob zzcobVar = (zzcob) this.zza.zzb();
        zzioe.zzb(zzcobVar);
        return zzcobVar;
    }
}
