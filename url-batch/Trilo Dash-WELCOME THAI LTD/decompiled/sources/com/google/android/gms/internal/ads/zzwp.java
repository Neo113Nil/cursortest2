package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzwp {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzwo) obj).zza - ((zzwo) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzwm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzwo) obj).zzc, ((zzwo) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzwo[] zzd = new zzwo[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzwp(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzwo zzwoVar = (zzwo) this.zzc.get(i2);
            i += zzwoVar.zzb;
            if (i >= f2) {
                return zzwoVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzwo) this.zzc.get(r5.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzwo zzwoVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzwo[] zzwoVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzwoVar = zzwoVarArr[i3];
        } else {
            zzwoVar = new zzwo(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzwoVar.zza = i4;
        zzwoVar.zzb = i;
        zzwoVar.zzc = f;
        this.zzc.add(zzwoVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzwo zzwoVar2 = (zzwo) this.zzc.get(0);
            int i7 = zzwoVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzwo[] zzwoVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzwoVarArr2[i8] = zzwoVar2;
                }
            } else {
                zzwoVar2.zzb = i7 - i6;
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
