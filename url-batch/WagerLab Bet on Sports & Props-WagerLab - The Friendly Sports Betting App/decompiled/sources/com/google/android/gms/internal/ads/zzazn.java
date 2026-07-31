package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzazn {
    private final int zza;
    private final zzazk zzb = new zzazp();

    public zzazn(int i) {
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
        zzazm zzazmVar = new zzazm();
        int i2 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new zzazl(this));
        for (String str : split) {
            String[] zzb = zzazo.zzb(str, false);
            if (zzb.length != 0) {
                zzazr.zza(zzb, i2, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzazmVar.zzb.write(this.zzb.zza(((zzazq) it.next()).zzb));
            } catch (IOException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzazmVar.toString();
    }
}
