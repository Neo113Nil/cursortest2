package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaju {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzaju(String str, zzaik zzaikVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzaikVar.zzb;
        long j = zzaikVar.zzc;
        long j2 = zzaikVar.zzd;
        long j3 = zzaikVar.zze;
        long j4 = zzaikVar.zzf;
        List list = zzaikVar.zzh;
        if (list == null) {
            Map map = zzaikVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzait((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    static zzaju zza(zzajv zzajvVar) throws IOException {
        if (zzajx.zze(zzajvVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzajx.zzh(zzajvVar);
        String zzh2 = zzajx.zzh(zzajvVar);
        long zzf = zzajx.zzf(zzajvVar);
        long zzf2 = zzajx.zzf(zzajvVar);
        long zzf3 = zzajx.zzf(zzajvVar);
        long zzf4 = zzajx.zzf(zzajvVar);
        int zze = zzajx.zze(zzajvVar);
        if (zze < 0) {
            throw new IOException("readHeaderList size=" + zze);
        }
        List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zze; i++) {
            emptyList.add(new zzait(zzajx.zzh(zzajvVar).intern(), zzajx.zzh(zzajvVar).intern()));
        }
        return new zzaju(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
    }

    private zzaju(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
