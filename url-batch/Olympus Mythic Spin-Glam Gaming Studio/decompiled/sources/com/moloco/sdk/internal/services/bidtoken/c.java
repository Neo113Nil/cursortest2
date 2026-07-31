package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.login.LoginLogger;
import com.google.protobuf.InvalidProtocolBufferException;
import com.moloco.sdk.BidToken;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.MolocoAdError;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfo;
import java.net.UnknownHostException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes5.dex */
public final class c implements InterfaceC5038a {
    public static final int f = 8;

    @NotNull
    public final String a;

    @NotNull
    public final HttpClient b;

    @NotNull
    public final j c;

    @NotNull
    public final g d;

    @NotNull
    public final String e;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenApiImpl$fetchBidToken$2", f = "BidTokenApi.kt", l = {80, 127}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final /* synthetic */ MetricsRecorder j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MetricsRecorder metricsRecorder, Continuation continuation) {
            super(2, continuation);
            this.j = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(this.j, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0090  */
        /* JADX WARN: Type inference failed for: r10v1, types: [T, com.moloco.sdk.internal.x, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.moloco.sdk.internal.x$a] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x01fb -> B:6:0x01fe). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef ref$ObjectRef;
            int i;
            MetricsRecorder metricsRecorder;
            c cVar;
            int i2;
            Ref$ObjectRef ref$ObjectRef2;
            Object obj2;
            TimerEvent timerEvent;
            int i3;
            ?? r10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.h;
            int i5 = 1;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                ref$ObjectRef3.element = new x.a(new com.moloco.sdk.internal.m("retry max parameter is 0", MolocoAdError.ErrorType.UNKNOWN.getErrorCode()));
                int e = c.this.c.e();
                c cVar2 = c.this;
                ref$ObjectRef = ref$ObjectRef3;
                i = 0;
                metricsRecorder = this.j;
                cVar = cVar2;
                i2 = e;
                if (i < i2) {
                }
            } else if (i4 == 1) {
                i = this.g;
                i3 = this.f;
                i2 = this.e;
                TimerEvent timerEvent2 = (TimerEvent) this.d;
                metricsRecorder = (MetricsRecorder) this.c;
                c cVar3 = (c) this.b;
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.a;
                ResultKt.throwOnFailure(obj);
                ref$ObjectRef2 = ref$ObjectRef4;
                obj2 = obj;
                timerEvent = timerEvent2;
                cVar = cVar3;
                r10 = (com.moloco.sdk.internal.x) obj2;
                ref$ObjectRef2.element = r10;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, cVar.e, "Received bidtoken fetch result: " + ((Object) r10), null, false, 12, null);
                if (r10 instanceof x.a) {
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = this.f;
                int i7 = this.e;
                MetricsRecorder metricsRecorder2 = (MetricsRecorder) this.c;
                cVar = (c) this.b;
                Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.a;
                ResultKt.throwOnFailure(obj);
                Object obj3 = coroutine_suspended;
                char c = 2;
                i2 = i7;
                ref$ObjectRef = ref$ObjectRef5;
                metricsRecorder = metricsRecorder2;
                i = i6 + i5;
                coroutine_suspended = obj3;
                if (i < i2) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, cVar.e, "Fetching bidtoken, attempt #" + i, null, false, 12, null);
                    timerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.n.c());
                    this.a = ref$ObjectRef;
                    this.b = cVar;
                    this.c = metricsRecorder;
                    this.d = timerEvent;
                    this.e = i2;
                    this.f = i;
                    this.g = i;
                    this.h = i5;
                    obj2 = cVar.a(d.a, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                    i3 = i;
                    r10 = (com.moloco.sdk.internal.x) obj2;
                    ref$ObjectRef2.element = r10;
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger2, cVar.e, "Received bidtoken fetch result: " + ((Object) r10), null, false, 12, null);
                    if (r10 instanceof x.a) {
                        if (!(r10 instanceof x.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                        TimerEvent withTag = timerEvent.withTag(dVar.c(), "success");
                        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f;
                        metricsRecorder.recordTimerEvent(withTag.withTag(dVar2.c(), String.valueOf(i)));
                        metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.w.c()).withTag(dVar.c(), "success").withTag(dVar2.c(), String.valueOf(i)));
                        return r10;
                    }
                    int b = ((com.moloco.sdk.internal.m) ((x.a) r10).a()).b();
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    TimerEvent withTag2 = timerEvent.withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    TimerEvent withTag3 = withTag2.withTag(dVar4.c(), String.valueOf(b));
                    com.moloco.sdk.internal.client_metrics_data.d dVar5 = com.moloco.sdk.internal.client_metrics_data.d.f;
                    Object obj4 = coroutine_suspended;
                    metricsRecorder.recordTimerEvent(withTag3.withTag(dVar5.c(), String.valueOf(i)));
                    metricsRecorder.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.w.c()).withTag(dVar3.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar4.c(), String.valueOf(b)).withTag(dVar5.c(), String.valueOf(i)));
                    if (400 <= b && b < 500 && b != 429) {
                        MolocoLogger.info$default(molocoLogger2, cVar.e, "Received 4xx error: " + b, null, false, 12, null);
                        return r10;
                    }
                    MolocoLogger.info$default(molocoLogger2, cVar.e, "Received non-4xx or " + b + " error: " + b, null, false, 12, null);
                    long d = cVar.c.d() * ((long) (i + 1));
                    MolocoLogger.info$default(molocoLogger2, cVar.e, "Retrying after delay: " + d, null, false, 12, null);
                    this.a = ref$ObjectRef2;
                    this.b = cVar;
                    this.c = metricsRecorder;
                    this.d = null;
                    this.e = i2;
                    this.f = i3;
                    c = 2;
                    this.h = 2;
                    Object delay = DelayKt.delay(d, this);
                    obj3 = obj4;
                    if (delay == obj3) {
                        return obj3;
                    }
                    i6 = i3;
                    ref$ObjectRef = ref$ObjectRef2;
                    i5 = 1;
                    i = i6 + i5;
                    coroutine_suspended = obj3;
                    if (i < i2) {
                        return ref$ObjectRef.element;
                    }
                }
            }
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenApiImpl", f = "BidTokenApi.kt", l = {209, 210}, m = "fetchBidTokenWork")
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return c.this.a((String) null, this);
        }
    }

    public c(@NotNull String sdkVersion, @NotNull HttpClient httpClient, @NotNull j httpRequestInfo, @NotNull g deviceRequestInfo) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(httpRequestInfo, "httpRequestInfo");
        Intrinsics.checkNotNullParameter(deviceRequestInfo, "deviceRequestInfo");
        this.a = sdkVersion;
        this.b = httpClient;
        this.c = httpRequestInfo;
        this.d = deviceRequestInfo;
        this.e = "BidTokenApi";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.InterfaceC5038a
    @Nullable
    public Object a(@NotNull MetricsRecorder metricsRecorder, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new a(metricsRecorder, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0113 A[Catch: InvalidProtocolBufferException -> 0x0030, TryCatch #5 {InvalidProtocolBufferException -> 0x0030, blocks: (B:11:0x002b, B:13:0x0113, B:16:0x013d, B:17:0x0144, B:26:0x00f3, B:29:0x0101), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013d A[Catch: InvalidProtocolBufferException -> 0x0030, TryCatch #5 {InvalidProtocolBufferException -> 0x0030, blocks: (B:11:0x002b, B:13:0x0113, B:16:0x013d, B:17:0x0144, B:26:0x00f3, B:29:0x0101), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3 A[Catch: InvalidProtocolBufferException -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #5 {InvalidProtocolBufferException -> 0x0030, blocks: (B:11:0x002b, B:13:0x0113, B:16:0x013d, B:17:0x0144, B:26:0x00f3, B:29:0x0101), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        b bVar;
        int i;
        c cVar;
        KType kType;
        KType kType2;
        HttpResponse httpResponse;
        KType kType3;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.d = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            HttpClient httpClient = this.b;
                            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
                            HttpRequestKt.url(httpRequestBuilder, str);
                            HttpRequestKt.headers(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.internal.services.bidtoken.c$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return c.a(c.this, (HeadersBuilder) obj2);
                                }
                            });
                            HttpMessagePropertiesKt.contentType(httpRequestBuilder, ContentType.Application.INSTANCE.getProtoBuf());
                            byte[] a2 = a();
                            if (a2 == null) {
                                httpRequestBuilder.setBody(NullBody.INSTANCE);
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                                try {
                                    kType2 = Reflection.typeOf(byte[].class);
                                } catch (Throwable unused) {
                                    kType2 = null;
                                }
                                httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass, kType2));
                            } else if (a2 instanceof OutgoingContent) {
                                httpRequestBuilder.setBody(a2);
                                httpRequestBuilder.setBodyType(null);
                            } else {
                                httpRequestBuilder.setBody(a2);
                                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(byte[].class);
                                try {
                                    kType = Reflection.typeOf(byte[].class);
                                } catch (Throwable unused2) {
                                    kType = null;
                                }
                                httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass2, kType));
                            }
                            com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, this.c.f());
                            httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
                            HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                            bVar.a = this;
                            bVar.d = 1;
                            obj = httpStatement.execute(bVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            cVar = this;
                        } catch (HttpRequestTimeoutException e) {
                            e = e;
                            cVar = this;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, cVar.e, "Request timeout exception", e, false, 8, null);
                            return new x.a(new com.moloco.sdk.internal.m("bidtoken request failed due to timeout", EnumC5039b.c.c()));
                        } catch (UnknownHostException e2) {
                            e = e2;
                            cVar = this;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, cVar.e, "Unknown Host Request exception", e, false, 8, null);
                            return new x.a(new com.moloco.sdk.internal.m("bidtoken request failed due to not being able to connect to host", EnumC5039b.d.c()));
                        } catch (Exception e3) {
                            e = e3;
                            cVar = this;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, cVar.e, "Bid Token API Request exception", e, false, 8, null);
                            return new x.a(new com.moloco.sdk.internal.m("bidtoken request failed due to unknown exception", EnumC5039b.b.c()));
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                                BidToken.BidTokenResponseV3 parseFrom = BidToken.BidTokenResponseV3.parseFrom((byte[]) obj);
                                String bidToken = parseFrom.getBidToken();
                                Intrinsics.checkNotNullExpressionValue(bidToken, "getBidToken(...)");
                                String pk = parseFrom.getPk();
                                Intrinsics.checkNotNullExpressionValue(pk, "getPk(...)");
                                Intrinsics.checkNotNull(parseFrom);
                                return new x.b(new k(bidToken, pk, e.a(parseFrom)));
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                        cVar = (c) bVar.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (HttpRequestTimeoutException e4) {
                            e = e4;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, cVar.e, "Request timeout exception", e, false, 8, null);
                            return new x.a(new com.moloco.sdk.internal.m("bidtoken request failed due to timeout", EnumC5039b.c.c()));
                        } catch (UnknownHostException e5) {
                            e = e5;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, cVar.e, "Unknown Host Request exception", e, false, 8, null);
                            return new x.a(new com.moloco.sdk.internal.m("bidtoken request failed due to not being able to connect to host", EnumC5039b.d.c()));
                        } catch (Exception e6) {
                            e = e6;
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, cVar.e, "Bid Token API Request exception", e, false, 8, null);
                            return new x.a(new com.moloco.sdk.internal.m("bidtoken request failed due to unknown exception", EnumC5039b.b.c()));
                        }
                    }
                    httpResponse = (HttpResponse) obj;
                    if (!Intrinsics.areEqual(httpResponse.getStatus(), HttpStatusCode.Companion.getOK())) {
                        HttpClientCall call = httpResponse.getCall();
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(byte[].class);
                        try {
                            kType3 = Reflection.typeOf(byte[].class);
                        } catch (Throwable unused3) {
                            kType3 = null;
                        }
                        TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass3, kType3);
                        bVar.a = null;
                        bVar.d = 2;
                        obj = call.bodyNullable(typeInfo, bVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (obj == null) {
                        }
                    } else {
                        return new x.a(new com.moloco.sdk.internal.m("bidtoken request failed", httpResponse.getStatus().getValue()));
                    }
                }
            }
            if (i != 0) {
            }
            httpResponse = (HttpResponse) obj;
            if (!Intrinsics.areEqual(httpResponse.getStatus(), HttpStatusCode.Companion.getOK())) {
            }
        } catch (InvalidProtocolBufferException e7) {
            return new x.a(new com.moloco.sdk.internal.m("Bidtoken parsing failed. Reason: " + e7, HttpStatusCode.Companion.getBadRequest().getValue()));
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
    }

    public static final Unit a(c cVar, HeadersBuilder headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.n.a(headers, cVar.a, cVar.d.j(), null, 4, null);
        return Unit.INSTANCE;
    }

    public final byte[] a() {
        byte[] byteArray = BidToken.BidTokenRequestV3.newBuilder().build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
