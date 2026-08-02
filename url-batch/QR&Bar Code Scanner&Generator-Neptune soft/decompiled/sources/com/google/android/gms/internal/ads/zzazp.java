package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzazp {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzazj[] zze = new zzazj[100];
    private final zzazj[] zza = new zzazj[1];

    public zzazp(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzc * 65536;
    }

    public final synchronized zzazj zzb() {
        zzazj zzazjVar;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzazj[] zzazjVarArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzazjVar = zzazjVarArr[i2];
            zzazjVarArr[i2] = null;
        } else {
            zzazjVar = new zzazj(new byte[65536], 0);
        }
        return zzazjVar;
    }

    public final synchronized void zzc(zzazj zzazjVar) {
        zzazj[] zzazjVarArr = this.zza;
        zzazjVarArr[0] = zzazjVar;
        zzd(zzazjVarArr);
    }

    public final synchronized void zzd(zzazj[] zzazjVarArr) {
        int length = this.zzd + zzazjVarArr.length;
        zzazj[] zzazjVarArr2 = this.zze;
        int length2 = zzazjVarArr2.length;
        if (length >= length2) {
            this.zze = (zzazj[]) Arrays.copyOf(zzazjVarArr2, Math.max(length2 + length2, length));
        }
        for (zzazj zzazjVar : zzazjVarArr) {
            byte[] bArr = zzazjVar.zza;
            zzazj[] zzazjVarArr3 = this.zze;
            int i = this.zzd;
            this.zzd = i + 1;
            zzazjVarArr3[i] = zzazjVar;
        }
        this.zzc -= zzazjVarArr.length;
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
        int max = Math.max(0, zzbar.zzd(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zze, max, i, (Object) null);
        this.zzd = max;
    }
}
