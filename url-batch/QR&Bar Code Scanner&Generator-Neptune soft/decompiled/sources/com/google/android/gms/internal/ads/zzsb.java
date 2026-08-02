package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzsb extends zzrw {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzsb(zzcn zzcnVar, Object obj, Object obj2) {
        super(zzcnVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzsb zzq(zzbg zzbgVar) {
        return new zzsb(new zzsc(zzbgVar), zzcm.zza, zzd);
    }

    public static zzsb zzr(zzcn zzcnVar, Object obj, Object obj2) {
        return new zzsb(zzcnVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        Object obj2;
        zzcn zzcnVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcnVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        this.zzc.zzd(i, zzckVar, z);
        if (zzen.zzT(zzckVar.zzc, this.zzf) && z) {
            zzckVar.zzc = zzd;
        }
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        this.zzc.zze(i, zzcmVar, j);
        if (zzen.zzT(zzcmVar.zzc, this.zze)) {
            zzcmVar.zzc = zzcm.zza;
        }
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        Object zzf = this.zzc.zzf(i);
        return zzen.zzT(zzf, this.zzf) ? zzd : zzf;
    }

    public final zzsb zzp(zzcn zzcnVar) {
        return new zzsb(zzcnVar, this.zze, this.zzf);
    }
}
