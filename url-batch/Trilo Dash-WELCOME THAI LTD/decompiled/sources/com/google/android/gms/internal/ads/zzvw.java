package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzvw {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzvp[] zzd = new zzvp[100];

    public zzvw(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzvp zzb() {
        zzvp zzvpVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzvp[] zzvpVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzvpVar = zzvpVarArr[i2];
            Objects.requireNonNull(zzvpVar);
            zzvpVarArr[i2] = null;
        } else {
            zzvpVar = new zzvp(new byte[65536], 0);
            int i3 = this.zzb;
            zzvp[] zzvpVarArr2 = this.zzd;
            int length = zzvpVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzvp[]) Arrays.copyOf(zzvpVarArr2, length + length);
                return zzvpVar;
            }
        }
        return zzvpVar;
    }

    public final synchronized void zzc(zzvp zzvpVar) {
        zzvp[] zzvpVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzvpVarArr[i] = zzvpVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzvq zzvqVar) {
        while (zzvqVar != null) {
            zzvp[] zzvpVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzvpVarArr[i] = zzvqVar.zzc();
            this.zzb--;
            zzvqVar = zzvqVar.zzd();
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
        int max = Math.max(0, zzeg.zze(this.zza, 65536) - this.zzb);
        int i = this.zzc;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zzd, max, i, (Object) null);
        this.zzc = max;
    }
}
