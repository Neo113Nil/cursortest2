package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgmk extends zzgiy {
    final zzgmo zza;
    zzgja zzb = zzb();
    final /* synthetic */ zzgmq zzc;

    zzgmk(zzgmq zzgmqVar) {
        this.zzc = zzgmqVar;
        this.zza = new zzgmo(zzgmqVar, null);
    }

    private final zzgja zzb() {
        zzgmo zzgmoVar = this.zza;
        if (zzgmoVar.hasNext()) {
            return zzgmoVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgja
    public final byte zza() {
        zzgja zzgjaVar = this.zzb;
        if (zzgjaVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzgjaVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
