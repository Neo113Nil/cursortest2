package com.google.android.play.core.hsdp.service;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes11.dex */
final class zzaw implements View.OnClickListener {
    final /* synthetic */ zzax zza;

    zzaw(zzax zzaxVar) {
        Objects.requireNonNull(zzaxVar);
        this.zza = zzaxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb();
    }
}
