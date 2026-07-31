package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfku implements Comparator {
    final /* synthetic */ zzflb zza;

    zzfku(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzfks zzfksVar = (zzfks) obj;
        zzfks zzfksVar2 = (zzfks) obj2;
        Object zza = zzfksVar2.zza();
        zzflb zzflbVar = this.zza;
        int compare = Double.compare(zzflb.zzD(zzflbVar.zzb(zza)), zzflb.zzD(zzflbVar.zzb(zzfksVar.zza())));
        return compare == 0 ? Long.compare(zzfksVar.zzd(), zzfksVar2.zzd()) : compare;
    }
}
