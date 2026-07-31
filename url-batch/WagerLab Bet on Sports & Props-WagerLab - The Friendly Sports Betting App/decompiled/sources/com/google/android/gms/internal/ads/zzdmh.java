package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdmh {
    private final Executor zza;
    private final zzdmc zzb;
    private final zzdsg zzc;

    zzdmh(Executor executor, zzdmc zzdmcVar, zzdsg zzdsgVar) {
        this.zza = executor;
        this.zzb = zzdmcVar;
        this.zzc = zzdsgVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgot.zza(Collections.emptyList());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcy)).booleanValue()) {
            this.zzc.zze().putLong(zzdru.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = zzgot.zza(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = zzgot.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zza = TypedValues.Custom.S_STRING.equals(optString2) ? zzgot.zza(new zzdme(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgot.zzk(this.zzb.zza(optJSONObject, "image_value", null), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdmf
                        @Override // com.google.android.gms.internal.ads.zzggr
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdme(optString, (zzbfh) obj);
                        }
                    }, this.zza) : zzgot.zza(null);
                }
            }
            arrayList.add(zza);
        }
        return zzgot.zzk(zzgot.zzl(arrayList), zzdmg.zza, this.zza);
    }
}
