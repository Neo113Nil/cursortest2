package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaah implements zzys {
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
    private zzyv zzp;
    private zzzz zzq;
    private zzzv zzr;
    private boolean zzs;
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzaag
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaah.zza;
            return new zzys[]{new zzaah(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] zzd = zzeg.zzZ("#!AMR\n");
    private static final byte[] zze = zzeg.zzZ("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzc = iArr;
        zzf = iArr[8];
    }

    public zzaah() {
        this(0);
    }

    public zzaah(int i) {
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
    private final int zze(zzyt zzytVar) throws IOException {
        int i;
        int i2 = this.zzk;
        if (i2 == 0) {
            try {
                zzytVar.zzj();
                ((zzym) zzytVar).zzm(this.zzg, 0, 1, false);
                byte b = this.zzg[0];
                if ((b & 131) > 0) {
                    throw zzbp.zza("Invalid padding bits for frame header " + ((int) b), null);
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
                throw zzbp.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int zza2 = zzzx.zza(this.zzq, zzytVar, i2, true);
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

    private static boolean zzf(zzyt zzytVar, byte[] bArr) throws IOException {
        zzytVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzym) zzytVar).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzyt zzytVar) throws IOException {
        byte[] bArr = zzd;
        if (zzf(zzytVar, bArr)) {
            this.zzh = false;
            ((zzym) zzytVar).zzo(bArr.length, false);
            return true;
        }
        byte[] bArr2 = zze;
        if (!zzf(zzytVar, bArr2)) {
            return false;
        }
        this.zzh = true;
        ((zzym) zzytVar).zzo(bArr2.length, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        zzcw.zzb(this.zzq);
        int i = zzeg.zza;
        if (zzytVar.zzf() == 0 && !zzg(zzytVar)) {
            throw zzbp.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzh;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            zzzz zzzzVar = this.zzq;
            zzab zzabVar = new zzab();
            zzabVar.zzS(str);
            zzabVar.zzL(zzf);
            zzabVar.zzw(1);
            zzabVar.zzT(i2);
            zzzzVar.zzk(zzabVar.zzY());
        }
        int zze2 = zze(zzytVar);
        if (this.zzl) {
            return zze2;
        }
        zzzu zzzuVar = new zzzu(-9223372036854775807L, 0L);
        this.zzr = zzzuVar;
        this.zzp.zzL(zzzuVar);
        this.zzl = true;
        return zze2;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzp = zzyvVar;
        this.zzq = zzyvVar.zzv(0, 1);
        zzyvVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        this.zzi = 0L;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        return zzg(zzytVar);
    }
}
