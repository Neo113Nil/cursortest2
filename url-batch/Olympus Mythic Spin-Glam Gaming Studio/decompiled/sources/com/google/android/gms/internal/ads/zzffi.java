package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzffi implements zzfdg {
    private final List zza;

    public zzffi(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put(TelemetryCategory.EID, TextUtils.join(StringUtils.COMMA, this.zza));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }
}
