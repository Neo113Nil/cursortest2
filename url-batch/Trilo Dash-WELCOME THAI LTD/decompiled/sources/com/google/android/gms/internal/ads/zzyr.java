package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzyr implements zzzz {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ int zze(zzp zzpVar, int i, boolean z) {
        return zzzx.zza(this, zzpVar, i, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final int zzf(zzp zzpVar, int i, boolean z, int i2) throws IOException {
        int zza = zzpVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza != -1) {
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzk(zzad zzadVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ void zzq(zzdy zzdyVar, int i) {
        zzzx.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzr(zzdy zzdyVar, int i, int i2) {
        zzdyVar.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzs(long j, int i, int i2, int i3, zzzy zzzyVar) {
    }
}
