package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzebm {
    private final Map zza = new ConcurrentHashMap();

    zzebm() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:11:0x0019, B:13:0x0032, B:15:0x0038, B:17:0x0041, B:19:0x0049, B:25:0x0068, B:27:0x009c, B:29:0x00a6, B:30:0x00ae, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00d4, B:38:0x00dd, B:40:0x00e3, B:43:0x00f1, B:46:0x00f7, B:47:0x0109, B:49:0x010f, B:52:0x0121, B:55:0x0129, B:67:0x013a, B:70:0x0142, B:73:0x0148, B:76:0x0151, B:85:0x015a, B:88:0x0079, B:89:0x008a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(long j, int i, long j2) {
        int i2;
        ArrayDeque arrayDeque;
        Long l;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziQ)).booleanValue()) {
                if (i == 2) {
                    zzebk zzebkVar = new zzebk();
                    zzebkVar.zza(j);
                    zzebkVar.zzb(1);
                    zzebp zzc = zzebkVar.zzc();
                    Map map = this.zza;
                    ArrayDeque arrayDeque2 = (ArrayDeque) map.get(zzc);
                    if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                        arrayDeque2.removeFirst();
                        if (arrayDeque2.isEmpty()) {
                            map.remove(zzc);
                        }
                    }
                    i = 2;
                }
                zzebk zzebkVar2 = new zzebk();
                zzebkVar2.zza(j);
                zzebkVar2.zzb(i);
                zzebp zzc2 = zzebkVar2.zzc();
                int zzb = zzc2.zzb();
                if (zzb != 0) {
                    if (zzb == 1) {
                        i2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziX)).intValue();
                    } else if (zzb == 2) {
                        i2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziY)).intValue();
                    } else if (zzb == 3) {
                        i2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziZ)).intValue();
                    }
                    if (i2 > 0) {
                        Map map2 = this.zza;
                        ArrayDeque arrayDeque3 = (ArrayDeque) map2.get(zzc2);
                        if (arrayDeque3 == null) {
                            arrayDeque3 = new ArrayDeque();
                            map2.put(zzc2, arrayDeque3);
                        }
                        arrayDeque3.addLast(Long.valueOf(j2));
                        while (arrayDeque3.size() > i2) {
                            arrayDeque3.removeFirst();
                        }
                        zzc();
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzja)).intValue();
                        if (intValue <= 0) {
                            map2.clear();
                            return;
                        }
                        while (true) {
                            Iterator it = map2.values().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                i3 += ((ArrayDeque) it.next()).size();
                            }
                            if (i3 <= intValue) {
                                break;
                            }
                            if (!map2.isEmpty()) {
                                Long l2 = Long.MAX_VALUE;
                                Map.Entry entry = null;
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    ArrayDeque arrayDeque4 = (ArrayDeque) entry2.getValue();
                                    if (!arrayDeque4.isEmpty() && (l = (Long) arrayDeque4.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                        entry = entry2;
                                        l2 = l;
                                    }
                                }
                                if (entry != null && (arrayDeque = (ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                    arrayDeque.removeFirst();
                                    if (arrayDeque.isEmpty()) {
                                        map2.remove(entry.getKey());
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
        } finally {
        }
    }

    public final synchronized Map zzb() {
        HashMap hashMap;
        hashMap = new HashMap();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziQ)).booleanValue()) {
            zzc();
            for (Map.Entry entry : this.zza.entrySet()) {
                hashMap.put((zzebp) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[SYNTHETIC] */
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
            zzebp zzebpVar = (zzebp) entry.getKey();
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            int zzb = zzebpVar.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziU)).longValue();
                } else if (zzb == 2) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziV)).longValue();
                } else if (zzb == 3) {
                    j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziW)).longValue();
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
