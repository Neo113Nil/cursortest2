package io.bidmachine.analytics.internal.A;

import android.util.Base64;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.internal.I.f;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.b.C5893a;
import io.bidmachine.util.network.NetworkUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class a {
    public static final C1720a e = new C1720a(null);
    private final io.bidmachine.analytics.internal.A.c a;
    private final String b;
    private final f c;
    private final C5893a d;

    /* renamed from: io.bidmachine.analytics.internal.A.a$a, reason: collision with other inner class name */
    public static final class C1720a {
        public /* synthetic */ C1720a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1720a() {
        }
    }

    static final class b extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object a = a.this.a(this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    static final class c extends SuspendLambda implements Function2 {
        int a;

        /* renamed from: io.bidmachine.analytics.internal.A.a$c$a, reason: collision with other inner class name */
        static final class C1721a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1721a(a aVar, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1721a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1721a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a aVar = this.b;
                return aVar.a(aVar.d, this.b.b());
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m8023constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (a.this.d == null) {
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m8022boximpl(Result.m8023constructorimpl(a.this.a()));
                        }
                        CoroutineDispatcher b = a.this.c.b();
                        C1721a c1721a = new C1721a(a.this, null);
                        this.a = 1;
                        obj = BuildersKt.withContext(b, c1721a, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    byte[] bArr = (byte[]) obj;
                    a aVar = a.this;
                    aVar.a(aVar.b, bArr);
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(a.this.a());
                } catch (Throwable unused) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m8022boximpl(Result.m8023constructorimpl(a.this.a()));
                }
            } catch (Throwable th) {
                Result.Companion companion4 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            return Result.m8022boximpl(m8023constructorimpl);
        }
    }

    public a(io.bidmachine.analytics.internal.A.c cVar, String str, f fVar, C5893a c5893a) {
        this.a = cVar;
        this.b = str;
        this.c = fVar;
        this.d = c5893a;
    }

    public abstract a a();

    public abstract byte[] b();

    private final int b(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return BidMachineNetworkBridge.httpUrlConnectionGetResponseCode((HttpURLConnection) uRLConnection);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
                Object obj = bVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher c2 = this.c.c();
                    c cVar = new c(null);
                    bVar.c = 1;
                    obj = BuildersKt.withContext(c2, cVar, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.c;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a(C5893a c5893a, byte[] bArr) {
        if (bArr != null) {
            return io.bidmachine.analytics.internal.b.b.a(bArr, c5893a);
        }
        return null;
    }

    public /* synthetic */ a(io.bidmachine.analytics.internal.A.c cVar, String str, f fVar, C5893a c5893a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str, fVar, (i & 8) != 0 ? BidMachineAnalytics.INSTANCE.getEncryptionManager$bidmachine_android_sdk_j_3_7_1() : c5893a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, byte[] bArr) {
        HttpURLConnection httpURLConnection;
        URLConnection uRLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) openConnection;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.a.a(httpURLConnection);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(40000);
            httpURLConnection.setReadTimeout(40000);
            C5893a c5893a = this.d;
            if (c5893a != null) {
                httpURLConnection.setRequestProperty("bm-data", Base64.encodeToString(c5893a.a().b(), 2));
            }
            if (bArr != null && bArr.length != 0) {
                httpURLConnection.setDoOutput(true);
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(BidMachineNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                    try {
                        bufferedOutputStream2.write(bArr);
                        g.a((Flushable) bufferedOutputStream2);
                        g.a((Closeable) bufferedOutputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            Result.m8022boximpl(g.a((Flushable) bufferedOutputStream));
                        }
                        if (bufferedOutputStream != null) {
                            Result.m8022boximpl(g.a((Closeable) bufferedOutputStream));
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            int b2 = b(httpURLConnection);
            if (b2 != 200 && b2 != 204) {
                if (b2 != 305 && b2 != 307 && b2 != 308) {
                    switch (b2) {
                    }
                    throw new IllegalStateException(("Invalid response code: " + b2).toString());
                }
                String headerField = httpURLConnection.getHeaderField(NetworkUtils.HEADER_LOCATION);
                if (headerField != null && headerField.length() > 0) {
                    a(headerField, bArr);
                    a(httpURLConnection);
                    return;
                }
                throw new IllegalStateException(("Invalid response code: " + b2).toString());
            }
            a(httpURLConnection);
        } catch (Throwable th4) {
            th = th4;
            uRLConnection = httpURLConnection;
            a(uRLConnection);
            throw th;
        }
    }

    private final Object a(URLConnection uRLConnection) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (uRLConnection instanceof HttpURLConnection) {
                BidMachineNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) uRLConnection);
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }
}
