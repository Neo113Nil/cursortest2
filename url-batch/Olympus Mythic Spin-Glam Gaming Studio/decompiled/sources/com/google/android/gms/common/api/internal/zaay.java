package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* loaded from: classes10.dex */
final class zaay implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ StatusPendingResult zaa;

    zaay(zabc zabcVar, StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zaa.setResult(new Status(8));
    }
}
