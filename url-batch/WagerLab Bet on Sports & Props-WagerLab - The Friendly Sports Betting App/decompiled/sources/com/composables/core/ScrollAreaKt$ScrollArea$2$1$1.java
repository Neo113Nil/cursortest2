package com.composables.core;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006$"}, d2 = {"com/composables/core/ScrollAreaKt$ScrollArea$2$1$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPreScroll", "Landroidx/compose/ui/geometry/Offset;", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPreScroll-OzD1aCk", "(JI)J", "onPostScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performFling", "Lkotlin/Function1;", "getPerformFling", "()Lkotlin/jvm/functions/Function1;", "performScroll", "getPerformScroll", "canScrollBackwards", "", "getCanScrollBackwards", "()Z", "canScrollForward", "getCanScrollForward", "isMovingForward", "delta", "", "isMovingBackwards", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollAreaKt$ScrollArea$2$1$1 implements NestedScrollConnection {
    final /* synthetic */ OverscrollEffect $overscrollEffect;
    final /* synthetic */ List<OverscrollSides> $overscrollEffectSides;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableSharedFlow<Unit> $scrollEvents;
    final /* synthetic */ ScrollAreaState $state;
    private final Function1<Velocity, Velocity> performFling = new Function1() { // from class: com.composables.core.ScrollAreaKt$ScrollArea$2$1$1$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Velocity performFling$lambda$17;
            performFling$lambda$17 = ScrollAreaKt$ScrollArea$2$1$1.performFling$lambda$17((Velocity) obj);
            return performFling$lambda$17;
        }
    };
    private final Function1<Offset, Offset> performScroll = new Function1() { // from class: com.composables.core.ScrollAreaKt$ScrollArea$2$1$1$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Offset performScroll$lambda$18;
            performScroll$lambda$18 = ScrollAreaKt$ScrollArea$2$1$1.performScroll$lambda$18((Offset) obj);
            return performScroll$lambda$18;
        }
    };

    public final boolean isMovingBackwards(float delta) {
        return delta > 0.0f;
    }

    public final boolean isMovingForward(float delta) {
        return delta < 0.0f;
    }

    ScrollAreaKt$ScrollArea$2$1$1(CoroutineScope coroutineScope, OverscrollEffect overscrollEffect, List<OverscrollSides> list, MutableSharedFlow<Unit> mutableSharedFlow, ScrollAreaState scrollAreaState) {
        this.$scope = coroutineScope;
        this.$overscrollEffect = overscrollEffect;
        this.$overscrollEffectSides = list;
        this.$scrollEvents = mutableSharedFlow;
        this.$state = scrollAreaState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo923onPreScrollOzD1aCk(long available, int source) {
        boolean z;
        boolean z2;
        boolean z3;
        BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new ScrollAreaKt$ScrollArea$2$1$1$onPreScroll$1(this.$scrollEvents, null), 3, null);
        if (NestedScrollSource.m6828equalsimpl0(source, NestedScrollSource.INSTANCE.m6840getUserInputWNlRxjI()) && this.$overscrollEffect != null) {
            int i = (int) (4294967295L & available);
            boolean z4 = true;
            if (isMovingBackwards(Float.intBitsToFloat(i)) && !getCanScrollBackwards()) {
                List<OverscrollSides> list = this.$overscrollEffectSides;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int id = ((OverscrollSides) it.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9399getTopFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            if (isMovingForward(Float.intBitsToFloat(i)) && !getCanScrollForward()) {
                List<OverscrollSides> list2 = this.$overscrollEffectSides;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        int id2 = ((OverscrollSides) it2.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9395getBottomFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                            z2 = true;
                            break;
                        }
                    }
                }
            }
            z2 = false;
            int i2 = (int) (available >> 32);
            if (isMovingBackwards(Float.intBitsToFloat(i2)) && !getCanScrollBackwards()) {
                List<OverscrollSides> list3 = this.$overscrollEffectSides;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        int id3 = ((OverscrollSides) it3.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9397getLeftFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                            z3 = true;
                            break;
                        }
                    }
                }
            }
            z3 = false;
            if (isMovingForward(Float.intBitsToFloat(i2)) && !getCanScrollForward()) {
                List<OverscrollSides> list4 = this.$overscrollEffectSides;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        int id4 = ((OverscrollSides) it4.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9398getRightFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                            break;
                        }
                    }
                }
            }
            z4 = false;
            if (z || z2 || z3 || z4) {
                this.$overscrollEffect.mo241applyToScrollRhakbz0(available, source, this.performScroll);
            }
        }
        return super.mo923onPreScrollOzD1aCk(available, source);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo572onPostScrollDzOQY0M(long consumed, long available, int source) {
        boolean z;
        boolean z2;
        boolean z3;
        if (NestedScrollSource.m6828equalsimpl0(source, NestedScrollSource.INSTANCE.m6840getUserInputWNlRxjI()) && this.$overscrollEffect != null) {
            int i = (int) (4294967295L & available);
            boolean z4 = true;
            if (isMovingBackwards(Float.intBitsToFloat(i)) && !getCanScrollBackwards()) {
                List<OverscrollSides> list = this.$overscrollEffectSides;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int id = ((OverscrollSides) it.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9399getTopFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            if (isMovingForward(Float.intBitsToFloat(i)) && !getCanScrollForward()) {
                List<OverscrollSides> list2 = this.$overscrollEffectSides;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        int id2 = ((OverscrollSides) it2.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9395getBottomFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                            z2 = true;
                            break;
                        }
                    }
                }
            }
            z2 = false;
            int i2 = (int) (available >> 32);
            if (isMovingBackwards(Float.intBitsToFloat(i2)) && !getCanScrollBackwards()) {
                List<OverscrollSides> list3 = this.$overscrollEffectSides;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        int id3 = ((OverscrollSides) it3.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9397getLeftFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                            z3 = true;
                            break;
                        }
                    }
                }
            }
            z3 = false;
            if (isMovingForward(Float.intBitsToFloat(i2)) && !getCanScrollForward()) {
                List<OverscrollSides> list4 = this.$overscrollEffectSides;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        int id4 = ((OverscrollSides) it4.next()).getId();
                        if (OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9398getRightFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                            break;
                        }
                    }
                }
            }
            z4 = false;
            if (z || z2 || z3 || z4) {
                this.$overscrollEffect.mo241applyToScrollRhakbz0(available, source, this.performScroll);
            }
        }
        return super.mo572onPostScrollDzOQY0M(consumed, available, source);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a1, code lost:
    
        if (r13.mo240applyToFlingBMRW4eQ(r11, r2, r0) == r1) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo922onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        ScrollAreaKt$ScrollArea$2$1$1$onPreFling$1 scrollAreaKt$ScrollArea$2$1$1$onPreFling$1;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        if (continuation instanceof ScrollAreaKt$ScrollArea$2$1$1$onPreFling$1) {
            scrollAreaKt$ScrollArea$2$1$1$onPreFling$1 = (ScrollAreaKt$ScrollArea$2$1$1$onPreFling$1) continuation;
            if ((scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.label -= Integer.MIN_VALUE;
                Object obj = scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$overscrollEffect != null) {
                        boolean z4 = false;
                        if (isMovingForward(Velocity.m8640getYimpl(j)) && !getCanScrollBackwards()) {
                            List<OverscrollSides> list = this.$overscrollEffectSides;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    int id = ((OverscrollSides) it.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9399getTopFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (isMovingBackwards(Velocity.m8640getYimpl(j)) && !getCanScrollForward()) {
                            List<OverscrollSides> list2 = this.$overscrollEffectSides;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    int id2 = ((OverscrollSides) it2.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9395getBottomFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (isMovingForward(Velocity.m8639getXimpl(j)) && !getCanScrollBackwards()) {
                            List<OverscrollSides> list3 = this.$overscrollEffectSides;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator<T> it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    int id3 = ((OverscrollSides) it3.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9397getLeftFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = false;
                        if (isMovingBackwards(Velocity.m8639getXimpl(j)) && !getCanScrollForward()) {
                            List<OverscrollSides> list4 = this.$overscrollEffectSides;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator<T> it4 = list4.iterator();
                                while (it4.hasNext()) {
                                    int id4 = ((OverscrollSides) it4.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9398getRightFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (z || z2 || z3 || z4) {
                            OverscrollEffect overscrollEffect = this.$overscrollEffect;
                            ScrollAreaKt$ScrollArea$2$1$1$onPreFling$2 scrollAreaKt$ScrollArea$2$1$1$onPreFling$2 = new ScrollAreaKt$ScrollArea$2$1$1$onPreFling$2(this.performFling);
                            scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.J$0 = j;
                            scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.label = 1;
                        }
                    }
                    scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.label = 2;
                    Object mo922onPreFlingQWom1Mo = super.mo922onPreFlingQWom1Mo(j, scrollAreaKt$ScrollArea$2$1$1$onPreFling$1);
                    return mo922onPreFlingQWom1Mo == coroutine_suspended ? coroutine_suspended : mo922onPreFlingQWom1Mo;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                j = scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.J$0;
                ResultKt.throwOnFailure(obj);
                return Velocity.m8630boximpl(j);
            }
        }
        scrollAreaKt$ScrollArea$2$1$1$onPreFling$1 = new ScrollAreaKt$ScrollArea$2$1$1$onPreFling$1(this, continuation);
        Object obj2 = scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollAreaKt$ScrollArea$2$1$1$onPreFling$1.label;
        if (i != 0) {
        }
        return Velocity.m8630boximpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onPreFling_QWom1Mo$suspendConversion0(Function1 function1, long j, Continuation continuation) {
        return function1.invoke(Velocity.m8630boximpl(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a2, code lost:
    
        if (r11.mo240applyToFlingBMRW4eQ(r13, r12, r6) == r0) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo571onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        ScrollAreaKt$ScrollArea$2$1$1$onPostFling$1 scrollAreaKt$ScrollArea$2$1$1$onPostFling$1;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        if (continuation instanceof ScrollAreaKt$ScrollArea$2$1$1$onPostFling$1) {
            scrollAreaKt$ScrollArea$2$1$1$onPostFling$1 = (ScrollAreaKt$ScrollArea$2$1$1$onPostFling$1) continuation;
            if ((scrollAreaKt$ScrollArea$2$1$1$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                scrollAreaKt$ScrollArea$2$1$1$onPostFling$1.label -= Integer.MIN_VALUE;
                ScrollAreaKt$ScrollArea$2$1$1$onPostFling$1 scrollAreaKt$ScrollArea$2$1$1$onPostFling$12 = scrollAreaKt$ScrollArea$2$1$1$onPostFling$1;
                Object obj = scrollAreaKt$ScrollArea$2$1$1$onPostFling$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollAreaKt$ScrollArea$2$1$1$onPostFling$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$overscrollEffect != null) {
                        boolean z4 = false;
                        if (isMovingBackwards(Velocity.m8640getYimpl(j2)) && !getCanScrollBackwards()) {
                            List<OverscrollSides> list = this.$overscrollEffectSides;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    int id = ((OverscrollSides) it.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9399getTopFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                        if (isMovingForward(Velocity.m8640getYimpl(j2)) && !getCanScrollForward()) {
                            List<OverscrollSides> list2 = this.$overscrollEffectSides;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    int id2 = ((OverscrollSides) it2.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9395getBottomFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id2, OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc())) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z2 = false;
                        if (isMovingBackwards(Velocity.m8639getXimpl(j2)) && !getCanScrollBackwards()) {
                            List<OverscrollSides> list3 = this.$overscrollEffectSides;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator<T> it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    int id3 = ((OverscrollSides) it3.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9397getLeftFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id3, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z3 = false;
                        if (isMovingForward(Velocity.m8639getXimpl(j2)) && !getCanScrollForward()) {
                            List<OverscrollSides> list4 = this.$overscrollEffectSides;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator<T> it4 = list4.iterator();
                                while (it4.hasNext()) {
                                    int id4 = ((OverscrollSides) it4.next()).getId();
                                    if (OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9398getRightFfLkZdc()) || OverscrollSides.m9391equalsimpl0(id4, OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (z || z2 || z3 || z4) {
                            OverscrollEffect overscrollEffect = this.$overscrollEffect;
                            ScrollAreaKt$ScrollArea$2$1$1$onPostFling$2 scrollAreaKt$ScrollArea$2$1$1$onPostFling$2 = new ScrollAreaKt$ScrollArea$2$1$1$onPostFling$2(this.performFling);
                            scrollAreaKt$ScrollArea$2$1$1$onPostFling$12.J$0 = j2;
                            scrollAreaKt$ScrollArea$2$1$1$onPostFling$12.label = 1;
                        }
                    }
                    scrollAreaKt$ScrollArea$2$1$1$onPostFling$12.label = 2;
                    Object mo571onPostFlingRZ2iAVY = super.mo571onPostFlingRZ2iAVY(j, j2, scrollAreaKt$ScrollArea$2$1$1$onPostFling$12);
                    return mo571onPostFlingRZ2iAVY == coroutine_suspended ? coroutine_suspended : mo571onPostFlingRZ2iAVY;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                j2 = scrollAreaKt$ScrollArea$2$1$1$onPostFling$12.J$0;
                ResultKt.throwOnFailure(obj);
                return Velocity.m8630boximpl(j2);
            }
        }
        scrollAreaKt$ScrollArea$2$1$1$onPostFling$1 = new ScrollAreaKt$ScrollArea$2$1$1$onPostFling$1(this, continuation);
        ScrollAreaKt$ScrollArea$2$1$1$onPostFling$1 scrollAreaKt$ScrollArea$2$1$1$onPostFling$122 = scrollAreaKt$ScrollArea$2$1$1$onPostFling$1;
        Object obj2 = scrollAreaKt$ScrollArea$2$1$1$onPostFling$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollAreaKt$ScrollArea$2$1$1$onPostFling$122.label;
        if (i != 0) {
        }
        return Velocity.m8630boximpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onPostFling_RZ2iAVY$suspendConversion0$16(Function1 function1, long j, Continuation continuation) {
        return function1.invoke(Velocity.m8630boximpl(j));
    }

    public final Function1<Velocity, Velocity> getPerformFling() {
        return this.performFling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Velocity performFling$lambda$17(Velocity velocity) {
        return Velocity.m8630boximpl(Velocity.INSTANCE.m8650getZero9UxMQ8M());
    }

    public final Function1<Offset, Offset> getPerformScroll() {
        return this.performScroll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset performScroll$lambda$18(Offset offset) {
        return Offset.m5402boximpl(Offset.INSTANCE.m5429getZeroF1C5BW0());
    }

    public final boolean getCanScrollBackwards() {
        return this.$state.getScrollOffset() > 0.0d;
    }

    public final boolean getCanScrollForward() {
        return this.$state.getScrollOffset() < ScrollAreaKt.getMaxScrollOffset(this.$state);
    }
}
