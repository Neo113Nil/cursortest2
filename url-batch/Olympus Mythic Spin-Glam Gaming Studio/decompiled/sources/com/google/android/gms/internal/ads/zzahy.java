package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahy implements zzagh {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaht zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzagk zzn;
    private zzaht zzo;
    private zzaht zzp;
    private zzahk zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i = zzahx.zza;
        zza = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        zzb = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        String str = zzfm.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzahy() {
        throw null;
    }

    public zzahy(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzage zzageVar = new zzage();
        this.zzf = zzageVar;
        this.zzp = zzageVar;
    }

    private final boolean zzh(zzagi zzagiVar) throws IOException {
        byte[] bArr = zzc;
        if (zzi(zzagiVar, bArr)) {
            this.zzg = false;
            zzagiVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzi(zzagiVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzagiVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzi(zzagi zzagiVar, byte[] bArr) throws IOException {
        zzagiVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzagiVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x009f, TryCatch #0 {EOFException -> 0x009f, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0080, B:42:0x0081, B:43:0x009e), top: B:12:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzj(zzagi zzagiVar) throws IOException {
        int i;
        int i2 = this.zzj;
        if (i2 == 0) {
            try {
                zzagiVar.zzl();
                byte[] bArr = this.zze;
                zzagiVar.zzi(bArr, 0, 1);
                byte b = bArr[0];
                if ((b & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b);
                    throw zzat.zzb(sb.toString(), null);
                }
                boolean z = this.zzg;
                int i3 = (b >> 3) & 15;
                if (z) {
                    if (i3 >= 10) {
                        if (i3 > 13) {
                        }
                    }
                    i2 = !z ? zzb[i3] : zza[i3];
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                        this.zzk = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzl++;
                    }
                }
                if (!z) {
                    if (i3 >= 12 && i3 <= 14) {
                    }
                    if (!z) {
                    }
                    this.zzi = i2;
                    this.zzj = i2;
                    i = this.zzk;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                String str = true != z ? "NB" : "WB";
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 26);
                sb2.append("Illegal AMR ");
                sb2.append(str);
                sb2.append(" frame type ");
                sb2.append(i3);
                throw zzat.zzb(sb2.toString(), null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = this.zzp.zza(zzagiVar, i2, true);
        if (zza2 == -1) {
            return -1;
        }
        int i4 = this.zzj - zza2;
        this.zzj = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzp.zze(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        return zzh(zzagiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzn = zzagkVar;
        zzaht zzs = zzagkVar.zzs(0, 1);
        this.zzo = zzs;
        this.zzp = zzs;
        zzagkVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        this.zzo.getClass();
        String str = zzfm.zza;
        if (zzagiVar.zzn() == 0 && !zzh(zzagiVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            String str2 = true != z ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i = true != z ? 8000 : 16000;
            int i2 = z ? zzb[8] : zza[7];
            zzaht zzahtVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzn(str2);
            zztVar.zzo(str3);
            zztVar.zzp(i2);
            zztVar.zzH(1);
            zztVar.zzJ(i);
            zzahtVar.zzA(zztVar.zzQ());
        }
        int zzj = zzj(zzagiVar);
        if (this.zzq == null) {
            zzahj zzahjVar = new zzahj(-9223372036854775807L, 0L);
            this.zzq = zzahjVar;
            this.zzn.zzw(zzahjVar);
        }
        return zzj == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
