package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbcu {
    private final int zza;
    private final zzbcr zzb = new zzbcw();

    public zzbcu(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbct zzbctVar = new zzbct();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbcs(this));
        for (String str : split) {
            String[] zzb = zzbcv.zzb(str, false);
            if (zzb.length != 0) {
                zzbcz.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbctVar.zzb.write(this.zzb.zzb(((zzbcy) it.next()).zzb));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzbctVar.toString();
    }
}
