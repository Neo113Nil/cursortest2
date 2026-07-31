package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpRetryDelayContext;
import io.ktor.client.plugins.HttpRetryModifyRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes11.dex */
public final class d implements n {
    public static final int e = 8;

    @NotNull
    public final u a;

    @NotNull
    public final com.moloco.sdk.internal.error.b b;

    @NotNull
    public final HttpClient c;

    @NotNull
    public final String d;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.LegacyMediaDownloader$downloadMedia$2", f = "LegacyMediaDownloader.kt", l = {42, 52, 63, 63}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public Object b;
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ File f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, Continuation continuation) {
            super(2, continuation);
            this.e = str;
            this.f = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new a(this.e, this.f, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x016f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0158 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            Object a;
            int i2;
            Object a2;
            HttpResponse httpResponse;
            int value;
            int value2;
            Object bodyAsChannel;
            HttpResponse httpResponse2;
            Object copyAndClose;
            HttpResponse httpResponse3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.c;
            try {
                try {
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Fetching asset from network: " + this.e, null, false, 12, null);
                            u uVar = d.this.a;
                            this.a = 0;
                            this.c = 1;
                            a = uVar.a(5000L, this);
                            if (a == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i2 = 0;
                        } catch (TimeoutCancellationException unused) {
                            i = 0;
                            b.a.a(d.this.b, d.this.a(i != 0), null, 2, null);
                            if (i == 0) {
                            }
                            throw new p();
                        }
                    } else if (i3 == 1) {
                        int i4 = this.a;
                        ResultKt.throwOnFailure(obj);
                        i2 = i4;
                        a = obj;
                    } else {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i = this.a;
                                httpResponse3 = (HttpResponse) this.b;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    copyAndClose = obj;
                                    long longValue = ((Number) copyAndClose).longValue();
                                    MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse3) + " and saved to disk: " + longValue + " bytes, file size: " + this.f.length(), null, false, 12, null);
                                    return new i.a.b(this.f);
                                } catch (TimeoutCancellationException unused2) {
                                    b.a.a(d.this.b, d.this.a(i != 0), null, 2, null);
                                    if (i == 0) {
                                    }
                                    throw new p();
                                }
                            }
                            i3 = this.a;
                            HttpResponse httpResponse4 = (HttpResponse) this.b;
                            ResultKt.throwOnFailure(obj);
                            httpResponse2 = httpResponse4;
                            bodyAsChannel = obj;
                            ByteWriteChannel writeChannel$default = FileChannelsKt.writeChannel$default(this.f, null, 1, null);
                            this.b = httpResponse2;
                            this.a = i3;
                            this.c = 4;
                            copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default, this);
                            if (copyAndClose != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i = i3;
                            httpResponse3 = httpResponse2;
                            long longValue2 = ((Number) copyAndClose).longValue();
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse3) + " and saved to disk: " + longValue2 + " bytes, file size: " + this.f.length(), null, false, 12, null);
                            return new i.a.b(this.f);
                        }
                        int i5 = this.a;
                        ResultKt.throwOnFailure(obj);
                        a2 = obj;
                        httpResponse = (HttpResponse) a2;
                        try {
                            value = httpResponse.getStatus().getValue();
                            if (400 > value && value < 500) {
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Failed to fetch media from url: " + this.e + ", status: " + httpResponse.getStatus(), null, false, 12, null);
                                return i.a.AbstractC1586a.e.c;
                            }
                            value2 = httpResponse.getStatus().getValue();
                            if (500 > value2 && value2 < 600) {
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Failed to fetch media from url: " + this.e + ", status: " + httpResponse.getStatus(), null, false, 12, null);
                                return i.a.AbstractC1586a.h.c;
                            }
                            this.b = httpResponse;
                            this.a = 1;
                            this.c = 3;
                            bodyAsChannel = HttpResponseKt.bodyAsChannel(httpResponse, this);
                            if (bodyAsChannel != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            httpResponse2 = httpResponse;
                            i3 = 1;
                            ByteWriteChannel writeChannel$default2 = FileChannelsKt.writeChannel$default(this.f, null, 1, null);
                            this.b = httpResponse2;
                            this.a = i3;
                            this.c = 4;
                            copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default2, this);
                            if (copyAndClose != coroutine_suspended) {
                            }
                        } catch (TimeoutCancellationException unused3) {
                            i3 = 1;
                            i = i3;
                            b.a.a(d.this.b, d.this.a(i != 0), null, 2, null);
                            if (i == 0) {
                            }
                            throw new p();
                        }
                    }
                    if (!((Boolean) a).booleanValue()) {
                        return i.a.AbstractC1586a.n.c;
                    }
                    if (this.f.exists()) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Deleting existing file and re-downloading it", null, false, 12, null);
                        this.f.delete();
                    }
                    d dVar = d.this;
                    String str = this.e;
                    this.a = i2;
                    this.c = 2;
                    a2 = dVar.a(str, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpResponse = (HttpResponse) a2;
                    value = httpResponse.getStatus().getValue();
                    if (400 > value) {
                    }
                    value2 = httpResponse.getStatus().getValue();
                    if (500 > value2) {
                    }
                    this.b = httpResponse;
                    this.a = 1;
                    this.c = 3;
                    bodyAsChannel = HttpResponseKt.bodyAsChannel(httpResponse, this);
                    if (bodyAsChannel != coroutine_suspended) {
                    }
                } catch (TimeoutCancellationException unused4) {
                    i3 = i2;
                    i = i3;
                    b.a.a(d.this.b, d.this.a(i != 0), null, 2, null);
                    if (i == 0) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Timeout occurred after request had completed: " + this.e, null, false, 12, null);
                    } else {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Timeout occurred when still waiting for request to complete: " + this.e, null, false, 12, null);
                    }
                    throw new p();
                }
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Failed to fetch media from url: " + this.e, e, false, 8, null);
                return o.a(e);
            }
        }
    }

    public d(@NotNull u connectivityService, @NotNull com.moloco.sdk.internal.error.b errorReportingService, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.a = connectivityService;
        this.b = errorReportingService;
        this.c = httpClient;
        this.d = "LegacyMediaDownloader";
    }

    public static final long a(HttpRetryDelayContext delayMillis, int i) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n
    @Nullable
    public Object a(@NotNull String str, @NotNull File file, @NotNull Continuation continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new a(str, file, null), continuation);
    }

    public final Object a(String str, Continuation continuation) {
        HttpClient httpClient = this.c;
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        HttpRequestRetryKt.retry(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.a(d.this, (HttpRequestRetryConfig) obj);
            }
        });
        httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Unit a(final d dVar, HttpRequestRetryConfig retry) {
        Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.setMaxRetries(10);
        HttpRequestRetryConfig.delayMillis$default(retry, false, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(d.a((HttpRetryDelayContext) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.retryOnException(10, true);
        retry.retryOnServerErrors(10);
        retry.modifyRequest(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d.a(d.this, (HttpRetryModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit a(d dVar, HttpRetryModifyRequestContext modifyRequest, HttpRequestBuilder it) {
        Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, dVar.d, "Retry attempt #" + modifyRequest.getRetryCount() + " for " + modifyRequest.getRequest().getUrl(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    public final String a(boolean z) {
        if (z) {
            return e.a;
        }
        return e.b;
    }
}
