package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzcev {
    static zzcev zza;

    public static synchronized zzcev zzd(Context context) {
        synchronized (zzcev.class) {
            zzcev zzcevVar = zza;
            if (zzcevVar != null) {
                return zzcevVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbjc.zzc(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
            zzh.zzr(applicationContext);
            zzcdz zzcdzVar = new zzcdz(null);
            zzcdzVar.zzb(applicationContext);
            zzcdzVar.zzc(com.google.android.gms.ads.internal.zzt.zzB());
            zzcdzVar.zza(zzh);
            zzcdzVar.zzd(com.google.android.gms.ads.internal.zzt.zzn());
            zzcev zze = zzcdzVar.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzcez zzc = zza.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzao)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaq));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        zzc.zzc((String) it.next());
                    }
                    zzc.zzd(new zzcex(zzc, hashMap));
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzf("Failed to parse listening list", e);
                }
            }
            return zza;
        }
    }

    abstract zzcds zza();

    abstract zzcdw zzb();

    abstract zzcez zzc();
}
