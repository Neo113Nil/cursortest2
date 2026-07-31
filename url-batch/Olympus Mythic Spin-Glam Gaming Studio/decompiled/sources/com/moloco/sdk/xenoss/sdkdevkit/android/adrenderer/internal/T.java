package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T;
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
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes8.dex */
public final class T {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isAttachedToWindowFlow$1", f = "ViewVisibilityTracker.kt", l = {114, 130}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ View c;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1575a implements View.OnAttachStateChangeListener {
            public final /* synthetic */ ProducerScope a;

            public ViewOnAttachStateChangeListenerC1575a(ProducerScope producerScope) {
                this.a = producerScope;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.a.mo8216trySendJP2dKIU(Boolean.TRUE);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.a.mo8216trySendJP2dKIU(Boolean.FALSE);
            }
        }

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
            ProducerScope producerScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                producerScope = (ProducerScope) this.b;
                Boolean boxBoolean = Boxing.boxBoolean(this.c.isAttachedToWindow());
                this.b = producerScope;
                this.a = 1;
                if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                producerScope = (ProducerScope) this.b;
                ResultKt.throwOnFailure(obj);
            }
            final ViewOnAttachStateChangeListenerC1575a viewOnAttachStateChangeListenerC1575a = new ViewOnAttachStateChangeListenerC1575a(producerScope);
            this.c.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1575a);
            final View view = this.c;
            Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return T.a.a(view, viewOnAttachStateChangeListenerC1575a);
                }
            };
            this.b = null;
            this.a = 2;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        public static final Unit a(View view, ViewOnAttachStateChangeListenerC1575a viewOnAttachStateChangeListenerC1575a) {
            view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1575a);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isLifecycleResumedFlow$1", f = "ViewVisibilityTracker.kt", l = {157}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Lifecycle c;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lifecycle lifecycle, Continuation continuation) {
            super(2, continuation);
            this.c = lifecycle;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope producerScope, Continuation continuation) {
            return ((b) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.c, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.b;
                final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$b$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        T.b.a(ProducerScope.this, lifecycleOwner, event);
                    }
                };
                this.c.addObserver(lifecycleEventObserver);
                final Lifecycle lifecycle = this.c;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T$b$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return T.b.a(Lifecycle.this, lifecycleEventObserver);
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

        public static final void a(ProducerScope producerScope, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i = a.a[event.ordinal()];
            if (i == 1) {
                ChannelResult.m8219boximpl(producerScope.mo8216trySendJP2dKIU(Boolean.FALSE));
            } else if (i != 2) {
                Unit unit = Unit.INSTANCE;
            } else {
                ChannelResult.m8219boximpl(producerScope.mo8216trySendJP2dKIU(Boolean.TRUE));
            }
        }

        public static final Unit a(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            lifecycle.removeObserver(lifecycleEventObserver);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerKt$isLifecycleResumedFlow$lifecycle$1", f = "ViewVisibilityTracker.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                this.a = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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
    }

    public static final Flow b(View view) {
        return b(FlowKt.callbackFlow(new a(view, null)));
    }

    public static final Flow b(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            return b(FlowKt.callbackFlow(new b(lifecycle, null)));
        }
        return FlowKt.flow(new c(null));
    }

    public static final <T> Flow b(Flow flow) {
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.conflate(flow)), com.moloco.sdk.internal.scheduling.b.a().getMain());
    }
}
