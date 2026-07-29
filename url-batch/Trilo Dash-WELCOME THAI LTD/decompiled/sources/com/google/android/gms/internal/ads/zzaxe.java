package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaxe implements zzaxa {
    private final zzaxa[] zza;
    private final ArrayList zzb;
    private zzawz zzd;
    private zzasd zze;
    private zzaxd zzg;
    private final zzasc zzc = new zzasc();
    private int zzf = -1;

    public zzaxe(zzaxa... zzaxaVarArr) {
        this.zza = zzaxaVarArr;
        this.zzb = new ArrayList(Arrays.asList(zzaxaVarArr));
    }

    static /* bridge */ /* synthetic */ void zzf(zzaxe zzaxeVar, int i, zzasd zzasdVar, Object obj) {
        zzaxd zzaxdVar;
        if (zzaxeVar.zzg == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzasdVar.zzg(i2, zzaxeVar.zzc, false);
            }
            int i3 = zzaxeVar.zzf;
            if (i3 == -1) {
                zzaxeVar.zzf = 1;
            } else if (i3 != 1) {
                zzaxdVar = new zzaxd(1);
                zzaxeVar.zzg = zzaxdVar;
            }
            zzaxdVar = null;
            zzaxeVar.zzg = zzaxdVar;
        }
        if (zzaxeVar.zzg != null) {
            return;
        }
        zzaxeVar.zzb.remove(zzaxeVar.zza[i]);
        if (i == 0) {
            zzaxeVar.zze = zzasdVar;
        }
        if (zzaxeVar.zzb.isEmpty()) {
            zzaxeVar.zzd.zzg(zzaxeVar.zze, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zza() throws IOException {
        zzaxd zzaxdVar = this.zzg;
        if (zzaxdVar != null) {
            throw zzaxdVar;
        }
        for (zzaxa zzaxaVar : this.zza) {
            zzaxaVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzb(zzari zzariVar, boolean z, zzawz zzawzVar) {
        this.zzd = zzawzVar;
        int i = 0;
        while (true) {
            zzaxa[] zzaxaVarArr = this.zza;
            if (i >= zzaxaVarArr.length) {
                return;
            }
            zzaxaVarArr[i].zzb(zzariVar, false, new zzaxc(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzc(zzawy zzawyVar) {
        zzaxb zzaxbVar = (zzaxb) zzawyVar;
        int i = 0;
        while (true) {
            zzaxa[] zzaxaVarArr = this.zza;
            if (i >= zzaxaVarArr.length) {
                return;
            }
            zzaxaVarArr[i].zzc(zzaxbVar.zza[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final void zzd() {
        for (zzaxa zzaxaVar : this.zza) {
            zzaxaVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxa
    public final zzawy zze(int i, zzayl zzaylVar) {
        int length = this.zza.length;
        zzawy[] zzawyVarArr = new zzawy[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzawyVarArr[i2] = this.zza[i2].zze(i, zzaylVar);
        }
        return new zzaxb(zzawyVarArr);
    }
}
