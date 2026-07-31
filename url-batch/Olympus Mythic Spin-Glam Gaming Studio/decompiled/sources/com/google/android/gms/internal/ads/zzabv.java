package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzabv implements zzabp {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzabn[] zzd = new zzabn[100];

    public zzabv(boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized zzabn zza() {
        zzabn zzabnVar;
        try {
            this.zzb++;
            int i = this.zzc;
            if (i > 0) {
                zzabn[] zzabnVarArr = this.zzd;
                int i2 = i - 1;
                this.zzc = i2;
                zzabnVar = zzabnVarArr[i2];
                if (zzabnVar == null) {
                    throw null;
                }
                zzabnVarArr[i2] = null;
            } else {
                zzabnVar = new zzabn(new byte[65536], 0);
                int i3 = this.zzb;
                zzabn[] zzabnVarArr2 = this.zzd;
                int length = zzabnVarArr2.length;
                if (i3 > length) {
                    this.zzd = (zzabn[]) Arrays.copyOf(zzabnVarArr2, length + length);
                    return zzabnVar;
                }
            }
            return zzabnVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzb(zzabn zzabnVar) {
        zzabn[] zzabnVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzabnVarArr[i] = zzabnVar;
        this.zzb--;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzc(@Nullable zzabo zzaboVar) {
        while (zzaboVar != null) {
            zzabn[] zzabnVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzabnVarArr[i] = zzaboVar.zzd();
            this.zzb--;
            zzaboVar = zzaboVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzd() {
        int i = this.zza;
        String str = zzfm.zza;
        int max = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i2 = this.zzc;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.zzd, max, i2, (Object) null);
        this.zzc = max;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }

    public final synchronized int zzh() {
        return this.zzc * 65536;
    }
}
