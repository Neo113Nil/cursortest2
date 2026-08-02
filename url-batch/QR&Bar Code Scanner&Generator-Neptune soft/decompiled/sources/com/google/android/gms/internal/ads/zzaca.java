package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaca implements zzaal {
    final /* synthetic */ zzaal zza;
    final /* synthetic */ zzacb zzb;

    zzaca(zzacb zzacbVar, zzaal zzaalVar) {
        this.zzb = zzacbVar;
        this.zza = zzaalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        long j2;
        long j3;
        zzaaj zzg = this.zza.zzg(j);
        zzaam zzaamVar = zzg.zza;
        long j4 = zzaamVar.zzb;
        long j5 = zzaamVar.zzc;
        j2 = this.zzb.zzb;
        zzaam zzaamVar2 = new zzaam(j4, j5 + j2);
        zzaam zzaamVar3 = zzg.zzb;
        long j6 = zzaamVar3.zzb;
        long j7 = zzaamVar3.zzc;
        j3 = this.zzb.zzb;
        return new zzaaj(zzaamVar2, new zzaam(j6, j7 + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
