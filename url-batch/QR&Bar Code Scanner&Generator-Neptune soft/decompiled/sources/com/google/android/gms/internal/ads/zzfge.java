package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfge {
    private final HashMap zza = new HashMap();

    public final zzfgd zza(zzffu zzffuVar, Context context, zzffm zzffmVar, zzfgk zzfgkVar) {
        zzfgd zzfgdVar = (zzfgd) this.zza.get(zzffuVar);
        if (zzfgdVar != null) {
            return zzfgdVar;
        }
        zzffr zzffrVar = new zzffr(zzffx.zza(zzffuVar, context));
        zzfgd zzfgdVar2 = new zzfgd(zzffrVar, new zzfgm(zzffrVar, zzffmVar, zzfgkVar));
        this.zza.put(zzffuVar, zzfgdVar2);
        return zzfgdVar2;
    }
}
