package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzwi {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzwb[] zzd = new zzwb[100];

    public zzwi(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzwb zzb() {
        zzwb zzwbVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzwb[] zzwbVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzwbVar = zzwbVarArr[i2];
            Objects.requireNonNull(zzwbVar);
            zzwbVarArr[i2] = null;
        } else {
            zzwbVar = new zzwb(new byte[65536], 0);
            int i3 = this.zzb;
            zzwb[] zzwbVarArr2 = this.zzd;
            int length = zzwbVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzwb[]) Arrays.copyOf(zzwbVarArr2, length + length);
                return zzwbVar;
            }
        }
        return zzwbVar;
    }

    public final synchronized void zzc(zzwb zzwbVar) {
        zzwb[] zzwbVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzwbVarArr[i] = zzwbVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzwc zzwcVar) {
        while (zzwcVar != null) {
            zzwb[] zzwbVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzwbVarArr[i] = zzwcVar.zzc();
            this.zzb--;
            zzwcVar = zzwcVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzen.zze(this.zza, 65536) - this.zzb);
        int i = this.zzc;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zzd, max, i, (Object) null);
        this.zzc = max;
    }
}
