package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4469xb implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Intrinsics.checkNotNullExpressionValue(C4521zb.e, "access$getTAG$p(...)");
        C4521zb.f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        C4521zb.f = false;
        Intrinsics.checkNotNullExpressionValue(C4521zb.e, "access$getTAG$p(...)");
    }
}
