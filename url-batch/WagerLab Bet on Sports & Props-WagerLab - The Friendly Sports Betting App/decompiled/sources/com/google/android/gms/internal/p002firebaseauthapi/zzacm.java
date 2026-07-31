package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzacm implements zzafv<zzahv> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    zzacm(zzaar zzaarVar, String str, zzael zzaelVar) {
        this.zza = str;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        String zzc = zzahvVar2.zzc();
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzc).zzf(this.zza);
        zzaar.zza(this.zzc, this.zzb, zzahvVar2, zzailVar, this);
    }
}
