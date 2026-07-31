package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SDKErrorHandler.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J2\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "key", "Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "getKey", "()Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", TelemetryCategory.EXCEPTION, "", "sendDiagnostic", "name", "", "reason", "scopeName", "stackTrace", "opportunityId", "Lcom/google/protobuf/ByteString;", "retrieveCoroutineName", "retrieveOpportunityId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SDKErrorHandler implements CoroutineExceptionHandler {

    @NotNull
    public static final String UNITY_PACKAGE = "com.unity3d";

    @NotNull
    public static final String UNKNOWN_FILE = "unknown";

    @NotNull
    private final CoroutineExceptionHandler.Key key;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public SDKErrorHandler(@NotNull CoroutineDispatcher defaultDispatcher, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        CoroutineScope plus = CoroutineScopeKt.plus(CoroutineScopeKt.CoroutineScope(defaultDispatcher), new CoroutineName("SDKErrorHandler"));
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        this.scope = CoroutineScopeKt.plus(plus, new SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(key));
        this.key = key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2 function2) {
        return (R) CoroutineExceptionHandler.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key key) {
        return (E) CoroutineExceptionHandler.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key key) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineExceptionHandler.Key getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new SDKErrorHandler$handleException$1(this, context, exception, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDiagnostic(String name, String reason, String scopeName, String stackTrace, ByteString opportunityId) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("reason", reason);
        createMapBuilder.put("reason_debug", stackTrace);
        createMapBuilder.put("coroutine_name", scopeName);
        if (opportunityId != null) {
            String uuid = ProtobufExtensionsKt.toUUID(opportunityId).toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            createMapBuilder.put("impressionOpportunityId", uuid);
        }
        Unit unit = Unit.INSTANCE;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, name, (Double) null, MapsKt.build(createMapBuilder), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String retrieveCoroutineName(CoroutineContext context) {
        String name;
        CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.Key);
        return (coroutineName == null || (name = coroutineName.getName()) == null) ? "unknown" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteString retrieveOpportunityId(CoroutineContext context) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) context.get(CoroutineOpportunity.INSTANCE);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }
}
