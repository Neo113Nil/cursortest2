package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzabs implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzael zzd;

    zzabs(zzaar zzaarVar, String str, String str2, zzael zzaelVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzd.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzaft zzaftVar;
        zzaji zzajiVar = new zzaji(zzahvVar.zzc(), this.zzb, this.zzc);
        zzaftVar = this.zza.zza;
        zzaftVar.zza(zzajiVar, new zzabr(this, this.zzd));
    }
}
