package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzacb implements zzzl {
    private final long zzb;
    private final zzzl zzc;

    public zzacb(long j, zzzl zzzlVar) {
        this.zzb = j;
        this.zzc = zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzN(zzaal zzaalVar) {
        this.zzc.zzN(new zzaca(this, zzaalVar));
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final zzaap zzv(int i, int i2) {
        return this.zzc.zzv(i, i2);
    }
}
