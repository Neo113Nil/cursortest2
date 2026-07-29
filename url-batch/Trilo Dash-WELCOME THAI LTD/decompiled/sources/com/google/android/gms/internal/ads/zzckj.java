package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzckj implements zzer {
    private final zzer zza;
    private final long zzb;
    private final zzer zzc;
    private long zzd;
    private Uri zze;

    zzckj(zzer zzerVar, int i, zzer zzerVar2) {
        this.zza = zzerVar;
        this.zzb = i;
        this.zzc = zzerVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
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

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) throws IOException {
        zzew zzewVar2;
        this.zze = zzewVar.zza;
        long j = zzewVar.zzf;
        long j2 = this.zzb;
        zzew zzewVar3 = null;
        if (j >= j2) {
            zzewVar2 = null;
        } else {
            long j3 = zzewVar.zzg;
            zzewVar2 = new zzew(zzewVar.zza, null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null, 0);
        }
        long j4 = zzewVar.zzg;
        if (j4 == -1 || zzewVar.zzf + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzewVar.zzf);
            long j5 = zzewVar.zzg;
            zzewVar3 = new zzew(zzewVar.zza, null, max, max, j5 != -1 ? Math.min(j5, (zzewVar.zzf + j5) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzewVar2 != null ? this.zza.zzb(zzewVar2) : 0L;
        long zzb2 = zzewVar3 != null ? this.zzc.zzb(zzewVar3) : 0L;
        this.zzd = zzewVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public final Map zze() {
        return zzfrk.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzf(zzft zzftVar) {
    }
}
