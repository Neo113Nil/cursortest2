package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzek implements zzer {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzew zzd;

    protected zzek(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    protected final void zzg(int i) {
        zzew zzewVar = this.zzd;
        int i2 = zzeg.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzft) this.zzb.get(i3)).zza(this, zzewVar, this.zza, i);
        }
    }

    protected final void zzh() {
        zzew zzewVar = this.zzd;
        int i = zzeg.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzft) this.zzb.get(i2)).zzb(this, zzewVar, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzew zzewVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzft) this.zzb.get(i)).zzc(this, zzewVar, this.zza);
        }
    }

    protected final void zzj(zzew zzewVar) {
        this.zzd = zzewVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzft) this.zzb.get(i)).zzd(this, zzewVar, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzf(zzft zzftVar) {
        Objects.requireNonNull(zzftVar);
        if (this.zzb.contains(zzftVar)) {
            return;
        }
        this.zzb.add(zzftVar);
        this.zzc++;
    }
}
