package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzesu {

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final Map zzb = new HashMap();

    @GuardedBy
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;

    @Nullable
    private JSONObject zzg;

    zzesu(Executor executor) {
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzl();
        zzj();
        zzk();
    }

    private final synchronized void zzj() {
        JSONObject zzg;
        if (!((Boolean) zzbln.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcB)).booleanValue() && (zzg = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzg()) != null) {
                try {
                    JSONArray jSONArray = zzg.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle zzp = zzp(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzesy(optString, optBoolean2, optBoolean, true, zzp));
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private final synchronized void zzk() {
        JSONObject zzg;
        try {
            if (!((Boolean) zzbln.zzb.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcC)).booleanValue() && (zzg = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzg()) != null) {
                    JSONArray jSONArray = zzg.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzesy zzesyVar = new zzesy(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.zzd.put(optString, zzesyVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.zze.put(optString, zzesyVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
        } finally {
        }
    }

    private final synchronized void zzl() {
        JSONArray optJSONArray;
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzg();
            if (zzg != null) {
                try {
                    JSONArray optJSONArray2 = zzg.optJSONArray("ad_unit_id_settings");
                    this.zzg = zzg.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmA)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String optString = jSONObject.optString(POBConstants.KEY_FORMAT, "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    arrayList.addAll(zzm(optJSONArray.getJSONObject(i2), optString));
                                }
                            }
                            zzn(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzm(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle zzp = zzp(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) arrayList2.get(i2);
                        zze(str2);
                        if (((zzesw) this.zza.get(str2)) != null) {
                            arrayList.add(new zzesw(str2, str, zzp));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.zzc;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List list2 = (List) map2.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map2.put(str2, list2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized zzgxp zzo(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzd())) {
                boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzem), str);
                boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzen), str);
                if (matches) {
                    hashMap = new HashMap(this.zze);
                } else if (matches2) {
                    hashMap = new HashMap(this.zzd);
                }
                return zzgxp.zzc(hashMap);
            }
            return zzgxp.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Bundle zzp(@Nullable JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzh().zzp().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzesu.this.zzf();
            }
        });
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzesu.this.zzg();
            }
        });
    }

    public final synchronized Map zzb() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzd())) {
            return zzgxp.zza();
        }
        return zzgxp.zzc(this.zzb);
    }

    public final synchronized Map zzc(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzd()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzesw> list = (List) map.get(str2);
                if (list == null) {
                    String zza = zzdyh.zza(this.zzg, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmA)).booleanValue()) {
                        zza = zza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(zza);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzesw zzeswVar : list) {
                        String str3 = zzeswVar.zza;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzeswVar.zzb);
                    }
                    return zzgxp.zzc(hashMap);
                }
            }
            return zzgxp.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzd(String str, String str2) {
        HashMap hashMap;
        try {
            Map zzc = zzc(str, str2);
            zzgxp zzo = zzo(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : zzc.entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzo.containsKey(str3)) {
                    zzesy zzesyVar = (zzesy) zzo.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new zzesy(str3, zzesyVar.zzb, zzesyVar.zzc, zzesyVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzhaa it = zzo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((zzesy) entry2.getValue()).zzd) {
                    hashMap.put(str4, (zzesy) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized void zze(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new zzesw(str, "", new Bundle()));
            }
        }
    }

    final /* synthetic */ void zzf() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzesu.this.zzh();
            }
        });
    }
}
