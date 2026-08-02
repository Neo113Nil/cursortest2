package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaga implements zzaal {
    final /* synthetic */ zzagb zza;

    /* synthetic */ zzaga(zzagb zzagbVar, zzafz zzafzVar) {
        this.zza = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        zzagn zzagnVar;
        long j;
        zzagb zzagbVar = this.zza;
        zzagnVar = zzagbVar.zzd;
        j = zzagbVar.zzf;
        return zzagnVar.zzf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        zzagn zzagnVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzagb zzagbVar = this.zza;
        zzagnVar = zzagbVar.zzd;
        long zzg = zzagnVar.zzg(j);
        j2 = zzagbVar.zzb;
        j3 = zzagbVar.zzc;
        j4 = zzagbVar.zzb;
        j5 = zzagbVar.zzf;
        long j8 = (zzg * (j3 - j4)) / j5;
        j6 = zzagbVar.zzb;
        j7 = zzagbVar.zzc;
        zzaam zzaamVar = new zzaam(j, zzen.zzr((-30000) + j2 + j8, j6, j7 - 1));
        return new zzaaj(zzaamVar, zzaamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return true;
    }
}
