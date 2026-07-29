package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcja implements zzayi {
    private final zzayi zza;
    private final long zzb;
    private final zzayi zzc;
    private long zzd;
    private Uri zze;

    zzcja(zzayi zzayiVar, int i, zzayi zzayiVar2) {
        this.zza = zzayiVar;
        this.zzb = i;
        this.zzc = zzayiVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
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

    @Override // com.google.android.gms.internal.ads.zzayi
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final long zzb(zzayk zzaykVar) throws IOException {
        zzayk zzaykVar2;
        this.zze = zzaykVar.zza;
        long j = zzaykVar.zzc;
        long j2 = this.zzb;
        zzayk zzaykVar3 = null;
        if (j >= j2) {
            zzaykVar2 = null;
        } else {
            long j3 = zzaykVar.zzd;
            zzaykVar2 = new zzayk(zzaykVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzaykVar.zzd;
        if (j4 == -1 || zzaykVar.zzc + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzaykVar.zzc);
            long j5 = zzaykVar.zzd;
            zzaykVar3 = new zzayk(zzaykVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzaykVar.zzc + j5) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzaykVar2 != null ? this.zza.zzb(zzaykVar2) : 0L;
        long zzb2 = zzaykVar3 != null ? this.zzc.zzb(zzaykVar3) : 0L;
        this.zzd = zzaykVar.zzc;
        if (zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }
}
