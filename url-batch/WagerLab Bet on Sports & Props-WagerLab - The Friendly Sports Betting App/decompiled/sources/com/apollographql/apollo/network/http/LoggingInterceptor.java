package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.ByteStringHttpBody;
import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0017\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\nJ\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002J\u001e\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo/network/http/LoggingInterceptor;", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", FirebaseAnalytics.Param.LEVEL, "Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;", "log", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "intercept", "Lokio/Source;", "Lokio/BufferedSource;", "Lcom/apollographql/apollo/api/http/HttpResponse;", "request", "Lcom/apollographql/apollo/api/http/HttpRequest;", "chain", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lcom/apollographql/apollo/network/http/HttpInterceptorChain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Level", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggingInterceptor implements HttpInterceptor {
    private final Level level;
    private final Function1<String, Unit> log;

    /* JADX WARN: Multi-variable type inference failed */
    public LoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoggingInterceptor(Level level, Function1<? super String, Unit> log) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(log, "log");
        this.level = level;
        this.log = log;
    }

    public /* synthetic */ LoggingInterceptor(Level level, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(level, (i & 2) != 0 ? new Function1() { // from class: com.apollographql.apollo.network.http.LoggingInterceptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = LoggingInterceptor._init_$lambda$0((String) obj);
                return _init_$lambda$0;
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        System.out.println((Object) it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor(Function1<? super String, Unit> log) {
        this(Level.BODY, log);
        Intrinsics.checkNotNullParameter(log, "log");
    }

    public /* synthetic */ LoggingInterceptor(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: com.apollographql.apollo.network.http.LoggingInterceptor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$1;
                _init_$lambda$1 = LoggingInterceptor._init_$lambda$1((String) obj);
                return _init_$lambda$1;
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        System.out.println((Object) it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/network/http/LoggingInterceptor$Level;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level NONE = new Level("NONE", 0);
        public static final Level BASIC = new Level("BASIC", 1);
        public static final Level HEADERS = new Level("HEADERS", 2);
        public static final Level BODY = new Level("BODY", 3);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{NONE, BASIC, HEADERS, BODY};
        }

        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        private Level(String str, int i) {
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    private final Source intercept(final BufferedSource bufferedSource) {
        return new Source() { // from class: com.apollographql.apollo.network.http.LoggingInterceptor$intercept$1
            private final Buffer buffer = new Buffer();

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                BufferedSource.this.close();
            }

            @Override // okio.Source
            public long read(Buffer sink, long byteCount) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(sink, "sink");
                Buffer buffer = new Buffer();
                long read = BufferedSource.this.read(buffer, byteCount);
                this.buffer.writeAll(buffer.peek());
                while (true) {
                    String readUtf8Line = this.buffer.readUtf8Line();
                    if (readUtf8Line != null) {
                        function1 = this.log;
                        function1.invoke(readUtf8Line);
                    } else {
                        sink.writeAll(buffer);
                        return read;
                    }
                }
            }

            @Override // okio.Source
            /* renamed from: timeout */
            public Timeout getTimeout() {
                return Timeout.NONE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.apollographql.apollo.network.http.HttpInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(HttpRequest httpRequest, HttpInterceptorChain httpInterceptorChain, Continuation<? super HttpResponse> continuation) {
        LoggingInterceptor$intercept$2 loggingInterceptor$intercept$2;
        int i;
        int i2;
        int i3;
        if (continuation instanceof LoggingInterceptor$intercept$2) {
            loggingInterceptor$intercept$2 = (LoggingInterceptor$intercept$2) continuation;
            if ((loggingInterceptor$intercept$2.label & Integer.MIN_VALUE) != 0) {
                loggingInterceptor$intercept$2.label -= Integer.MIN_VALUE;
                Object obj = loggingInterceptor$intercept$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loggingInterceptor$intercept$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.level == Level.NONE) {
                        loggingInterceptor$intercept$2.label = 1;
                        Object proceed = httpInterceptorChain.proceed(httpRequest, loggingInterceptor$intercept$2);
                        if (proceed != coroutine_suspended) {
                            return proceed;
                        }
                    } else {
                        int i4 = (this.level == Level.HEADERS || this.level == Level.BODY) ? 1 : 0;
                        int i5 = this.level != Level.BODY ? 0 : 1;
                        this.log.invoke(httpRequest.getMethod().name() + " " + httpRequest.getUrl());
                        if (i4 != 0) {
                            for (HttpHeader httpHeader : httpRequest.getHeaders()) {
                                this.log.invoke(httpHeader.getName() + ": " + httpHeader.getValue());
                            }
                            this.log.invoke("[end of headers]");
                        }
                        HttpBody body = httpRequest.getBody();
                        if (i5 != 0 && body != null) {
                            Buffer buffer = new Buffer();
                            body.writeTo(buffer);
                            ByteString readByteString = buffer.readByteString();
                            this.log.invoke(readByteString.utf8());
                            httpRequest = HttpRequest.newBuilder$default(httpRequest, null, null, 3, null).body(new ByteStringHttpBody(body.getContentType(), readByteString)).build();
                        }
                        this.log.invoke("");
                        loggingInterceptor$intercept$2.I$0 = i4;
                        loggingInterceptor$intercept$2.I$1 = i5;
                        loggingInterceptor$intercept$2.label = 2;
                        Object proceed2 = httpInterceptorChain.proceed(httpRequest, loggingInterceptor$intercept$2);
                        if (proceed2 != coroutine_suspended) {
                            i2 = i4;
                            obj = proceed2;
                            i3 = i5;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = loggingInterceptor$intercept$2.I$1;
                i2 = loggingInterceptor$intercept$2.I$0;
                ResultKt.throwOnFailure(obj);
                HttpResponse httpResponse = (HttpResponse) obj;
                this.log.invoke("HTTP: " + httpResponse.getStatusCode());
                if (i2 != 0) {
                    for (HttpHeader httpHeader2 : httpResponse.getHeaders()) {
                        this.log.invoke(httpHeader2.getName() + ": " + httpHeader2.getValue());
                    }
                    this.log.invoke("[end of headers]");
                }
                BufferedSource body2 = httpResponse.getBody();
                return (i3 != 0 || body2 == null) ? httpResponse : new HttpResponse.Builder(httpResponse.getStatusCode()).body(Okio.buffer(intercept(body2))).addHeaders(httpResponse.getHeaders()).build();
            }
        }
        loggingInterceptor$intercept$2 = new LoggingInterceptor$intercept$2(this, continuation);
        Object obj2 = loggingInterceptor$intercept$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loggingInterceptor$intercept$2.label;
        if (i != 0) {
        }
        HttpResponse httpResponse2 = (HttpResponse) obj2;
        this.log.invoke("HTTP: " + httpResponse2.getStatusCode());
        if (i2 != 0) {
        }
        BufferedSource body22 = httpResponse2.getBody();
        if (i3 != 0) {
        }
    }
}
