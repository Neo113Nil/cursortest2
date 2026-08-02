package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzadw implements zzack {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final int zze;
    private final byte[] zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private zzacn zzo;
    private zzadp zzp;
    private zzadi zzq;
    private boolean zzr;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzb = iArr;
        int i = zzet.zza;
        zzc = "#!AMR\n".getBytes(zzfuj.zzc);
        zzd = "#!AMR-WB\n".getBytes(zzfuj.zzc);
        zze = iArr[8];
    }

    public zzadw() {
        throw null;
    }

    public zzadw(int i) {
        this.zzf = new byte[1];
        this.zzl = -1;
    }

    private static boolean zzg(zzacl zzaclVar, byte[] bArr) throws IOException {
        zzaclVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzaby) zzaclVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzacl zzaclVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzaclVar, bArr)) {
            this.zzg = false;
            ((zzaby) zzaclVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzaclVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        ((zzaby) zzaclVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        zzdi.zzb(this.zzp);
        int i = zzet.zza;
        if (zzaclVar.zzf() == 0 && !zzh(zzaclVar)) {
            throw zzbo.zza("Could not find AMR header.", null);
        }
        if (!this.zzr) {
            this.zzr = true;
            boolean z = this.zzg;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzadp zzadpVar = this.zzp;
            zzad zzadVar = new zzad();
            zzadVar.zzX(str);
            zzadVar.zzP(zze);
            zzadVar.zzy(1);
            zzadVar.zzY(i2);
            zzadpVar.zzl(zzadVar.zzad());
        }
        int zza2 = zza(zzaclVar);
        if (this.zzk) {
            return zza2;
        }
        zzadh zzadhVar = new zzadh(-9223372036854775807L, 0L);
        this.zzq = zzadhVar;
        this.zzo.zzO(zzadhVar);
        this.zzk = true;
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzo = zzacnVar;
        this.zzp = zzacnVar.zzw(0, 1);
        zzacnVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzn = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        return zzh(zzaclVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043 A[Catch: EOFException -> 0x00b0, TryCatch #0 {EOFException -> 0x00b0, blocks: (B:13:0x000c, B:15:0x0020, B:23:0x003e, B:24:0x0047, B:30:0x0043, B:40:0x0086, B:41:0x009e, B:42:0x009f, B:43:0x00af), top: B:12:0x000c }] */
    @RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zza(zzacl zzaclVar) throws IOException {
        int i;
        int i2 = this.zzj;
        if (i2 == 0) {
            try {
                zzaclVar.zzj();
                ((zzaby) zzaclVar).zzm(this.zzf, 0, 1, false);
                byte b = this.zzf[0];
                if ((b & 131) > 0) {
                    throw zzbo.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i3 = b >> 3;
                boolean z = this.zzg;
                int i4 = i3 & 15;
                if (z) {
                    if (i4 >= 10) {
                        if (i4 > 13) {
                        }
                    }
                    i2 = !z ? zzb[i4] : zza[i4];
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzl;
                    if (i == -1) {
                        this.zzl = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzm++;
                    }
                }
                if (!z) {
                    if (i4 >= 12 && i4 <= 14) {
                    }
                    i2 = !z ? zzb[i4] : zza[i4];
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzl;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                throw zzbo.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i4, null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zzf = this.zzp.zzf(zzaclVar, i2, true);
        if (zzf == -1) {
            return -1;
        }
        int i5 = this.zzj - zzf;
        this.zzj = i5;
        if (i5 > 0) {
            return 0;
        }
        this.zzp.zzs(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }
}
