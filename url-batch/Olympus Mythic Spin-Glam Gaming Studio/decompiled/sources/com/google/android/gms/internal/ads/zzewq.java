package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzewq implements zzfdg {

    @Nullable
    @VisibleForTesting
    final ArrayList zza;

    public zzewq(@Nullable ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfml.zzg((Bundle) obj, "android_permissions", this.zza);
    }
}
