package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzczl implements zzhcv {
    final /* synthetic */ zzczp zza;

    zzczl(zzczp zzczpVar) {
        Objects.requireNonNull(zzczpVar);
        this.zza = zzczpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zza.zzk().zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzn(true);
    }
}
