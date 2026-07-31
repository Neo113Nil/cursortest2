package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class F4 {
    public final Interceptor[] a;
    public final OkHttpClient b;
    public final long c;

    public F4(Interceptor[] interceptorArr, Interceptor[] interceptorArr2, Dispatcher dispatcher, Ok timeoutConfig) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.a = interceptorArr2;
        this.c = timeoutConfig.c;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (interceptorArr != null) {
            for (Interceptor interceptor : interceptorArr) {
                builder.addInterceptor(interceptor);
            }
        }
        Interceptor[] interceptorArr3 = this.a;
        if (interceptorArr3 != null) {
            for (Interceptor interceptor2 : interceptorArr3) {
                builder.addNetworkInterceptor(interceptor2);
            }
        }
        builder.addInterceptor(new Ui());
        builder.addNetworkInterceptor(new C4127kc());
        builder.protocols(CollectionsKt.mutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1));
        builder.retryOnConnectionFailure(false);
        builder.dispatcher(dispatcher);
        long j = timeoutConfig.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j, timeUnit);
        builder.readTimeout(timeoutConfig.b, timeUnit);
        OkHttpClient build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        this.b = build;
    }

    public static Pair a(AbstractC3866af abstractC3866af) {
        RequestBody c4;
        Set keySet;
        HttpUrl parse = HttpUrl.parse(abstractC3866af.c());
        if (parse == null) {
            abstractC3866af.c();
            return new Pair(null, new C4095j6(abstractC3866af.c(), EnumC4069i6.s));
        }
        Request.Builder url = new Request.Builder().url(parse);
        Map a = abstractC3866af.a();
        if (a != null) {
            for (Map.Entry entry : a.entrySet()) {
                url.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map a2 = abstractC3866af.a();
        if (a2 != null && (keySet = a2.keySet()) != null && !keySet.isEmpty()) {
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((String) it.next(), "User-Agent")) {
                    break;
                }
            }
        }
        url.addHeader("User-Agent", AbstractC4002fj.c());
        Vi b = abstractC3866af.b();
        if (b != null) {
            url.tag(b);
        }
        if (abstractC3866af instanceof Xe) {
            url.get();
        } else if (abstractC3866af instanceof Ze) {
            try {
                Pi pi = ((Ze) abstractC3866af).d;
                if (pi == null) {
                    c4 = RequestBody.create((MediaType) null, new byte[0]);
                    Intrinsics.checkNotNull(c4);
                } else {
                    c4 = new C4(pi);
                }
                url.post(c4);
            } catch (FileNotFoundException e) {
                e.getStackTrace();
                return new Pair(url.build(), new C4095j6(((Ze) abstractC3866af).a, EnumC4069i6.m));
            } catch (IOException e2) {
                e2.getStackTrace();
                return new Pair(url.build(), new C4095j6(((Ze) abstractC3866af).a, EnumC4069i6.e));
            } catch (Exception e3) {
                e3.getStackTrace();
                return new Pair(url.build(), new C4095j6(((Ze) abstractC3866af).a, EnumC4069i6.d));
            }
        } else {
            if (!(abstractC3866af instanceof Ye)) {
                throw new NoWhenBranchMatchedException();
            }
            url.head();
        }
        return new Pair(url.build(), null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(17:(2:3|(21:5|6|7|(1:(3:10|11|12)(2:106|107))(7:108|109|110|111|112|113|(1:115)(1:116))|13|15|16|(2:18|(12:20|(1:22)|23|(1:25)(1:45)|26|(1:30)|31|(1:33)(1:44)|34|(2:42|43)(1:38)|39|40))|46|23|(0)(0)|26|(2:28|30)|31|(0)(0)|34|(1:36)|42|43|39|40))|15|16|(0)|46|23|(0)(0)|26|(0)|31|(0)(0)|34|(0)|42|43|39|40)|145|6|7|(0)(0)|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0033, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0045, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[Catch: all -> 0x008f, Exception -> 0x0092, IOException -> 0x0095, NoSuchElementException -> 0x0098, SocketTimeoutException -> 0x009b, MalformedURLException -> 0x009e, CancellationException -> 0x00a1, TimeoutCancellationException -> 0x00a4, TryCatch #7 {MalformedURLException -> 0x009e, SocketTimeoutException -> 0x009b, IOException -> 0x0095, NoSuchElementException -> 0x0098, TimeoutCancellationException -> 0x00a4, CancellationException -> 0x00a1, Exception -> 0x0092, all -> 0x008f, blocks: (B:16:0x0078, B:18:0x0082, B:20:0x0088, B:23:0x00a9, B:25:0x00b9, B:26:0x00bf, B:28:0x00c5, B:30:0x00cb, B:31:0x00cf, B:34:0x00e2, B:38:0x00fc, B:42:0x010b, B:46:0x00a7), top: B:15:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: all -> 0x008f, Exception -> 0x0092, IOException -> 0x0095, NoSuchElementException -> 0x0098, SocketTimeoutException -> 0x009b, MalformedURLException -> 0x009e, CancellationException -> 0x00a1, TimeoutCancellationException -> 0x00a4, TryCatch #7 {MalformedURLException -> 0x009e, SocketTimeoutException -> 0x009b, IOException -> 0x0095, NoSuchElementException -> 0x0098, TimeoutCancellationException -> 0x00a4, CancellationException -> 0x00a1, Exception -> 0x0092, all -> 0x008f, blocks: (B:16:0x0078, B:18:0x0082, B:20:0x0088, B:23:0x00a9, B:25:0x00b9, B:26:0x00bf, B:28:0x00c5, B:30:0x00cb, B:31:0x00cf, B:34:0x00e2, B:38:0x00fc, B:42:0x010b, B:46:0x00a7), top: B:15:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[Catch: all -> 0x008f, Exception -> 0x0092, IOException -> 0x0095, NoSuchElementException -> 0x0098, SocketTimeoutException -> 0x009b, MalformedURLException -> 0x009e, CancellationException -> 0x00a1, TimeoutCancellationException -> 0x00a4, TryCatch #7 {MalformedURLException -> 0x009e, SocketTimeoutException -> 0x009b, IOException -> 0x0095, NoSuchElementException -> 0x0098, TimeoutCancellationException -> 0x00a4, CancellationException -> 0x00a1, Exception -> 0x0092, all -> 0x008f, blocks: (B:16:0x0078, B:18:0x0082, B:20:0x0088, B:23:0x00a9, B:25:0x00b9, B:26:0x00bf, B:28:0x00c5, B:30:0x00cb, B:31:0x00cf, B:34:0x00e2, B:38:0x00fc, B:42:0x010b, B:46:0x00a7), top: B:15:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(OkHttpClient okHttpClient, Request request, String str, ContinuationImpl continuationImpl) {
        D4 d4;
        int i;
        Response response;
        String str2;
        String str3;
        Response response2;
        Response response3;
        Response response4;
        Response response5;
        Response response6;
        Response response7;
        Response response8;
        ResponseBody okhttp3Response_body;
        ByteString byteString;
        ResponseBody okhttp3Response_body2;
        int code;
        Object c3918cf;
        MediaType mediaType;
        try {
            if (continuationImpl instanceof D4) {
                d4 = (D4) continuationImpl;
                int i2 = d4.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    d4.d = i2 - Integer.MIN_VALUE;
                    Object obj = d4.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = d4.d;
                    response = null;
                    r7 = null;
                    String str4 = null;
                    response7 = null;
                    response6 = null;
                    response5 = null;
                    response4 = null;
                    response3 = null;
                    response2 = null;
                    response7 = null;
                    response6 = null;
                    response5 = null;
                    response4 = null;
                    response3 = null;
                    response2 = null;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            long millis = TimeUnit.SECONDS.toMillis(this.c);
                            E4 e4 = new E4(okHttpClient, request, null);
                            str2 = str;
                            try {
                                d4.a = str2;
                                d4.d = 1;
                                obj = TimeoutKt.withTimeout(millis, e4, d4);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str3 = str2;
                            } catch (MalformedURLException e) {
                                e = e;
                                str3 = str2;
                                Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                                C4095j6 c4095j6 = new C4095j6(str3, EnumC4069i6.p);
                                if (response7 != null) {
                                }
                                return c4095j6;
                            } catch (SocketTimeoutException e2) {
                                e = e2;
                                str3 = str2;
                                Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                                C4095j6 c4095j62 = new C4095j6(str3, EnumC4069i6.t);
                                if (response6 != null) {
                                }
                                return c4095j62;
                            } catch (IOException e3) {
                                e = e3;
                                str3 = str2;
                                Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                                C4095j6 c4095j63 = new C4095j6(str3, EnumC4069i6.e);
                                if (response5 != null) {
                                }
                                return c4095j63;
                            } catch (NoSuchElementException e5) {
                                e = e5;
                                str3 = str2;
                                Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                                C4095j6 c4095j64 = new C4095j6(str3, EnumC4069i6.q);
                                if (response4 != null) {
                                }
                                return c4095j64;
                            } catch (TimeoutCancellationException e6) {
                                e = e6;
                                str3 = str2;
                                Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                                C4095j6 c4095j65 = new C4095j6(str3, EnumC4069i6.r);
                                if (response3 != null) {
                                }
                                return c4095j65;
                            } catch (Exception e7) {
                                e = e7;
                                str3 = str2;
                                Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                                C4095j6 c4095j66 = new C4095j6(str3, EnumC4069i6.d);
                                if (response2 != null) {
                                }
                                return c4095j66;
                            }
                        } catch (MalformedURLException e8) {
                            e = e8;
                            str2 = str;
                        } catch (SocketTimeoutException e9) {
                            e = e9;
                            str2 = str;
                        } catch (IOException e10) {
                            e = e10;
                            str2 = str;
                        } catch (NoSuchElementException e11) {
                            e = e11;
                            str2 = str;
                        } catch (TimeoutCancellationException e12) {
                            e = e12;
                            str2 = str;
                        } catch (Exception e13) {
                            e = e13;
                            str2 = str;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = d4.a;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (MalformedURLException e14) {
                            e = e14;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C4095j6 c4095j67 = new C4095j6(str3, EnumC4069i6.p);
                            if (response7 != null) {
                                response7.close();
                            }
                            return c4095j67;
                        } catch (SocketTimeoutException e15) {
                            e = e15;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C4095j6 c4095j622 = new C4095j6(str3, EnumC4069i6.t);
                            if (response6 != null) {
                                response6.close();
                            }
                            return c4095j622;
                        } catch (IOException e16) {
                            e = e16;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C4095j6 c4095j632 = new C4095j6(str3, EnumC4069i6.e);
                            if (response5 != null) {
                                response5.close();
                            }
                            return c4095j632;
                        } catch (NoSuchElementException e17) {
                            e = e17;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C4095j6 c4095j642 = new C4095j6(str3, EnumC4069i6.q);
                            if (response4 != null) {
                                response4.close();
                            }
                            return c4095j642;
                        } catch (TimeoutCancellationException e18) {
                            e = e18;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C4095j6 c4095j652 = new C4095j6(str3, EnumC4069i6.r);
                            if (response3 != null) {
                                response3.close();
                            }
                            return c4095j652;
                        } catch (Exception e19) {
                            e = e19;
                            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
                            C4095j6 c4095j662 = new C4095j6(str3, EnumC4069i6.d);
                            if (response2 != null) {
                                response2.close();
                            }
                            return c4095j662;
                        }
                    }
                    response8 = (Response) obj;
                    int code2 = response8.code();
                    okhttp3Response_body = InMobiNetworkBridge.okhttp3Response_body(response8);
                    if (okhttp3Response_body != null) {
                        BufferedSource retrofitExceptionCatchingRequestBody_source = InMobiNetworkBridge.retrofitExceptionCatchingRequestBody_source(okhttp3Response_body);
                        if (retrofitExceptionCatchingRequestBody_source != null) {
                            byteString = retrofitExceptionCatchingRequestBody_source.readByteString();
                            if (byteString != null) {
                            }
                            Map<String, List<String>> multimap = response8.headers().toMultimap();
                            ResponseBody okhttp3Response_body3 = InMobiNetworkBridge.okhttp3Response_body(response8);
                            long contentLength = okhttp3Response_body3 != null ? okhttp3Response_body3.getContentLength() : 0L;
                            okhttp3Response_body2 = InMobiNetworkBridge.okhttp3Response_body(response8);
                            if (okhttp3Response_body2 != null && (mediaType = okhttp3Response_body2.get$contentType()) != null) {
                                str4 = mediaType.getMediaType();
                            }
                            long receivedResponseAtMillis = response8.receivedResponseAtMillis() - response8.sentRequestAtMillis();
                            long j = receivedResponseAtMillis < 0 ? 0L : receivedResponseAtMillis;
                            Intrinsics.checkNotNull(multimap);
                            We we = new We(j, multimap, (int) contentLength, str4);
                            Intrinsics.checkNotNullParameter(response8, "<this>");
                            code = response8.code();
                            if (400 <= code || code >= 600) {
                                c3918cf = new C3918cf(str3, code2, byteString, we);
                            } else {
                                EnumC4069i6.b.getClass();
                                c3918cf = new C4095j6(str3, C4017g6.a(code2));
                            }
                            response8.close();
                            return c3918cf;
                        }
                    }
                    byteString = ByteString.EMPTY;
                    Map<String, List<String>> multimap2 = response8.headers().toMultimap();
                    ResponseBody okhttp3Response_body32 = InMobiNetworkBridge.okhttp3Response_body(response8);
                    if (okhttp3Response_body32 != null) {
                    }
                    okhttp3Response_body2 = InMobiNetworkBridge.okhttp3Response_body(response8);
                    if (okhttp3Response_body2 != null) {
                        str4 = mediaType.getMediaType();
                    }
                    long receivedResponseAtMillis2 = response8.receivedResponseAtMillis() - response8.sentRequestAtMillis();
                    if (receivedResponseAtMillis2 < 0) {
                    }
                    Intrinsics.checkNotNull(multimap2);
                    We we2 = new We(j, multimap2, (int) contentLength, str4);
                    Intrinsics.checkNotNullParameter(response8, "<this>");
                    code = response8.code();
                    if (400 <= code) {
                    }
                    c3918cf = new C3918cf(str3, code2, byteString, we2);
                    response8.close();
                    return c3918cf;
                }
            }
            int code22 = response8.code();
            okhttp3Response_body = InMobiNetworkBridge.okhttp3Response_body(response8);
            if (okhttp3Response_body != null) {
            }
            byteString = ByteString.EMPTY;
            Map<String, List<String>> multimap22 = response8.headers().toMultimap();
            ResponseBody okhttp3Response_body322 = InMobiNetworkBridge.okhttp3Response_body(response8);
            if (okhttp3Response_body322 != null) {
            }
            okhttp3Response_body2 = InMobiNetworkBridge.okhttp3Response_body(response8);
            if (okhttp3Response_body2 != null) {
            }
            long receivedResponseAtMillis22 = response8.receivedResponseAtMillis() - response8.sentRequestAtMillis();
            if (receivedResponseAtMillis22 < 0) {
            }
            Intrinsics.checkNotNull(multimap22);
            We we22 = new We(j, multimap22, (int) contentLength, str4);
            Intrinsics.checkNotNullParameter(response8, "<this>");
            code = response8.code();
            if (400 <= code) {
            }
            c3918cf = new C3918cf(str3, code22, byteString, we22);
            response8.close();
            return c3918cf;
        } catch (MalformedURLException e20) {
            e = e20;
            response7 = response8;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
            C4095j6 c4095j672 = new C4095j6(str3, EnumC4069i6.p);
            if (response7 != null) {
            }
            return c4095j672;
        } catch (SocketTimeoutException e21) {
            e = e21;
            response6 = response8;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
            C4095j6 c4095j6222 = new C4095j6(str3, EnumC4069i6.t);
            if (response6 != null) {
            }
            return c4095j6222;
        } catch (IOException e22) {
            e = e22;
            response5 = response8;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
            C4095j6 c4095j6322 = new C4095j6(str3, EnumC4069i6.e);
            if (response5 != null) {
            }
            return c4095j6322;
        } catch (NoSuchElementException e23) {
            e = e23;
            response4 = response8;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
            C4095j6 c4095j6422 = new C4095j6(str3, EnumC4069i6.q);
            if (response4 != null) {
            }
            return c4095j6422;
        } catch (TimeoutCancellationException e24) {
            e = e24;
            response3 = response8;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
            C4095j6 c4095j6522 = new C4095j6(str3, EnumC4069i6.r);
            if (response3 != null) {
            }
            return c4095j6522;
        } catch (CancellationException e25) {
            e = e25;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
            throw e;
        } catch (Exception e26) {
            e = e26;
            response2 = response8;
            Intrinsics.checkNotNullExpressionValue(Arrays.toString(e.getStackTrace()), "toString(...)");
            C4095j6 c4095j6622 = new C4095j6(str3, EnumC4069i6.d);
            if (response2 != null) {
            }
            return c4095j6622;
        } catch (Throwable th) {
            th = th;
            response = response8;
            if (response != null) {
                response.close();
            }
            throw th;
        }
        d4 = new D4(this, continuationImpl);
        Object obj2 = d4.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = d4.d;
        response = null;
        str4 = null;
        String str42 = null;
        response7 = null;
        response6 = null;
        response5 = null;
        response4 = null;
        response3 = null;
        response2 = null;
        response7 = null;
        response6 = null;
        response5 = null;
        response4 = null;
        response3 = null;
        response2 = null;
        if (i != 0) {
        }
        response8 = (Response) obj2;
    }

    public final Object a(AbstractC3866af abstractC3866af, ContinuationImpl continuationImpl) {
        OkHttpClient okHttpClient = this.b;
        Pair a = a(abstractC3866af);
        Request request = (Request) a.component1();
        C4095j6 c4095j6 = (C4095j6) a.component2();
        if (c4095j6 != null || request == null) {
            return c4095j6 != null ? c4095j6 : new C4095j6(abstractC3866af.c(), EnumC4069i6.d);
        }
        return a(okHttpClient, request, abstractC3866af.c(), continuationImpl);
    }
}
