package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahs {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzahs(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahs.class == obj.getClass()) {
            zzahs zzahsVar = (zzahs) obj;
            if (this.zza == zzahsVar.zza && this.zzc == zzahsVar.zzc && this.zzd == zzahsVar.zzd && Arrays.equals(this.zzb, zzahsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
