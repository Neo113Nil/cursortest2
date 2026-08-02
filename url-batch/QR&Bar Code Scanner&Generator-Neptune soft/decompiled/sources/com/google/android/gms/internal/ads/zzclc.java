package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzclc implements zzbpu {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar;
        zzckt zza;
        zzciy zzciyVar = (zzciy) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.zze.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcku zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zzd(zzciyVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcix zzcixVar = new zzcix((String) map.get("flags"));
        boolean z = zzcixVar.zzn;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zza = null;
                        break;
                    }
                    zzckt zzcktVar = (zzckt) it.next();
                    if (zzcktVar.zza == zzciyVar && str.equals(zzcktVar.zze())) {
                        zza = zzcktVar;
                        break;
                    }
                }
            } else {
                zza = zzy.zza(zzciyVar);
            }
            if (zza != null) {
                com.google.android.gms.ads.internal.util.zze.zzj("Precache task is already running.");
                return;
            }
            if (zzciyVar.zzm() == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = 0;
            }
            if (zzb != null) {
                zzciyVar.zzC(zzb.intValue());
            }
            if (zzb2 != null) {
                zzciyVar.zzA(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzciyVar.zzz(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzckn zzcknVar = zzciyVar.zzm().zzb;
            if (intValue > 0) {
                int zzu = zzcip.zzu();
                zzclbVar = zzu < zzcixVar.zzh ? new zzclk(zzciyVar, zzcixVar) : zzu < zzcixVar.zzb ? new zzclh(zzciyVar, zzcixVar) : new zzclf(zzciyVar);
            } else {
                zzclbVar = new zzcle(zzciyVar);
            }
            new zzckt(zzciyVar, zzclbVar, str, strArr).zzb();
        } else {
            zzckt zza2 = zzy.zza(zzciyVar);
            if (zza2 == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("Precache must specify a source.");
                return;
            }
            zzclbVar = zza2.zzb;
        }
        Integer zzb5 = zzb(map, "minBufferMs");
        if (zzb5 != null) {
            zzclbVar.zzp(zzb5.intValue());
        }
        Integer zzb6 = zzb(map, "maxBufferMs");
        if (zzb6 != null) {
            zzclbVar.zzo(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "bufferForPlaybackMs");
        if (zzb7 != null) {
            zzclbVar.zzh(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb8 != null) {
            zzclbVar.zzn(zzb8.intValue());
        }
    }
}
