package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public enum Od {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");


    @NotNull
    private final String a;

    Od(String str) {
        this.a = str;
    }

    @NotNull
    public final String b() {
        return this.a;
    }
}
