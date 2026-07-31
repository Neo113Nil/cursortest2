package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.vungle.ads.EvaluateJsError;
import com.vungle.ads.internal.model.h0;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class v extends Lambda implements Function0 {
    public final /* synthetic */ z a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, WebView webView, String str) {
        super(0);
        this.a = zVar;
        this.b = webView;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Object m8023constructorimpl;
        h0 h0Var;
        WebView webView = this.b;
        String str = this.c;
        try {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = null;
            if (webView != null) {
                LiftoffMonetizeNetworkBridge.webViewEvaluateJavaScript(webView, str, null);
                unit = Unit.INSTANCE;
            }
            m8023constructorimpl = Result.m8023constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        z zVar = this.a;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Evaluate js failed ");
            a.append(m8026exceptionOrNullimpl.getLocalizedMessage());
            EvaluateJsError evaluateJsError = new EvaluateJsError(a.toString());
            h0Var = zVar.a;
            evaluateJsError.setLogEntry$vungle_ads_release(h0Var.q()).logErrorNoReturnValue$vungle_ads_release();
        }
        return Unit.INSTANCE;
    }
}
