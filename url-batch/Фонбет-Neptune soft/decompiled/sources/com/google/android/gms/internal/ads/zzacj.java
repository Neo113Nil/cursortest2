package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacj implements zzadp {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzp zzpVar, int i, boolean z) {
        return zzadn.zza(this, zzpVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzp zzpVar, int i, boolean z, int i2) throws IOException {
        int zza = zzpVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza != -1) {
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzl(zzaf zzafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzq(zzek zzekVar, int i) {
        zzadn.zzb(this, zzekVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzr(zzek zzekVar, int i, int i2) {
        zzekVar.zzL(i);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(long j, int i, int i2, int i3, zzado zzadoVar) {
    }
}
