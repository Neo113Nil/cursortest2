package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
final class zzerv extends zzcwk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzerv(zzerz zzerzVar, View view, zzclm zzclmVar, zzcyj zzcyjVar, zzfle zzfleVar) {
        super(view, null, zzcyjVar, zzfleVar);
        Objects.requireNonNull(zzerzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final zzdfb zze(Set set) {
        return new zzdfb(Collections.emptySet());
    }
}
