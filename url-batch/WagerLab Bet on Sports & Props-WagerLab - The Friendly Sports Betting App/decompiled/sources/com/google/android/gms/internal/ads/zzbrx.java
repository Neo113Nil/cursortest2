package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbrx implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbry zza;

    zzbrx(zzbry zzbryVar) {
        Objects.requireNonNull(zzbryVar);
        this.zza = zzbryVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
