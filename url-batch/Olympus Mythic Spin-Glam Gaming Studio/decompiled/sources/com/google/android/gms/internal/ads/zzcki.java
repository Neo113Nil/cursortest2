package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzcki implements zzhs {
    private final zzhs zza;
    private final long zzb;
    private final zzhs zzc;
    private long zzd;
    private Uri zze;

    zzcki(zzhs zzhsVar, int i, zzhs zzhsVar2) {
        this.zza = zzhsVar;
        this.zzb = i;
        this.zzc = zzhsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
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
        if (j < j2) {
            return i3;
        }
        int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + zza2;
        this.zzd += zza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws IOException {
        zzhw zzhwVar2;
        Uri uri = zzhwVar.zza;
        this.zze = uri;
        long j = zzhwVar.zze;
        long j2 = this.zzb;
        zzhw zzhwVar3 = null;
        if (j >= j2) {
            zzhwVar2 = null;
        } else {
            long j3 = zzhwVar.zzf;
            long j4 = j2 - j;
            zzhwVar2 = new zzhw(uri, j, j3 != -1 ? Math.min(j3, j4) : j4, null);
        }
        long j5 = zzhwVar.zzf;
        if (j5 == -1 || j + j5 > j2) {
            zzhwVar3 = new zzhw(uri, Math.max(j2, j), j5 != -1 ? Math.min(j5, (j + j5) - j2) : -1L, null);
        }
        long zzb = zzhwVar2 != null ? this.zza.zzb(zzhwVar2) : 0L;
        long zzb2 = zzhwVar3 != null ? this.zzc.zzb(zzhwVar3) : 0L;
        this.zzd = j;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zze(zziq zziqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhs, com.google.android.gms.internal.ads.zzil
    public final Map zzj() {
        return zzgxp.zza();
    }
}
