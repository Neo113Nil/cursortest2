package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbat implements zzfzy {
    final /* synthetic */ zzfyd zza;

    zzbat(zzbav zzbavVar, zzfyd zzfydVar) {
        this.zza = zzfydVar;
        Objects.requireNonNull(zzbavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
