package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
final class zzh implements zzj {
    final /* synthetic */ Set zza;
    final /* synthetic */ zzs zzb;
    final /* synthetic */ zzm zzc;

    zzh(zzm zzmVar, Set set, zzs zzsVar) {
        this.zzc = zzmVar;
        this.zza = set;
        this.zzb = zzsVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzj
    public final void zza(ZipFile zipFile, Set set) throws IOException {
        this.zza.addAll(zzm.zza(this.zzc, set, this.zzb, zipFile));
    }
}
