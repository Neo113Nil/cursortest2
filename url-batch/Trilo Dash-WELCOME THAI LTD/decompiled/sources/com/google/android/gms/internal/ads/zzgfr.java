package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfr extends zzgkk implements zzglz {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgfr() {
        super(r0);
        zzgfu zzgfuVar;
        zzgfuVar = zzgfu.zzb;
    }

    public final zzgfr zza(zzgft zzgftVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgfu.zzj((zzgfu) this.zza, zzgftVar);
        return this;
    }

    public final zzgfr zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfu) this.zza).zze = i;
        return this;
    }

    public final List zzc() {
        return Collections.unmodifiableList(((zzgfu) this.zza).zzh());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzgfr(zzgfq zzgfqVar) {
        super(r1);
        zzgfu zzgfuVar;
        zzgfuVar = zzgfu.zzb;
    }
}
