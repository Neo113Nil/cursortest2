package com.unity3d.services.core.network.core;

import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LegacyHttpClient.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/network/core/LegacyHttpClient;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "executeBlocking", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "execute", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LegacyHttpClient implements HttpClient {

    @NotNull
    private static final String NETWORK_CLIENT_LEGACY = "legacy";

    @NotNull
    private final ISDKDispatchers dispatchers;

    public LegacyHttpClient(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @NotNull
    public HttpResponse executeBlocking(@NotNull HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new LegacyHttpClient$executeBlocking$1(this, request, null));
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    @Nullable
    public Object execute(@NotNull HttpRequest httpRequest, boolean z, @NotNull Continuation continuation) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new LegacyHttpClient$execute$2(httpRequest, z, null), continuation);
    }
}
