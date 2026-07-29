package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaxn extends zzasd {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzaxn(long j, boolean z) {
        this.zzc = j;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final zzasb zzd(int i, zzasb zzasbVar, boolean z) {
        zzayy.zza(i, 0, 1);
        Object obj = z ? zzb : null;
        long j = this.zzc;
        zzasbVar.zza = obj;
        zzasbVar.zzb = obj;
        zzasbVar.zzc = j;
        return zzasbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final zzasc zze(int i, zzasc zzascVar, boolean z, long j) {
        zzayy.zza(i, 0, 1);
        zzascVar.zza = this.zzd;
        return zzascVar;
    }
}
