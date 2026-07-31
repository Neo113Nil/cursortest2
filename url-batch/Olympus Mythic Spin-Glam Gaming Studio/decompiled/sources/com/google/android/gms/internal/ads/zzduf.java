package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzduf {
    private final Executor zza;
    private final zzdua zzb;
    private final zzeae zzc;

    zzduf(Executor executor, zzdua zzduaVar, zzeae zzeaeVar) {
        this.zza = executor;
        this.zzb = zzduaVar;
        this.zzc = zzeaeVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zza;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzhcy.zza(Collections.emptyList());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcZ)).booleanValue()) {
            this.zzc.zzf(zzdzs.NATIVE_ASSETS_LOADING_CUSTOM_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zza = zzhcy.zza(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zza = zzhcy.zza(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zza = "string".equals(optString2) ? zzhcy.zza(new zzduc(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzhcy.zzk(this.zzb.zza(optJSONObject, "image_value", null), new zzgub() { // from class: com.google.android.gms.internal.ads.zzdud
                        @Override // com.google.android.gms.internal.ads.zzgub
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzduc(optString, (zzbmg) obj);
                        }
                    }, this.zza) : zzhcy.zza(null);
                }
            }
            arrayList.add(zza);
        }
        return zzhcy.zzk(zzhcy.zzm(arrayList), zzdue.zza, this.zza);
    }
}
