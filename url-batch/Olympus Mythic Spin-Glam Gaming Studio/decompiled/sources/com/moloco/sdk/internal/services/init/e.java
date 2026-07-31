package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.login.LoginLogger;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.C5047j;
import com.moloco.sdk.internal.services.InterfaceC5048k;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.services.x;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.MediationInfo;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.reflect.TypeInfo;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes13.dex */
public final class e implements d {
    public static final int j = 8;

    @NotNull
    public final y c;

    @NotNull
    public final InterfaceC5048k d;

    @NotNull
    public final com.moloco.sdk.internal.services.usertracker.f e;

    @NotNull
    public final String f;
    public final long g;

    @NotNull
    public final HttpClient h;
    public final Uri i;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitApiImpl", f = "InitApi.kt", l = {67, 157, 99}, m = "invoke")
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return e.this.a(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitApiImpl$invoke$2", f = "InitApi.kt", l = {150}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ HttpResponse b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpResponse httpResponse, Continuation continuation) {
            super(2, continuation);
            this.b = httpResponse;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KType kType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, f.a, "Successful Init", null, false, 12, null);
                HttpClientCall call = this.b.getCall();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(byte[].class);
                try {
                    kType = Reflection.typeOf(byte[].class);
                } catch (Throwable unused) {
                    kType = null;
                }
                TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                this.a = 1;
                obj = call.bodyNullable(typeInfo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (obj != null) {
                return Init.SDKInitResponse.parseFrom((byte[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
        }
    }

    public e(@NotNull y deviceInfoService, @NotNull InterfaceC5048k appInfoService, @NotNull com.moloco.sdk.internal.services.usertracker.f userTrackerService, @NotNull String sdkVersion, @NotNull String endpoint, long j2, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        Intrinsics.checkNotNullParameter(appInfoService, "appInfoService");
        Intrinsics.checkNotNullParameter(userTrackerService, "userTrackerService");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.c = deviceInfoService;
        this.d = appInfoService;
        this.e = userTrackerService;
        this.f = sdkVersion;
        this.g = j2;
        this.h = httpClient;
        this.i = Uri.parse(endpoint);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|(1:(4:(1:(6:11|12|13|14|15|17)(2:27|28))(7:29|30|31|32|33|34|(2:36|(1:38)(4:39|14|15|17))(5:40|41|(1:43)(1:46)|44|45))|26|21|22)(4:52|53|54|55))(4:66|67|68|(1:70)(1:71))|56|57|(1:59)(4:60|33|34|(0)(0))))|75|6|(0)(0)|56|57|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0260, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016e A[Catch: Exception -> 0x01a9, TRY_LEAVE, TryCatch #2 {Exception -> 0x01a9, blocks: (B:34:0x015c, B:36:0x016e, B:40:0x01ad, B:43:0x01b9, B:46:0x020d), top: B:33:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad A[Catch: Exception -> 0x01a9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x01a9, blocks: (B:34:0x015c, B:36:0x016e, B:40:0x01ad, B:43:0x01b9, B:46:0x020d), top: B:33:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.moloco.sdk.internal.services.init.d
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull String str, @Nullable MediationInfo mediationInfo, @NotNull MetricsRecorder metricsRecorder, @NotNull Continuation continuation) {
        a aVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        final e eVar;
        TimerEvent timerEvent;
        final C5047j invoke;
        String str2;
        final MediationInfo mediationInfo2;
        final x xVar;
        MetricsRecorder metricsRecorder2;
        TimerEvent timerEvent2;
        e eVar2;
        HttpStatusCode status;
        HttpStatusCode.Companion companion;
        x.a aVar2;
        MetricsRecorder metricsRecorder3;
        MetricsRecorder metricsRecorder4 = metricsRecorder;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.j = i2 - Integer.MIN_VALUE;
                obj = aVar.h;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.j;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TimerEvent startTimerEvent = metricsRecorder4.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.d.c());
                    try {
                        com.moloco.sdk.internal.services.x invoke2 = this.c.invoke();
                        invoke = this.d.invoke();
                        com.moloco.sdk.internal.services.usertracker.f fVar = this.e;
                        aVar.a = this;
                        str2 = str;
                        aVar.b = str2;
                        aVar.c = mediationInfo;
                        aVar.d = metricsRecorder4;
                        aVar.e = startTimerEvent;
                        aVar.f = invoke2;
                        aVar.g = invoke;
                        aVar.j = 1;
                        Object b2 = fVar.b(aVar);
                        if (b2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mediationInfo2 = mediationInfo;
                        eVar = this;
                        xVar = invoke2;
                        obj = b2;
                        timerEvent = startTimerEvent;
                    } catch (Exception e) {
                        e = e;
                        eVar = this;
                        timerEvent = startTimerEvent;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            timerEvent2 = (TimerEvent) aVar.c;
                            metricsRecorder2 = (MetricsRecorder) aVar.b;
                            e eVar3 = (e) aVar.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                eVar = eVar3;
                                try {
                                    HttpResponse httpResponse = (HttpResponse) obj;
                                    status = httpResponse.getStatus();
                                    companion = HttpStatusCode.Companion;
                                    if (!Intrinsics.areEqual(status, companion.getOK())) {
                                        metricsRecorder2.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success"));
                                        CoroutineContext io2 = com.moloco.sdk.internal.scheduling.b.a().getIo();
                                        b bVar = new b(httpResponse, null);
                                        aVar.a = eVar;
                                        aVar.b = metricsRecorder2;
                                        aVar.c = timerEvent2;
                                        aVar.j = 3;
                                        obj = BuildersKt.withContext(io2, bVar, aVar);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        metricsRecorder3 = metricsRecorder2;
                                        eVar2 = eVar;
                                        return new x.b(obj);
                                    }
                                    if (Intrinsics.areEqual(status, companion.getNotFound())) {
                                        metricsRecorder2.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(status.getValue())));
                                        MolocoLogger.error$default(MolocoLogger.INSTANCE, f.a, "http status " + status + ": App not found or AppKey is not correct", null, false, 12, null);
                                        aVar2 = new x.a(new j.b(status.getValue()));
                                    } else {
                                        metricsRecorder2.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(status.getValue())));
                                        MolocoLogger.error$default(MolocoLogger.INSTANCE, f.a, "SDK Init failed with status code: " + status, null, false, 12, null);
                                        aVar2 = new x.a(new j.b(status.getValue()));
                                    }
                                    return aVar2;
                                } catch (Exception e2) {
                                    e = e2;
                                    eVar2 = eVar;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                eVar2 = eVar3;
                            }
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            timerEvent2 = (TimerEvent) aVar.c;
                            metricsRecorder3 = (MetricsRecorder) aVar.b;
                            eVar2 = (e) aVar.a;
                            try {
                                ResultKt.throwOnFailure(obj);
                                try {
                                    return new x.b(obj);
                                } catch (Exception e4) {
                                    e = e4;
                                    timerEvent = timerEvent2;
                                    eVar = eVar2;
                                    metricsRecorder4 = metricsRecorder3;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                metricsRecorder2 = metricsRecorder3;
                            }
                        }
                        timerEvent = timerEvent2;
                        eVar = eVar2;
                        metricsRecorder4 = metricsRecorder2;
                        return eVar.a(e, timerEvent, metricsRecorder4);
                    }
                    C5047j c5047j = (C5047j) aVar.g;
                    xVar = (com.moloco.sdk.internal.services.x) aVar.f;
                    timerEvent = (TimerEvent) aVar.e;
                    MetricsRecorder metricsRecorder5 = (MetricsRecorder) aVar.d;
                    mediationInfo2 = (MediationInfo) aVar.c;
                    str2 = (String) aVar.b;
                    eVar = (e) aVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        invoke = c5047j;
                        metricsRecorder4 = metricsRecorder5;
                    } catch (Exception e6) {
                        e = e6;
                        metricsRecorder4 = metricsRecorder5;
                    }
                }
                String str3 = (String) obj;
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, f.a, "Requesting Init with appKey: " + str2 + ", mref: " + str3 + ", url: " + eVar.i, false, 4, null);
                HttpClient httpClient = eVar.h;
                String uri = eVar.i.buildUpon().appendQueryParameter(MBridgeConstans.APP_KEY, str2).appendQueryParameter(com.safedk.android.analytics.brandsafety.m.x, str3).build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, uri);
                HttpRequestKt.headers(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.internal.services.init.e$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return e.a(e.this, xVar, mediationInfo2, invoke, (HeadersBuilder) obj2);
                    }
                });
                com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, eVar.g);
                httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                aVar.a = eVar;
                aVar.b = metricsRecorder4;
                aVar.c = timerEvent;
                aVar.d = null;
                aVar.e = null;
                aVar.f = null;
                aVar.g = null;
                aVar.j = 2;
                obj = httpStatement.execute(aVar);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                metricsRecorder2 = metricsRecorder4;
                timerEvent2 = timerEvent;
                HttpResponse httpResponse2 = (HttpResponse) obj;
                status = httpResponse2.getStatus();
                companion = HttpStatusCode.Companion;
                if (!Intrinsics.areEqual(status, companion.getOK())) {
                }
            }
        }
        aVar = new a(continuation);
        obj = aVar.h;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.j;
        if (i != 0) {
        }
        String str32 = (String) obj;
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f.a, "Requesting Init with appKey: " + str2 + ", mref: " + str32 + ", url: " + eVar.i, false, 4, null);
        HttpClient httpClient2 = eVar.h;
        String uri2 = eVar.i.buildUpon().appendQueryParameter(MBridgeConstans.APP_KEY, str2).appendQueryParameter(com.safedk.android.analytics.brandsafety.m.x, str32).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        HttpRequestBuilder httpRequestBuilder2 = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder2, uri2);
        HttpRequestKt.headers(httpRequestBuilder2, new Function1() { // from class: com.moloco.sdk.internal.services.init.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return e.a(e.this, xVar, mediationInfo2, invoke, (HeadersBuilder) obj2);
            }
        });
        com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder2, eVar.g);
        httpRequestBuilder2.setMethod(HttpMethod.Companion.getGet());
        HttpStatement httpStatement2 = new HttpStatement(httpRequestBuilder2, httpClient2);
        aVar.a = eVar;
        aVar.b = metricsRecorder4;
        aVar.c = timerEvent;
        aVar.d = null;
        aVar.e = null;
        aVar.f = null;
        aVar.g = null;
        aVar.j = 2;
        obj = httpStatement2.execute(aVar);
        if (obj != coroutine_suspended) {
        }
    }

    public static final Unit a(e eVar, com.moloco.sdk.internal.services.x xVar, MediationInfo mediationInfo, C5047j c5047j, HeadersBuilder headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.n.a(headers, eVar.f, xVar.x(), mediationInfo);
        String b2 = c5047j.b();
        if (Intrinsics.areEqual(b2, "com.example.demo2")) {
            b2 = "com.trickytribe.penetrator";
        }
        headers.append("X-Moloco-App-Bundle", b2);
        return Unit.INSTANCE;
    }

    public final com.moloco.sdk.internal.x<Init.SDKInitResponse, j> a(Exception exc, TimerEvent timerEvent, MetricsRecorder metricsRecorder) {
        com.moloco.sdk.internal.services.init.b bVar;
        if (exc instanceof HttpRequestTimeoutException) {
            bVar = com.moloco.sdk.internal.services.init.b.a;
        } else if (exc instanceof SSLHandshakeException) {
            bVar = com.moloco.sdk.internal.services.init.b.d;
        } else if (exc instanceof SocketException) {
            bVar = com.moloco.sdk.internal.services.init.b.c;
        } else {
            bVar = exc instanceof UnknownHostException ? com.moloco.sdk.internal.services.init.b.b : com.moloco.sdk.internal.services.init.b.f;
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, f.a, "SDK Init failed with client exception", exc, false, 8, null);
        metricsRecorder.recordTimerEvent(timerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), bVar.name()));
        return new x.a(new j.a(bVar));
    }
}
