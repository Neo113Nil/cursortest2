package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdrj implements zzinw {
    private final zzdrc zza;

    private zzdrj(zzdrc zzdrcVar) {
        this.zza = zzdrcVar;
    }

    public static zzdrj zzc(zzdrc zzdrcVar) {
        return new zzdrj(zzdrcVar);
    }

    public static zzdqr zzd(zzdrc zzdrcVar) {
        zzdqr zza = zzdrcVar.zza();
        zzioe.zzb(zza);
        return zza;
    }

    public final zzdqr zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
