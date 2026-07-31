package com.composables.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.composables.core.ThumbVisibility;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.composables.core.ScrollAreaKt$Thumb$1$1", f = "ScrollArea.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ScrollAreaKt$Thumb$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Boolean> $isDraggingList$delegate;
    final /* synthetic */ State<Boolean> $isHovered$delegate;
    final /* synthetic */ MutableState<Boolean> $show$delegate;
    final /* synthetic */ ThumbVisibility $thumbVisibility;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollAreaKt$Thumb$1$1(ThumbVisibility thumbVisibility, State<Boolean> state, State<Boolean> state2, MutableState<Boolean> mutableState, Continuation<? super ScrollAreaKt$Thumb$1$1> continuation) {
        super(2, continuation);
        this.$thumbVisibility = thumbVisibility;
        this.$isDraggingList$delegate = state;
        this.$isHovered$delegate = state2;
        this.$show$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScrollAreaKt$Thumb$1$1(this.$thumbVisibility, this.$isDraggingList$delegate, this.$isHovered$delegate, this.$show$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScrollAreaKt$Thumb$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r6 != false) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean Thumb$lambda$33;
        boolean Thumb$lambda$30;
        boolean Thumb$lambda$32;
        boolean Thumb$lambda$322;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Thumb$lambda$33 = ScrollAreaKt.Thumb$lambda$33(this.$isDraggingList$delegate);
            if (!Thumb$lambda$33) {
                Thumb$lambda$322 = ScrollAreaKt.Thumb$lambda$32(this.$isHovered$delegate);
            }
            ScrollAreaKt.Thumb$lambda$31(this.$show$delegate, true);
            Thumb$lambda$30 = ScrollAreaKt.Thumb$lambda$30(this.$show$delegate);
            if (Thumb$lambda$30) {
                Thumb$lambda$32 = ScrollAreaKt.Thumb$lambda$32(this.$isHovered$delegate);
                if (!Thumb$lambda$32) {
                    this.label = 1;
                    if (DelayKt.m13875delayVtjQ1oo(((ThumbVisibility.HideWhileIdle) this.$thumbVisibility).m9420getHideDelayUwyO8pc(), this) == coroutine_suspended) {
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
        ScrollAreaKt.Thumb$lambda$31(this.$show$delegate, false);
        return Unit.INSTANCE;
    }
}
