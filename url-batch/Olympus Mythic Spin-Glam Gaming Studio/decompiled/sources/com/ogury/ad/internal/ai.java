package com.ogury.ad.internal;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import android.webkit.WebView;
import com.ogury.core.OguryError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes10.dex */
public final class ai extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Window d;
    public final /* synthetic */ Bitmap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(WebView webView, Rect rect, Window window, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.b = webView;
        this.c = rect;
        this.d = window;
        this.e = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ai(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        WebView webView = this.b;
        Rect rect = this.c;
        Window window = this.d;
        Bitmap bitmap = this.e;
        this.a = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        int[] iArr = new int[2];
        webView.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = rect.left + i2;
        int i4 = iArr[1];
        Rect rect2 = new Rect(i3, rect.top + i4, i2 + rect.right, i4 + rect.bottom);
        cancellableContinuationImpl.invokeOnCancellation(new yh(bitmap));
        try {
            PixelCopy.request(window, rect2, bitmap, new zh(cancellableContinuationImpl, bitmap), new Handler(Looper.getMainLooper()));
        } catch (Exception e) {
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new OguryError(104, "PixelCopy request failed: " + e.getMessage()))));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
