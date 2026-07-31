package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzfar implements zzfdg {
    private final Boolean zza;

    public zzfar(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.zza;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
