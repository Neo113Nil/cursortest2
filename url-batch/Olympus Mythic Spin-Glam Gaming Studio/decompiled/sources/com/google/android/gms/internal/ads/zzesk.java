package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
final class zzesk implements zzdom {
    final /* synthetic */ zzfld zza;

    zzesk(zzesn zzesnVar, zzfld zzfldVar) {
        this.zza = zzfldVar;
        Objects.requireNonNull(zzesnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void zza(boolean z, Context context, @Nullable zzdec zzdecVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    @Nullable
    public final zzfld zzb() {
        return this.zza;
    }
}
