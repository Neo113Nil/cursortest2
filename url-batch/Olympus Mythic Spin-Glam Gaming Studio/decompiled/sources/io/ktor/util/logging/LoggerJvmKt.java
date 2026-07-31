package io.ktor.util.logging;

import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* compiled from: LoggerJvm.kt */
/* loaded from: classes5.dex */
public abstract class LoggerJvmKt {
    public static final boolean isTraceEnabled(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "<this>");
        return logger.isTraceEnabled();
    }
}
