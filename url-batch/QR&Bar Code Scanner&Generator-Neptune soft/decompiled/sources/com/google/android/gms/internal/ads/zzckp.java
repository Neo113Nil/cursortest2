package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzckp implements zzbpu {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                i = zzcgi.zzw(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzcim zzcimVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcimVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcimVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcimVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcimVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcimVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        int i;
        zzciy zzciyVar = (zzciy) obj;
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zzl = (zzciyVar.zzbp() == null || zzciyVar.zzbp().zza() == null) ? null : zzciyVar.zzbp().zza().zzl();
        if (valueOf != null && zzl != null && !valueOf.equals(zzl)) {
            com.google.android.gms.ads.internal.util.zze.zzi(String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", valueOf, zzl));
            return;
        }
        String str = (String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Action missing from video GMSG.");
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.zze.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzciyVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzciyVar.zzD(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.zze.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzciyVar.zzd("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzciyVar.zzd("onVideoEvent", hashMap3);
            return;
        }
        zzcin zzbp = zzciyVar.zzbp();
        if (zzbp == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = zzciyVar.getContext();
            int zzb = zzb(context, map, "x", 0);
            int zzb2 = zzb(context, map, "y", 0);
            int zzb3 = zzb(context, map, "w", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcY)).booleanValue()) {
                min = zzb3 == -1 ? zzciyVar.zzj() : Math.min(zzb3, zzciyVar.zzj());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate width with original width " + zzb3 + ", videoHost.getVideoBoundingWidth() " + zzciyVar.zzj() + ", x " + zzb + ".");
                }
                min = Math.min(zzb3, zzciyVar.zzj() - zzb);
            }
            int zzb4 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcY)).booleanValue()) {
                min2 = zzb4 == -1 ? zzciyVar.zzi() : Math.min(zzb4, zzciyVar.zzi());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate height with original height " + zzb4 + ", videoHost.getVideoBoundingHeight() " + zzciyVar.zzi() + ", y " + zzb2 + ".");
                }
                min2 = Math.min(zzb4, zzciyVar.zzi() - zzb2);
            }
            int i2 = min2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzbp.zza() != null) {
                zzbp.zzb(zzb, zzb2, min, i2);
                return;
            }
            zzbp.zzc(zzb, zzb2, min, i2, i, parseBoolean, new zzcix((String) map.get("flags")), valueOf);
            zzcim zza = zzbp.zza();
            if (zza != null) {
                zzc(zza, map);
                return;
            }
            return;
        }
        zzcnl zzs = zzciyVar.zzs();
        if (zzs != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzs.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzs.zzu();
                return;
            }
        }
        zzcim zza2 = zzbp.zza();
        if (zza2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzciyVar.zzd("onVideoEvent", hashMap4);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzciyVar.getContext();
            int zzb5 = zzb(context2, map, "x", 0);
            int zzb6 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb6, 0);
            zza2.zzx(obtain);
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.zze.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            zza2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            zza2.zzr();
            return;
        }
        if ("loadControl".equals(str)) {
            zzc(zza2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zza2.zzs();
                return;
            } else {
                zza2.zzI();
                return;
            }
        }
        if ("pause".equals(str)) {
            zza2.zzu();
            return;
        }
        if ("play".equals(str)) {
            zza2.zzv();
            return;
        }
        if ("show".equals(str)) {
            zza2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr2[i3] = jSONArray.getString(i3);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                zzciyVar.zzC(num.intValue());
            }
            zza2.zzE(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzciyVar.getContext();
            zza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzciyVar.zzw();
            this.zza = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zza2.zzn();
                return;
            } else {
                com.google.android.gms.ads.internal.util.zze.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
