package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* loaded from: classes11.dex */
public final class Cc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Dc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(Dc dc, Continuation continuation) {
        super(2, continuation);
        this.b = dc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Cc(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Cc(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Dc dc = this.b;
            String str3 = dc.a;
            int i2 = dc.b;
            int i3 = dc.c;
            IntRange intRange = AbstractC4026gf.a;
            dc.g = new Xe(str3, null, null, null, new Vi(i2, i3 * 1000, 0), false, 46);
            Dc dc2 = this.b;
            Xe xe = dc2.g;
            Context context = AbstractC4002fj.a;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa a2 = Pa.a(context, "mraid_js_store");
                str = "key";
                str2 = "last_ts";
                Intrinsics.checkNotNullParameter(str2, str);
                if ((System.currentTimeMillis() / 1000) - a2.a.getLong(str2, 0L) > dc2.d && xe != null) {
                    F9 f9 = (F9) Ve.c.getValue();
                    this.a = 1;
                    a = f9.a.a(xe, this);
                    if (a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a = obj;
        str = "key";
        str2 = "last_ts";
        InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) a;
        Context context2 = AbstractC4002fj.a;
        if (!Fl.a(interfaceC3892bf)) {
            Dc dc3 = this.b;
            InterfaceC4466x9 interfaceC4466x9 = dc3.e;
            if (interfaceC4466x9 != null) {
                String str4 = dc3.f;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C4493y9) interfaceC4466x9).b(str4, "Getting MRAID Js from server failed.");
            }
        } else if (context2 != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
            ConcurrentHashMap concurrentHashMap2 = Qa.b;
            Qa a3 = Pa.a(context2, "mraid_js_store");
            IntRange intRange2 = AbstractC4026gf.a;
            Intrinsics.checkNotNullParameter(interfaceC3892bf, "<this>");
            String value = interfaceC3892bf.d().string(Charsets.UTF_8);
            Intrinsics.checkNotNullParameter("mraid_js_string", str);
            Intrinsics.checkNotNullParameter(value, "value");
            a3.a("mraid_js_string", value, false);
            a3.a(str2, System.currentTimeMillis() / 1000, false);
        }
        return Unit.INSTANCE;
    }
}
