package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfvu extends zzftq {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfsy zzb;

    zzfvu(Iterator it, zzfsy zzfsyVar) {
        this.zza = it;
        this.zzb = zzfsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    @CheckForNull
    protected final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
