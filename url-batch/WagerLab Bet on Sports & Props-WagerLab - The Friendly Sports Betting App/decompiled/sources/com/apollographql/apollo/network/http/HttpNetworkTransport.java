package com.apollographql.apollo.network.http;

import com.amazon.a.a.n.a.a.g;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.DeferredFragmentIdentifier;
import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operations;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpRequestComposer;
import com.apollographql.apollo.api.http.HttpResponse;
import com.apollographql.apollo.api.internal.ResponseParserKt;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonReaders;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.RouterError;
import com.apollographql.apollo.internal.DeferredJsonMerger;
import com.apollographql.apollo.internal.MultipartKt;
import com.apollographql.apollo.mpp.UtilsKt;
import com.apollographql.apollo.network.NetworkTransport;
import com.apollographql.apollo.network.http.HttpNetworkTransport;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okio.BufferedSource;

/* compiled from: HttpNetworkTransport.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u0004/012B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00130\u0012\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H\u0016J:\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00130\u0012\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ.\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J4\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00130\u0012\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J<\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00130\u0012\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J<\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u00130\u0012\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J@\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0015*\b\u0012\u0004\u0012\u0002H\u00140\u00132\n\u0010&\u001a\u00060'j\u0002`(2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0016J\u0006\u0010-\u001a\u00020.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "httpRequestComposer", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "engine", "Lcom/apollographql/apollo/network/http/HttpEngine;", "interceptors", "", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "exposeErrorBody", "", "<init>", "(Lcom/apollographql/apollo/api/http/HttpRequestComposer;Lcom/apollographql/apollo/network/http/HttpEngine;Ljava/util/List;Z)V", "getInterceptors", "()Ljava/util/List;", "engineInterceptor", "Lcom/apollographql/apollo/network/http/HttpNetworkTransport$EngineInterceptor;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/apollographql/apollo/api/ApolloResponse;", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "request", "Lcom/apollographql/apollo/api/ApolloRequest;", "httpRequest", "Lcom/apollographql/apollo/api/http/HttpRequest;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "errorResponse", "operation", "Lcom/apollographql/apollo/api/Operation;", "throwable", "", "httpResponse", "Lcom/apollographql/apollo/api/http/HttpResponse;", "singleResponse", "multipleResponses", "withHttpInfo", "requestUuid", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "millisStart", "", "dispose", "", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", coil3.intercept.EngineInterceptor.TAG, "Builder", "TransportHeadersInterceptor", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpNetworkTransport implements NetworkTransport {
    private static final Companion Companion = new Companion(null);
    private final HttpEngine engine;
    private final EngineInterceptor engineInterceptor;
    private final boolean exposeErrorBody;
    private final HttpRequestComposer httpRequestComposer;
    private final List<HttpInterceptor> interceptors;

    public /* synthetic */ HttpNetworkTransport(HttpRequestComposer httpRequestComposer, HttpEngine httpEngine, List list, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpRequestComposer, httpEngine, list, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private HttpNetworkTransport(HttpRequestComposer httpRequestComposer, HttpEngine httpEngine, List<? extends HttpInterceptor> list, boolean z) {
        this.httpRequestComposer = httpRequestComposer;
        this.engine = httpEngine;
        this.interceptors = list;
        this.exposeErrorBody = z;
        this.engineInterceptor = new EngineInterceptor();
    }

    public final List<HttpInterceptor> getInterceptors() {
        return this.interceptors;
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public <D extends Operation.Data> Flow<ApolloResponse<D>> execute(ApolloRequest<D> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ExecutionContext.Element element = request.getExecutionContext().get(CustomScalarAdapters.INSTANCE);
        Intrinsics.checkNotNull(element);
        return execute(request, this.httpRequestComposer.compose(request), (CustomScalarAdapters) element);
    }

    public final <D extends Operation.Data> Flow<ApolloResponse<D>> execute(ApolloRequest<D> request, HttpRequest httpRequest, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        return FlowKt.flow(new HttpNetworkTransport$execute$1(this, httpRequest, request, customScalarAdapters, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends Operation.Data> ApolloResponse<D> errorResponse(Operation<D> operation, Throwable throwable) {
        ApolloNetworkException apolloNetworkException;
        if (throwable instanceof ApolloException) {
            apolloNetworkException = (ApolloException) throwable;
        } else {
            apolloNetworkException = new ApolloNetworkException("Error while reading JSON response", throwable);
        }
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        return new ApolloResponse.Builder(operation, randomUUID).exception(apolloNetworkException).isLast(true).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends Operation.Data> Flow<ApolloResponse<D>> errorResponse(Operation<D> operation, HttpResponse httpResponse) {
        BufferedSource bufferedSource;
        if (this.exposeErrorBody) {
            bufferedSource = httpResponse.getBody();
        } else {
            BufferedSource body = httpResponse.getBody();
            if (body != null) {
                body.close();
            }
            bufferedSource = null;
        }
        return FlowKt.flowOf(errorResponse(operation, new ApolloHttpException(httpResponse.getStatusCode(), httpResponse.getHeaders(), bufferedSource, "Http request failed with status code `" + httpResponse.getStatusCode() + "`", null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends Operation.Data> Flow<ApolloResponse<D>> singleResponse(Operation<D> operation, CustomScalarAdapters customScalarAdapters, HttpResponse httpResponse) {
        BufferedSource body = httpResponse.getBody();
        Intrinsics.checkNotNull(body);
        return FlowKt.flowOf(Operations.toApolloResponse$default(JsonReaders.jsonReader(body), operation, null, customScalarAdapters, null, 2, null).newBuilder().isLast(true).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends Operation.Data> Flow<ApolloResponse<D>> multipleResponses(final Operation<D> operation, final CustomScalarAdapters customScalarAdapters, HttpResponse httpResponse) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Flow<BufferedSource> multipartBodyFlow = MultipartKt.multipartBodyFlow(httpResponse);
        return FlowKt.m13922catch(new Flow<ApolloResponse<D>>() { // from class: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, operation, customScalarAdapters, this, objectRef), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ CustomScalarAdapters $customScalarAdapters$inlined;
                final /* synthetic */ Ref.ObjectRef $jsonMerger$inlined;
                final /* synthetic */ Operation $operation$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ HttpNetworkTransport this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", i = {}, l = {112}, m = "emit", n = {}, s = {})
                /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Operation operation, CustomScalarAdapters customScalarAdapters, HttpNetworkTransport httpNetworkTransport, Ref.ObjectRef objectRef) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$operation$inlined = operation;
                    this.$customScalarAdapters$inlined = customScalarAdapters;
                    this.this$0 = httpNetworkTransport;
                    this.$jsonMerger$inlined = objectRef;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                BufferedSource bufferedSource = (BufferedSource) obj;
                                ApolloResponse apolloResponse = null;
                                if (this.$operation$inlined instanceof Subscription) {
                                    JsonReader jsonReader = JsonReaders.jsonReader(bufferedSource);
                                    jsonReader.beginObject();
                                    List<Error> list = null;
                                    ApolloResponse apolloResponse2 = null;
                                    while (jsonReader.hasNext()) {
                                        String nextName = jsonReader.nextName();
                                        if (Intrinsics.areEqual(nextName, "payload")) {
                                            if (jsonReader.getPeekedToken() == JsonReader.Token.NULL) {
                                                jsonReader.skipValue();
                                            } else {
                                                apolloResponse2 = Operations.parseResponse$default(jsonReader, this.$operation$inlined, (UUID) null, this.$customScalarAdapters$inlined, (Set) null, 2, (Object) null);
                                            }
                                        } else if (Intrinsics.areEqual(nextName, "errors")) {
                                            if (jsonReader.getPeekedToken() == JsonReader.Token.NULL) {
                                                jsonReader.skipValue();
                                            } else {
                                                list = ResponseParserKt.readErrors(jsonReader);
                                            }
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                    jsonReader.endObject();
                                    if (list != null) {
                                        apolloResponse = this.this$0.errorResponse(this.$operation$inlined, new RouterError(list));
                                    } else if (apolloResponse2 != null) {
                                        apolloResponse = apolloResponse2;
                                    }
                                } else {
                                    if (this.$jsonMerger$inlined.element == null) {
                                        this.$jsonMerger$inlined.element = (T) new DeferredJsonMerger();
                                    }
                                    Map<String, Object> merge = ((DeferredJsonMerger) this.$jsonMerger$inlined.element).merge(bufferedSource);
                                    Set<DeferredFragmentIdentifier> mergedFragmentIds = ((DeferredJsonMerger) this.$jsonMerger$inlined.element).getMergedFragmentIds();
                                    boolean z = !((DeferredJsonMerger) this.$jsonMerger$inlined.element).getHasNext();
                                    if (!((DeferredJsonMerger) this.$jsonMerger$inlined.element).getIsEmptyPayload()) {
                                        apolloResponse = Operations.toApolloResponse$default(JsonReaders.jsonReader((Map<String, ? extends Object>) merge), this.$operation$inlined, null, this.$customScalarAdapters$inlined, mergedFragmentIds, 2, null).newBuilder().isLast(z).build();
                                    }
                                }
                                if (apolloResponse != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(apolloResponse, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new HttpNetworkTransport$multipleResponses$2(operation, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends Operation.Data> ApolloResponse<D> withHttpInfo(ApolloResponse<D> apolloResponse, UUID uuid, HttpResponse httpResponse, long j) {
        ApolloResponse.Builder<D> requestUuid = apolloResponse.newBuilder().requestUuid(uuid);
        if (httpResponse != null) {
            requestUuid.addExecutionContext(new HttpInfo(j, UtilsKt.currentTimeMillis(), httpResponse.getStatusCode(), httpResponse.getHeaders()));
        }
        return requestUuid.build();
    }

    /* compiled from: HttpNetworkTransport.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$EngineInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "<init>", "(Lcom/apollographql/apollo/network/http/HttpNetworkTransport;)V", "intercept", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "chain", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class EngineInterceptor implements HttpInterceptor {
        public EngineInterceptor() {
        }

        @Override // com.apollographql.apollo.network.http.HttpInterceptor
        public Object intercept(HttpRequest httpRequest, HttpInterceptorChain httpInterceptorChain, Continuation<? super HttpResponse> continuation) {
            return HttpNetworkTransport.this.engine.execute(httpRequest, continuation);
        }
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public void dispose() {
        Iterator<T> it = this.interceptors.iterator();
        while (it.hasNext()) {
            ((HttpInterceptor) it.next()).dispose();
        }
        this.engine.close();
    }

    public final Builder newBuilder() {
        return new Builder().httpEngine(this.engine).interceptors(this.interceptors).httpRequestComposer(this.httpRequestComposer).exposeErrorBody(this.exposeErrorBody);
    }

    /* compiled from: HttpNetworkTransport.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0007J\u0016\u0010\u0014\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u0015J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0019\u001a\u00020\u001aR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Builder;", "", "<init>", "()V", "httpRequestComposer", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "serverUrl", "", "engine", "Lcom/apollographql/apollo/network/http/HttpEngine;", "interceptors", "", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "exposeErrorBody", "", "headers", "Lcom/apollographql/apollo/api/http/HttpHeader;", "addHttpHeader", "name", "value", "httpHeaders", "", "httpEngine", "addInterceptor", "interceptor", InAppPurchaseConstants.METHOD_BUILD, "Lcom/apollographql/apollo/network/http/HttpNetworkTransport;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private HttpEngine engine;
        private boolean exposeErrorBody;
        private HttpRequestComposer httpRequestComposer;
        private String serverUrl;
        private final List<HttpInterceptor> interceptors = new ArrayList();
        private final List<HttpHeader> headers = new ArrayList();

        public final Builder httpRequestComposer(HttpRequestComposer httpRequestComposer) {
            Intrinsics.checkNotNullParameter(httpRequestComposer, "httpRequestComposer");
            this.httpRequestComposer = httpRequestComposer;
            return this;
        }

        public final Builder serverUrl(String serverUrl) {
            Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
            this.serverUrl = serverUrl;
            return this;
        }

        public final Builder exposeErrorBody(boolean exposeErrorBody) {
            this.exposeErrorBody = exposeErrorBody;
            return this;
        }

        @Deprecated(message = "Use ApolloClient.Builder.addHttpHeader() instead")
        public final Builder addHttpHeader(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(new HttpHeader(name, value));
            return this;
        }

        @Deprecated(message = "Use ApolloClient.Builder.httpHeader() instead")
        public final Builder httpHeaders(List<HttpHeader> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            CollectionsKt.removeAll((List) this.interceptors, new Function1() { // from class: com.apollographql.apollo.network.http.HttpNetworkTransport$Builder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean httpHeaders$lambda$5$lambda$4;
                    httpHeaders$lambda$5$lambda$4 = HttpNetworkTransport.Builder.httpHeaders$lambda$5$lambda$4((HttpInterceptor) obj);
                    return Boolean.valueOf(httpHeaders$lambda$5$lambda$4);
                }
            });
            this.headers.clear();
            this.headers.addAll(headers);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean httpHeaders$lambda$5$lambda$4(HttpInterceptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it instanceof TransportHeadersInterceptor;
        }

        public final Builder httpEngine(HttpEngine httpEngine) {
            Intrinsics.checkNotNullParameter(httpEngine, "httpEngine");
            this.engine = httpEngine;
            return this;
        }

        public final Builder interceptors(List<? extends HttpInterceptor> interceptors) {
            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
            this.interceptors.clear();
            this.interceptors.addAll(interceptors);
            return this;
        }

        public final Builder addInterceptor(HttpInterceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final HttpNetworkTransport build() {
            DefaultHttpRequestComposer defaultHttpRequestComposer = this.httpRequestComposer;
            if (defaultHttpRequestComposer != null && this.serverUrl != null) {
                throw new IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'".toString());
            }
            if (defaultHttpRequestComposer == null) {
                String str = this.serverUrl;
                DefaultHttpRequestComposer defaultHttpRequestComposer2 = str != null ? new DefaultHttpRequestComposer(str) : null;
                if (defaultHttpRequestComposer2 != null) {
                    defaultHttpRequestComposer = defaultHttpRequestComposer2;
                } else {
                    throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'".toString());
                }
            }
            HttpRequestComposer httpRequestComposer = defaultHttpRequestComposer;
            if (!this.headers.isEmpty()) {
                this.interceptors.add(new TransportHeadersInterceptor(this.headers));
            }
            HttpEngine httpEngine = this.engine;
            if (httpEngine == null) {
                httpEngine = DefaultHttpEngine.DefaultHttpEngine$default(0L, 1, null);
            }
            return new HttpNetworkTransport(httpRequestComposer, httpEngine, this.interceptors, this.exposeErrorBody, null);
        }
    }

    /* compiled from: HttpNetworkTransport.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$TransportHeadersInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "headers", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "<init>", "(Ljava/util/List;)V", "intercept", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "chain", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TransportHeadersInterceptor implements HttpInterceptor {
        private final List<HttpHeader> headers;

        public TransportHeadersInterceptor(List<HttpHeader> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers;
        }

        @Override // com.apollographql.apollo.network.http.HttpInterceptor
        public Object intercept(HttpRequest httpRequest, HttpInterceptorChain httpInterceptorChain, Continuation<? super HttpResponse> continuation) {
            return httpInterceptorChain.proceed(HttpRequest.newBuilder$default(httpRequest, null, null, 3, null).addHeaders(this.headers).build(), continuation);
        }
    }

    /* compiled from: HttpNetworkTransport.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Companion;", "", "<init>", "()V", "Kind", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HttpNetworkTransport.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/apollographql/apollo/network/http/HttpNetworkTransport$Companion$Kind;", "", "<init>", "(Ljava/lang/String;I)V", g.f558a, "PAYLOAD", "OTHER", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Kind {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Kind[] $VALUES;
            public static final Kind EMPTY = new Kind(g.f558a, 0);
            public static final Kind PAYLOAD = new Kind("PAYLOAD", 1);
            public static final Kind OTHER = new Kind("OTHER", 2);

            private static final /* synthetic */ Kind[] $values() {
                return new Kind[]{EMPTY, PAYLOAD, OTHER};
            }

            public static EnumEntries<Kind> getEntries() {
                return $ENTRIES;
            }

            private Kind(String str, int i) {
            }

            static {
                Kind[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) $VALUES.clone();
            }
        }

        private Companion() {
        }
    }
}
