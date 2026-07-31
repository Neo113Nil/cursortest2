package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahu {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzagi zzagiVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzagiVar.zzi(bArr, 0, 10);
        zzagiVar.zzl();
        int i = zzafh.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzaht zzahtVar, long j, int i, int i2, int i3, @Nullable zzahs zzahsVar) {
        zzguk.zzj(this.zzg <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zzd(zzahtVar, zzahsVar);
            }
        }
    }

    public final void zzd(zzaht zzahtVar, @Nullable zzahs zzahsVar) {
        if (this.zzc > 0) {
            zzahtVar.zze(this.zzd, this.zze, this.zzf, this.zzg, zzahsVar);
            this.zzc = 0;
        }
    }
}
