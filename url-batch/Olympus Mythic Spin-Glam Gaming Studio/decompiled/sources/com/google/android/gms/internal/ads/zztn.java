package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zztn implements zzqx {
    final /* synthetic */ zztw zza;
    private final zzri zzb;

    /* synthetic */ zztn(zztw zztwVar, zzri zzriVar, byte[] bArr) {
        Objects.requireNonNull(zztwVar);
        this.zza = zztwVar;
        this.zzb = zzriVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zza(long j) {
        zztw zztwVar = this.zza;
        if (equals(zztwVar.zzK()) && zztwVar.zzL() != null) {
            zzuc zzucVar = ((zzub) zztwVar.zzL()).zza;
            zzucVar.zzaE(true);
            zzucVar.zzaB().zzd(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = ((com.google.android.gms.internal.ads.zzub) r0.zzL()).zza.zzbe();
     */
    @Override // com.google.android.gms.internal.ads.zzqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb() {
        zznd zzbe;
        zztw zztwVar = this.zza;
        if (equals(zztwVar.zzK()) && zztwVar.zzL() != null && zztwVar.zzQ() && zzbe != null) {
            zzbe.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzc() {
        zztw zztwVar = this.zza;
        if (equals(zztwVar.zzK()) && zztwVar.zzO()) {
            zztwVar.zzP(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzd() {
        long j;
        zztw zztwVar = this.zza;
        if (equals(zztwVar.zzK()) && zztwVar.zzL() != null) {
            if (zztwVar.zzM().zzi() != -1) {
                long zzi = zztwVar.zzM().zzj().zze / zztwVar.zzM().zzi();
                zzqz zzN = zztwVar.zzN();
                zzN.getClass();
                j = zzfm.zzu(zzi, zzN.zzi());
            } else {
                j = -9223372036854775807L;
            }
            ((zzub) zztwVar.zzL()).zza.zzaB().zze(zztwVar.zzM().zzj().zze, zzfm.zzs(j), SystemClock.elapsedRealtime() - zztwVar.zzR());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zze() {
        AtomicInteger atomicInteger;
        atomicInteger = zztw.zza;
        atomicInteger.getAndDecrement();
        zztw zztwVar = this.zza;
        if (zztwVar.zzL() != null) {
            zzri zzriVar = this.zzb;
            ((zzub) zztwVar.zzL()).zza.zzaB().zzl(new zzsc(zzriVar.zza, zzriVar.zzb, zzriVar.zzc, false, false, zzriVar.zze));
        }
    }
}
