package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.firebase.database.core.ServerValues;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcob implements zzbnh {
    private final Context zza;
    private final zzaxs zzb;
    private final PowerManager zzc;

    public zzcob(Context context, zzaxs zzaxsVar) {
        this.zza = context;
        this.zzb = zzaxsVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcoe zzcoeVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzaxv zzaxvVar = zzcoeVar.zzf;
        if (zzaxvVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzaxvVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put(ServerValues.NAME_OP_TIMESTAMP, zzcoeVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z2 = zzcoeVar.zzc;
            put.put("isStopped", false).put("isPaused", zzcoeVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzu.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzu.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzac.zzb(this.zza.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzaxvVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzaxvVar.zzc.top).put("bottom", zzaxvVar.zzc.bottom).put("left", zzaxvVar.zzc.left).put("right", zzaxvVar.zzc.right)).put("adBox", new JSONObject().put("top", zzaxvVar.zzd.top).put("bottom", zzaxvVar.zzd.bottom).put("left", zzaxvVar.zzd.left).put("right", zzaxvVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzaxvVar.zze.top).put("bottom", zzaxvVar.zze.bottom).put("left", zzaxvVar.zze.left).put("right", zzaxvVar.zze.right)).put("globalVisibleBoxVisible", zzaxvVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzaxvVar.zzg.top).put("bottom", zzaxvVar.zzg.bottom).put("left", zzaxvVar.zzg.left).put("right", zzaxvVar.zzg.right)).put("localVisibleBoxVisible", zzaxvVar.zzh).put("hitBox", new JSONObject().put("top", zzaxvVar.zzi.top).put("bottom", zzaxvVar.zzi.bottom).put("left", zzaxvVar.zzi.left).put("right", zzaxvVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcoeVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbg)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzaxvVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcoeVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
