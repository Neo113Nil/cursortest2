package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzebx implements zzinw {
    private final zziof zza;

    private zzebx(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzebx zzc(zziof zziofVar) {
        return new zzebx(zziofVar);
    }

    public static zzebw zzd(zzbri zzbriVar) {
        return new zzebw(zzbriVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzebw zzb() {
        return new zzebw((zzbri) this.zza.zzb());
    }
}
