package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public abstract class Ob {
    public static final Nb a(String logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        return StringsKt.equals(logLevel, "DEBUG", true) ? Nb.b : StringsKt.equals(logLevel, "ERROR", true) ? Nb.c : StringsKt.equals(logLevel, "INFO", true) ? Nb.a : StringsKt.equals(logLevel, "STATE", true) ? Nb.d : Nb.c;
    }
}
