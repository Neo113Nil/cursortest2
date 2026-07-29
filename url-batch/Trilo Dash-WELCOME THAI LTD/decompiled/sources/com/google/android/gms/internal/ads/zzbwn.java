package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbwn implements View.OnClickListener {
    final /* synthetic */ zzbwo zza;

    zzbwn(zzbwo zzbwoVar) {
        this.zza = zzbwoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
