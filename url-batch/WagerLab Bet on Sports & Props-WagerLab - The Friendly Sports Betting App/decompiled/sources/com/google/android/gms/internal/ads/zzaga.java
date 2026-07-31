package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaga extends zzagh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagh[] zze;

    public zzaga(String str, boolean z, boolean z2, String[] strArr, zzagh[] zzaghVarArr) {
        super(ChapterTocFrame.ID);
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzaghVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaga zzagaVar = (zzaga) obj;
            if (this.zzb == zzagaVar.zzb && this.zzc == zzagaVar.zzc && Objects.equals(this.zza, zzagaVar.zza) && Arrays.equals(this.zzd, zzagaVar.zzd) && Arrays.equals(this.zze, zzagaVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
