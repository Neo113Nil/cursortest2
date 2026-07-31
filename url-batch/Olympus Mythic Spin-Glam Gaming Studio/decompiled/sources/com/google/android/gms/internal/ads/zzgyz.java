package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgyz extends zzgyy {
    final /* synthetic */ zzgza zza;

    zzgyz(zzgza zzgzaVar, int i) {
        Objects.requireNonNull(zzgzaVar);
        this.zza = zzgzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyy
    public final zzgyh zza() {
        return new zzgzc(this.zza.zza(), new zzgyx(2));
    }
}
