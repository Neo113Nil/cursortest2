package io.ktor.client.engine;

import io.ktor.client.HttpClient;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.util.CoroutinesUtilsKt;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientEngineBase.kt */
/* loaded from: classes5.dex */
public abstract class HttpClientEngineBase implements HttpClientEngine {
    private static final /* synthetic */ AtomicIntegerFieldUpdater closed$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientEngineBase.class, "closed");

    @NotNull
    private volatile /* synthetic */ int closed;
    private final Lazy coroutineContext$delegate;
    private final Lazy dispatcher$delegate;
    private final String engineName;

    public HttpClientEngineBase(String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        this.engineName = engineName;
        this.closed = 0;
        this.dispatcher$delegate = LazyKt.lazy(new Function0() { // from class: io.ktor.client.engine.HttpClientEngineBase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                CoroutineDispatcher dispatcher_delegate$lambda$0;
                dispatcher_delegate$lambda$0 = HttpClientEngineBase.dispatcher_delegate$lambda$0(HttpClientEngineBase.this);
                return dispatcher_delegate$lambda$0;
            }
        });
        this.coroutineContext$delegate = LazyKt.lazy(new Function0() { // from class: io.ktor.client.engine.HttpClientEngineBase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                CoroutineContext coroutineContext_delegate$lambda$1;
                coroutineContext_delegate$lambda$1 = HttpClientEngineBase.coroutineContext_delegate$lambda$1(HttpClientEngineBase.this);
                return coroutineContext_delegate$lambda$1;
            }
        });
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public Set getSupportedCapabilities() {
        return HttpClientEngine.DefaultImpls.getSupportedCapabilities(this);
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public void install(HttpClient httpClient) {
        HttpClientEngine.DefaultImpls.install(this, httpClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineDispatcher dispatcher_delegate$lambda$0(HttpClientEngineBase httpClientEngineBase) {
        CoroutineDispatcher dispatcher = httpClientEngineBase.getConfig().getDispatcher();
        return dispatcher == null ? HttpClientEngineBase_jvmKt.ioDispatcher() : dispatcher;
    }

    public CoroutineDispatcher getDispatcher() {
        return (CoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.coroutineContext$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext coroutineContext_delegate$lambda$1(HttpClientEngineBase httpClientEngineBase) {
        return CoroutinesUtilsKt.SilentSupervisor$default(null, 1, null).plus(httpClientEngineBase.getDispatcher()).plus(new CoroutineName(httpClientEngineBase.engineName + "-context"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (closed$FU.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(Job.Key);
            CompletableJob completableJob = element instanceof CompletableJob ? (CompletableJob) element : null;
            if (completableJob == null) {
                return;
            }
            completableJob.complete();
        }
    }
}
