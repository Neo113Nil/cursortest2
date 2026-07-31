package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzezu implements zzggr {
    final /* synthetic */ zzezx zza;

    zzezu(zzezx zzezxVar) {
        Objects.requireNonNull(zzezxVar);
        this.zza = zzezxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzbuv zzbuvVar = (zzbuv) obj;
        zzezv zzezvVar = new zzezv(zzbuvVar, new zzffd(zzbuvVar.zzj), null);
        zzezx zzezxVar = this.zza;
        zzezxVar.zzd(zzezvVar);
        return zzezxVar.zzc();
    }
}
