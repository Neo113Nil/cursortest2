package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes12.dex */
public final class w extends S {
    public static final int b = 0;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ImpressionViewVisibilityTracker$isEnoughAreaVisibleFlow$1", f = "ViewVisibilityTracker.kt", l = {103}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, Continuation continuation) {
            super(2, continuation);
            this.c = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope producerScope, Continuation continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.c, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.b;
                boolean z = false;
                final Rect rect = new Rect(0, 0, 0, 0);
                final View view = this.c;
                final ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w$a$$ExternalSyntheticLambda0
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        return w.a.a(ProducerScope.this, view, rect);
                    }
                };
                this.c.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
                if (this.c.isShown() && this.c.getGlobalVisibleRect(rect)) {
                    z = true;
                }
                producerScope.mo8216trySendJP2dKIU(Boxing.boxBoolean(z));
                final View view2 = this.c;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w$a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return w.a.a(view2, onPreDrawListener);
                    }
                };
                this.a = 1;
                if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        public static final boolean a(ProducerScope producerScope, View view, Rect rect) {
            producerScope.mo8216trySendJP2dKIU(Boolean.valueOf(view.isShown() && view.getGlobalVisibleRect(rect)));
            return true;
        }

        public static final Unit a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S
    @NotNull
    public Flow b(@NotNull View view) {
        Flow b2;
        Intrinsics.checkNotNullParameter(view, "view");
        b2 = T.b(FlowKt.callbackFlow(new a(view, null)));
        return b2;
    }
}
