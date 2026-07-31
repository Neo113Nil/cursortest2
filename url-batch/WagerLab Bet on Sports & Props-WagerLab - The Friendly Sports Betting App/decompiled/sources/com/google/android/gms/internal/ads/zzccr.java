package com.google.android.gms.internal.ads;

import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzccr implements zzbjl {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzbjl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccq zzccqVar;
        int i;
        zzcbd zzcbdVar = (zzcbd) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccj zzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzB.zza(zzcbdVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb = zzb(map, "periodicReportIntervalMs");
        Integer zzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbc zzcbcVar = new zzcbc((String) map.get(NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY));
        boolean z = zzcbcVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcci zzcciVar = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            strArr2[i2] = jSONArray.getString(i2);
                        } catch (JSONException unused) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                            if (strArr == null) {
                            }
                            if (!z) {
                            }
                            if (zzcciVar == null) {
                            }
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i] = str;
            }
            if (!z) {
                Iterator it = zzB.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzcci zzcciVar2 = (zzcci) it.next();
                    if (zzcciVar2.zza == zzcbdVar && str.equals(zzcciVar2.zzd())) {
                        zzcciVar = zzcciVar2;
                        break;
                    }
                }
            } else {
                zzcciVar = zzB.zzb(zzcbdVar);
            }
            if (zzcciVar == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache task is already running.");
                return;
            }
            if (zzcbdVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer zzb4 = zzb(map, "player");
            if (zzb4 == null) {
                zzb4 = Integer.valueOf(i);
            }
            if (zzb != null) {
                zzcbdVar.zzo(zzb.intValue());
            }
            if (zzb2 != null) {
                zzcbdVar.zzA(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzcbdVar.zzB(zzb3.intValue());
            }
            int intValue = zzb4.intValue();
            zzcca zzccaVar = zzcbdVar.zzk().zzb;
            if (intValue > 0) {
                int i3 = zzcbcVar.zzg;
                int zzQ = zzcau.zzQ();
                if (zzQ < i3) {
                    zzccqVar = new zzccz(zzcbdVar, zzcbcVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzp)).booleanValue()) {
                        zzQ = zzccw.zzr();
                    }
                    zzccqVar = zzQ < zzcbcVar.zzb ? new zzccw(zzcbdVar, zzcbcVar) : new zzccu(zzcbdVar);
                }
            } else {
                zzccqVar = new zzcct(zzcbdVar);
            }
            new zzcci(zzcbdVar, zzccqVar, str, strArr).zzb();
        } else {
            zzcci zzb5 = zzB.zzb(zzcbdVar);
            if (zzb5 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache must specify a source.");
                return;
            }
            zzccqVar = zzb5.zzb;
        }
        Integer zzb6 = zzb(map, "minBufferMs");
        if (zzb6 != null) {
            zzccqVar.zzi(zzb6.intValue());
        }
        Integer zzb7 = zzb(map, "maxBufferMs");
        if (zzb7 != null) {
            zzccqVar.zzh(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "bufferForPlaybackMs");
        if (zzb8 != null) {
            zzccqVar.zzj(zzb8.intValue());
        }
        Integer zzb9 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb9 != null) {
            zzccqVar.zzk(zzb9.intValue());
        }
    }
}
