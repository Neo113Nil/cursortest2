package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC5700th implements InterfaceC5726uh {

    @NonNull
    protected final DataSendingRestrictionController a;

    public AbstractC5700th(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5726uh
    public boolean a(@Nullable Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
