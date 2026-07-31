package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaiy implements zzagh {
    private final zzagh zza;

    @Nullable
    private final zzagh zzb;
    private zzagk zzc;
    private zzagh zzd;

    @Nullable
    private Pair zze;

    public zzaiy() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        if (zzaiz.zza(zzagiVar, true)) {
            return true;
        }
        zzagiVar.zzl();
        return zzaiz.zza(zzagiVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzc = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        if (this.zzd == null) {
            zzagh zzaghVar = this.zzb;
            if (!zzaghVar.zza(zzagiVar)) {
                zzaghVar = this.zza;
            }
            this.zzd = zzaghVar;
            zzagiVar.zzl();
            Pair pair = this.zze;
            if (pair != null) {
                this.zzd.zze(((Long) pair.first).longValue(), ((Long) this.zze.second).longValue());
                this.zze = null;
            }
            zzagh zzaghVar2 = this.zzd;
            zzagk zzagkVar = this.zzc;
            zzagkVar.getClass();
            zzaghVar2.zzc(zzagkVar);
        }
        return this.zzd.zzd(zzagiVar, zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        zzagh zzaghVar = this.zzd;
        if (zzaghVar != null) {
            zzaghVar.zze(j, j2);
        } else {
            this.zze = Pair.create(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
        this.zzb.zzf();
    }

    public zzaiy(int i) {
        this.zza = new zzahm(-1, -1, "image/heif");
        this.zzb = new zzaix();
    }
}
