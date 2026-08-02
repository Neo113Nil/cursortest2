package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgsa extends zzgsc {
    private zzgsa() {
        super(null);
    }

    /* synthetic */ zzgsa(zzgrz zzgrzVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    final List zza(Object obj, long j) {
        zzgrn zzgrnVar = (zzgrn) zzgui.zzh(obj, j);
        if (zzgrnVar.zzc()) {
            return zzgrnVar;
        }
        int size = zzgrnVar.size();
        zzgrn zzd = zzgrnVar.zzd(size == 0 ? 10 : size + size);
        zzgui.zzv(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    final void zzb(Object obj, long j) {
        ((zzgrn) zzgui.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    final void zzc(Object obj, Object obj2, long j) {
        zzgrn zzgrnVar = (zzgrn) zzgui.zzh(obj, j);
        zzgrn zzgrnVar2 = (zzgrn) zzgui.zzh(obj2, j);
        int size = zzgrnVar.size();
        int size2 = zzgrnVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgrnVar.zzc()) {
                zzgrnVar = zzgrnVar.zzd(size2 + size);
            }
            zzgrnVar.addAll(zzgrnVar2);
        }
        if (size > 0) {
            zzgrnVar2 = zzgrnVar;
        }
        zzgui.zzv(obj, j, zzgrnVar2);
    }
}
