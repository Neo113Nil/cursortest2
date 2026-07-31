package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzio;
import com.google.android.gms.measurement.internal.zzlw;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes10.dex */
final class zza extends zzc {
    private final zzio zza;
    private final zzlw zzb;

    public zza(zzio zzioVar) {
        super(null);
        Preconditions.checkNotNull(zzioVar);
        this.zza = zzioVar;
        this.zzb = zzioVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final int zza(String str) {
        this.zzb.zzi(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final long zzb() {
        return this.zza.zzw().zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzh() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzi() {
        return this.zzb.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzj() {
        return this.zzb.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzk() {
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final List zzm(String str, String str2) {
        return this.zzb.zzv(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final Map zzo(String str, String str2, boolean z) {
        return this.zzb.zzx(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzp(String str) {
        zzio zzioVar = this.zza;
        zzioVar.zzd().zzd(str, zzioVar.zzaU().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq().zzJ(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzr(String str) {
        zzio zzioVar = this.zza;
        zzioVar.zzd().zze(str, zzioVar.zzaU().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zzb.zzO(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzv(Bundle bundle) {
        this.zzb.zzad(bundle);
    }
}
