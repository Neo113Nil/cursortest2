package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.charsets.EncodingKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.io.Source;

/* compiled from: HttpResponse.kt */
/* loaded from: classes13.dex */
public abstract class HttpResponseKt {
    public static final HttpRequest getRequest(HttpResponse httpResponse) {
        Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getRequest();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsText(HttpResponse httpResponse, Charset charset, Continuation continuation) {
        HttpResponseKt$bodyAsText$1 httpResponseKt$bodyAsText$1;
        Object obj;
        int i;
        KType kType;
        CharsetDecoder charsetDecoder;
        if (continuation instanceof HttpResponseKt$bodyAsText$1) {
            httpResponseKt$bodyAsText$1 = (HttpResponseKt$bodyAsText$1) continuation;
            int i2 = httpResponseKt$bodyAsText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsText$1.label = i2 - Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsText$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsText$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Charset charset2 = HttpMessagePropertiesKt.charset(httpResponse);
                    if (charset2 != null) {
                        charset = charset2;
                    }
                    CharsetDecoder newDecoder = charset.newDecoder();
                    HttpClientCall call = httpResponse.getCall();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
                    try {
                        kType = Reflection.typeOf(Source.class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsText$1.L$0 = newDecoder;
                    httpResponseKt$bodyAsText$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsText$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    charsetDecoder = newDecoder;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charsetDecoder = (CharsetDecoder) httpResponseKt$bodyAsText$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    Intrinsics.checkNotNull(charsetDecoder);
                    return EncodingKt.decode$default(charsetDecoder, (Source) obj, 0, 2, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
            }
        }
        httpResponseKt$bodyAsText$1 = new HttpResponseKt$bodyAsText$1(continuation);
        obj = httpResponseKt$bodyAsText$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpResponseKt$bodyAsText$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    public static /* synthetic */ Object bodyAsText$default(HttpResponse httpResponse, Charset charset, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return bodyAsText(httpResponse, charset, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bodyAsChannel(HttpResponse httpResponse, Continuation continuation) {
        HttpResponseKt$bodyAsChannel$1 httpResponseKt$bodyAsChannel$1;
        Object obj;
        int i;
        KType kType;
        if (continuation instanceof HttpResponseKt$bodyAsChannel$1) {
            httpResponseKt$bodyAsChannel$1 = (HttpResponseKt$bodyAsChannel$1) continuation;
            int i2 = httpResponseKt$bodyAsChannel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                httpResponseKt$bodyAsChannel$1.label = i2 - Integer.MIN_VALUE;
                obj = httpResponseKt$bodyAsChannel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpResponseKt$bodyAsChannel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpClientCall call = httpResponse.getCall();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ByteReadChannel.class);
                    try {
                        kType = Reflection.typeOf(ByteReadChannel.class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                    httpResponseKt$bodyAsChannel$1.label = 1;
                    obj = call.bodyNullable(typeInfo, httpResponseKt$bodyAsChannel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (obj == null) {
                    return (ByteReadChannel) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
            }
        }
        httpResponseKt$bodyAsChannel$1 = new HttpResponseKt$bodyAsChannel$1(continuation);
        obj = httpResponseKt$bodyAsChannel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpResponseKt$bodyAsChannel$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }
}
