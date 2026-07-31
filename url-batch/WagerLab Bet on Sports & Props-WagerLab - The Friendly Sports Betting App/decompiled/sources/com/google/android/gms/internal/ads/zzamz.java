package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import java.io.IOException;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzamz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzel zza = new zzel(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzef zzb = new zzef();

    zzamz() {
    }

    public static long zze(zzef zzefVar) {
        int zzg = zzefVar.zzg();
        if (zzefVar.zzd() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzefVar.zzm(bArr, 0, 9);
        zzefVar.zzh(zzg);
        byte b = bArr[0];
        if ((b & MessagePack.Code.BIN8) != 68) {
            return C.TIME_UNSET;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return C.TIME_UNSET;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C.TIME_UNSET;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(zzacv zzacvVar) {
        byte[] bArr = zzeo.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzacvVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzel zzb() {
        return this.zza;
    }

    public final int zzc(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean z = this.zze;
        long j = C.TIME_UNSET;
        if (!z) {
            long zzo = zzacvVar.zzo();
            int min = (int) Math.min(20000L, zzo);
            long j2 = zzo - min;
            if (zzacvVar.zzn() != j2) {
                zzadsVar.zza = j2;
                return 1;
            }
            zzef zzefVar = this.zzb;
            zzefVar.zza(min);
            zzacvVar.zzl();
            zzacvVar.zzi(zzefVar.zzi(), 0, min);
            int zzg = zzefVar.zzg();
            int zze = zzefVar.zze() - 4;
            while (true) {
                if (zze < zzg) {
                    break;
                }
                if (zzg(zzefVar.zzi(), zze) == 442) {
                    zzefVar.zzh(zze + 4);
                    long zze2 = zze(zzefVar);
                    if (zze2 != C.TIME_UNSET) {
                        j = zze2;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == C.TIME_UNSET) {
            zzf(zzacvVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == C.TIME_UNSET) {
                zzf(zzacvVar);
                return 0;
            }
            zzel zzelVar = this.zza;
            this.zzh = zzelVar.zzf(this.zzg) - zzelVar.zze(j3);
            zzf(zzacvVar);
            return 0;
        }
        int min2 = (int) Math.min(20000L, zzacvVar.zzo());
        if (zzacvVar.zzn() != 0) {
            zzadsVar.zza = 0L;
            return 1;
        }
        zzef zzefVar2 = this.zzb;
        zzefVar2.zza(min2);
        zzacvVar.zzl();
        zzacvVar.zzi(zzefVar2.zzi(), 0, min2);
        int zzg2 = zzefVar2.zzg();
        int zze3 = zzefVar2.zze();
        while (true) {
            if (zzg2 >= zze3 - 3) {
                break;
            }
            if (zzg(zzefVar2.zzi(), zzg2) == 442) {
                zzefVar2.zzh(zzg2 + 4);
                long zze4 = zze(zzefVar2);
                if (zze4 != C.TIME_UNSET) {
                    j = zze4;
                    break;
                }
            }
            zzg2++;
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
