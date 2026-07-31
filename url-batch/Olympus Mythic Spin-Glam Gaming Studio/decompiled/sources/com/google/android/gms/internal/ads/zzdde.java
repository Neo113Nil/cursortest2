package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdde implements zzinw {
    private final zziof zza;

    private zzdde(zzdcz zzdczVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdde zzc(zzdcz zzdczVar, zziof zziofVar) {
        return new zzdde(zzdczVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String zzp = ((zzdab) this.zza.zzb()).zzp();
        zzioe.zzb(zzp);
        return zzp;
    }
}
