package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzayl {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzayf[] zze = new zzayf[100];
    private final zzayf[] zza = new zzayf[1];

    public zzayl(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzc * 65536;
    }

    public final synchronized zzayf zzb() {
        zzayf zzayfVar;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzayf[] zzayfVarArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzayfVar = zzayfVarArr[i2];
            zzayfVarArr[i2] = null;
        } else {
            zzayfVar = new zzayf(new byte[65536], 0);
        }
        return zzayfVar;
    }

    public final synchronized void zzc(zzayf zzayfVar) {
        zzayf[] zzayfVarArr = this.zza;
        zzayfVarArr[0] = zzayfVar;
        zzd(zzayfVarArr);
    }

    public final synchronized void zzd(zzayf[] zzayfVarArr) {
        int length = this.zzd + zzayfVarArr.length;
        zzayf[] zzayfVarArr2 = this.zze;
        int length2 = zzayfVarArr2.length;
        if (length >= length2) {
            this.zze = (zzayf[]) Arrays.copyOf(zzayfVarArr2, Math.max(length2 + length2, length));
        }
        for (zzayf zzayfVar : zzayfVarArr) {
            byte[] bArr = zzayfVar.zza;
            zzayf[] zzayfVarArr3 = this.zze;
            int i = this.zzd;
            this.zzd = i + 1;
            zzayfVarArr3[i] = zzayfVar;
        }
        this.zzc -= zzayfVarArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zzb;
        this.zzb = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzazn.zzd(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zze, max, i, (Object) null);
        this.zzd = max;
    }
}
