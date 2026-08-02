package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzts {
    private final zzef zza = new zzef(32);
    private zztr zzb;
    private zztr zzc;
    private zztr zzd;
    private long zze;
    private final zzwi zzf;

    public zzts(zzwi zzwiVar, byte[] bArr) {
        this.zzf = zzwiVar;
        zztr zztrVar = new zztr(0L, 65536);
        this.zzb = zztrVar;
        this.zzc = zztrVar;
        this.zzd = zztrVar;
    }

    private final int zzi(int i) {
        zztr zztrVar = this.zzd;
        if (zztrVar.zzc == null) {
            zzwb zzb = this.zzf.zzb();
            zztr zztrVar2 = new zztr(this.zzd.zzb, 65536);
            zztrVar.zzc = zzb;
            zztrVar.zzd = zztrVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zztr zzj(zztr zztrVar, long j) {
        while (j >= zztrVar.zzb) {
            zztrVar = zztrVar.zzd;
        }
        return zztrVar;
    }

    private static zztr zzk(zztr zztrVar, long j, ByteBuffer byteBuffer, int i) {
        zztr zzj = zzj(zztrVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztr zzl(zztr zztrVar, long j, byte[] bArr, int i) {
        zztr zzj = zzj(zztrVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztr zzm(zztr zztrVar, zzgi zzgiVar, zztu zztuVar, zzef zzefVar) {
        zztr zztrVar2;
        if (zzgiVar.zzk()) {
            long j = zztuVar.zzb;
            int i = 1;
            zzefVar.zzC(1);
            zztr zzl = zzl(zztrVar, j, zzefVar.zzH(), 1);
            long j2 = j + 1;
            byte b = zzefVar.zzH()[0];
            int i2 = b & ByteCompanionObject.MIN_VALUE;
            int i3 = b & ByteCompanionObject.MAX_VALUE;
            zzgf zzgfVar = zzgiVar.zza;
            byte[] bArr = zzgfVar.zza;
            if (bArr == null) {
                zzgfVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztrVar2 = zzl(zzl, j2, zzgfVar.zza, i3);
            long j3 = j2 + i3;
            if (i2 != 0) {
                zzefVar.zzC(2);
                zztrVar2 = zzl(zztrVar2, j3, zzefVar.zzH(), 2);
                j3 += 2;
                i = zzefVar.zzo();
            }
            int i4 = i;
            int[] iArr = zzgfVar.zzd;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgfVar.zze;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (i2 != 0) {
                int i5 = i4 * 6;
                zzefVar.zzC(i5);
                zztrVar2 = zzl(zztrVar2, j3, zzefVar.zzH(), i5);
                j3 += i5;
                zzefVar.zzF(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzefVar.zzo();
                    iArr4[i6] = zzefVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztuVar.zza - ((int) (j3 - zztuVar.zzb));
            }
            zzaao zzaaoVar = zztuVar.zzc;
            int i7 = zzen.zza;
            zzgfVar.zzc(i4, iArr2, iArr4, zzaaoVar.zzb, zzgfVar.zza, zzaaoVar.zza, zzaaoVar.zzc, zzaaoVar.zzd);
            long j4 = zztuVar.zzb;
            int i8 = (int) (j3 - j4);
            zztuVar.zzb = j4 + i8;
            zztuVar.zza -= i8;
        } else {
            zztrVar2 = zztrVar;
        }
        if (!zzgiVar.zze()) {
            zzgiVar.zzi(zztuVar.zza);
            return zzk(zztrVar2, zztuVar.zzb, zzgiVar.zzb, zztuVar.zza);
        }
        zzefVar.zzC(4);
        zztr zzl2 = zzl(zztrVar2, zztuVar.zzb, zzefVar.zzH(), 4);
        int zzn = zzefVar.zzn();
        zztuVar.zzb += 4;
        zztuVar.zza -= 4;
        zzgiVar.zzi(zzn);
        zztr zzk = zzk(zzl2, zztuVar.zzb, zzgiVar.zzb, zzn);
        zztuVar.zzb += zzn;
        int i9 = zztuVar.zza - zzn;
        zztuVar.zza = i9;
        ByteBuffer byteBuffer = zzgiVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            zzgiVar.zze = ByteBuffer.allocate(i9);
        } else {
            zzgiVar.zze.clear();
        }
        return zzk(zzk, zztuVar.zzb, zzgiVar.zze, zztuVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zztr zztrVar = this.zzd;
        if (j == zztrVar.zzb) {
            this.zzd = zztrVar.zzd;
        }
    }

    public final int zza(zzr zzrVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zztr zztrVar = this.zzd;
        int zza = zzrVar.zza(zztrVar.zzc.zza, zztrVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zztr zztrVar;
        if (j != -1) {
            while (true) {
                zztrVar = this.zzb;
                if (j < zztrVar.zzb) {
                    break;
                }
                this.zzf.zzc(zztrVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zztrVar.zza) {
                this.zzc = zztrVar;
            }
        }
    }

    public final void zzd(zzgi zzgiVar, zztu zztuVar) {
        zzm(this.zzc, zzgiVar, zztuVar, this.zza);
    }

    public final void zze(zzgi zzgiVar, zztu zztuVar) {
        this.zzc = zzm(this.zzc, zzgiVar, zztuVar, this.zza);
    }

    public final void zzf() {
        zztr zztrVar = this.zzb;
        if (zztrVar.zzc != null) {
            this.zzf.zzd(zztrVar);
            zztrVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zztr zztrVar2 = this.zzb;
        this.zzc = zztrVar2;
        this.zzd = zztrVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzef zzefVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zztr zztrVar = this.zzd;
            zzefVar.zzB(zztrVar.zzc.zza, zztrVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
