package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdge extends zzdjn implements zzdej, zzdfo {
    private final zzfld zzb;
    private final AtomicBoolean zzc;
    private final zzflo zzd;

    public zzdge(Set set, zzfld zzfldVar, zzflo zzfloVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfldVar;
        this.zzd = zzfloVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjd)).booleanValue() && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3 && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdgd
                @Override // com.google.android.gms.internal.ads.zzdjm
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdgg) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(this.zzd) && this.zzb.zzaB && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdjm() { // from class: com.google.android.gms.internal.ads.zzdgc
                @Override // com.google.android.gms.internal.ads.zzdjm
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdgg) obj).zzm(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
