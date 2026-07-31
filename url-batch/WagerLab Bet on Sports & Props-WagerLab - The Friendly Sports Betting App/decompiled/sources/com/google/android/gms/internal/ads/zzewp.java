package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzewp implements zzeun {
    private final List zza;

    public zzewp(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(f.f598a, this.zza));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting experiment ids.");
        }
    }
}
