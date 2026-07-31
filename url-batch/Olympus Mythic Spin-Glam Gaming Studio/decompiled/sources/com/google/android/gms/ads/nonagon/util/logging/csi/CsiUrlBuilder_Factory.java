package com.google.android.gms.ads.nonagon.util.logging.csi;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzinw;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class CsiUrlBuilder_Factory implements zzinw<CsiUrlBuilder> {
    @NonNull
    public static CsiUrlBuilder_Factory create() {
        return zza.zza;
    }

    @NonNull
    public static CsiUrlBuilder newInstance() {
        return new CsiUrlBuilder();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    @NonNull
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiUrlBuilder zzb() {
        return newInstance();
    }
}
