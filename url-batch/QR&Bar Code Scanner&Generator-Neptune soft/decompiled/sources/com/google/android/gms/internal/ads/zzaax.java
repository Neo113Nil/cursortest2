package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaax implements zzzi {
    private static final int[] zzc;
    private static final int zzf;
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzzl zzp;
    private zzaap zzq;
    private zzaal zzr;
    private boolean zzs;
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzaaw
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzaax.zza;
            return new zzzi[]{new zzaax(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] zzd = zzen.zzaa("#!AMR\n");
    private static final byte[] zze = zzen.zzaa("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        zzf = iArr[8];
    }

    public zzaax() {
        this(0);
    }

    public zzaax(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:13:0x0007, B:15:0x001b, B:23:0x0039, B:24:0x0042, B:30:0x003e, B:40:0x005c, B:41:0x0079, B:42:0x007a, B:43:0x008f), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:13:0x0007, B:15:0x001b, B:23:0x0039, B:24:0x0042, B:30:0x003e, B:40:0x005c, B:41:0x0079, B:42:0x007a, B:43:0x008f), top: B:12:0x0007 }] */
    @RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zze(zzzj zzzjVar) throws IOException {
        int i;
        int i2 = this.zzk;
        if (i2 == 0) {
            try {
                zzzjVar.zzj();
                ((zzyy) zzzjVar).zzm(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) > 0) {
                    throw zzbu.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i3 = (b >> 3) & 15;
                boolean z = this.zzh;
                if (z) {
                    if (i3 >= 10) {
                        if (i3 > 13) {
                        }
                    }
                    i2 = !z ? zzc[i3] : zzb[i3];
                    this.zzj = i2;
                    this.zzk = i2;
                    i = this.zzm;
                    if (i == -1) {
                        this.zzm = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.zzn++;
                    }
                }
                if (!z) {
                    if (i3 >= 12 && i3 <= 14) {
                    }
                    if (!z) {
                    }
                    this.zzj = i2;
                    this.zzk = i2;
                    i = this.zzm;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                throw zzbu.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = zzaan.zza(this.zzq, zzzjVar, i2, true);
        if (zza2 == -1) {
            return -1;
        }
        int i4 = this.zzk - zza2;
        this.zzk = i4;
        if (i4 > 0) {
            return 0;
        }
        this.zzq.zzs(this.zzi, 1, this.zzj, 0, null);
        this.zzi += 20000;
        return 0;
    }

    private static boolean zzf(zzzj zzzjVar, byte[] bArr) throws IOException {
        zzzjVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzyy) zzzjVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzzj zzzjVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzzjVar, bArr)) {
            this.zzh = false;
            ((zzyy) zzzjVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzzjVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzyy) zzzjVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        zzdd.zzb(this.zzq);
        int i = zzen.zza;
        if (zzzjVar.zzf() == 0 && !zzg(zzzjVar)) {
            throw zzbu.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzaap zzaapVar = this.zzq;
            zzad zzadVar = new zzad();
            zzadVar.zzS(str);
            zzadVar.zzL(zzf);
            zzadVar.zzw(1);
            zzadVar.zzT(i2);
            zzaapVar.zzk(zzadVar.zzY());
        }
        int zze2 = zze(zzzjVar);
        if (this.zzl) {
            return zze2;
        }
        zzaak zzaakVar = new zzaak(-9223372036854775807L, 0L);
        this.zzr = zzaakVar;
        this.zzp.zzN(zzaakVar);
        this.zzl = true;
        return zze2;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzp = zzzlVar;
        this.zzq = zzzlVar.zzv(0, 1);
        zzzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        return zzg(zzzjVar);
    }
}
