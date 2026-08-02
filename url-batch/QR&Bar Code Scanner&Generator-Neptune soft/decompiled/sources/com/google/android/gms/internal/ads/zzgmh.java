package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmh extends zzgra implements zzgsp {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgmh() {
        super(r0);
        zzgmk zzgmkVar;
        zzgmkVar = zzgmk.zzb;
    }

    public final zzgmh zza(zzgmj zzgmjVar) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        zzgmk.zzj((zzgmk) this.zza, zzgmjVar);
        return this;
    }

    public final zzgmh zzb(int i) {
        if (this.zzb) {
            zzaq();
            this.zzb = false;
        }
        ((zzgmk) this.zza).zze = i;
        return this;
    }

    public final List zzc() {
        return Collections.unmodifiableList(((zzgmk) this.zza).zzh());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzgmh(zzgmg zzgmgVar) {
        super(r1);
        zzgmk zzgmkVar;
        zzgmkVar = zzgmk.zzb;
    }
}
