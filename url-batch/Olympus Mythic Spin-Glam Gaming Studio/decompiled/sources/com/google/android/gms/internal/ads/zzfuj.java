package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfuj {
    private final zzfve zzc;
    private final zzfuf zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    zzfuj(zzfve zzfveVar, zzfuf zzfufVar, Context context, Clock clock) {
        this.zzc = zzfveVar;
        this.zzd = zzfufVar;
        this.zze = context;
        this.zzh = clock;
    }

    static String zzh(String str, @Nullable AdFormat adFormat) {
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzC)).booleanValue()) {
            zzj(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z) {
        try {
            if (z) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfvd) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfvd) it2.next()).zzi();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzF)).booleanValue() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) it.next();
                String zzh = zzh(zzfpVar.zza, AdFormat.getAdFormat(zzfpVar.zzb));
                hashSet.add(zzh);
                ConcurrentMap concurrentMap = this.zza;
                zzfvd zzfvdVar = (zzfvd) concurrentMap.get(zzh);
                if (zzfvdVar == null) {
                    ConcurrentMap concurrentMap2 = this.zzb;
                    if (concurrentMap2.containsKey(zzh)) {
                        zzfvd zzfvdVar2 = (zzfvd) concurrentMap2.get(zzh);
                        if (zzfvdVar2.zzk(zzfpVar)) {
                            zzfvdVar2.zzA(zzfpVar.zzd);
                            zzfvdVar2.zzj();
                            concurrentMap.put(zzh, zzfvdVar2);
                            concurrentMap2.remove(zzh);
                        } else {
                            arrayList.add(zzfpVar);
                        }
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else if (zzfvdVar.zzk(zzfpVar)) {
                    zzfvdVar.zzA(zzfpVar.zzd);
                } else {
                    this.zzb.put(zzh, zzfvdVar);
                    concurrentMap.remove(zzh);
                    arrayList.add(zzfpVar);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfvd) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfvd zzfvdVar3 = (zzfvd) ((Map.Entry) it3.next()).getValue();
                zzfvdVar3.zzh();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzE)).booleanValue()) {
                }
                zzfvdVar3.zzv();
                if (!zzfvdVar3.zzf()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzfvd zzfvdVar) {
        zzfvdVar.zzd();
        this.zza.put(str, zzfvdVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z;
        try {
            Clock clock = this.zzh;
            long currentTimeMillis = clock.currentTimeMillis();
            zzfvd zzq = zzq(str, adFormat);
            z = zzq != null && zzq.zzf();
            this.zzd.zzd(zzq == null ? 0 : zzq.zzs(), zzq == null ? 0 : zzq.zzt(), currentTimeMillis, z ? Long.valueOf(clock.currentTimeMillis()) : null, zzq == null ? null : zzq.zzl(), new zzfum(new zzful(str, adFormat), null), "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Nullable
    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfum zzfumVar = new zzfum(new zzful(str, adFormat), null);
        zzfuf zzfufVar = this.zzd;
        Clock clock = this.zzh;
        zzfufVar.zzf(clock.currentTimeMillis(), zzfumVar, -1, -1, "1");
        zzfvd zzq = zzq(str, adFormat);
        if (zzq == null) {
            return null;
        }
        try {
            String zzl = zzq.zzl();
            Object zzg = zzq.zzg();
            Object cast = zzg == null ? null : cls.cast(zzg);
            if (cast != null) {
                zzfufVar.zzh(clock.currentTimeMillis(), zzq.zzs(), zzq.zzt(), zzl, zzfumVar, "1");
            }
            return cast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    @Nullable
    private final synchronized zzfvd zzq(String str, AdFormat adFormat) {
        return (zzfvd) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        try {
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
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfui(this));
                    } catch (RuntimeException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                        this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzL)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfuh(this));
            }
            List<com.google.android.gms.ads.internal.client.zzfp> zzm = zzm(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzfp zzfpVar : zzm) {
                String str = zzfpVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
                zzfvd zza = this.zzc.zza(zzfpVar, zzcbVar);
                if (adFormat != null && zza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zza.zzn(atomicInteger.get());
                    }
                    zzfuf zzfufVar = this.zzd;
                    zza.zzm(zzfufVar);
                    zzn(zzh(str, adFormat), zza);
                    enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                    zzfufVar.zza(zzfpVar.zzd, this.zzh.currentTimeMillis(), new zzfum(new zzful(str, adFormat), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    @Nullable
    public final synchronized zzcda zzc(String str) {
        return (zzcda) zzp(zzcda.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final synchronized zzbgz zze(String str) {
        return (zzbgz) zzp(zzbgz.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbu zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzp(com.google.android.gms.ads.internal.client.zzbu.class, str, AdFormat.INTERSTITIAL);
    }
}
