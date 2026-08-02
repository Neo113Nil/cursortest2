package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzavl {
    private final byte[] zza = new byte[8];
    private final Stack zzb = new Stack();
    private final zzavt zzc = new zzavt();
    private int zzd;
    private int zze;
    private long zzf;
    private zzavo zzg;

    zzavl() {
    }

    private final long zzd(zzauy zzauyVar, int i) throws IOException, InterruptedException {
        zzauyVar.zzh(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zzd();
    }

    public final void zzb(zzavo zzavoVar) {
        this.zzg = zzavoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x008b, code lost:
    
        if (r0 == 1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzauy zzauyVar) throws IOException, InterruptedException {
        String str;
        int zzb;
        int zzc;
        long j;
        int i;
        zzbac.zze(this.zzg != null);
        while (true) {
            if (!this.zzb.isEmpty()) {
                long zzd = zzauyVar.zzd();
                j = ((zzavk) this.zzb.peek()).zzb;
                if (zzd >= j) {
                    zzavo zzavoVar = this.zzg;
                    i = ((zzavk) this.zzb.pop()).zza;
                    zzavoVar.zza.zzb(i);
                    return true;
                }
            }
            int i2 = this.zzd;
            if (i2 == 0) {
                long zze = this.zzc.zze(zzauyVar, true, false, 4);
                if (zze == -2) {
                    zzauyVar.zze();
                    while (true) {
                        zzauyVar.zzg(this.zza, 0, 4, false);
                        zzb = zzavt.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzavt.zzc(this.zza, zzb, false);
                            zzavr zzavrVar = this.zzg.zza;
                            if (zzavr.zzm(zzc)) {
                                break;
                            }
                        }
                        zzauyVar.zzi(1, false);
                    }
                    zzauyVar.zzi(zzb, false);
                    zze = zzc;
                }
                if (zze == -1) {
                    return false;
                }
                this.zze = (int) zze;
                this.zzd = 1;
            }
            this.zzf = this.zzc.zze(zzauyVar, false, true, 8);
            this.zzd = 2;
            zzavo zzavoVar2 = this.zzg;
            int i3 = this.zze;
            zzavr zzavrVar2 = zzavoVar2.zza;
            int zzl = zzavr.zzl(i3);
            if (zzl != 0) {
                if (zzl == 1) {
                    long zzd2 = zzauyVar.zzd();
                    this.zzb.add(new zzavk(i3, this.zzf + zzd2, null));
                    this.zzg.zza.zzi(this.zze, zzd2, this.zzf);
                    this.zzd = 0;
                    return true;
                }
                if (zzl == 2) {
                    long j2 = this.zzf;
                    if (j2 <= 8) {
                        zzavoVar2.zza.zzh(i3, zzd(zzauyVar, (int) j2));
                        this.zzd = 0;
                        return true;
                    }
                    throw new zzasz("Invalid integer size: " + j2);
                }
                if (zzl == 3) {
                    long j3 = this.zzf;
                    if (j3 > 2147483647L) {
                        throw new zzasz("String element size: " + j3);
                    }
                    int i4 = (int) j3;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i4];
                        zzauyVar.zzh(bArr, 0, i4, false);
                        str = new String(bArr);
                    }
                    zzavoVar2.zza.zzj(i3, str);
                    this.zzd = 0;
                    return true;
                }
                if (zzl == 4) {
                    zzavrVar2.zzk(i3, (int) this.zzf, zzauyVar);
                    this.zzd = 0;
                    return true;
                }
                long j4 = this.zzf;
                if (j4 != 4 && j4 != 8) {
                    throw new zzasz("Invalid float size: " + j4);
                }
                int i5 = (int) j4;
                zzavoVar2.zza.zzc(i3, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzauyVar, i5)));
                this.zzd = 0;
                return true;
            }
            zzauyVar.zzi((int) this.zzf, false);
            this.zzd = 0;
        }
    }
}
