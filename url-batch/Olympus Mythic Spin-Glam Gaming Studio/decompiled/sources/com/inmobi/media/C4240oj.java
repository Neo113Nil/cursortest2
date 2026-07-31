package com.inmobi.media;

import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4240oj extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ C4266pj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ WebView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4240oj(C4266pj c4266pj, long j, String str, WebView webView, Continuation continuation) {
        super(2, continuation);
        this.b = c4266pj;
        this.c = j;
        this.d = str;
        this.e = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4240oj(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4240oj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[ADDED_TO_REGION] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int ordinal;
        WebView webView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b.a;
            this.a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean z2 = false;
        boolean z3 = this.c == this.b.e;
        String str = this.d;
        if (str != null) {
            WebView webView2 = this.e;
            if (Intrinsics.areEqual(str, webView2 != null ? webView2.getUrl() : null)) {
                z = true;
                ordinal = this.b.g.ordinal();
                if (ordinal == 1 ? !this.b.h : ordinal == 3) {
                    z2 = true;
                }
                if (z3 && z && !this.b.f && z2 && (webView = this.e) != null && webView.isAttachedToWindow()) {
                    this.b.a("PAGE_COMMIT_VISIBLE", this.d);
                }
                return Unit.INSTANCE;
            }
        }
        z = false;
        ordinal = this.b.g.ordinal();
        if (ordinal == 1) {
            z2 = true;
            if (z3) {
            }
            return Unit.INSTANCE;
        }
        z2 = true;
        if (z3) {
            this.b.a("PAGE_COMMIT_VISIBLE", this.d);
        }
        return Unit.INSTANCE;
    }
}
