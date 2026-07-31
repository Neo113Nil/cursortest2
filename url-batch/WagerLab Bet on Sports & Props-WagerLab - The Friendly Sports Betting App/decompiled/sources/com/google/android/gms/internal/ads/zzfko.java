package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfko {
    private final zzflc zzc;
    private final zzfkk zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    zzfko(zzflc zzflcVar, zzfkk zzfkkVar, Context context, Clock clock) {
        this.zzc = zzflcVar;
        this.zzd = zzfkkVar;
        this.zze = context;
        this.zzh = clock;
    }

    static String zzh(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append("#");
        sb.append(name);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzw)).booleanValue()) {
            zzj(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z) {
        if (z) {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                ((zzflb) it.next()).zzh();
            }
        } else {
            Iterator it2 = this.zza.values().iterator();
            while (it2.hasNext()) {
                ((zzflb) it2.next()).zzg();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzz)).booleanValue() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
            String zzh = zzh(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
            hashSet.add(zzh);
            ConcurrentMap concurrentMap = this.zza;
            zzflb zzflbVar = (zzflb) concurrentMap.get(zzh);
            if (zzflbVar == null) {
                ConcurrentMap concurrentMap2 = this.zzb;
                if (concurrentMap2.containsKey(zzh)) {
                    zzflb zzflbVar2 = (zzflb) concurrentMap2.get(zzh);
                    if (zzflbVar2.zze.equals(zzftVar)) {
                        zzflbVar2.zzr(zzftVar.zzd);
                        zzflbVar2.zzh();
                        concurrentMap.put(zzh, zzflbVar2);
                        concurrentMap2.remove(zzh);
                    } else {
                        arrayList.add(zzftVar);
                    }
                } else {
                    arrayList.add(zzftVar);
                }
            } else if (zzflbVar.zze.equals(zzftVar)) {
                zzflbVar.zzr(zzftVar.zzd);
            } else {
                this.zzb.put(zzh, zzflbVar);
                concurrentMap.remove(zzh);
                arrayList.add(zzftVar);
            }
        }
        Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains((String) entry.getKey())) {
                this.zzb.put((String) entry.getKey(), (zzflb) entry.getValue());
                it2.remove();
            }
        }
        Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            zzflb zzflbVar3 = (zzflb) ((Map.Entry) it3.next()).getValue();
            zzflbVar3.zzf();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzy)).booleanValue()) {
            }
            zzflbVar3.zzo();
            if (!zzflbVar3.zzd()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzflb zzflbVar) {
        zzflbVar.zzc();
        this.zza.put(str, zzflbVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z;
        Clock clock = this.zzh;
        long currentTimeMillis = clock.currentTimeMillis();
        zzflb zzq = zzq(str, adFormat);
        int i = 0;
        z = zzq != null && zzq.zzd();
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        zzfkr zzfkrVar = new zzfkr(new zzfkq(str, adFormat), null);
        zzfkk zzfkkVar = this.zzd;
        int i2 = zzq == null ? 0 : zzq.zze.zzd;
        if (zzq != null) {
            i = zzq.zzn();
        }
        zzfkkVar.zzd(i2, i, currentTimeMillis, valueOf, zzq != null ? zzq.zzi() : null, zzfkrVar, "1");
        return z;
    }

    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfkr zzfkrVar = new zzfkr(new zzfkq(str, adFormat), null);
        zzfkk zzfkkVar = this.zzd;
        Clock clock = this.zzh;
        zzfkkVar.zzf(clock.currentTimeMillis(), zzfkrVar, -1, -1, "1");
        zzflb zzq = zzq(str, adFormat);
        if (zzq == null) {
            return null;
        }
        try {
            String zzi = zzq.zzi();
            Object zze = zzq.zze();
            Object cast = zze == null ? null : cls.cast(zze);
            if (cast != null) {
                zzfkkVar.zzh(clock.currentTimeMillis(), zzq.zze.zzd, zzq.zzn(), zzi, zzfkrVar, "1");
            }
            return cast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
            String name = cls.getName();
            String.valueOf(name);
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(name)), e);
            return null;
        }
    }

    private final synchronized zzflb zzq(String str, AdFormat adFormat) {
        return (zzflb) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        if (!this.zzg.getAndSet(true)) {
            if (this.zzf == null) {
                synchronized (this) {
                    if (this.zzf == null) {
                        try {
                            this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
            } else {
                try {
                    this.zzf.registerDefaultNetworkCallback(new zzfkn(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfkm(this));
        }
        List<com.google.android.gms.ads.internal.client.zzft> zzm = zzm(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzft zzftVar : zzm) {
            String str = zzftVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            zzflb zza = this.zzc.zza(zzftVar, zzceVar);
            if (adFormat != null && zza != null) {
                AtomicInteger atomicInteger = this.zzi;
                if (atomicInteger != null) {
                    zza.zzk(atomicInteger.get());
                }
                zzfkk zzfkkVar = this.zzd;
                zza.zzj(zzfkkVar);
                zzn(zzh(str, adFormat), zza);
                enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                zzfkkVar.zza(zzftVar.zzd, this.zzh.currentTimeMillis(), new zzfkr(new zzfkq(str, adFormat), null), "1");
            }
        }
        this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    public final synchronized zzbwa zzc(String str) {
        return (zzbwa) zzp(zzbwa.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized zzbab zze(String str) {
        return (zzbab) zzp(zzbab.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }
}
