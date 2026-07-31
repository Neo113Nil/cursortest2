package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzapu implements zzanu {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzapu(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzapk zzapkVar = (zzapk) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzapkVar.zzb;
            jArr[i2 + 1] = zzapkVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final long zzb(int i) {
        zzguk.zza(i >= 0);
        long[] jArr = this.zzc;
        zzguk.zza(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzapk zzapkVar = (zzapk) list.get(i);
                zzcy zzcyVar = zzapkVar.zza;
                if (zzcyVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzapkVar);
                } else {
                    arrayList.add(zzcyVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, zzapt.zza);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzcx zza = ((zzapk) arrayList2.get(i3)).zza.zza();
            zza.zzf((-1) - i3, 1);
            arrayList.add(zza.zzr());
        }
        return arrayList;
    }
}
