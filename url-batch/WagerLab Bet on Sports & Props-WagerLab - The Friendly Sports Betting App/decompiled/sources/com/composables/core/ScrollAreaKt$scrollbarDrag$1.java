package com.composables.core;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScrollArea.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ScrollAreaKt$scrollbarDrag$1 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ MutableState<DragInteraction.Start> $draggedInteraction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ SliderAdapter $sliderAdapter;

    ScrollAreaKt$scrollbarDrag$1(MutableInteractionSource mutableInteractionSource, MutableState<DragInteraction.Start> mutableState, SliderAdapter sliderAdapter) {
        this.$interactionSource = mutableInteractionSource;
        this.$draggedInteraction = mutableState;
        this.$sliderAdapter = sliderAdapter;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-1610673004);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610673004, i, -1, "com.composables.core.scrollbarDrag.<anonymous> (ScrollArea.kt:502)");
        }
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$interactionSource, composer, 0);
        final State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$draggedInteraction, composer, 0);
        final State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(this.$sliderAdapter, composer, 0);
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean changed = composer.changed(rememberUpdatedState) | composer.changed(rememberUpdatedState2) | composer.changed(rememberUpdatedState3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1

                /* compiled from: ScrollArea.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1$1", f = "ScrollArea.kt", i = {0, 1}, l = {509, 514}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "interaction"}, s = {"L$0", "L$0"})
                /* renamed from: com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ State<MutableState<DragInteraction.Start>> $currentDraggedInteraction$delegate;
                    final /* synthetic */ State<MutableInteractionSource> $currentInteractionSource$delegate;
                    final /* synthetic */ State<SliderAdapter> $currentSliderAdapter$delegate;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(State<? extends MutableInteractionSource> state, State<? extends MutableState<DragInteraction.Start>> state2, State<SliderAdapter> state3, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$currentInteractionSource$delegate = state;
                        this.$currentDraggedInteraction$delegate = state2;
                        this.$currentSliderAdapter$delegate = state3;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentInteractionSource$delegate, this.$currentDraggedInteraction$delegate, this.$currentSliderAdapter$delegate, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0088  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        AwaitPointerEventScope awaitPointerEventScope;
                        MutableInteractionSource invoke$lambda$0;
                        MutableState invoke$lambda$1;
                        SliderAdapter invoke$lambda$2;
                        DragInteraction.Start start;
                        DragInteraction.Cancel cancel;
                        MutableInteractionSource invoke$lambda$02;
                        MutableState invoke$lambda$12;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                            this.L$0 = awaitPointerEventScope2;
                            this.label = 1;
                            obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, this, 2, null);
                            if (obj != coroutine_suspended) {
                                awaitPointerEventScope = awaitPointerEventScope2;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            start = (DragInteraction.Start) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                cancel = new DragInteraction.Stop(start);
                            } else {
                                cancel = new DragInteraction.Cancel(start);
                            }
                            invoke$lambda$02 = ScrollAreaKt$scrollbarDrag$1.invoke$lambda$0(this.$currentInteractionSource$delegate);
                            invoke$lambda$02.tryEmit(cancel);
                            invoke$lambda$12 = ScrollAreaKt$scrollbarDrag$1.invoke$lambda$1(this.$currentDraggedInteraction$delegate);
                            invoke$lambda$12.setValue(null);
                            return Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        DragInteraction.Start start2 = new DragInteraction.Start();
                        invoke$lambda$0 = ScrollAreaKt$scrollbarDrag$1.invoke$lambda$0(this.$currentInteractionSource$delegate);
                        invoke$lambda$0.tryEmit(start2);
                        invoke$lambda$1 = ScrollAreaKt$scrollbarDrag$1.invoke$lambda$1(this.$currentDraggedInteraction$delegate);
                        invoke$lambda$1.setValue(start2);
                        invoke$lambda$2 = ScrollAreaKt$scrollbarDrag$1.invoke$lambda$2(this.$currentSliderAdapter$delegate);
                        invoke$lambda$2.onDragStarted();
                        long id = ((PointerInputChange) obj).getId();
                        final State<SliderAdapter> state = this.$currentSliderAdapter$delegate;
                        this.L$0 = start2;
                        this.label = 2;
                        obj = DragGestureDetectorKt.m492dragjO51t88(awaitPointerEventScope, id, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0078: INVOKE (r11v8 'obj' java.lang.Object) = 
                              (r1v2 'awaitPointerEventScope' androidx.compose.ui.input.pointer.AwaitPointerEventScope)
                              (r4v8 'id' long)
                              (wrap:kotlin.jvm.functions.Function1:0x006e: CONSTRUCTOR (r11v5 'state' androidx.compose.runtime.State<com.composables.core.SliderAdapter> A[DONT_INLINE]) A[MD:(androidx.compose.runtime.State):void (m), WRAPPED] call: com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.runtime.State):void type: CONSTRUCTOR)
                              (r10v0 'this' com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1$1 A[IMMUTABLE_TYPE, THIS])
                             STATIC call: androidx.compose.foundation.gestures.DragGestureDetectorKt.drag-jO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object A[MD:(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>, kotlin.coroutines.Continuation<? super java.lang.Boolean>):java.lang.Object (m)] in method: com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 15 more
                            */
                        /*
                            this = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r10.label
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L26
                            if (r1 == r3) goto L1e
                            if (r1 != r2) goto L16
                            java.lang.Object r0 = r10.L$0
                            androidx.compose.foundation.interaction.DragInteraction$Start r0 = (androidx.compose.foundation.interaction.DragInteraction.Start) r0
                            kotlin.ResultKt.throwOnFailure(r11)
                            goto L80
                        L16:
                            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r11.<init>(r0)
                            throw r11
                        L1e:
                            java.lang.Object r1 = r10.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.ResultKt.throwOnFailure(r11)
                            goto L41
                        L26:
                            kotlin.ResultKt.throwOnFailure(r11)
                            java.lang.Object r11 = r10.L$0
                            r4 = r11
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                            r7 = r10
                            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                            r10.L$0 = r4
                            r10.label = r3
                            r5 = 0
                            r6 = 0
                            r8 = 2
                            r9 = 0
                            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                            if (r11 != r0) goto L40
                            goto L7e
                        L40:
                            r1 = r4
                        L41:
                            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                            androidx.compose.foundation.interaction.DragInteraction$Start r3 = new androidx.compose.foundation.interaction.DragInteraction$Start
                            r3.<init>()
                            androidx.compose.runtime.State<androidx.compose.foundation.interaction.MutableInteractionSource> r4 = r10.$currentInteractionSource$delegate
                            androidx.compose.foundation.interaction.MutableInteractionSource r4 = com.composables.core.ScrollAreaKt$scrollbarDrag$1.access$invoke$lambda$0(r4)
                            r5 = r3
                            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
                            r4.tryEmit(r5)
                            androidx.compose.runtime.State<androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start>> r4 = r10.$currentDraggedInteraction$delegate
                            androidx.compose.runtime.MutableState r4 = com.composables.core.ScrollAreaKt$scrollbarDrag$1.access$invoke$lambda$1(r4)
                            r4.setValue(r3)
                            androidx.compose.runtime.State<com.composables.core.SliderAdapter> r4 = r10.$currentSliderAdapter$delegate
                            com.composables.core.SliderAdapter r4 = com.composables.core.ScrollAreaKt$scrollbarDrag$1.access$invoke$lambda$2(r4)
                            r4.onDragStarted()
                            long r4 = r11.getId()
                            androidx.compose.runtime.State<com.composables.core.SliderAdapter> r11 = r10.$currentSliderAdapter$delegate
                            com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1$1$$ExternalSyntheticLambda0 r6 = new com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1$1$$ExternalSyntheticLambda0
                            r6.<init>(r11)
                            r11 = r10
                            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
                            r10.L$0 = r3
                            r10.label = r2
                            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m492dragjO51t88(r1, r4, r6, r11)
                            if (r11 != r0) goto L7f
                        L7e:
                            return r0
                        L7f:
                            r0 = r3
                        L80:
                            java.lang.Boolean r11 = (java.lang.Boolean) r11
                            boolean r11 = r11.booleanValue()
                            if (r11 == 0) goto L90
                            androidx.compose.foundation.interaction.DragInteraction$Stop r11 = new androidx.compose.foundation.interaction.DragInteraction$Stop
                            r11.<init>(r0)
                            androidx.compose.foundation.interaction.DragInteraction r11 = (androidx.compose.foundation.interaction.DragInteraction) r11
                            goto L97
                        L90:
                            androidx.compose.foundation.interaction.DragInteraction$Cancel r11 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
                            r11.<init>(r0)
                            androidx.compose.foundation.interaction.DragInteraction r11 = (androidx.compose.foundation.interaction.DragInteraction) r11
                        L97:
                            androidx.compose.runtime.State<androidx.compose.foundation.interaction.MutableInteractionSource> r0 = r10.$currentInteractionSource$delegate
                            androidx.compose.foundation.interaction.MutableInteractionSource r0 = com.composables.core.ScrollAreaKt$scrollbarDrag$1.access$invoke$lambda$0(r0)
                            androidx.compose.foundation.interaction.Interaction r11 = (androidx.compose.foundation.interaction.Interaction) r11
                            r0.tryEmit(r11)
                            androidx.compose.runtime.State<androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start>> r11 = r10.$currentDraggedInteraction$delegate
                            androidx.compose.runtime.MutableState r11 = com.composables.core.ScrollAreaKt$scrollbarDrag$1.access$invoke$lambda$1(r11)
                            r0 = 0
                            r11.setValue(r0)
                            kotlin.Unit r11 = kotlin.Unit.INSTANCE
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.composables.core.ScrollAreaKt$scrollbarDrag$1$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invokeSuspend$lambda$0(State state, PointerInputChange pointerInputChange) {
                        SliderAdapter invoke$lambda$2;
                        invoke$lambda$2 = ScrollAreaKt$scrollbarDrag$1.invoke$lambda$2(state);
                        invoke$lambda$2.m9416onDragDeltak4lQ0M(PointerEventKt.positionChange(pointerInputChange));
                        pointerInputChange.consume();
                        return Unit.INSTANCE;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(rememberUpdatedState, rememberUpdatedState2, rememberUpdatedState3, null), continuation);
                    return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(composed, unit, (PointerInputEventHandler) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pointerInput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableInteractionSource invoke$lambda$0(State<? extends MutableInteractionSource> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState<DragInteraction.Start> invoke$lambda$1(State<? extends MutableState<DragInteraction.Start>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SliderAdapter invoke$lambda$2(State<SliderAdapter> state) {
        return state.getValue();
    }
}
