package io.appmetrica.analytics.coreutils.internal.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class LoggerStorage {
    private static HashMap a = new HashMap();
    private static final Object b = new Object();
    private static volatile PublicLogger c = PublicLogger.getAnonymousInstance();

    @NonNull
    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return c;
    }

    @NonNull
    public static PublicLogger getOrCreateMainPublicLogger(@NonNull String str) {
        c = getOrCreatePublicLogger(str);
        return c;
    }

    @NonNull
    public static PublicLogger getOrCreatePublicLogger(@Nullable String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) a.get(str);
        if (publicLogger == null) {
            synchronized (b) {
                try {
                    publicLogger = (PublicLogger) a.get(str);
                    if (publicLogger == null) {
                        publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                        a.put(str, publicLogger);
                    }
                } finally {
                }
            }
        }
        return publicLogger;
    }

    @VisibleForTesting
    public static void unsetPublicLoggers() {
        a = new HashMap();
        c = PublicLogger.getAnonymousInstance();
    }
}
