package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzahq extends zzagw {
    final /* synthetic */ zzahk zza;
    final /* synthetic */ zzahr zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzahq(zzahr zzahrVar, zzahk zzahkVar, zzahk zzahkVar2) {
        super(zzahkVar);
        this.zza = zzahkVar2;
        Objects.requireNonNull(zzahrVar);
        this.zzb = zzahrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagw, com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        zzahi zzc = this.zza.zzc(j);
        zzahl zzahlVar = zzc.zza;
        long j2 = zzahlVar.zzb;
        zzahr zzahrVar = this.zzb;
        zzahl zzahlVar2 = new zzahl(j2, zzahlVar.zzc + zzahrVar.zza());
        zzahl zzahlVar3 = zzc.zzb;
        return new zzahi(zzahlVar2, new zzahl(zzahlVar3.zzb, zzahlVar3.zzc + zzahrVar.zza()));
    }
}
