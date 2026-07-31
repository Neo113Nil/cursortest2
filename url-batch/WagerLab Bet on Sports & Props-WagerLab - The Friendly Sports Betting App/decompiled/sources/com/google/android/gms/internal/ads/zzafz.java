package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzafz extends zzagh {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagh[] zzg;

    public zzafz(String str, int i, int i2, long j, long j2, zzagh[] zzaghVarArr) {
        super(ChapterFrame.ID);
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzaghVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc && this.zzd == zzafzVar.zzd && this.zze == zzafzVar.zze && Objects.equals(this.zza, zzafzVar.zza) && Arrays.equals(this.zzg, zzafzVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + 527;
        String str = this.zza;
        long j = this.zze;
        return (((((((i * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
