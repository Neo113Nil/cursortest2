package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzayi implements zzaye {
    private final zzaye[] zza;
    private final ArrayList zzb;
    private zzayd zzd;
    private zzath zze;
    private zzayh zzg;
    private final zzatg zzc = new zzatg();
    private int zzf = -1;

    public zzayi(zzaye... zzayeVarArr) {
        this.zza = zzayeVarArr;
        this.zzb = new ArrayList(Arrays.asList(zzayeVarArr));
    }

    static /* bridge */ /* synthetic */ void zzf(zzayi zzayiVar, int i, zzath zzathVar, Object obj) {
        zzayh zzayhVar;
        if (zzayiVar.zzg == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzathVar.zzg(i2, zzayiVar.zzc, false);
            }
            int i3 = zzayiVar.zzf;
            if (i3 == -1) {
                zzayiVar.zzf = 1;
            } else if (i3 != 1) {
                zzayhVar = new zzayh(1);
                zzayiVar.zzg = zzayhVar;
            }
            zzayhVar = null;
            zzayiVar.zzg = zzayhVar;
        }
        if (zzayiVar.zzg != null) {
            return;
        }
        zzayiVar.zzb.remove(zzayiVar.zza[i]);
        if (i == 0) {
            zzayiVar.zze = zzathVar;
        }
        if (zzayiVar.zzb.isEmpty()) {
            zzayiVar.zzd.zzg(zzayiVar.zze, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zza() throws IOException {
        zzayh zzayhVar = this.zzg;
        if (zzayhVar != null) {
            throw zzayhVar;
        }
        for (zzaye zzayeVar : this.zza) {
            zzayeVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzb(zzasm zzasmVar, boolean z, zzayd zzaydVar) {
        this.zzd = zzaydVar;
        int i = 0;
        while (true) {
            zzaye[] zzayeVarArr = this.zza;
            if (i >= zzayeVarArr.length) {
                return;
            }
            zzayeVarArr[i].zzb(zzasmVar, false, new zzayg(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzc(zzayc zzaycVar) {
        zzayf zzayfVar = (zzayf) zzaycVar;
        int i = 0;
        while (true) {
            zzaye[] zzayeVarArr = this.zza;
            if (i >= zzayeVarArr.length) {
                return;
            }
            zzayeVarArr[i].zzc(zzayfVar.zza[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzd() {
        for (zzaye zzayeVar : this.zza) {
            zzayeVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final zzayc zze(int i, zzazp zzazpVar) {
        int length = this.zza.length;
        zzayc[] zzaycVarArr = new zzayc[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaycVarArr[i2] = this.zza[i2].zze(i, zzazpVar);
        }
        return new zzayf(zzaycVarArr);
    }
}
