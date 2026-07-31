package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbgp {
    public static void zza(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzb(i, zze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long zza = zzbgm.zza(strArr[i3 - 1]);
            long zza2 = zzbgm.zza(strArr[i3 + 5]);
            String zzc = zzc(strArr, i3, 6);
            zze = ((((((zze + 1073807359) - ((zzd(16785407L, 5) * ((zza + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zza2 + 2147483647L) % 1073807359)) % 1073807359;
            zzb(i, zze, zzc, length2, priorityQueue);
            i3++;
        }
    }

    @VisibleForTesting
    static void zzb(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbgo zzbgoVar = new zzbgo(j, str, i2);
        if ((priorityQueue.size() != i || (((zzbgo) priorityQueue.peek()).zzc <= zzbgoVar.zzc && ((zzbgo) priorityQueue.peek()).zza <= zzbgoVar.zza)) && !priorityQueue.contains(zzbgoVar)) {
            priorityQueue.add(zzbgoVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    @VisibleForTesting
    static String zzc(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i3 - 1;
            if (i >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    @VisibleForTesting
    static long zzd(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? zzd(j2, i2) : j * (zzd(j2, i2) % 1073807359)) % 1073807359;
    }

    private static long zze(String[] strArr, int i, int i2) {
        long zza = (zzbgm.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((zza * 16785407) % 1073807359) + ((zzbgm.zza(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
