package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeww implements zzfdg {

    @Nullable
    @VisibleForTesting
    final String zza;

    @VisibleForTesting
    final int zzb;

    public zzeww(@Nullable String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        Bundle zza = zzfml.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", str);
        zza.putInt("pvid_s", i);
    }
}
