package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import org.apache.commons.io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaza {
    private final int zza;
    private final zzayx zzb = new zzazc();

    public zzaza(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split(IOUtils.LINE_SEPARATOR_UNIX);
        if (split.length == 0) {
            return "";
        }
        zzayz zzayzVar = new zzayz();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzayy(this));
        for (String str : split) {
            String[] zzb = zzazb.zzb(str, false);
            if (zzb.length != 0) {
                zzazf.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzayzVar.zzb.write(this.zzb.zzb(((zzaze) it.next()).zzb));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzayzVar.toString();
    }
}
