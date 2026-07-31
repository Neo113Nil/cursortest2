package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
final class zzd implements View.OnClickListener {
    final /* synthetic */ zzl zza;

    zzd(zzl zzlVar) {
        Objects.requireNonNull(zzlVar);
        this.zza = zzlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzl zzlVar = this.zza;
        zzlVar.zzn = 2;
        zzlVar.zzb.finish();
    }
}
