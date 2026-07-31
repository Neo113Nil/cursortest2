package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzhk implements zzhs {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;

    @Nullable
    private zzhw zzd;

    protected zzhk(boolean z) {
        this.zza = z;
    }

    protected final void zzf(zzhw zzhwVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zziq) this.zzb.get(i)).zza(this, zzhwVar, this.zza);
        }
    }

    protected final void zzg(zzhw zzhwVar) {
        this.zzd = zzhwVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zziq) this.zzb.get(i)).zzb(this, zzhwVar, this.zza);
        }
    }

    protected final void zzh(int i) {
        zzhw zzhwVar = this.zzd;
        String str = zzfm.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zziq) this.zzb.get(i2)).zzc(this, zzhwVar, this.zza, i);
        }
    }

    protected final void zzi() {
        zzhw zzhwVar = this.zzd;
        String str = zzfm.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((zziq) this.zzb.get(i)).zzd(this, zzhwVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zze(zziq zziqVar) {
        zziqVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zziqVar)) {
            return;
        }
        arrayList.add(zziqVar);
        this.zzc++;
    }
}
