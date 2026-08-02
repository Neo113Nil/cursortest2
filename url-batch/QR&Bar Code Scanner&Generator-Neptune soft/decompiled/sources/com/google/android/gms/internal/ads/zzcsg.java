package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcsg implements com.google.android.gms.ads.nonagon.signalgeneration.zzg {
    private final zzcpw zza;
    private zzdcm zzb;
    private com.google.android.gms.ads.nonagon.signalgeneration.zzae zzc;

    /* synthetic */ zzcsg(zzcpw zzcpwVar, zzcsf zzcsfVar) {
        this.zza = zzcpwVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zza(zzdcm zzdcmVar) {
        this.zzb = zzdcmVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzg zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzae zzaeVar) {
        this.zzc = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzc() {
        zzgxq.zzc(this.zzb, zzdcm.class);
        zzgxq.zzc(this.zzc, com.google.android.gms.ads.nonagon.signalgeneration.zzae.class);
        return new zzcsi(this.zza, this.zzc, new zzdaj(), new zzdyd(), this.zzb, null, null, null);
    }
}
