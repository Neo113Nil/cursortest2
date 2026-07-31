package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdbi implements zzinw {
    private final zziof zza;

    private zzdbi(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzdbi zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdbi(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdzo) this.zza.zzb(), zzfoy.zzc());
    }
}
