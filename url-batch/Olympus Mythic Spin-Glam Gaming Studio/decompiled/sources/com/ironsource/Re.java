package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Be;
import com.ironsource.InterfaceC4678h7;
import com.ironsource.We;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Re implements Se {

    @NotNull
    private final C4608d9 a;

    /* JADX WARN: Multi-variable type inference failed */
    public Re() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Be b(Context context, He he, C4957we c4957we) {
        Be a = a(context, he, c4957we);
        if (!(a instanceof Be.a)) {
            return a;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        We a2 = he.a(context, c4957we.d());
        if (a2 == null || !a2.q()) {
            return a;
        }
        Be.b bVar = new Be.b(new C4975xe(a2), null);
        IronSourceError buildUsingCachedConfigurationError = ErrorBuilder.buildUsingCachedConfigurationError(c4957we.d(), c4957we.f());
        IronSourceLoggerManager.getLogger().log(ironSourceTag, buildUsingCachedConfigurationError + ": " + bVar.d(), 1);
        he.b();
        return bVar;
    }

    @Override // com.ironsource.Se
    public void a(@NotNull Context context, @NotNull C4957we request, @NotNull He tools, @NotNull InterfaceC4921ue listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String f = request.f();
        if (f == null) {
            f = "";
        }
        tools.a("userId", f);
        tools.a("appKey", request.d());
        tools.g().i(request.f());
        tools.f();
        Be b = b(context, tools, request);
        if (b instanceof Be.b) {
            Be.b bVar = (Be.b) b;
            listener.a(new C4810oe(bVar.d(), null, bVar.c()));
        } else if (b instanceof Be.a) {
            Be.a aVar = (Be.a) b;
            listener.a(aVar.c(), aVar.d());
        }
    }

    public Re(@NotNull C4608d9 performanceMeasurer) {
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.a = performanceMeasurer;
    }

    public /* synthetic */ Re(C4608d9 c4608d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4608d9(null, null, 3, null) : c4608d9);
    }

    private final Be a(Context context, He he, C4957we c4957we) {
        C4846qe c4846qe;
        try {
            String c = he.c(context);
            if (TextUtils.isEmpty(c)) {
                c = he.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = c;
            C4573ba c2 = he.c();
            String a = Ye.a(context, c4957we.d(), c4957we.f(), str, null, true, c2 != null ? c2.f() : null, false);
            String jSONObject = C4644f9.a().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "createRequestData().toString()");
            InterfaceC4678h7 serverResponse = C4642f7.a(a, jSONObject);
            if (serverResponse instanceof InterfaceC4678h7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC4678h7.a) serverResponse).a());
                Intrinsics.checkNotNullExpressionValue(serverResponse, "serverResponse");
                return new Be.a(a((InterfaceC4678h7.a) serverResponse), null, 2, null);
            }
            if (serverResponse instanceof InterfaceC4678h7.b) {
                String d = ((InterfaceC4678h7.b) serverResponse).d();
                if (he.d()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(d);
                    String encryptedResponse = jsonObjectInit.optString("response");
                    if (TextUtils.isEmpty(encryptedResponse)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new Be.a(new C4846qe(2100, C4899te.h), null, 2, null);
                    }
                    boolean optBoolean = jsonObjectInit.optBoolean("compression", false);
                    Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                    d = a(encryptedResponse, optBoolean);
                    if (TextUtils.isEmpty(d)) {
                        ironLog.warning("encoded response invalid - return null");
                        he.e();
                        return new Be.a(new C4846qe(C4846qe.f, C4899te.g), null, 2, null);
                    }
                }
                this.a.a(d);
                We we = new We(context, c4957we.d(), c4957we.f(), d);
                we.a(We.a.SERVER);
                if (!we.q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String e = we.e();
                    if (e == null) {
                        e = "Unknown";
                    }
                    return new Be.a(new C4846qe(C4846qe.e, e), this.a);
                }
                return new Be.b(new C4975xe(we), this.a);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.warning("exception = " + e2);
            if (e2 instanceof JSONException) {
                c4846qe = new C4846qe(C4846qe.e, "serverResponseIsNotValid");
            } else {
                c4846qe = new C4846qe(510, "internal error");
            }
            return new Be.a(c4846qe, null, 2, null);
        }
    }

    private final String a(String str, boolean z) {
        if (z) {
            String d = J9.d(C4729k5.b().c(), str);
            Intrinsics.checkNotNullExpressionValue(d, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return d;
        }
        String b = J9.b(C4729k5.b().c(), str);
        Intrinsics.checkNotNullExpressionValue(b, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return b;
    }

    private final C4846qe a(InterfaceC4678h7.a aVar) {
        return new C4846qe(aVar.b() ? C4846qe.d : C4846qe.h, aVar.a());
    }
}
