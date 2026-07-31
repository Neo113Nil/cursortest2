package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzffa implements zzfdi {
    private final JSONObject zza;

    zzffa(Context context) {
        this.zza = zzcbr.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznF)).booleanValue() ? zzhcy.zza(zzfey.zza) : zzhcy.zza(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzfez
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final /* synthetic */ void zza(Object obj) {
                zzffa.this.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 46;
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
