package com.google.android.gms.internal.ads;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public class zzbyy {
    private final zzclm zza;
    private final String zzb;

    public zzbyy(zzclm zzclmVar, String str) {
        this.zza = zzclmVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzclm zzclmVar = this.zza;
            if (zzclmVar != null) {
                zzclmVar.zzd("onError", put);
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put(POBConstants.KEY_JS, str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put(VastAttributes.HORIZONTAL_POSITION, i).put(VastAttributes.VERTICAL_POSITION, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put(VastAttributes.HORIZONTAL_POSITION, i).put(VastAttributes.VERTICAL_POSITION, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e);
        }
    }

    public final void zzl(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e);
        }
    }
}
