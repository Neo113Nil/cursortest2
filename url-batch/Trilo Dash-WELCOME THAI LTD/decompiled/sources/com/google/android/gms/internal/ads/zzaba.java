package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaba implements zzyv {
    private final long zzb;
    private final zzyv zzc;

    public zzaba(long j, zzyv zzyvVar) {
        this.zzb = j;
        this.zzc = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final void zzB() {
        this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final void zzL(zzzv zzzvVar) {
        this.zzc.zzL(new zzaaz(this, zzzvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final zzzz zzv(int i, int i2) {
        return this.zzc.zzv(i, i2);
    }
}
