package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Lo {
    public final Xe a;
    public final C4250p3 b;
    public final long c;
    public Function0 d;
    public Ko e;
    public final Handler f;
    public Runnable g;

    public Lo(Xe mNetworkRequest, C4250p3 mWebViewClient, long j, Function0 function0) {
        Intrinsics.checkNotNullParameter(mNetworkRequest, "mNetworkRequest");
        Intrinsics.checkNotNullParameter(mWebViewClient, "mWebViewClient");
        this.a = mNetworkRequest;
        this.b = mWebViewClient;
        this.c = j;
        this.d = function0;
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final void a(Lo lo) {
        Intrinsics.checkNotNullExpressionValue("Lo", "TAG");
        String str = lo.a.a;
        lo.a();
        Function0 function0 = lo.d;
        if (function0 != null) {
            function0.mo4828invoke();
        }
        lo.d = null;
    }

    public final void b() {
        try {
            Context context = AbstractC4002fj.a;
            if (context != null) {
                Ko ko = new Ko(context);
                ko.setWebViewClient(this.b);
                ko.getSettings().setJavaScriptEnabled(true);
                ko.getSettings().setCacheMode(2);
                this.e = ko;
            }
            Ko ko2 = this.e;
            if (ko2 != null) {
                Xe xe = this.a;
                String a = AbstractC4026gf.a(xe.a, xe.d);
                Map map = this.a.b;
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                InMobiNetworkBridge.webviewLoadUrl(ko2, a, map);
            }
            if (this.c > 0) {
                Runnable runnable = new Runnable() { // from class: com.inmobi.media.Lo$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Lo.a(Lo.this);
                    }
                };
                this.f.postDelayed(runnable, this.c);
                this.g = runnable;
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Lo", "TAG");
            e.getMessage();
        }
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.f.removeCallbacks(runnable);
        }
        this.g = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Ko ko = this.e;
            if (ko != null && !ko.a) {
                ko.stopLoading();
                ko.removeAllViews();
                ko.destroy();
            }
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        this.e = null;
    }
}
