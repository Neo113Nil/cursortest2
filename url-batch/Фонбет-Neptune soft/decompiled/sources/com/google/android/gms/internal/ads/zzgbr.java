package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgbr extends zzgbt {
    zzgbr(zzfxm zzfxmVar, boolean z) {
        super(zzfxmVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfyh.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgbs zzgbsVar = (zzgbs) it.next();
            zza.add(zzgbsVar != null ? zzgbsVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
