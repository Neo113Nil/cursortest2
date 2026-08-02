package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.firebase.database.core.ServerValues;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcvg implements zzbud {
    private final Context zza;
    private final zzbbm zzb;
    private final PowerManager zzc;

    public zzcvg(Context context, zzbbm zzbbmVar) {
        this.zza = context;
        this.zzb = zzbbmVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcvj zzcvjVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbbp zzbbpVar = zzcvjVar.zzf;
        if (zzbbpVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbbpVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put(ServerValues.NAME_OP_TIMESTAMP, zzcvjVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z2 = zzcvjVar.zzc;
            put.put("isStopped", false).put("isPaused", zzcvjVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.zzc.isInteractive() : this.zzc.isScreenOn()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeN)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbbpVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzbbpVar.zzc.top).put("bottom", zzbbpVar.zzc.bottom).put("left", zzbbpVar.zzc.left).put("right", zzbbpVar.zzc.right)).put("adBox", new JSONObject().put("top", zzbbpVar.zzd.top).put("bottom", zzbbpVar.zzd.bottom).put("left", zzbbpVar.zzd.left).put("right", zzbbpVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbbpVar.zze.top).put("bottom", zzbbpVar.zze.bottom).put("left", zzbbpVar.zze.left).put("right", zzbbpVar.zze.right)).put("globalVisibleBoxVisible", zzbbpVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzbbpVar.zzg.top).put("bottom", zzbbpVar.zzg.bottom).put("left", zzbbpVar.zzg.left).put("right", zzbbpVar.zzg.right)).put("localVisibleBoxVisible", zzbbpVar.zzh).put("hitBox", new JSONObject().put("top", zzbbpVar.zzi.top).put("bottom", zzbbpVar.zzi.bottom).put("left", zzbbpVar.zzi.left).put("right", zzbbpVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcvjVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbbpVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcvjVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
