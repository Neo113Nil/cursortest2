package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzfyq extends zzfyg {

    @CheckForNull
    private List zza;

    zzfyq(zzfvi zzfviVar, boolean z) {
        super(zzfviVar, true, true);
        List emptyList = zzfviVar.isEmpty() ? Collections.emptyList() : zzfwb.zza(zzfviVar.size());
        for (int i = 0; i < zzfviVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfyg
    final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzfyp(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyg
    final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}
