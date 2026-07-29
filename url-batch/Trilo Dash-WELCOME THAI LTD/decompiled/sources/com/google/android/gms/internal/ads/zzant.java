package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzant implements zzfmn {
    final /* synthetic */ zzfkn zza;

    zzant(zzanv zzanvVar, zzfkn zzfknVar) {
        this.zza = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
