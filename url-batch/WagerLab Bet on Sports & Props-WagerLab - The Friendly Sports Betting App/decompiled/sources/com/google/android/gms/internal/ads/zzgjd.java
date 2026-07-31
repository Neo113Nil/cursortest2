package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgjd extends zzgjg {
    final /* synthetic */ zzgjk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgjd(zzgjk zzgjkVar) {
        super(zzgjkVar, null);
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzgji(this.zza, i);
    }
}
