package com.vungle.ads.internal.network;

import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/* loaded from: classes6.dex */
public final class m {
    public final Call a;
    public final com.vungle.ads.internal.network.converters.a b;

    static {
        new h();
    }

    public m(Call rawCall, com.vungle.ads.internal.network.converters.a responseConverter) {
        Intrinsics.checkNotNullParameter(rawCall, "rawCall");
        Intrinsics.checkNotNullParameter(responseConverter, "responseConverter");
        this.a = rawCall;
        this.b = responseConverter;
    }

    public final void a(a callback) {
        Call call;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this) {
            call = this.a;
            Unit unit = Unit.INSTANCE;
        }
        LiftoffMonetizeNetworkBridge.okhttp3CallEnqueue(call, new l(this, callback));
    }

    public final o a() {
        Call call;
        Object m8023constructorimpl;
        synchronized (this) {
            call = this.a;
            Unit unit = Unit.INSTANCE;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(a(LiftoffMonetizeNetworkBridge.okhttp3CallExecute(call)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("[execute] Failed to parse response:  ");
            a.append(m8026exceptionOrNullimpl.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", a.toString());
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (o) m8023constructorimpl;
    }

    public final o a(Response response) {
        ResponseBody okhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response);
        if (okhttp3Response_body == null) {
            return null;
        }
        Response build = response.newBuilder().body(new k(okhttp3Response_body.get$contentType(), okhttp3Response_body.getContentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                j jVar = new j(okhttp3Response_body);
                try {
                    return n.a(this.b.a(jVar), build);
                } catch (Throwable th) {
                    jVar.a();
                    throw th;
                }
            }
            okhttp3Response_body.close();
            return n.a(null, build);
        }
        try {
            Buffer buffer = new Buffer();
            LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(okhttp3Response_body).readAll(buffer);
            ResponseBody.INSTANCE.create(buffer, okhttp3Response_body.get$contentType(), okhttp3Response_body.getContentLength());
            o a = n.a(build);
            CloseableKt.closeFinally(okhttp3Response_body, null);
            return a;
        } finally {
        }
    }
}
