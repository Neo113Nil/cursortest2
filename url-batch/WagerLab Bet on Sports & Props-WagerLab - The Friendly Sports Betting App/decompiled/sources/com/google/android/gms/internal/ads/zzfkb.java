package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfkb {
    private final Map zza;
    private final zzflc zzb;
    private final zzfkk zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;

    zzfkb(zzflc zzflcVar, zzfkk zzfkkVar, Context context, Clock clock) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put(AdFormat.APP_OPEN_AD, new HashMap());
        hashMap.put(AdFormat.INTERSTITIAL, new HashMap());
        hashMap.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzflcVar;
        this.zzc = zzfkkVar;
        this.zzd = context;
        this.zzg = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzw)).booleanValue()) {
            zzl(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            for (zzflb zzflbVar : ((Map) it.next()).values()) {
                if (z) {
                    zzflbVar.zzh();
                } else {
                    zzflbVar.zzg();
                }
            }
        }
    }

    private final synchronized Object zzo(Class cls, AdFormat adFormat, String str) {
        zzfkk zzfkkVar = this.zzc;
        Clock clock = this.zzg;
        zzfkkVar.zze(clock.currentTimeMillis(), ExifInterface.GPS_MEASUREMENT_2D);
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzflb zzflbVar = (zzflb) ((Map) map.get(adFormat)).get(str);
        if (zzflbVar != null && adFormat.equals(zzflbVar.zzm())) {
            zzfkq zzfkqVar = new zzfkq(zzflbVar.zze.zza, zzflbVar.zzm());
            zzfkqVar.zza(str);
            zzfkr zzfkrVar = new zzfkr(zzfkqVar, null);
            zzfkkVar.zzf(clock.currentTimeMillis(), zzfkrVar, zzflbVar.zze.zzd, zzflbVar.zzn(), ExifInterface.GPS_MEASUREMENT_2D);
            try {
                String zzi = zzflbVar.zzi();
                Object zze = zzflbVar.zze();
                Object cast = zze == null ? null : cls.cast(zze);
                if (cast != null) {
                    zzfkkVar.zzh(clock.currentTimeMillis(), zzflbVar.zze.zzd, zzflbVar.zzn(), zzi, zzfkrVar, ExifInterface.GPS_MEASUREMENT_2D);
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
        return null;
    }

    private final synchronized boolean zzp(AdFormat adFormat) {
        int size;
        int ordinal;
        Map map = this.zza;
        size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
        ordinal = adFormat.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeY)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeX)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeW)).intValue(), 1));
    }

    public final synchronized boolean zza(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        zzflb zzb;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new zzfjz(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzE)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfka(this));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat != null) {
            Map map = this.zza;
            if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && zzp(adFormat) && (zzb = this.zzb.zzb(str, zzftVar, zzchVar)) != null) {
                AtomicInteger atomicInteger = this.zzh;
                if (atomicInteger != null) {
                    zzb.zzk(atomicInteger.get());
                }
                zzfkk zzfkkVar = this.zzc;
                zzb.zzj(zzfkkVar);
                zzb.zzc();
                ((Map) map.get(adFormat)).put(str, zzb);
                zzfkq zzfkqVar = new zzfkq(zzftVar.zza, adFormat);
                zzfkqVar.zza(str);
                zzfkkVar.zza(zzftVar.zzd, this.zzg.currentTimeMillis(), new zzfkr(zzfkqVar, null), ExifInterface.GPS_MEASUREMENT_2D);
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean zzb(AdFormat adFormat, String str) {
        zzfkr zzfkrVar;
        Clock clock = this.zzg;
        long currentTimeMillis = clock.currentTimeMillis();
        Map map = this.zza;
        int i = 0;
        if (!map.containsKey(adFormat)) {
            return false;
        }
        zzflb zzflbVar = (zzflb) ((Map) map.get(adFormat)).get(str);
        String zzi = zzflbVar == null ? null : zzflbVar.zzi();
        boolean z = zzi != null && adFormat.equals(zzflbVar.zzm());
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        if (zzflbVar == null) {
            zzfkrVar = null;
        } else {
            zzfkq zzfkqVar = new zzfkq(zzflbVar.zze.zza, adFormat);
            zzfkqVar.zza(str);
            zzfkrVar = new zzfkr(zzfkqVar, null);
        }
        zzfkk zzfkkVar = this.zzc;
        int i2 = zzflbVar == null ? 0 : zzflbVar.zze.zzd;
        if (zzflbVar != null) {
            i = zzflbVar.zzn();
        }
        zzfkkVar.zzd(i2, i, currentTimeMillis, valueOf, zzi, zzfkrVar, ExifInterface.GPS_MEASUREMENT_2D);
        return z;
    }

    public final synchronized zzbwa zzc(String str) {
        return (zzbwa) zzo(zzbwa.class, AdFormat.REWARDED, str);
    }

    public final synchronized zzbab zzd(String str) {
        return (zzbab) zzo(zzbab.class, AdFormat.APP_OPEN_AD, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzo(com.google.android.gms.ads.internal.client.zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzft zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (map.containsKey(adFormat)) {
            zzflb zzflbVar = (zzflb) ((Map) map.get(adFormat)).get(str);
            this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzflbVar == null ? null : zzflbVar.zze.zza, adFormat, zzflbVar == null ? -1 : zzflbVar.zze.zzd, zzflbVar != null ? zzflbVar.zzn() : -1);
            if (zzflbVar != null) {
                return zzflbVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzflb zzflbVar = (zzflb) ((Map) map.get(adFormat)).get(str);
        int zzn = zzflbVar != null ? zzflbVar.zzn() : 0;
        this.zzc.zzp(zzn, this.zzg.currentTimeMillis(), str, zzflbVar == null ? null : zzflbVar.zze.zza, adFormat, zzflbVar == null ? -1 : zzflbVar.zze.zzd);
        return zzn;
    }

    public final synchronized Map zzh(int i) {
        HashMap hashMap = new HashMap();
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat != null) {
            Map map = this.zza;
            if (map.containsKey(adFormat)) {
                for (zzflb zzflbVar : ((Map) map.get(adFormat)).values()) {
                    hashMap.put(zzflbVar.zzl(), zzflbVar.zze);
                }
                this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), hashMap.size());
                return hashMap;
            }
        }
        return hashMap;
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        zzflb zzflbVar;
        Map map = this.zza;
        if (map.containsKey(adFormat) && (zzflbVar = (zzflb) ((Map) map.get(adFormat)).get(str)) != null) {
            ((Map) map.get(adFormat)).remove(str);
            zzflbVar.zzf();
            zzflbVar.zzo();
            zzfkk zzfkkVar = this.zzc;
            long currentTimeMillis = this.zzg.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzft zzftVar = zzflbVar.zze;
            zzfkkVar.zzm(currentTimeMillis, str, zzftVar.zza, adFormat, zzftVar.zzd, zzflbVar.zzn());
            return true;
        }
        return false;
    }

    public final synchronized void zzj(int i) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat != null) {
            Map map = this.zza;
            if (map.containsKey(adFormat)) {
                Map map2 = (Map) map.get(adFormat);
                int size = map2.size();
                for (String str : map2.keySet()) {
                    zzflb zzflbVar = (zzflb) map2.get(str);
                    if (zzflbVar != null) {
                        zzflbVar.zzf();
                        zzflbVar.zzo();
                        String.valueOf(str);
                        String valueOf = String.valueOf(str);
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(valueOf));
                    }
                }
                map2.clear();
                String concat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
                this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
            }
        }
    }
}
