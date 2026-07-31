package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzqu {
    public static zzgxm zza(List list) {
        int standard;
        byte[] descriptor;
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return zzgxm.zzi();
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzqt.zza).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor m = zzqu$$ExternalSyntheticApiModelOutline0.m(it.next());
            standard = m.getStandard();
            if (standard == 1) {
                descriptor = m.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 20);
                    sb.append("Invalid SAD length: ");
                    sb.append(length);
                    zzeh.zzc("AudioDescriptorUtil", sb.toString());
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfm.zzG(i)));
                    }
                }
            }
        }
        return zzgxm.zzq(treeSet);
    }
}
