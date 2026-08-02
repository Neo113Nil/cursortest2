package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzh implements zzaap {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaap
    public final /* synthetic */ int zze(zzr zzrVar, int i, boolean z) {
        return zzaan.zza(this, zzrVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final int zzf(zzr zzrVar, int i, boolean z, int i2) throws IOException {
        int zza = zzrVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza != -1) {
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzk(zzaf zzafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final /* synthetic */ void zzq(zzef zzefVar, int i) {
        zzaan.zzb(this, zzefVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzr(zzef zzefVar, int i, int i2) {
        zzefVar.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzs(long j, int i, int i2, int i3, zzaao zzaaoVar) {
    }
}
