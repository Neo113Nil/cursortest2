package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzahk {
    private final zzaap zza;
    private final zzaah zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzahj zzi = new zzahj(null);
    private final zzahj zzj = new zzahj(null);
    private boolean zzk = false;

    public zzahk(zzaap zzaapVar, boolean z, boolean z2) {
        this.zza = zzaapVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzaah(bArr, 0, 0);
    }

    public final void zza(zzaad zzaadVar) {
        this.zzc.append(zzaadVar.zza, zzaadVar);
    }

    public final void zzb(zzaae zzaaeVar) {
        this.zzb.append(zzaaeVar.zzd, zzaaeVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j, int i, long j2) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
    }

    public final boolean zze(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                long j2 = this.zzg;
                int i2 = i + ((int) (j - j2));
                long j3 = this.zzm;
                if (j3 != -9223372036854775807L) {
                    this.zza.zzs(j3, this.zzn ? 1 : 0, (int) (j2 - this.zzl), i2, null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z4 = this.zzn;
        int i3 = this.zzf;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        this.zzn = z5;
        return z5;
    }
}
