package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzazt implements Comparator {
    public zzazt(zzazu zzazuVar) {
        Objects.requireNonNull(zzazuVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazj zzazjVar = (zzazj) obj;
        zzazj zzazjVar2 = (zzazj) obj2;
        if (zzazjVar.zzb() < zzazjVar2.zzb()) {
            return -1;
        }
        if (zzazjVar.zzb() > zzazjVar2.zzb()) {
            return 1;
        }
        if (zzazjVar.zza() < zzazjVar2.zza()) {
            return -1;
        }
        if (zzazjVar.zza() > zzazjVar2.zza()) {
            return 1;
        }
        float zzd = (zzazjVar.zzd() - zzazjVar.zzb()) * (zzazjVar.zzc() - zzazjVar.zza());
        float zzd2 = (zzazjVar2.zzd() - zzazjVar2.zzb()) * (zzazjVar2.zzc() - zzazjVar2.zza());
        if (zzd > zzd2) {
            return -1;
        }
        return zzd < zzd2 ? 1 : 0;
    }
}
