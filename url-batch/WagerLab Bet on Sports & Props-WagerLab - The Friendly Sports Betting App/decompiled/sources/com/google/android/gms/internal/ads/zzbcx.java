package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes5.dex */
public final class zzbcx {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbcx(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbcu zzf() {
        return new zzbcu(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(zzbcx zzbcxVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbcu zzbcuVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbcu(j, strArr[0], zzbcuVar));
        }
        return true;
    }

    public final zzbcw zzc() {
        zzbcw zzbcwVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            List<zzbcu> list = this.zza;
            for (zzbcu zzbcuVar : list) {
                long zza = zzbcuVar.zza();
                String zzb = zzbcuVar.zzb();
                zzbcu zzc = zzbcuVar.zzc();
                if (zzc != null && zza > 0) {
                    long zza2 = zza - zzc.zza();
                    sb.append(zzb);
                    sb.append('.');
                    sb.append(zza2);
                    sb.append(AbstractJsonLexerKt.COMMA);
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
                    sb3.append(AbstractJsonLexerKt.COMMA);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbcwVar = new zzbcw(sb.toString(), str);
        }
        return zzbcwVar;
    }

    public final void zzd(String str, String str2) {
        zzbcn zza;
        if (TextUtils.isEmpty(str2) || (zza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbct zzd = zza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
