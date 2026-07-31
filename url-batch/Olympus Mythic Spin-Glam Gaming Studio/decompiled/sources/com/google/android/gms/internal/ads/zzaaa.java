package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public class zzaaa implements zzabe {
    protected final zzbg zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzv[] zzd;
    private int zze;

    public zzaaa(zzbg zzbgVar, int[] iArr, int i) {
        int length = iArr.length;
        zzguk.zzi(length > 0);
        zzbgVar.getClass();
        this.zza = zzbgVar;
        this.zzb = length;
        this.zzd = new zzv[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbgVar.zza(iArr[i2]);
        }
        Arrays.sort(this.zzd, zzzz.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbgVar.zzb(this.zzd[i3]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaaa zzaaaVar = (zzaaa) obj;
            if (this.zza.equals(zzaaaVar.zza) && Arrays.equals(this.zzc, zzaaaVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final zzv zzb(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final zzv zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zzf(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzabj
    public final int zzg(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    public final int zzh() {
        return this.zzc[0];
    }
}
