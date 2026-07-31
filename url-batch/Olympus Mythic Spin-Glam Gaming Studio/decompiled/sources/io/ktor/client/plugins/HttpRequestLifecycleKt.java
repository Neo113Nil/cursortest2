package io.ktor.client.plugins;

import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.slf4j.Logger;

/* compiled from: HttpRequestLifecycle.kt */
/* loaded from: classes12.dex */
public abstract class HttpRequestLifecycleKt {
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestLifecycle");
    private static final ClientPlugin HttpRequestLifecycle = CreatePluginUtilsKt.createClientPlugin("RequestLifecycle", new Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit HttpRequestLifecycle$lambda$0;
            HttpRequestLifecycle$lambda$0 = HttpRequestLifecycleKt.HttpRequestLifecycle$lambda$0((ClientPluginBuilder) obj);
            return HttpRequestLifecycle$lambda$0;
        }
    });

    public static final ClientPlugin getHttpRequestLifecycle() {
        return HttpRequestLifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpRequestLifecycle$lambda$0(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(SetupRequestContext.INSTANCE, new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(createClientPlugin, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToClientEngineJob(final CompletableJob completableJob, Job job) {
        final DisposableHandle invokeOnCompletion = job.invokeOnCompletion(new Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit attachToClientEngineJob$lambda$1;
                attachToClientEngineJob$lambda$1 = HttpRequestLifecycleKt.attachToClientEngineJob$lambda$1(CompletableJob.this, (Throwable) obj);
                return attachToClientEngineJob$lambda$1;
            }
        });
        completableJob.invokeOnCompletion(new Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit attachToClientEngineJob$lambda$2;
                attachToClientEngineJob$lambda$2 = HttpRequestLifecycleKt.attachToClientEngineJob$lambda$2(DisposableHandle.this, (Throwable) obj);
                return attachToClientEngineJob$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachToClientEngineJob$lambda$1(CompletableJob completableJob, Throwable th) {
        if (th != null) {
            LOGGER.trace("Cancelling request because engine Job failed with error: " + th);
            JobKt.cancel(completableJob, "Engine failed", th);
        } else {
            LOGGER.trace("Cancelling request because engine Job completed");
            completableJob.complete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachToClientEngineJob$lambda$2(DisposableHandle disposableHandle, Throwable th) {
        disposableHandle.dispose();
        return Unit.INSTANCE;
    }
}
