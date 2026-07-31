package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdtp {
    private final Map zza = new ConcurrentHashMap();

    zzdtp() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: all -> 0x0130, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0015, B:18:0x0035, B:20:0x006b, B:22:0x0075, B:23:0x007d, B:24:0x0084, B:26:0x008a, B:28:0x008e, B:30:0x00a3, B:31:0x00ac, B:33:0x00b2, B:36:0x00c0, B:39:0x00c6, B:40:0x00d8, B:42:0x00de, B:45:0x00f0, B:48:0x00f8, B:60:0x0109, B:63:0x0111, B:66:0x0117, B:69:0x0120, B:78:0x0129, B:81:0x0046, B:82:0x0057), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(long j, int i, long j2) {
        int i2;
        ArrayDeque arrayDeque;
        Long l;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue()) {
            zzdtn zzdtnVar = new zzdtn();
            zzdtnVar.zza(j);
            zzdtnVar.zzb(i);
            zzdts zzc = zzdtnVar.zzc();
            int zzb = zzc.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    i2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziu)).intValue();
                } else if (zzb == 2) {
                    i2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziv)).intValue();
                } else if (zzb == 3) {
                    i2 = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziw)).intValue();
                }
                if (i2 > 0) {
                    Map map = this.zza;
                    ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzc);
                    if (arrayDeque2 == null) {
                        arrayDeque2 = new ArrayDeque();
                        map.put(zzc, arrayDeque2);
                    }
                    arrayDeque2.addLast(Long.valueOf(j2));
                    while (arrayDeque2.size() > i2) {
                        arrayDeque2.removeFirst();
                    }
                    zzc();
                    int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzix)).intValue();
                    if (intValue <= 0) {
                        map.clear();
                        return;
                    }
                    while (true) {
                        Iterator it = map.values().iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            i3 += ((ArrayDeque) it.next()).size();
                        }
                        if (i3 <= intValue) {
                            break;
                        }
                        if (!map.isEmpty()) {
                            Long l2 = Long.MAX_VALUE;
                            Map.Entry entry = null;
                            for (Map.Entry entry2 : map.entrySet()) {
                                ArrayDeque arrayDeque3 = (ArrayDeque) entry2.getValue();
                                if (!arrayDeque3.isEmpty() && (l = (Long) arrayDeque3.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                    entry = entry2;
                                    l2 = l;
                                }
                            }
                            if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    map.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
            i2 = 0;
            if (i2 > 0) {
            }
        }
    }

    public final synchronized Map zzb() {
        HashMap hashMap;
        hashMap = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                hashMap.put((zzdts) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzc() {
        long j;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzdts zzdtsVar = (zzdts) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int zzb = zzdtsVar.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzir)).longValue();
                } else if (zzb == 2) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzis)).longValue();
                } else if (zzb == 3) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzit)).longValue();
                }
                if (j == 0) {
                    it.remove();
                    j = 0;
                }
                if (j <= 0) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext() && currentTimeMillis - ((Long) it2.next()).longValue() > j) {
                        it2.remove();
                    }
                    if (arrayDeque.isEmpty()) {
                        it.remove();
                    }
                }
            }
            j = 0;
            if (j == 0) {
            }
            if (j <= 0) {
            }
        }
    }
}
