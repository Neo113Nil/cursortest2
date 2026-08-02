package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzckh implements zzazm {
    private final zzazm zza;
    private final long zzb;
    private final zzazm zzc;
    private long zzd;
    private Uri zze;

    zzckh(zzazm zzazmVar, int i, zzazm zzazmVar2) {
        this.zza = zzazmVar;
        this.zzb = i;
        this.zzc = zzazmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzazm
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

    @Override // com.google.android.gms.internal.ads.zzazm
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzazm
    public final long zzb(zzazo zzazoVar) throws IOException {
        zzazo zzazoVar2;
        this.zze = zzazoVar.zza;
        long j = zzazoVar.zzc;
        long j2 = this.zzb;
        zzazo zzazoVar3 = null;
        if (j >= j2) {
            zzazoVar2 = null;
        } else {
            long j3 = zzazoVar.zzd;
            zzazoVar2 = new zzazo(zzazoVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzazoVar.zzd;
        if (j4 == -1 || zzazoVar.zzc + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzazoVar.zzc);
            long j5 = zzazoVar.zzd;
            zzazoVar3 = new zzazo(zzazoVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzazoVar.zzc + j5) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzazoVar2 != null ? this.zza.zzb(zzazoVar2) : 0L;
        long zzb2 = zzazoVar3 != null ? this.zzc.zzb(zzazoVar3) : 0L;
        this.zzd = zzazoVar.zzc;
        if (zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }
}
