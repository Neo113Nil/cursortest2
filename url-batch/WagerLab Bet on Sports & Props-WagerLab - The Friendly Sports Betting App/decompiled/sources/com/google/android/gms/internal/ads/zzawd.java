package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzawd extends BroadcastReceiver {
    final /* synthetic */ zzawe zza;

    zzawd(zzawe zzaweVar) {
        Objects.requireNonNull(zzaweVar);
        this.zza = zzaweVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
