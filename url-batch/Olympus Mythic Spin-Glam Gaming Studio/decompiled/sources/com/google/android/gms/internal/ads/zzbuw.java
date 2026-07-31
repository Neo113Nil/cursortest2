package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final /* synthetic */ class zzbuw implements zzbus {
    static final /* synthetic */ zzbuw zza = new zzbuw();

    private /* synthetic */ zzbuw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final /* synthetic */ Object zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
