package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzada implements zzadc {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzadj zzc = new zzadj();
    private zzadb zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzyt zzytVar, int i) throws IOException {
        ((zzym) zzytVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zza(zzadb zzadbVar) {
        this.zzd = zzadbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadc
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0087, code lost:
    
        if (r0 == 1) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.zzadc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzyt zzytVar) throws IOException {
        String str;
        zzym zzymVar;
        int zzb;
        int zzc;
        long j;
        int i;
        zzcw.zzb(this.zzd);
        while (true) {
            zzacz zzaczVar = (zzacz) this.zzb.peek();
            if (zzaczVar != null) {
                long zzf = zzytVar.zzf();
                j = zzaczVar.zzb;
                if (zzf >= j) {
                    zzadb zzadbVar = this.zzd;
                    i = ((zzacz) this.zzb.pop()).zza;
                    ((zzadf) zzadbVar).zza.zzh(i);
                    return true;
                }
            }
            int i2 = this.zze;
            if (i2 == 0) {
                long zzd = this.zzc.zzd(zzytVar, true, false, 4);
                if (zzd == -2) {
                    zzytVar.zzj();
                    while (true) {
                        zzymVar = (zzym) zzytVar;
                        zzymVar.zzm(this.zza, 0, 4, false);
                        zzb = zzadj.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzadj.zzc(this.zza, zzb, false);
                            zzadh zzadhVar = ((zzadf) this.zzd).zza;
                            if (zzadh.zzo(zzc)) {
                                break;
                            }
                        }
                        zzymVar.zzo(1, false);
                    }
                    zzymVar.zzo(zzb, false);
                    zzd = zzc;
                }
                if (zzd == -1) {
                    return false;
                }
                this.zzf = (int) zzd;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzytVar, false, true, 8);
            this.zze = 2;
            zzadb zzadbVar2 = this.zzd;
            int i3 = this.zzf;
            zzadf zzadfVar = (zzadf) zzadbVar2;
            zzadh zzadhVar2 = zzadfVar.zza;
            int zzn = zzadh.zzn(i3);
            if (zzn != 0) {
                if (zzn == 1) {
                    long zzf2 = zzytVar.zzf();
                    this.zzb.push(new zzacz(i3, this.zzg + zzf2, null));
                    ((zzadf) this.zzd).zza.zzk(this.zzf, zzf2, this.zzg);
                    this.zze = 0;
                    return true;
                }
                if (zzn == 2) {
                    long j2 = this.zzg;
                    if (j2 <= 8) {
                        zzadfVar.zza.zzj(i3, zzd(zzytVar, (int) j2));
                        this.zze = 0;
                        return true;
                    }
                    throw zzbp.zza("Invalid integer size: " + j2, null);
                }
                if (zzn != 3) {
                    if (zzn == 4) {
                        zzadhVar2.zzg(i3, (int) this.zzg, zzytVar);
                        this.zze = 0;
                        return true;
                    }
                    long j3 = this.zzg;
                    if (j3 != 4 && j3 != 8) {
                        throw zzbp.zza("Invalid float size: " + j3, null);
                    }
                    int i4 = (int) j3;
                    zzadfVar.zza.zzi(i3, i4 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzytVar, i4)));
                    this.zze = 0;
                    return true;
                }
                long j4 = this.zzg;
                if (j4 > 2147483647L) {
                    throw zzbp.zza("String element size: " + j4, null);
                }
                int i5 = (int) j4;
                if (i5 == 0) {
                    str = "";
                } else {
                    byte[] bArr = new byte[i5];
                    ((zzym) zzytVar).zzn(bArr, 0, i5, false);
                    while (i5 > 0) {
                        int i6 = i5 - 1;
                        if (bArr[i6] != 0) {
                            break;
                        }
                        i5 = i6;
                    }
                    str = new String(bArr, 0, i5);
                }
                zzadfVar.zza.zzl(i3, str);
                this.zze = 0;
                return true;
            }
            ((zzym) zzytVar).zzo((int) this.zzg, false);
            this.zze = 0;
        }
    }
}
