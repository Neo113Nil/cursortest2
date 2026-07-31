package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcqu implements com.google.android.gms.ads.nonagon.signalgeneration.zzw {
    private final zzcpp zza;
    private zzdcz zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzat zzc;

    /* synthetic */ zzcqu(zzcpp zzcppVar, byte[] bArr) {
        this.zza = zzcppVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzx zza() {
        zzioe.zzc(this.zzb, zzdcz.class);
        zzioe.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzat.class);
        return new zzcqv(this.zza, this.zzc, new zzczr(), new zzdbu(), new zzeay(), this.zzb, null, null);
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzat zzatVar) {
        this.zzc = zzatVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw zzc(zzdcz zzdczVar) {
        this.zzb = zzdczVar;
        return this;
    }
}
