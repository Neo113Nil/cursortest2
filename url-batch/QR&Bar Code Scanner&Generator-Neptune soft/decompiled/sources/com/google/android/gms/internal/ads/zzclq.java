package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzclq implements zzex {
    private final zzex zza;
    private final long zzb;
    private final zzex zzc;
    private long zzd;
    private Uri zze;

    zzclq(zzex zzexVar, int i, zzex zzexVar2) {
        this.zza = zzexVar;
        this.zzb = i;
        this.zzc = zzexVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        this.zzd += zza2;
        return i3 + zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final long zzb(zzfc zzfcVar) throws IOException {
        zzfc zzfcVar2;
        this.zze = zzfcVar.zza;
        long j = zzfcVar.zzf;
        long j2 = this.zzb;
        zzfc zzfcVar3 = null;
        if (j >= j2) {
            zzfcVar2 = null;
        } else {
            long j3 = zzfcVar.zzg;
            zzfcVar2 = new zzfc(zzfcVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzfcVar.zzg;
        if (j4 == -1 || zzfcVar.zzf + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzfcVar.zzf);
            long j5 = zzfcVar.zzg;
            zzfcVar3 = new zzfc(zzfcVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzfcVar.zzf + j5) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzfcVar2 != null ? this.zza.zzb(zzfcVar2) : 0L;
        long zzb2 = zzfcVar3 != null ? this.zzc.zzb(zzfcVar3) : 0L;
        this.zzd = zzfcVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzex, com.google.android.gms.internal.ads.zzfu
    public final Map zze() {
        return zzfvq.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzf(zzfz zzfzVar) {
    }
}
