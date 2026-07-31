package com.apollographql.apollo.network.http;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpHeaders;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.BufferedSourceJsonReader;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.exception.JsonDataException;
import io.ably.lib.http.HttpConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.TimeSource;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: BatchingHttpInterceptor.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0002$%B'\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "batchIntervalMillis", "", "maxBatchSize", "", "exposeErrorBody", "", "<init>", "(JIZ)V", "startMark", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "J", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "disposed", "interceptorChain", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "pendingRequests", "", "Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$PendingRequest;", "intercept", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "chain", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executePendingRequests", "", "needLock", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "PendingRequest", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatchingHttpInterceptor implements HttpInterceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long batchIntervalMillis;
    private final CoroutineDispatcher dispatcher;
    private boolean disposed;
    private final boolean exposeErrorBody;
    private HttpInterceptorChain interceptorChain;
    private final int maxBatchSize;
    private final Mutex mutex;
    private final List<PendingRequest> pendingRequests;
    private final CoroutineScope scope;
    private final long startMark;

    public BatchingHttpInterceptor() {
        this(0L, 0, false, 7, null);
    }

    public BatchingHttpInterceptor(long j) {
        this(j, 0, false, 6, null);
    }

    public BatchingHttpInterceptor(long j, int i) {
        this(j, i, false, 4, null);
    }

    @JvmStatic
    public static final <D extends Operation.Data> void configureApolloCall(ApolloCall<D> apolloCall, boolean z) {
        INSTANCE.configureApolloCall(apolloCall, z);
    }

    @JvmStatic
    public static final void configureApolloClientBuilder(ApolloClient.Builder builder, boolean z) {
        INSTANCE.configureApolloClientBuilder(builder, z);
    }

    public BatchingHttpInterceptor(long j, int i, boolean z) {
        this.batchIntervalMillis = j;
        this.maxBatchSize = i;
        this.exposeErrorBody = z;
        this.startMark = TimeSource.Monotonic.INSTANCE.m13844markNowz9LOYto();
        CoroutineDispatcher limitedParallelism$default = CoroutineDispatcher.limitedParallelism$default(Dispatchers.getDefault(), 1, null, 2, null);
        this.dispatcher = limitedParallelism$default;
        this.scope = CoroutineScopeKt.CoroutineScope(limitedParallelism$default);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.pendingRequests = new ArrayList();
    }

    public /* synthetic */ BatchingHttpInterceptor(long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10L : j, (i2 & 2) != 0 ? 10 : i, (i2 & 4) != 0 ? false : z);
    }

    /* compiled from: BatchingHttpInterceptor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$PendingRequest;", "", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "<init>", "(Lcom/apollographql/apollo/api/http/HttpRequest;)V", "getRequest", "()Lcom/apollographql/apollo/api/http/HttpRequest;", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/apollographql/apollo/api/http/HttpResponse;", "getDeferred", "()Lkotlinx/coroutines/CompletableDeferred;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PendingRequest {
        private final CompletableDeferred<HttpResponse> deferred;
        private final HttpRequest request;

        public PendingRequest(HttpRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            this.deferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }

        public final HttpRequest getRequest() {
            return this.request;
        }

        public final CompletableDeferred<HttpResponse> getDeferred() {
            return this.deferred;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        if (executePendingRequests(false, r4) == r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        if (r0.lock(null, r4) == r5) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:19:0x004f, B:32:0x00db, B:36:0x00ef), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.apollographql.apollo.network.http.BatchingHttpInterceptor] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.apollographql.apollo.network.http.HttpInterceptorChain] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(HttpRequest httpRequest, HttpInterceptorChain httpInterceptorChain, Continuation<? super HttpResponse> continuation) {
        BatchingHttpInterceptor$intercept$1 batchingHttpInterceptor$intercept$1;
        Object coroutine_suspended;
        int i;
        PendingRequest pendingRequest;
        Mutex mutex;
        PendingRequest pendingRequest2;
        int i2;
        ?? r2 = httpInterceptorChain;
        try {
            if (continuation instanceof BatchingHttpInterceptor$intercept$1) {
                batchingHttpInterceptor$intercept$1 = (BatchingHttpInterceptor$intercept$1) continuation;
                if ((batchingHttpInterceptor$intercept$1.label & Integer.MIN_VALUE) != 0) {
                    batchingHttpInterceptor$intercept$1.label -= Integer.MIN_VALUE;
                    Object obj = batchingHttpInterceptor$intercept$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = batchingHttpInterceptor$intercept$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        String valueOf = HttpHeaders.valueOf(httpRequest.getHeaders(), "X-APOLLO-CAN-BE-BATCHED");
                        if (!(valueOf != null ? Boolean.parseBoolean(valueOf) : true)) {
                            HttpRequest.Builder newBuilder$default = HttpRequest.newBuilder$default(httpRequest, null, null, 3, null);
                            List<HttpHeader> headers = httpRequest.getHeaders();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : headers) {
                                if (!Intrinsics.areEqual(((HttpHeader) obj2).getName(), "X-APOLLO-CAN-BE-BATCHED")) {
                                    arrayList.add(obj2);
                                }
                            }
                            HttpRequest build = newBuilder$default.addHeaders(arrayList).build();
                            batchingHttpInterceptor$intercept$1.label = 1;
                            Object proceed = r2.proceed(build, batchingHttpInterceptor$intercept$1);
                            if (proceed != coroutine_suspended) {
                                return proceed;
                            }
                        } else {
                            this.interceptorChain = r2;
                            pendingRequest = new PendingRequest(httpRequest);
                            mutex = this.mutex;
                            batchingHttpInterceptor$intercept$1.L$0 = pendingRequest;
                            batchingHttpInterceptor$intercept$1.L$1 = mutex;
                            batchingHttpInterceptor$intercept$1.label = 2;
                        }
                    }
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        i2 = batchingHttpInterceptor$intercept$1.I$0;
                        r2 = (Mutex) batchingHttpInterceptor$intercept$1.L$1;
                        pendingRequest2 = (PendingRequest) batchingHttpInterceptor$intercept$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!(i2 != 0)) {
                            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new BatchingHttpInterceptor$intercept$3(this, null), 3, null);
                        }
                        CompletableDeferred<HttpResponse> deferred = pendingRequest2.getDeferred();
                        batchingHttpInterceptor$intercept$1.L$0 = null;
                        batchingHttpInterceptor$intercept$1.L$1 = null;
                        batchingHttpInterceptor$intercept$1.label = 4;
                        Object await = deferred.await(batchingHttpInterceptor$intercept$1);
                        return await == coroutine_suspended ? coroutine_suspended : await;
                    }
                    mutex = (Mutex) batchingHttpInterceptor$intercept$1.L$1;
                    pendingRequest = (PendingRequest) batchingHttpInterceptor$intercept$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    pendingRequest2 = pendingRequest;
                    r2 = mutex;
                    this.pendingRequests.add(pendingRequest2);
                    i2 = this.pendingRequests.size() < this.maxBatchSize ? 1 : 0;
                    if (i2 != 0) {
                        batchingHttpInterceptor$intercept$1.L$0 = pendingRequest2;
                        batchingHttpInterceptor$intercept$1.L$1 = r2;
                        batchingHttpInterceptor$intercept$1.I$0 = i2;
                        batchingHttpInterceptor$intercept$1.label = 3;
                    }
                    if (!(i2 != 0)) {
                    }
                    CompletableDeferred<HttpResponse> deferred2 = pendingRequest2.getDeferred();
                    batchingHttpInterceptor$intercept$1.L$0 = null;
                    batchingHttpInterceptor$intercept$1.L$1 = null;
                    batchingHttpInterceptor$intercept$1.label = 4;
                    Object await2 = deferred2.await(batchingHttpInterceptor$intercept$1);
                    if (await2 == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            pendingRequest2 = pendingRequest;
            r2 = mutex;
            this.pendingRequests.add(pendingRequest2);
            if (this.pendingRequests.size() < this.maxBatchSize) {
            }
            if (i2 != 0) {
            }
            if (!(i2 != 0)) {
            }
            CompletableDeferred<HttpResponse> deferred22 = pendingRequest2.getDeferred();
            batchingHttpInterceptor$intercept$1.L$0 = null;
            batchingHttpInterceptor$intercept$1.L$1 = null;
            batchingHttpInterceptor$intercept$1.label = 4;
            Object await22 = deferred22.await(batchingHttpInterceptor$intercept$1);
            if (await22 == coroutine_suspended) {
            }
        } finally {
            r2.unlock(null);
        }
        batchingHttpInterceptor$intercept$1 = new BatchingHttpInterceptor$intercept$1(this, continuation);
        Object obj3 = batchingHttpInterceptor$intercept$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = batchingHttpInterceptor$intercept$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0065, code lost:
    
        if (r4.lock(null, r2) == r3) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b0 A[Catch: Exception -> 0x0043, TryCatch #5 {Exception -> 0x0043, blocks: (B:12:0x003e, B:13:0x01a7, B:17:0x01b3, B:19:0x01b9, B:31:0x020f, B:33:0x0213, B:35:0x0220, B:36:0x0231, B:38:0x0237, B:40:0x023d, B:42:0x025b, B:43:0x0262, B:45:0x0263, B:67:0x0268, B:68:0x029a, B:69:0x029b, B:70:0x02a2, B:71:0x02a3, B:81:0x0208, B:82:0x02a4, B:83:0x02ab, B:84:0x02ac, B:86:0x02b0, B:88:0x02b6, B:90:0x02c0, B:91:0x02ef, B:92:0x02bb, B:21:0x01c7, B:23:0x01e4, B:24:0x0200, B:77:0x0203), top: B:11:0x003e, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bb A[Catch: Exception -> 0x0043, TryCatch #5 {Exception -> 0x0043, blocks: (B:12:0x003e, B:13:0x01a7, B:17:0x01b3, B:19:0x01b9, B:31:0x020f, B:33:0x0213, B:35:0x0220, B:36:0x0231, B:38:0x0237, B:40:0x023d, B:42:0x025b, B:43:0x0262, B:45:0x0263, B:67:0x0268, B:68:0x029a, B:69:0x029b, B:70:0x02a2, B:71:0x02a3, B:81:0x0208, B:82:0x02a4, B:83:0x02ab, B:84:0x02ac, B:86:0x02b0, B:88:0x02b6, B:90:0x02c0, B:91:0x02ef, B:92:0x02bb, B:21:0x01c7, B:23:0x01e4, B:24:0x0200, B:77:0x0203), top: B:11:0x003e, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02fb  */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executePendingRequests(boolean z, Continuation<? super Unit> continuation) {
        BatchingHttpInterceptor$executePendingRequests$1 batchingHttpInterceptor$executePendingRequests$1;
        int i;
        List list;
        Mutex mutex;
        List list2;
        List list3;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        HttpResponse httpResponse;
        int statusCode;
        BufferedSource body;
        Throwable th;
        Object obj;
        BufferedSourceJsonReader bufferedSourceJsonReader;
        try {
            if (continuation instanceof BatchingHttpInterceptor$executePendingRequests$1) {
                batchingHttpInterceptor$executePendingRequests$1 = (BatchingHttpInterceptor$executePendingRequests$1) continuation;
                if ((batchingHttpInterceptor$executePendingRequests$1.label & Integer.MIN_VALUE) != 0) {
                    batchingHttpInterceptor$executePendingRequests$1.label -= Integer.MIN_VALUE;
                    Object obj2 = batchingHttpInterceptor$executePendingRequests$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = batchingHttpInterceptor$executePendingRequests$1.label;
                    ArrayList arrayList = null;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (z) {
                            mutex = this.mutex;
                            batchingHttpInterceptor$executePendingRequests$1.L$0 = mutex;
                            batchingHttpInterceptor$executePendingRequests$1.label = 1;
                        } else {
                            list = CollectionsKt.toList(this.pendingRequests);
                            this.pendingRequests.clear();
                            list2 = list;
                            if (list2.isEmpty()) {
                                return Unit.INSTANCE;
                            }
                            HttpRequest request = ((PendingRequest) CollectionsKt.first(list2)).getRequest();
                            List list4 = list2;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                HttpBody body2 = ((PendingRequest) it.next()).getRequest().getBody();
                                if (body2 == null) {
                                    throw new IllegalStateException("empty body while batching queries".toString());
                                }
                                arrayList2.add(body2);
                            }
                            final ArrayList arrayList3 = arrayList2;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((PendingRequest) it2.next()).getRequest().getHeaders());
                            }
                            Iterator it3 = arrayList4.iterator();
                            if (!it3.hasNext()) {
                                throw new UnsupportedOperationException("Empty collection can't be reduced.");
                            }
                            Object next = it3.next();
                            while (it3.hasNext()) {
                                next = CollectionsKt.toList(CollectionsKt.intersect((List) next, CollectionsKt.toSet((List) it3.next())));
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj3 : (Iterable) next) {
                                if (!Intrinsics.areEqual(((HttpHeader) obj3).getName(), "X-APOLLO-CAN-BE-BATCHED")) {
                                    arrayList5.add(obj3);
                                }
                            }
                            HttpRequest build = new HttpRequest.Builder(HttpMethod.Post, request.getUrl()).body(new HttpBody() { // from class: com.apollographql.apollo.network.http.BatchingHttpInterceptor$executePendingRequests$body$1
                                private final String contentType = HttpConstants.ContentTypes.JSON;
                                private final long contentLength = -1;

                                @Override // com.apollographql.apollo.api.http.HttpBody
                                public String getContentType() {
                                    return this.contentType;
                                }

                                @Override // com.apollographql.apollo.api.http.HttpBody
                                public long getContentLength() {
                                    return this.contentLength;
                                }

                                @Override // com.apollographql.apollo.api.http.HttpBody
                                public void writeTo(BufferedSink bufferedSink) {
                                    Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
                                    BufferedSinkJsonWriter bufferedSinkJsonWriter = new BufferedSinkJsonWriter(bufferedSink, null, 2, null);
                                    List<HttpBody> list5 = arrayList3;
                                    bufferedSinkJsonWriter.beginArray();
                                    BufferedSinkJsonWriter bufferedSinkJsonWriter2 = bufferedSinkJsonWriter;
                                    for (HttpBody httpBody : list5) {
                                        Buffer buffer = new Buffer();
                                        httpBody.writeTo(buffer);
                                        bufferedSinkJsonWriter2.jsonValue(buffer.readUtf8());
                                    }
                                    bufferedSinkJsonWriter.endArray();
                                }
                            }).headers(arrayList5).build();
                            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                            objectRef4.element = CollectionsKt.emptyList();
                            try {
                                HttpInterceptorChain httpInterceptorChain = this.interceptorChain;
                                Intrinsics.checkNotNull(httpInterceptorChain);
                                batchingHttpInterceptor$executePendingRequests$1.L$0 = list2;
                                batchingHttpInterceptor$executePendingRequests$1.L$1 = objectRef3;
                                batchingHttpInterceptor$executePendingRequests$1.L$2 = objectRef4;
                                batchingHttpInterceptor$executePendingRequests$1.label = 2;
                                obj2 = httpInterceptorChain.proceed(build, batchingHttpInterceptor$executePendingRequests$1);
                                if (obj2 != coroutine_suspended) {
                                    list3 = list2;
                                    objectRef = objectRef3;
                                    objectRef2 = objectRef4;
                                    httpResponse = (HttpResponse) obj2;
                                    statusCode = httpResponse.getStatusCode();
                                    if (200 <= statusCode) {
                                    }
                                    if (!this.exposeErrorBody) {
                                    }
                                    throw new ApolloHttpException(httpResponse.getStatusCode(), httpResponse.getHeaders(), body, "HTTP error " + httpResponse.getStatusCode() + " while executing batched query", null, 16, null);
                                }
                                return coroutine_suspended;
                            } catch (Exception e) {
                                e = e;
                                list3 = list2;
                                objectRef = objectRef3;
                                objectRef2 = objectRef4;
                                objectRef.element = !(e instanceof ApolloException) ? (ApolloException) e : new DefaultApolloException("batched query failed with exception", e);
                                if (objectRef.element == 0) {
                                }
                            }
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            objectRef2 = (Ref.ObjectRef) batchingHttpInterceptor$executePendingRequests$1.L$2;
                            objectRef = (Ref.ObjectRef) batchingHttpInterceptor$executePendingRequests$1.L$1;
                            list3 = (List) batchingHttpInterceptor$executePendingRequests$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj2);
                                httpResponse = (HttpResponse) obj2;
                                statusCode = httpResponse.getStatusCode();
                            } catch (Exception e2) {
                                e = e2;
                                objectRef.element = !(e instanceof ApolloException) ? (ApolloException) e : new DefaultApolloException("batched query failed with exception", e);
                                if (objectRef.element == 0) {
                                }
                            }
                            if (200 <= statusCode || statusCode >= 300) {
                                if (!this.exposeErrorBody) {
                                    body = httpResponse.getBody();
                                } else {
                                    BufferedSource body3 = httpResponse.getBody();
                                    if (body3 != null) {
                                        body3.close();
                                    }
                                    body = null;
                                }
                                throw new ApolloHttpException(httpResponse.getStatusCode(), httpResponse.getHeaders(), body, "HTTP error " + httpResponse.getStatusCode() + " while executing batched query", null, 16, null);
                            }
                            BufferedSource body4 = httpResponse.getBody();
                            if (body4 == null) {
                                throw new DefaultApolloException("null body when executing batched query", null, 2, null);
                            }
                            objectRef2.element = httpResponse.getHeaders();
                            BufferedSourceJsonReader bufferedSourceJsonReader2 = new BufferedSourceJsonReader(body4);
                            try {
                                bufferedSourceJsonReader = bufferedSourceJsonReader2;
                                obj = Adapters.AnyAdapter.fromJson(bufferedSourceJsonReader, CustomScalarAdapters.Empty);
                            } catch (Throwable th2) {
                                try {
                                    bufferedSourceJsonReader2.close();
                                } catch (Throwable th3) {
                                    ExceptionsKt.addSuppressed(th2, th3);
                                }
                                th = th2;
                                obj = null;
                            }
                            if (bufferedSourceJsonReader.getPeekedToken() != JsonReader.Token.END_DOCUMENT) {
                                throw new JsonDataException("Expected END_DOCUMENT but was " + bufferedSourceJsonReader.getPeekedToken());
                            }
                            try {
                                bufferedSourceJsonReader2.close();
                                th = null;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            if (th == null) {
                                if (!(obj instanceof List)) {
                                    throw new DefaultApolloException("batched query response is not a list when executing batched query", null, 2, null);
                                }
                                if (((List) obj).size() != list3.size()) {
                                    throw new DefaultApolloException("batched query response count (" + ((List) obj).size() + ") does not match the requested queries (" + list3.size() + ")", null, 2, null);
                                }
                                Iterable iterable = (Iterable) obj;
                                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                                for (Object obj4 : iterable) {
                                    if (obj4 == null) {
                                        throw new DefaultApolloException("batched query response contains a null item", null, 2, null);
                                    }
                                    Buffer buffer = new Buffer();
                                    Adapters.AnyAdapter.toJson(new BufferedSinkJsonWriter(buffer, null), CustomScalarAdapters.Empty, obj4);
                                    arrayList6.add(buffer.readByteString());
                                }
                                arrayList = arrayList6;
                                if (objectRef.element == 0) {
                                    Intrinsics.checkNotNull(arrayList);
                                    int i2 = 0;
                                    for (Object obj5 : arrayList) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        ((PendingRequest) list3.get(i2)).getDeferred().complete(new HttpResponse.Builder(200).body((ByteString) obj5).headers((List) objectRef2.element).build());
                                        i2 = i3;
                                    }
                                    return Unit.INSTANCE;
                                }
                                Iterator it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    ((PendingRequest) it4.next()).getDeferred().completeExceptionally((Throwable) objectRef.element);
                                }
                                return Unit.INSTANCE;
                            }
                            throw th;
                        }
                        mutex = (Mutex) batchingHttpInterceptor$executePendingRequests$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                    }
                    list = CollectionsKt.toList(this.pendingRequests);
                    this.pendingRequests.clear();
                    list2 = list;
                    if (list2.isEmpty()) {
                    }
                }
            }
            list = CollectionsKt.toList(this.pendingRequests);
            this.pendingRequests.clear();
            list2 = list;
            if (list2.isEmpty()) {
            }
        } finally {
            mutex.unlock(null);
        }
        batchingHttpInterceptor$executePendingRequests$1 = new BatchingHttpInterceptor$executePendingRequests$1(this, continuation);
        Object obj22 = batchingHttpInterceptor$executePendingRequests$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = batchingHttpInterceptor$executePendingRequests$1.label;
        ArrayList arrayList7 = null;
        if (i != 0) {
        }
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.interceptorChain = null;
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.disposed = true;
    }

    /* compiled from: BatchingHttpInterceptor.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J(\u0010\n\u001a\u00020\u0005\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000f"}, d2 = {"Lcom/apollographql/apollo/network/http/BatchingHttpInterceptor$Companion;", "", "<init>", "()V", "configureApolloClientBuilder", "", "apolloClientBuilder", "Lcom/apollographql/apollo/ApolloClient$Builder;", "canBeBatched", "", "configureApolloCall", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "apolloCall", "Lcom/apollographql/apollo/ApolloCall;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void configureApolloClientBuilder(ApolloClient.Builder apolloClientBuilder, boolean canBeBatched) {
            Intrinsics.checkNotNullParameter(apolloClientBuilder, "apolloClientBuilder");
            apolloClientBuilder.canBeBatched(Boolean.valueOf(canBeBatched));
        }

        @JvmStatic
        public final <D extends Operation.Data> void configureApolloCall(ApolloCall<D> apolloCall, boolean canBeBatched) {
            Intrinsics.checkNotNullParameter(apolloCall, "apolloCall");
            apolloCall.canBeBatched(Boolean.valueOf(canBeBatched));
        }
    }
}
