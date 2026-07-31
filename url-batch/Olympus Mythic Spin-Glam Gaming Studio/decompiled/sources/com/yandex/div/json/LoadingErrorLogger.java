package com.yandex.div.json;

import android.util.Log;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoadingErrorLogger.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/json/LoadingErrorLogger;", "", "logError", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LoadingErrorLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void logError(@NotNull Exception e);

    /* compiled from: LoadingErrorLogger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/div/json/LoadingErrorLogger$Companion;", "", "()V", "ASSERT", "Lcom/yandex/div/json/LoadingErrorLogger;", "getASSERT", "()Lcom/yandex/div/json/LoadingErrorLogger;", "LOG", "getLOG", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final LoadingErrorLogger ASSERT = new LoadingErrorLogger() { // from class: com.yandex.div.json.LoadingErrorLogger$Companion$ASSERT$1
            @Override // com.yandex.div.json.LoadingErrorLogger
            public void logError(@NotNull Exception e) {
                Assert.fail(e.getMessage(), e);
            }
        };

        @NotNull
        private static final LoadingErrorLogger LOG = new LoadingErrorLogger() { // from class: com.yandex.div.json.LoadingErrorLogger$Companion$LOG$1
            @Override // com.yandex.div.json.LoadingErrorLogger
            public void logError(@NotNull Exception e) {
                if (KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                    Log.e("LoadingErrorLogger", "An error occurred during loading process", e);
                }
            }
        };

        private Companion() {
        }

        @NotNull
        public final LoadingErrorLogger getASSERT() {
            return ASSERT;
        }

        @NotNull
        public final LoadingErrorLogger getLOG() {
            return LOG;
        }
    }
}
