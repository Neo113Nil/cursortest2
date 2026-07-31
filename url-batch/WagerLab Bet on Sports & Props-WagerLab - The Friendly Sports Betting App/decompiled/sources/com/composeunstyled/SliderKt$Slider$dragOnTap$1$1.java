package com.composeunstyled;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SliderKt$Slider$dragOnTap$1$1 implements PointerInputEventHandler {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ MutableFloatState $pressOffset$delegate;
    final /* synthetic */ MutableState<Float> $rawOffset$delegate;
    final /* synthetic */ CoroutineScope $scope;

    SliderKt$Slider$dragOnTap$1$1(boolean z, boolean z2, float f, CoroutineScope coroutineScope, MutableState<Float> mutableState, MutableFloatState mutableFloatState, DraggableState draggableState, FocusRequester focusRequester) {
        this.$enabled = z;
        this.$isRtl = z2;
        this.$maxPx = f;
        this.$scope = coroutineScope;
        this.$rawOffset$delegate = mutableState;
        this.$pressOffset$delegate = mutableFloatState;
        this.$draggableState = draggableState;
        this.$focusRequester = focusRequester;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        if (this.$enabled) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$scope, this.$rawOffset$delegate, this.$pressOffset$delegate, this.$draggableState, this.$focusRequester, null);
            final CoroutineScope coroutineScope = this.$scope;
            final DraggableState draggableState = this.$draggableState;
            Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, new Function1() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = SliderKt$Slider$dragOnTap$1$1.invoke$lambda$0(CoroutineScope.this, draggableState, (Offset) obj);
                    return invoke$lambda$0;
                }
            }, continuation, 3, null);
            return detectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pos", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$1$1$1", f = "Slider.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        final /* synthetic */ DraggableState $draggableState;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ MutableFloatState $pressOffset$delegate;
        final /* synthetic */ MutableState<Float> $rawOffset$delegate;
        final /* synthetic */ CoroutineScope $scope;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, float f, CoroutineScope coroutineScope, MutableState<Float> mutableState, MutableFloatState mutableFloatState, DraggableState draggableState, FocusRequester focusRequester, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$isRtl = z;
            this.$maxPx = f;
            this.$scope = coroutineScope;
            this.$rawOffset$delegate = mutableState;
            this.$pressOffset$delegate = mutableFloatState;
            this.$draggableState = draggableState;
            this.$focusRequester = focusRequester;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m9535invoked4ec7I(pressGestureScope, offset.m5423unboximpl(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m9535invoked4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$scope, this.$rawOffset$delegate, this.$pressOffset$delegate, this.$draggableState, this.$focusRequester, continuation);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float Slider$lambda$9;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                    long j = this.J$0;
                    float intBitsToFloat = this.$isRtl ? this.$maxPx - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
                    MutableFloatState mutableFloatState = this.$pressOffset$delegate;
                    Slider$lambda$9 = SliderKt.Slider$lambda$9(this.$rawOffset$delegate);
                    mutableFloatState.setFloatValue(intBitsToFloat - Slider$lambda$9);
                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00671(this.$draggableState, this.$focusRequester, null), 3, null);
                    this.label = 1;
                    if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (GestureCancellationException unused) {
                this.$pressOffset$delegate.setFloatValue(0.0f);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$1$1$1$1", f = "Slider.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ DraggableState $draggableState;
            final /* synthetic */ FocusRequester $focusRequester;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00671(DraggableState draggableState, FocusRequester focusRequester, Continuation<? super C00671> continuation) {
                super(2, continuation);
                this.$draggableState = draggableState;
                this.$focusRequester = focusRequester;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00671(this.$draggableState, this.$focusRequester, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$1$1$1$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C00681 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ FocusRequester $focusRequester;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00681(FocusRequester focusRequester, Continuation<? super C00681> continuation) {
                    super(2, continuation);
                    this.$focusRequester = focusRequester;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00681 c00681 = new C00681(this.$focusRequester, continuation);
                    c00681.L$0 = obj;
                    return c00681;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DragScope dragScope, Continuation<? super Unit> continuation) {
                    return ((C00681) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DragScope dragScope = (DragScope) this.L$0;
                    FocusRequester.m5320requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
                    dragScope.dragBy(0.0f);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$draggableState.drag(MutatePriority.UserInput, new C00681(this.$focusRequester, null), this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(CoroutineScope coroutineScope, DraggableState draggableState, Offset offset) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SliderKt$Slider$dragOnTap$1$1$2$1(draggableState, null), 3, null);
        return Unit.INSTANCE;
    }
}
