package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzash {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = new zzeu(8);
        int i = zzasg.zza(zzagiVar, zzeuVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int zzB = zzeuVar.zzB();
        if (zzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(zzB);
        zzeh.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzasf zzb(zzagi zzagiVar) throws IOException {
        byte[] bArr;
        int i;
        int i2;
        zzeu zzeuVar = new zzeu(16);
        long j = zzd(1718449184, zzagiVar, zzeuVar).zzb;
        zzguk.zzi(j >= 16);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 16);
        zzeuVar.zzh(0);
        int zzu = zzeuVar.zzu();
        int zzu2 = zzeuVar.zzu();
        int zzI = zzeuVar.zzI();
        int zzI2 = zzeuVar.zzI();
        int zzu3 = zzeuVar.zzu();
        int zzu4 = zzeuVar.zzu();
        int i3 = ((int) j) - 16;
        if (i3 > 0) {
            byte[] bArr2 = new byte[i3];
            zzagiVar.zzi(bArr2, 0, i3);
            if (zzu != 65534) {
                i = zzu;
                bArr = bArr2;
            } else {
                if (i3 == 24) {
                    zzeu zzeuVar2 = new zzeu(bArr2);
                    zzeuVar2.zzu();
                    int zzu5 = zzeuVar2.zzu();
                    if (zzu5 != 0 && zzu5 != zzu4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzu5).length() + 33 + String.valueOf(zzu4).length() + 19);
                        sb.append("validBits ( ");
                        sb.append(zzu5);
                        sb.append(")  != bitsPerSample( ");
                        sb.append(zzu4);
                        sb.append(") are not supported");
                        throw zzat.zzc(sb.toString());
                    }
                    int zzI3 = zzeuVar2.zzI();
                    if (!zzft.zza(zzI3, zzu2)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzI3).length() + 57 + String.valueOf(zzu2).length());
                        sb2.append("Channel mask ");
                        sb2.append(zzI3);
                        sb2.append(" is invalid or does not match channel count ");
                        sb2.append(zzu2);
                        throw zzat.zzc(sb2.toString());
                    }
                    int zzu6 = zzeuVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzeuVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                    i2 = zzI3;
                    bArr = bArr2;
                    i = zzu6;
                    zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
                    return new zzasf(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr, i2);
                }
                bArr = bArr2;
                i = 65534;
            }
        } else {
            bArr = zzfm.zzb;
            i = zzu;
        }
        i2 = 0;
        zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
        return new zzasf(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr, i2);
    }

    public static Pair zzc(zzagi zzagiVar) throws IOException {
        zzagiVar.zzl();
        zzasg zzd = zzd(1684108385, zzagiVar, new zzeu(8));
        zzagiVar.zzf(8);
        return Pair.create(Long.valueOf(zzagiVar.zzn()), Long.valueOf(zzd.zzb));
    }

    private static zzasg zzd(int i, zzagi zzagiVar, zzeu zzeuVar) throws IOException {
        zzasg zza2 = zzasg.zza(zzagiVar, zzeuVar);
        while (true) {
            int i2 = zza2.zza;
            if (i2 == i) {
                return zza2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i2);
            zzeh.zzc("WavHeaderReader", sb.toString());
            long j = zza2.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i2);
                throw zzat.zzc(sb2.toString());
            }
            zzagiVar.zzf((int) j2);
            zza2 = zzasg.zza(zzagiVar, zzeuVar);
        }
    }
}
