package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzakw {
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
    zzakw(String str, zzajm zzajmVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzajmVar.zzb;
        long j = zzajmVar.zzc;
        long j2 = zzajmVar.zzd;
        long j3 = zzajmVar.zze;
        long j4 = zzajmVar.zzf;
        List list = zzajmVar.zzh;
        if (list == null) {
            Map map = zzajmVar.zzg;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new zzajv((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    static zzakw zza(zzakx zzakxVar) throws IOException {
        if (zzakz.zze(zzakxVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzakz.zzh(zzakxVar);
        String zzh2 = zzakz.zzh(zzakxVar);
        long zzf = zzakz.zzf(zzakxVar);
        long zzf2 = zzakz.zzf(zzakxVar);
        long zzf3 = zzakz.zzf(zzakxVar);
        long zzf4 = zzakz.zzf(zzakxVar);
        int zze = zzakz.zze(zzakxVar);
        if (zze < 0) {
            throw new IOException("readHeaderList size=" + zze);
        }
        List emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zze; i++) {
            emptyList.add(new zzajv(zzakz.zzh(zzakxVar).intern(), zzakz.zzh(zzakxVar).intern()));
        }
        return new zzakw(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
    }

    private zzakw(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
