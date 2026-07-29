package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzayk {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzayk(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        zzayy.zzc(j >= 0);
        zzayy.zzc(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            zzayy.zzc(z);
            this.zza = uri;
            this.zzb = j;
            this.zzc = j2;
            this.zzd = j3;
        }
        z = true;
        zzayy.zzc(z);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    public final String toString() {
        return "DataSpec[" + String.valueOf(this.zza) + ", " + Arrays.toString((byte[]) null) + ", " + this.zzb + ", " + this.zzc + ", " + this.zzd + ", null, 0]";
    }
}
