package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzxb {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwx
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzxa) obj).zza - ((zzxa) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzxa) obj).zzc, ((zzxa) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzxa[] zzd = new zzxa[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzxb(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzxa zzxaVar = (zzxa) this.zzc.get(i2);
            i += zzxaVar.zzb;
            if (i >= f2) {
                return zzxaVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzxa) this.zzc.get(r5.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzxa zzxaVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzxa[] zzxaVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzxaVar = zzxaVarArr[i3];
        } else {
            zzxaVar = new zzxa(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzxaVar.zza = i4;
        zzxaVar.zzb = i;
        zzxaVar.zzc = f;
        this.zzc.add(zzxaVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzxa zzxaVar2 = (zzxa) this.zzc.get(0);
            int i7 = zzxaVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzxa[] zzxaVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzxaVarArr2[i8] = zzxaVar2;
                }
            } else {
                zzxaVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
