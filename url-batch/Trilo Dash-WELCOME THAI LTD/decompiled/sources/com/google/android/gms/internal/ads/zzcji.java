package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcji implements zzbol {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                i = zzcfb.zzv(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzchf zzchfVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzchfVar.zzA(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzchfVar.zzz(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzchfVar.zzx(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzchfVar.zzy(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzchfVar.zzC(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        int i;
        zzchr zzchrVar = (zzchr) obj;
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
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchrVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchrVar.zzD(Color.parseColor(str3));
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
                zzchrVar.zzd("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzchrVar.zzd("onVideoEvent", hashMap3);
            return;
        }
        zzchg zzbp = zzchrVar.zzbp();
        if (zzbp == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = zzchrVar.getContext();
            int zzb = zzb(context, map, "x", 0);
            int zzb2 = zzb(context, map, "y", 0);
            int zzb3 = zzb(context, map, "w", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcT)).booleanValue()) {
                min = zzb3 == -1 ? zzchrVar.zzj() : Math.min(zzb3, zzchrVar.zzj());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate width with original width " + zzb3 + ", videoHost.getVideoBoundingWidth() " + zzchrVar.zzj() + ", x " + zzb + ".");
                }
                min = Math.min(zzb3, zzchrVar.zzj() - zzb);
            }
            int i2 = min;
            int zzb4 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcT)).booleanValue()) {
                min2 = zzb4 == -1 ? zzchrVar.zzi() : Math.min(zzb4, zzchrVar.zzi());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Calculate height with original height " + zzb4 + ", videoHost.getVideoBoundingHeight() " + zzchrVar.zzi() + ", y " + zzb2 + ".");
                }
                min2 = Math.min(zzb4, zzchrVar.zzi() - zzb2);
            }
            int i3 = min2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzbp.zza() != null) {
                zzbp.zzb(zzb, zzb2, i2, i3);
                return;
            }
            zzbp.zzc(zzb, zzb2, i2, i3, i, parseBoolean, new zzchq((String) map.get("flags")));
            zzchf zza = zzbp.zza();
            if (zza != null) {
                zzc(zza, map);
                return;
            }
            return;
        }
        zzcme zzs = zzchrVar.zzs();
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
        zzchf zza2 = zzbp.zza();
        if (zza2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzchrVar.zzd("onVideoEvent", hashMap4);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzchrVar.getContext();
            int zzb5 = zzb(context2, map, "x", 0);
            int zzb6 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb6, 0);
            zza2.zzw(obtain);
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
                zza2.zzv((int) (Float.parseFloat(str7) * 1000.0f));
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
            zza2.zzq();
            return;
        }
        if ("loadControl".equals(str)) {
            zzc(zza2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zza2.zzr();
                return;
            } else {
                zza2.zzH();
                return;
            }
        }
        if ("pause".equals(str)) {
            zza2.zzt();
            return;
        }
        if ("play".equals(str)) {
            zza2.zzu();
            return;
        }
        if ("show".equals(str)) {
            zza2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            Integer num = null;
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
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        strArr2[i4] = jSONArray.getString(i4);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                zzchrVar.zzC(num.intValue());
            }
            zza2.zzD(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzchrVar.getContext();
            zza2.zzG(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzchrVar.zzw();
            this.zza = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zza2.zzm();
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
            zza2.zzF(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
