package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@Deprecated
/* loaded from: classes13.dex */
public final class zzbjv {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbjv(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbjs zzf() {
        return new zzbjs(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(@Nullable zzbjv zzbjvVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbjs zzbjsVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbjs(j, strArr[0], zzbjsVar));
        }
        return true;
    }

    public final zzbju zzc() {
        zzbju zzbjuVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbjs> list = this.zza;
                for (zzbjs zzbjsVar : list) {
                    long zza = zzbjsVar.zza();
                    String zzb = zzbjsVar.zzb();
                    zzbjs zzc = zzbjsVar.zzc();
                    if (zzc != null && zza > 0) {
                        long zza2 = zza - zzc.zza();
                        sb.append(zzb);
                        sb.append('.');
                        sb.append(zza2);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(zzc.zza()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzc.zza()));
                                sb2.append('+');
                                sb2.append(zzb);
                            } else {
                                hashMap.put(Long.valueOf(zzc.zza()), new StringBuilder(zzb));
                            }
                        }
                    }
                }
                list.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                zzbjuVar = new zzbju(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbjuVar;
    }

    public final void zzd(String str, String str2) {
        zzbjl zza;
        if (TextUtils.isEmpty(str2) || (zza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbjr zzd = zza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzd.zza((String) map.get(str), str2));
        }
    }

    @VisibleForTesting
    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
