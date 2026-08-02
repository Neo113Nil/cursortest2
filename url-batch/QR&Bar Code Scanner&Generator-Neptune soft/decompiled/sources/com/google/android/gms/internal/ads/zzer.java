package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzer implements zzex {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzfc zzd;

    protected zzer(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzex, com.google.android.gms.internal.ads.zzfu
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    protected final void zzg(int i) {
        zzfc zzfcVar = this.zzd;
        int i2 = zzen.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzfz) this.zzb.get(i3)).zza(this, zzfcVar, this.zza, i);
        }
    }

    protected final void zzh() {
        zzfc zzfcVar = this.zzd;
        int i = zzen.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzfz) this.zzb.get(i2)).zzb(this, zzfcVar, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzfc zzfcVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzfz) this.zzb.get(i)).zzc(this, zzfcVar, this.zza);
        }
    }

    protected final void zzj(zzfc zzfcVar) {
        this.zzd = zzfcVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzfz) this.zzb.get(i)).zzd(this, zzfcVar, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzf(zzfz zzfzVar) {
        Objects.requireNonNull(zzfzVar);
        if (this.zzb.contains(zzfzVar)) {
            return;
        }
        this.zzb.add(zzfzVar);
        this.zzc++;
    }
}
