package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
abstract class zzgoe extends zzgnv {
    private List zza;

    zzgoe(zzgjv zzgjvVar, boolean z) {
        super(zzgjvVar, z, true);
        List emptyList = zzgjvVar.isEmpty() ? Collections.emptyList() : zzgkp.zzb(zzgjvVar.size());
        for (int i = 0; i < zzgjvVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzw(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgod(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
