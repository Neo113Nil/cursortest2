package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zztk {
    private final zzdy zza = new zzdy(32);
    private zztj zzb;
    private zztj zzc;
    private zztj zzd;
    private long zze;
    private final zzvw zzf;

    public zztk(zzvw zzvwVar, byte[] bArr) {
        this.zzf = zzvwVar;
        zztj zztjVar = new zztj(0L, 65536);
        this.zzb = zztjVar;
        this.zzc = zztjVar;
        this.zzd = zztjVar;
    }

    private final int zzi(int i) {
        zztj zztjVar = this.zzd;
        if (zztjVar.zzc == null) {
            zzvp zzb = this.zzf.zzb();
            zztj zztjVar2 = new zztj(this.zzd.zzb, 65536);
            zztjVar.zzc = zzb;
            zztjVar.zzd = zztjVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zztj zzj(zztj zztjVar, long j) {
        while (j >= zztjVar.zzb) {
            zztjVar = zztjVar.zzd;
        }
        return zztjVar;
    }

    private static zztj zzk(zztj zztjVar, long j, ByteBuffer byteBuffer, int i) {
        zztj zzj = zzj(zztjVar, j);
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

    private static zztj zzl(zztj zztjVar, long j, byte[] bArr, int i) {
        zztj zzj = zzj(zztjVar, j);
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

    private static zztj zzm(zztj zztjVar, zzgc zzgcVar, zztm zztmVar, zzdy zzdyVar) {
        zztj zztjVar2;
        int i;
        if (zzgcVar.zzk()) {
            long j = zztmVar.zzb;
            zzdyVar.zzC(1);
            zztj zzl = zzl(zztjVar, j, zzdyVar.zzH(), 1);
            long j2 = j + 1;
            byte b = zzdyVar.zzH()[0];
            int i2 = b & ByteCompanionObject.MIN_VALUE;
            int i3 = b & ByteCompanionObject.MAX_VALUE;
            zzfz zzfzVar = zzgcVar.zza;
            byte[] bArr = zzfzVar.zza;
            if (bArr == null) {
                zzfzVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztjVar2 = zzl(zzl, j2, zzfzVar.zza, i3);
            long j3 = j2 + i3;
            if (i2 != 0) {
                zzdyVar.zzC(2);
                zztjVar2 = zzl(zztjVar2, j3, zzdyVar.zzH(), 2);
                j3 += 2;
                i = zzdyVar.zzo();
            } else {
                i = 1;
            }
            int[] iArr = zzfzVar.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzfzVar.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (i2 != 0) {
                int i4 = i * 6;
                zzdyVar.zzC(i4);
                zztjVar2 = zzl(zztjVar2, j3, zzdyVar.zzH(), i4);
                j3 += i4;
                zzdyVar.zzF(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = zzdyVar.zzo();
                    iArr4[i5] = zzdyVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztmVar.zza - ((int) (j3 - zztmVar.zzb));
            }
            zzzy zzzyVar = zztmVar.zzc;
            int i6 = zzeg.zza;
            zzfzVar.zzc(i, iArr2, iArr4, zzzyVar.zzb, zzfzVar.zza, zzzyVar.zza, zzzyVar.zzc, zzzyVar.zzd);
            long j4 = zztmVar.zzb;
            int i7 = (int) (j3 - j4);
            zztmVar.zzb = j4 + i7;
            zztmVar.zza -= i7;
        } else {
            zztjVar2 = zztjVar;
        }
        if (!zzgcVar.zze()) {
            zzgcVar.zzi(zztmVar.zza);
            return zzk(zztjVar2, zztmVar.zzb, zzgcVar.zzb, zztmVar.zza);
        }
        zzdyVar.zzC(4);
        zztj zzl2 = zzl(zztjVar2, zztmVar.zzb, zzdyVar.zzH(), 4);
        int zzn = zzdyVar.zzn();
        zztmVar.zzb += 4;
        zztmVar.zza -= 4;
        zzgcVar.zzi(zzn);
        zztj zzk = zzk(zzl2, zztmVar.zzb, zzgcVar.zzb, zzn);
        zztmVar.zzb += zzn;
        int i8 = zztmVar.zza - zzn;
        zztmVar.zza = i8;
        ByteBuffer byteBuffer = zzgcVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zzgcVar.zze = ByteBuffer.allocate(i8);
        } else {
            zzgcVar.zze.clear();
        }
        return zzk(zzk, zztmVar.zzb, zzgcVar.zze, zztmVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + i;
        this.zze = j;
        zztj zztjVar = this.zzd;
        if (j == zztjVar.zzb) {
            this.zzd = zztjVar.zzd;
        }
    }

    public final int zza(zzp zzpVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zztj zztjVar = this.zzd;
        int zza = zzpVar.zza(zztjVar.zzc.zza, zztjVar.zza(this.zze), zzi);
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
        zztj zztjVar;
        if (j != -1) {
            while (true) {
                zztjVar = this.zzb;
                if (j < zztjVar.zzb) {
                    break;
                }
                this.zzf.zzc(zztjVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zztjVar.zza) {
                this.zzc = zztjVar;
            }
        }
    }

    public final void zzd(zzgc zzgcVar, zztm zztmVar) {
        zzm(this.zzc, zzgcVar, zztmVar, this.zza);
    }

    public final void zze(zzgc zzgcVar, zztm zztmVar) {
        this.zzc = zzm(this.zzc, zzgcVar, zztmVar, this.zza);
    }

    public final void zzf() {
        zztj zztjVar = this.zzb;
        if (zztjVar.zzc != null) {
            this.zzf.zzd(zztjVar);
            zztjVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zztj zztjVar2 = this.zzb;
        this.zzc = zztjVar2;
        this.zzd = zztjVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdyVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zztj zztjVar = this.zzd;
            zzdyVar.zzB(zztjVar.zzc.zza, zztjVar.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
