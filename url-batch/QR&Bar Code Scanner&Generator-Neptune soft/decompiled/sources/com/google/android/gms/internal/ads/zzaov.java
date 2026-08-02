package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaov implements zzfos {
    final /* synthetic */ zzfms zza;

    zzaov(zzaox zzaoxVar, zzfms zzfmsVar) {
        this.zza = zzfmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
