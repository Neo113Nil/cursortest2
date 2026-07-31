package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.apollographql.apollo.api.http.UploadsHttpBody;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.network.OkHttpExtensionsKt;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;

/* compiled from: DefaultHttpEngine.jvm.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\rJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/apollographql/apollo/network/http/JvmHttpEngine;", "Lcom/apollographql/apollo/network/http/HttpEngine;", "httpCallFactory", "Lkotlin/Function0;", "Lokhttp3/Call$Factory;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "(Lokhttp3/Call$Factory;)V", "timeoutMillis", "", "(J)V", "connectTimeoutMillis", "readTimeoutMillis", "(JJ)V", "callFactory", "getCallFactory", "()Lokhttp3/Call$Factory;", "callFactory$delegate", "Lkotlin/Lazy;", "execute", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class JvmHttpEngine implements HttpEngine {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: callFactory$delegate, reason: from kotlin metadata */
    private final Lazy callFactory;
    private final Function0<Call.Factory> httpCallFactory;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call.Factory _init_$lambda$1(Call.Factory factory) {
        return factory;
    }

    @Override // com.apollographql.apollo.network.http.HttpEngine, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmHttpEngine(Function0<? extends Call.Factory> httpCallFactory) {
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
        this.httpCallFactory = httpCallFactory;
        this.callFactory = LazyKt.lazy(new Function0() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Call.Factory callFactory_delegate$lambda$0;
                callFactory_delegate$lambda$0 = JvmHttpEngine.callFactory_delegate$lambda$0(JvmHttpEngine.this);
                return callFactory_delegate$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call.Factory callFactory_delegate$lambda$0(JvmHttpEngine jvmHttpEngine) {
        return jvmHttpEngine.httpCallFactory.invoke();
    }

    private final Call.Factory getCallFactory() {
        return (Call.Factory) this.callFactory.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmHttpEngine(final Call.Factory httpCallFactory) {
        this((Function0<? extends Call.Factory>) new Function0() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Call.Factory _init_$lambda$1;
                _init_$lambda$1 = JvmHttpEngine._init_$lambda$1(Call.Factory.this);
                return _init_$lambda$1;
            }
        });
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
    }

    public JvmHttpEngine(long j) {
        this(j, j);
    }

    public JvmHttpEngine(long j, long j2) {
        this(OkHttpExtensionsKt.getDefaultOkHttpClientBuilder().connectTimeout(j, TimeUnit.MILLISECONDS).readTimeout(j2, TimeUnit.MILLISECONDS).build());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.apollographql.apollo.network.http.HttpEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation) {
        JvmHttpEngine$execute$1 jvmHttpEngine$execute$1;
        int i;
        Companion companion;
        if (continuation instanceof JvmHttpEngine$execute$1) {
            jvmHttpEngine$execute$1 = (JvmHttpEngine$execute$1) continuation;
            if ((jvmHttpEngine$execute$1.label & Integer.MIN_VALUE) != 0) {
                jvmHttpEngine$execute$1.label -= Integer.MIN_VALUE;
                Object obj = jvmHttpEngine$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jvmHttpEngine$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Companion companion2 = INSTANCE;
                    Call.Factory callFactory = getCallFactory();
                    Request okHttpRequest = companion2.toOkHttpRequest(httpRequest);
                    jvmHttpEngine$execute$1.L$0 = companion2;
                    jvmHttpEngine$execute$1.label = 1;
                    Object execute = companion2.execute(callFactory, okHttpRequest, jvmHttpEngine$execute$1);
                    if (execute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = execute;
                    companion = companion2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (Companion) jvmHttpEngine$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return companion.toApolloHttpResponse((Response) obj);
            }
        }
        jvmHttpEngine$execute$1 = new JvmHttpEngine$execute$1(this, continuation);
        Object obj2 = jvmHttpEngine$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jvmHttpEngine$execute$1.label;
        if (i != 0) {
        }
        return companion.toApolloHttpResponse((Response) obj2);
    }

    /* compiled from: DefaultHttpEngine.jvm.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006J\u001a\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000bJ\n\u0010\f\u001a\u00020\r*\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/apollographql/apollo/network/http/JvmHttpEngine$Companion;", "", "<init>", "()V", "toOkHttpRequest", "Lokhttp3/Request;", "Lcom/apollographql/apollo/api/http/HttpRequest;", "execute", "Lokhttp3/Response;", "Lokhttp3/Call$Factory;", "request", "(Lokhttp3/Call$Factory;Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toApolloHttpResponse", "Lcom/apollographql/apollo/api/http/HttpResponse;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Request toOkHttpRequest(HttpRequest httpRequest) {
            Intrinsics.checkNotNullParameter(httpRequest, "<this>");
            Request.Builder headers = new Request.Builder().url(httpRequest.getUrl()).headers(OkHttpExtensionsKt.toOkHttpHeaders(httpRequest.getHeaders()));
            if (httpRequest.getMethod() == HttpMethod.Get) {
                headers.get();
            } else {
                final HttpBody body = httpRequest.getBody();
                if (body == null) {
                    throw new IllegalStateException("HTTP POST requires a request body".toString());
                }
                headers.post(new RequestBody() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$Companion$toOkHttpRequest$1$2
                    @Override // okhttp3.RequestBody
                    /* renamed from: contentType */
                    public MediaType getContentType() {
                        return MediaType.INSTANCE.get(HttpBody.this.getContentType());
                    }

                    @Override // okhttp3.RequestBody
                    public long contentLength() {
                        return HttpBody.this.getContentLength();
                    }

                    @Override // okhttp3.RequestBody
                    public boolean isOneShot() {
                        return HttpBody.this instanceof UploadsHttpBody;
                    }

                    @Override // okhttp3.RequestBody
                    public void writeTo(BufferedSink sink) {
                        Intrinsics.checkNotNullParameter(sink, "sink");
                        HttpBody.this.writeTo(sink);
                    }
                });
            }
            return headers.build();
        }

        public final HttpResponse toApolloHttpResponse(Response response) {
            Intrinsics.checkNotNullParameter(response, "<this>");
            HttpResponse.Builder builder = new HttpResponse.Builder(response.code());
            ResponseBody body = response.body();
            Intrinsics.checkNotNull(body);
            HttpResponse.Builder body2 = builder.body(body.getBodySource());
            Headers headers = response.headers();
            IntRange until = RangesKt.until(0, headers.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                arrayList.add(new HttpHeader(headers.name(nextInt), headers.value(nextInt)));
            }
            return body2.addHeaders(arrayList).build();
        }

        public final Object execute(Call.Factory factory, Request request, Continuation<? super Response> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final Call newCall = factory.newCall(request);
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.apollographql.apollo.network.http.JvmHttpEngine$Companion$execute$2$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Call.this.cancel();
                }
            });
            Response response = null;
            try {
                response = FirebasePerfOkHttpClient.execute(newCall);
                e = null;
            } catch (IOException e) {
                e = e;
            }
            if (e != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m12363constructorimpl(ResultKt.createFailure(new ApolloNetworkException("Failed to execute GraphQL http network request", e))));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                Intrinsics.checkNotNull(response);
                cancellableContinuationImpl2.resumeWith(Result.m12363constructorimpl(response));
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
    }
}
