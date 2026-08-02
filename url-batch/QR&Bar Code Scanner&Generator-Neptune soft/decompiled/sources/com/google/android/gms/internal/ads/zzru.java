package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzru {
    private final zzzp zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzew zze;

    public zzru(zzzp zzzpVar) {
        this.zza = zzzpVar;
    }

    public final void zza(zzew zzewVar) {
        if (zzewVar != this.zze) {
            this.zze = zzewVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
