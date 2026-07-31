package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzup implements zzus {
    zzup() {
    }

    @Override // com.google.android.gms.internal.ads.zzus
    @Nullable
    public final zzul zza(@Nullable zzun zzunVar, zzv zzvVar) {
        if (zzvVar.zzt == null) {
            return null;
        }
        return new zzut(new zzuk(new zzuu(1), 6001));
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final int zzb(zzv zzvVar) {
        return zzvVar.zzt != null ? 1 : 0;
    }
}
