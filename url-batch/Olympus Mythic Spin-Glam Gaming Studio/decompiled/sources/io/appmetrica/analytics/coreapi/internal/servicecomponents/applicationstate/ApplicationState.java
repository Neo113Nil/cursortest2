package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.M2;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* loaded from: classes4.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND(M2.g),
    VISIBLE(VastAttributes.VISIBLE);

    private final String a;

    ApplicationState(String str) {
        this.a = str;
    }

    @NonNull
    public static ApplicationState fromString(@Nullable String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.a;
    }
}
