package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzfuk extends zzfua {

    @CheckForNull
    private List zza;

    zzfuk(zzfrc zzfrcVar, boolean z) {
        super(zzfrcVar, true, true);
        List emptyList = zzfrcVar.isEmpty() ? Collections.emptyList() : zzfrv.zza(zzfrcVar.size());
        for (int i = 0; i < zzfrcVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfua
    final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfuj(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}
