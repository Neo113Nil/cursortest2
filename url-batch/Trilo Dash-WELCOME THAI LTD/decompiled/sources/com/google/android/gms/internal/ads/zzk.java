package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzk implements zzcb {
    protected final zzch zza = new zzch();

    protected zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zza() {
        zzci zzn = zzn();
        return !zzn.zzo() && zzn.zze(zzf(), this.zza, 0L).zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzb() {
        zzci zzn = zzn();
        return !zzn.zzo() && zzn.zze(zzf(), this.zza, 0L).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzc() {
        zzci zzn = zzn();
        return !zzn.zzo() && zzn.zze(zzf(), this.zza, 0L).zzh;
    }
}
