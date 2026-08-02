package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaeb implements zzaed {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaek zzc = new zzaek();
    private zzaec zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzzj zzzjVar, int i) throws IOException {
        ((zzyy) zzzjVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & UByte.MAX_VALUE);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final void zza(zzaec zzaecVar) {
        this.zzd = zzaecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0087, code lost:
    
        if (r0 == 1) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.zzaed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzzj zzzjVar) throws IOException {
        String str;
        zzyy zzyyVar;
        int zzb;
        int zzc;
        long j;
        int i;
        zzdd.zzb(this.zzd);
        while (true) {
            zzaea zzaeaVar = (zzaea) this.zzb.peek();
            if (zzaeaVar != null) {
                long zzf = zzzjVar.zzf();
                j = zzaeaVar.zzb;
                if (zzf >= j) {
                    zzaec zzaecVar = this.zzd;
                    i = ((zzaea) this.zzb.pop()).zza;
                    ((zzaeg) zzaecVar).zza.zzh(i);
                    return true;
                }
            }
            int i2 = this.zze;
            if (i2 == 0) {
                long zzd = this.zzc.zzd(zzzjVar, true, false, 4);
                if (zzd == -2) {
                    zzzjVar.zzj();
                    while (true) {
                        zzyyVar = (zzyy) zzzjVar;
                        zzyyVar.zzm(this.zza, 0, 4, false);
                        zzb = zzaek.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzaek.zzc(this.zza, zzb, false);
                            zzaei zzaeiVar = ((zzaeg) this.zzd).zza;
                            if (zzaei.zzo(zzc)) {
                                break;
                            }
                        }
                        zzyyVar.zzo(1, false);
                    }
                    zzyyVar.zzo(zzb, false);
                    zzd = zzc;
                }
                if (zzd == -1) {
                    return false;
                }
                this.zzf = (int) zzd;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzzjVar, false, true, 8);
            this.zze = 2;
            zzaec zzaecVar2 = this.zzd;
            int i3 = this.zzf;
            zzaeg zzaegVar = (zzaeg) zzaecVar2;
            zzaei zzaeiVar2 = zzaegVar.zza;
            int zzn = zzaei.zzn(i3);
            if (zzn != 0) {
                if (zzn == 1) {
                    long zzf2 = zzzjVar.zzf();
                    this.zzb.push(new zzaea(i3, this.zzg + zzf2, null));
                    ((zzaeg) this.zzd).zza.zzk(this.zzf, zzf2, this.zzg);
                    this.zze = 0;
                    return true;
                }
                if (zzn == 2) {
                    long j2 = this.zzg;
                    if (j2 <= 8) {
                        zzaegVar.zza.zzj(i3, zzd(zzzjVar, (int) j2));
                        this.zze = 0;
                        return true;
                    }
                    throw zzbu.zza("Invalid integer size: " + j2, null);
                }
                if (zzn != 3) {
                    if (zzn == 4) {
                        zzaeiVar2.zzg(i3, (int) this.zzg, zzzjVar);
                        this.zze = 0;
                        return true;
                    }
                    long j3 = this.zzg;
                    if (j3 != 4 && j3 != 8) {
                        throw zzbu.zza("Invalid float size: " + j3, null);
                    }
                    int i4 = (int) j3;
                    zzaegVar.zza.zzi(i3, i4 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzzjVar, i4)));
                    this.zze = 0;
                    return true;
                }
                long j4 = this.zzg;
                if (j4 > 2147483647L) {
                    throw zzbu.zza("String element size: " + j4, null);
                }
                int i5 = (int) j4;
                if (i5 == 0) {
                    str = "";
                } else {
                    byte[] bArr = new byte[i5];
                    ((zzyy) zzzjVar).zzn(bArr, 0, i5, false);
                    while (i5 > 0) {
                        int i6 = i5 - 1;
                        if (bArr[i6] != 0) {
                            break;
                        }
                        i5 = i6;
                    }
                    str = new String(bArr, 0, i5);
                }
                zzaegVar.zza.zzl(i3, str);
                this.zze = 0;
                return true;
            }
            ((zzyy) zzzjVar).zzo((int) this.zzg, false);
            this.zze = 0;
        }
    }
}
