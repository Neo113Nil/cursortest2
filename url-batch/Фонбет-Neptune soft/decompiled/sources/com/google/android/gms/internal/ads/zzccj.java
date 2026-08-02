package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccj implements zzbix {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzcay zzcayVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcayVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcayVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcayVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcayVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcayVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        int i;
        Integer valueOf;
        String str;
        zzcbk zzcbkVar = (zzcbk) obj;
        String str2 = (String) map.get("action");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from video GMSG.");
            return;
        }
        Integer valueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zzb = zzcbkVar.zzo() != null ? zzcbkVar.zzo().zzb() : null;
        int i2 = 0;
        if (valueOf2 != null && zzb != null && !valueOf2.equals(zzb) && !str2.equals("load")) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf2, zzb));
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Video GMSG: " + str2 + " " + jSONObject.toString());
        }
        if (str2.equals("background")) {
            String str3 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbkVar.setBackgroundColor(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str2.equals("playerBackground")) {
            String str4 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbkVar.zzB(Color.parseColor(str4));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str2.equals("decoderProps")) {
            String str5 = (String) map.get("mimeTypes");
            if (str5 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "missingMimeTypes");
                zzcbkVar.zzd("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str5.split(",");
            int length = split.length;
            while (i2 < length) {
                String str6 = split[i2];
                hashMap2.put(str6, com.google.android.gms.ads.internal.util.zzcj.zza(str6.trim()));
                i2++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzcbkVar.zzd("onVideoEvent", hashMap3);
            return;
        }
        zzcaz zzo = zzcbkVar.zzo();
        if (zzo == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str2.equals("new");
        boolean equals2 = str2.equals("position");
        if (equals || equals2) {
            Context context = zzcbkVar.getContext();
            int zzb2 = zzb(context, map, "x", 0);
            int zzb3 = zzb(context, map, "y", 0);
            int zzb4 = zzb(context, map, "w", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdx)).booleanValue()) {
                min = zzb4 == -1 ? zzcbkVar.zzh() : Math.min(zzb4, zzcbkVar.zzh());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate width with original width " + zzb4 + ", videoHost.getVideoBoundingWidth() " + zzcbkVar.zzh() + ", x " + zzb2 + ".");
                }
                min = Math.min(zzb4, zzcbkVar.zzh() - zzb2);
            }
            int zzb5 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdx)).booleanValue()) {
                min2 = zzb5 == -1 ? zzcbkVar.zzg() : Math.min(zzb5, zzcbkVar.zzg());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate height with original height " + zzb5 + ", videoHost.getVideoBoundingHeight() " + zzcbkVar.zzg() + ", y " + zzb3 + ".");
                }
                min2 = Math.min(zzb5, zzcbkVar.zzg() - zzb3);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzo.zza() != null) {
                zzo.zzc(zzb2, zzb3, min, min2);
                return;
            }
            zzo.zzd(zzb2, zzb3, min, min2, i, parseBoolean, new zzcbj((String) map.get("flags")));
            zzcay zza = zzo.zza();
            if (zza != null) {
                zzc(zza, map);
                return;
            }
            return;
        }
        zzcfl zzq = zzcbkVar.zzq();
        if (zzq != null) {
            if (str2.equals("timeupdate")) {
                String str7 = (String) map.get("currentTime");
                if (str7 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzq.zzt(Float.parseFloat(str7));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str2.equals("skip")) {
                zzq.zzu();
                return;
            }
        }
        zzcay zza2 = zzo.zza();
        if (zza2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzcbkVar.zzd("onVideoEvent", hashMap4);
            return;
        }
        if (str2.equals("click")) {
            Context context2 = zzcbkVar.getContext();
            int zzb6 = zzb(context2, map, "x", 0);
            float zzb7 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb6, zzb7, 0);
            zza2.zzx(obtain);
            obtain.recycle();
            return;
        }
        if (str2.equals("currentTime")) {
            String str8 = (String) map.get("time");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zza2.zzw((int) (Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if (str2.equals("hide")) {
            zza2.setVisibility(4);
            return;
        }
        if (str2.equals("remove")) {
            zza2.setVisibility(8);
            return;
        }
        if (str2.equals("load")) {
            zza2.zzr(valueOf2);
            return;
        }
        if (str2.equals("loadControl")) {
            zzc(zza2, map);
            return;
        }
        if (str2.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zza2.zzs();
                return;
            } else {
                zza2.zzI();
                return;
            }
        }
        if (str2.equals("pause")) {
            zza2.zzu();
            return;
        }
        if (str2.equals("play")) {
            zza2.zzv();
            return;
        }
        if (str2.equals("show")) {
            zza2.setVisibility(0);
            return;
        }
        if (!str2.equals("src")) {
            if (str2.equals("touchMove")) {
                Context context3 = zzcbkVar.getContext();
                zza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcbkVar.zzu();
                this.zza = true;
                return;
            }
            if (!str2.equals("volume")) {
                if (str2.equals("watermark")) {
                    zza2.zzn();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unknown video action: ".concat(str2));
                    return;
                }
            }
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zza2.zzG(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        String str10 = (String) map.get("src");
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
            String[] strArr = {str10};
            str = (String) map.get("demuxed");
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    String[] strArr2 = new String[jSONArray.length()];
                    while (i2 < jSONArray.length()) {
                        strArr2[i2] = jSONArray.getString(i2);
                        i2++;
                    }
                    strArr = strArr2;
                } catch (JSONException unused8) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for playback: ".concat(str));
                    strArr = new String[]{str10};
                }
            }
            if (valueOf != null) {
                zzcbkVar.zzA(valueOf.intValue());
            }
            zza2.zzE(str10, strArr);
        }
        valueOf = null;
        String[] strArr3 = {str10};
        str = (String) map.get("demuxed");
        if (str != null) {
        }
        if (valueOf != null) {
        }
        zza2.zzE(str10, strArr3);
    }
}
