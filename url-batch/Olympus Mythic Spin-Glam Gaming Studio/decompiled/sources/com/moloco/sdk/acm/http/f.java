package com.moloco.sdk.acm.http;

import com.moloco.sdk.MetricsRequest;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class f implements e {

    @NotNull
    public final HttpClient a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @DebugMetadata(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", l = {54}, m = "execute-0E7RQCE")
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = f.this.a(null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.acm.http.PostMetricsRequestImpl", f = "PostMetricsRequest.kt", l = {145, 82}, m = "makeMetricsRequest-BWLJW6A")
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object a = f.this.a(0L, null, null, this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public f(@NotNull HttpClient httpClient, @NotNull String apiUrl) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        this.a = httpClient;
        this.b = apiUrl;
        this.c = "PostMetricsRequest";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.moloco.sdk.acm.http.e
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull d dVar, @NotNull Function1 function1, @NotNull Continuation continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar2.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                aVar2.c = 1;
                Object a2 = a(5000L, dVar, function1, aVar2);
                return a2 == coroutine_suspended ? coroutine_suspended : a2;
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.c;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f9 A[Catch: Exception -> 0x0036, TryCatch #5 {Exception -> 0x0036, blocks: (B:12:0x0031, B:13:0x00eb, B:15:0x00f9, B:18:0x0119), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0119 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #5 {Exception -> 0x0036, blocks: (B:12:0x0031, B:13:0x00eb, B:15:0x00f9, B:18:0x0119), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(final long j, d dVar, Function1 function1, Continuation continuation) {
        b bVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        f fVar;
        KType kType;
        f fVar2;
        KType kType2;
        Exception e;
        HttpStatusCode status;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.e = i2 - Integer.MIN_VALUE;
                    obj = bVar.c;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            HttpClient httpClient = this.a;
                            String str = this.b;
                            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
                            HttpRequestKt.url(httpRequestBuilder, str);
                            HttpTimeoutKt.timeout(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.acm.http.f$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return f.a(j, (HttpTimeoutConfig) obj2);
                                }
                            });
                            HttpMessagePropertiesKt.contentType(httpRequestBuilder, ContentType.Application.INSTANCE.getProtoBuf());
                            HttpRequestKt.headers(httpRequestBuilder, function1);
                            byte[] a2 = a(dVar);
                            if (a2 != null) {
                                if (a2 instanceof OutgoingContent) {
                                    httpRequestBuilder.setBody(a2);
                                    httpRequestBuilder.setBodyType(null);
                                } else {
                                    httpRequestBuilder.setBody(a2);
                                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                                    try {
                                        kType = Reflection.typeOf(byte[].class);
                                    } catch (Throwable unused) {
                                        kType = null;
                                    }
                                    httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass, kType));
                                }
                            } else {
                                httpRequestBuilder.setBody(NullBody.INSTANCE);
                                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(byte[].class);
                                try {
                                    kType2 = Reflection.typeOf(byte[].class);
                                } catch (Throwable unused2) {
                                    kType2 = null;
                                }
                                httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass2, kType2));
                            }
                            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
                            HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                            bVar.a = this;
                            bVar.e = 1;
                            obj = httpStatement.execute(bVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            fVar2 = this;
                        } catch (Exception e2) {
                            e = e2;
                            fVar = this;
                            Exception exc = e;
                            fVar2 = fVar;
                            e = exc;
                            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Exception", e, false, 8, null);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(e));
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            status = (HttpStatusCode) bVar.b;
                            fVar2 = (f) bVar.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                String str2 = (String) obj;
                                if (Intrinsics.areEqual(status, HttpStatusCode.Companion.getOK())) {
                                    com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Success: " + str2, false, 4, null);
                                    return Result.m8023constructorimpl(str2);
                                }
                                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Error: " + str2, null, false, 12, null);
                                Result.Companion companion2 = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(new Exception("PostMetricsRequest Error: " + status)));
                            } catch (Exception e3) {
                                e = e3;
                                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Exception", e, false, 8, null);
                                Result.Companion companion3 = Result.INSTANCE;
                                return Result.m8023constructorimpl(ResultKt.createFailure(e));
                            }
                        }
                        fVar = (f) bVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            fVar2 = fVar;
                        } catch (Exception e4) {
                            e = e4;
                            Exception exc2 = e;
                            fVar2 = fVar;
                            e = exc2;
                            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Exception", e, false, 8, null);
                            Result.Companion companion32 = Result.INSTANCE;
                            return Result.m8023constructorimpl(ResultKt.createFailure(e));
                        }
                    }
                    HttpResponse httpResponse = (HttpResponse) obj;
                    status = httpResponse.getStatus();
                    bVar.a = fVar2;
                    bVar.b = status;
                    bVar.e = 2;
                    obj = HttpResponseKt.bodyAsText$default(httpResponse, null, bVar, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str22 = (String) obj;
                    if (Intrinsics.areEqual(status, HttpStatusCode.Companion.getOK())) {
                    }
                }
            }
            HttpResponse httpResponse2 = (HttpResponse) obj;
            status = httpResponse2.getStatus();
            bVar.a = fVar2;
            bVar.b = status;
            bVar.e = 2;
            obj = HttpResponseKt.bodyAsText$default(httpResponse2, null, bVar, 1, null);
            if (obj == coroutine_suspended) {
            }
            String str222 = (String) obj;
            if (Intrinsics.areEqual(status, HttpStatusCode.Companion.getOK())) {
            }
        } catch (Exception e5) {
            f fVar3 = fVar2;
            e = e5;
            fVar = fVar3;
            Exception exc22 = e;
            fVar2 = fVar;
            e = exc22;
            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, fVar2.c, "Post Metrics Request Exception", e, false, 8, null);
            Result.Companion companion322 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(e));
        }
        bVar = new b(continuation);
        obj = bVar.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
    }

    public static final Unit a(long j, HttpTimeoutConfig timeout) {
        Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
        timeout.setRequestTimeoutMillis(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    public final byte[] a(d dVar) {
        MetricsRequest.PostMetricsRequest build = MetricsRequest.PostMetricsRequest.newBuilder().addAllCounts(dVar.a()).addAllDurations(dVar.b()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        byte[] byteArray = build.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
