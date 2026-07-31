package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5471km {
    public final C5523mm a = new C5523mm();

    public final StartupParamsItem a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.id;
        C5523mm c5523mm = this.a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        c5523mm.getClass();
        int i = AbstractC5497lm.a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
