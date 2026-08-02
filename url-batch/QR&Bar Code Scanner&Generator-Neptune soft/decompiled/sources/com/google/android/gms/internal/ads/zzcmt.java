package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcmt implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcdq zza;
    final /* synthetic */ zzcmw zzb;

    zzcmt(zzcmw zzcmwVar, zzcdq zzcdqVar) {
        this.zzb = zzcmwVar;
        this.zza = zzcdqVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzQ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
