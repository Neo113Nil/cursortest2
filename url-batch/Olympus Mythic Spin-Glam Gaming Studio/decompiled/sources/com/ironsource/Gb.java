package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Gb {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public Gb(@NotNull JSONObject applicationLogger) {
        Intrinsics.checkNotNullParameter(applicationLogger, "applicationLogger");
        this.a = applicationLogger.optInt(Hb.a, 3);
        this.b = applicationLogger.optInt("publisher", 3);
        this.c = applicationLogger.optInt("console", 3);
        this.d = applicationLogger.optBoolean(Hb.d, false);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }
}
