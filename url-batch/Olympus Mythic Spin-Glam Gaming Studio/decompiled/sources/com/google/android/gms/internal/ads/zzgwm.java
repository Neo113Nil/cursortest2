package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgwm extends zzgwp {
    final /* synthetic */ zzgwt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgwm(zzgwt zzgwtVar) {
        super(zzgwtVar, null);
        Objects.requireNonNull(zzgwtVar);
        this.zza = zzgwtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzgwr(this.zza, i);
    }
}
