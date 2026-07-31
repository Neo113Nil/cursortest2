package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzbwl implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzbwl zza = new zzbwl();

    private /* synthetic */ zzbwl() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return queryLocalInterface instanceof zzbwe ? (zzbwe) queryLocalInterface : new zzbwe(iBinder);
    }
}
