package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzflg {
    private static final zzflg zza = new zzflg();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzflg() {
    }

    public static zzflg zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfkv zzfkvVar) {
        this.zzb.add(zzfkvVar);
    }

    public final void zze(zzfkv zzfkvVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzfkvVar);
        this.zzc.remove(zzfkvVar);
        if (!zzg || zzg()) {
            return;
        }
        zzflm.zzb().zzf();
    }

    public final void zzf(zzfkv zzfkvVar) {
        boolean zzg = zzg();
        this.zzc.add(zzfkvVar);
        if (zzg) {
            return;
        }
        zzflm.zzb().zze();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
