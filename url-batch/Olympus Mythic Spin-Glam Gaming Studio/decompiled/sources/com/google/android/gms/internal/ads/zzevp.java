package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevp implements zzfdg {

    @Nullable
    private final String zza;

    public zzevp(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((Bundle) obj).putString("ms", this.zza);
    }
}
