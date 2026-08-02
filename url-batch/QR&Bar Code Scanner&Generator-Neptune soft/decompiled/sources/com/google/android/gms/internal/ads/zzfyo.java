package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfyo extends zzfyq {
    zzfyo(zzfvi zzfviVar, boolean z) {
        super(zzfviVar, true);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfyq
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfwb.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfyp zzfypVar = (zzfyp) it.next();
            zza.add(zzfypVar != null ? zzfypVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
