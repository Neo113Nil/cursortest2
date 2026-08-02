package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzczl {
    public final List zza;

    public zzczl(zzcze zzczeVar) {
        this.zza = Collections.singletonList(zzfzg.zzi(zzczeVar));
    }

    public zzczl(List list) {
        this.zza = list;
    }

    public static zzehc zza(zzehc zzehcVar) {
        return new zzehd(zzehcVar, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzczk
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return new zzczl((zzcze) obj);
            }
        });
    }
}
