package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
final class zzes extends zzdj {
    private zzes() {
        throw null;
    }

    /* synthetic */ zzes(byte[] bArr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zze(@Nullable zze zzeVar) {
        OnAdInspectorClosedListener zzA = zzeu.zzb().zzA();
        if (zzA != null) {
            zzA.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }
}
