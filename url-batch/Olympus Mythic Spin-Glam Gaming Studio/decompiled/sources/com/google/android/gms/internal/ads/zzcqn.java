package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcqn implements zzein {
    private final zzcpp zza;
    private final zzcqm zzb;
    private zzegu zzc;

    /* synthetic */ zzcqn(zzcpp zzcppVar, zzcqm zzcqmVar, byte[] bArr) {
        this.zza = zzcppVar;
        this.zzb = zzcqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final zzeio zza() {
        zzioe.zzc(this.zzc, zzegu.class);
        return new zzcqo(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final /* bridge */ /* synthetic */ zzein zzb(zzegu zzeguVar) {
        this.zzc = zzeguVar;
        return this;
    }
}
