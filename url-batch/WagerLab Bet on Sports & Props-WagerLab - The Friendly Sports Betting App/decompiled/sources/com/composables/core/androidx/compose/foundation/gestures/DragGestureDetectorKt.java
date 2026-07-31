package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aV\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0080\u0001\u0010\u0018\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aË\u0001\u0010\u0018\u001a\u00020\f*\u00020\u001926\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\f0\u00062!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0080@¢\u0006\u0002\u0010$\u001a\u0080\u0001\u0010%\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aV\u0010&\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b(\u0010\u000e\u001a^\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+26\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0080@¢\u0006\u0004\b,\u0010-\u001a0\u0010.\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0004\b/\u0010\u0014\u001a\u001e\u00100\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b1\u0010\u0017\u001a\u0080\u0001\u00102\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u00103\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aV\u00104\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0004\b5\u0010\u000e\u001a^\u00106\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+26\u00107\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006H\u0080@¢\u0006\u0004\b8\u0010-\u001a0\u00109\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0012H\u0086@¢\u0006\u0004\b:\u0010\u0014\u001a\u001e\u0010;\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b<\u0010\u0017\u001a\u0080\u0001\u0010=\u001a\u00020\f*\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c26\u0010>\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110'¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0006H\u0086@¢\u0006\u0002\u0010\u001f\u001aP\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u00122\b\u0010?\u001a\u0004\u0018\u00010#2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u0012H\u0080H¢\u0006\u0004\bA\u0010B\u001a2\u0010C\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u0012H\u0082H¢\u0006\u0004\bE\u0010\u0014\u001aJ\u0010F\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\b\u0010?\u001a\u0004\u0018\u00010#2\u0018\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0006H\u0082H¢\u0006\u0004\bG\u0010H\u001a\u001e\u0010I\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bJ\u0010\u0017\u001a\u001b\u0010K\u001a\u00020\u0010*\u00020L2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010T\u001a\u00020'*\u00020U2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0004\bV\u0010W\"\u0010\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0004\n\u0002\u0010Q\"\u0010\u0010R\u001a\u00020PX\u0082\u0004¢\u0006\u0004\n\u0002\u0010Q\"\u000e\u0010S\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"awaitTouchSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onTouchSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "overSlop", "", "awaitTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drag", "", "onDrag", "Lkotlin/Function1;", "drag-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrCancellation", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialDelta", "shouldAwaitTouchSlop", "orientationLock", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "awaitVerticalTouchSlopOrCancellation", "", "awaitVerticalTouchSlopOrCancellation-jO51t88", "awaitVerticalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verticalDrag", "verticalDrag-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "detectVerticalDragGestures", "onVerticalDrag", "awaitHorizontalTouchSlopOrCancellation", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "awaitHorizontalPointerSlopOrCancellation", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "horizontalDrag", "horizontalDrag-jO51t88", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "detectHorizontalDragGestures", "onHorizontalDrag", "orientation", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "awaitDragOrUp-jO51t88", "awaitPointerSlopOrCancellation", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "awaitLongPressOrCancellation-rnUCldI", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "mouseSlop", "Landroidx/compose/ui/unit/Dp;", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean detectDragGestures$lambda$6() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0166 -> B:11:0x016c). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9453awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        float f2;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    int m7025getTouchT8wyACA = PointerType.INSTANCE.m7025getTouchT8wyACA();
                    if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m9462pointerSlopE8SPZFQ = m9462pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m7025getTouchT8wyACA);
                    Ref.LongRef longRef3 = new Ref.LongRef();
                    longRef3.element = j;
                    function22 = function2;
                    longRef = longRef3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    f = m9462pointerSlopE8SPZFQ;
                    touchSlopDetector = new TouchSlopDetector(null);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f3 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef4 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Offset, Unit> function23 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f3;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector3;
                    function22 = function23;
                    longRef2 = longRef4;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2 = i3 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    pointerEventPass2 = pointerEventPass;
                    i4 = 1;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                longRef = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Offset, Unit> function24 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj3);
                touchSlopDetector = touchSlopDetector4;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                f = f4;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                if (!pointerInputChange2.isConsumed()) {
                    return pointerEventPass;
                }
                function22 = function24;
                pointerEventPass2 = pointerEventPass;
                i4 = 1;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass2);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    float f5 = f;
                    touchSlopDetector2 = touchSlopDetector;
                    obj3 = awaitPointerEvent$default;
                    longRef2 = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                    f2 = f5;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes2.get(i2);
                        pointerEventPass = pointerEventPass2;
                        i3 = i2;
                        if (PointerId.m6929equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                            break;
                        }
                        i2 = i3 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes3.get(i5);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i5++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef2.element = pointerInputChange3.getId();
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                        longRef = longRef2;
                    } else {
                        Offset m9483addPointerInputChangeGcwITfU = touchSlopDetector2.m9483addPointerInputChangeGcwITfU(pointerInputChange, f2);
                        if (m9483addPointerInputChangeGcwITfU != null) {
                            function22.invoke(pointerInputChange, m9483addPointerInputChangeGcwITfU);
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            touchSlopDetector2.reset();
                            touchSlopDetector = touchSlopDetector2;
                            f = f2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                            longRef = longRef2;
                        } else {
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$2 = longRef2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.F$0 = f2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitTouchSlopOrCancellation$13) != coroutine_suspended) {
                                function24 = function22;
                                touchSlopDetector = touchSlopDetector2;
                                f = f2;
                                pointerInputChange2 = pointerInputChange;
                                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                                longRef = longRef2;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    pointerEventPass2 = pointerEventPass;
                    i4 = 1;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0049 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9459dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            if ((dragGestureDetectorKt$drag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.L$1 = function1;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m9446awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Function1<? super PointerInputChange, Unit> function12 = (Function1) dragGestureDetectorKt$drag$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function1 = function12;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            return Boxing.boxBoolean(true);
                        }
                        function1.invoke(pointerInputChange);
                        j = pointerInputChange.getId();
                        dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$drag$1.L$1 = function1;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = m9446awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return Boxing.boxBoolean(false);
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(continuation);
        Object obj2 = dragGestureDetectorKt$drag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9446awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i3++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (i2 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i2);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i2++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                ResultKt.throwOnFailure(obj);
                if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectDragGestures$lambda$1;
                    detectDragGestures$lambda$1 = DragGestureDetectorKt.detectDragGestures$lambda$1((Offset) obj2);
                    return detectDragGestures$lambda$1;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$1(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, final Function1<? super Offset, Unit> function1, final Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object detectDragGestures = detectDragGestures(pointerInputScope, new Function2() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit detectDragGestures$lambda$4;
                detectDragGestures$lambda$4 = DragGestureDetectorKt.detectDragGestures$lambda$4(Function1.this, (PointerInputChange) obj, (Offset) obj2);
                return detectDragGestures$lambda$4;
            }
        }, new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit detectDragGestures$lambda$5;
                detectDragGestures$lambda$5 = DragGestureDetectorKt.detectDragGestures$lambda$5(Function0.this, (PointerInputChange) obj);
                return detectDragGestures$lambda$5;
            }
        }, function02, new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean detectDragGestures$lambda$6;
                detectDragGestures$lambda$6 = DragGestureDetectorKt.detectDragGestures$lambda$6();
                return Boolean.valueOf(detectDragGestures$lambda$6);
            }
        }, null, function2, continuation);
        return detectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$4(Function1 function1, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        function1.invoke(Offset.m5402boximpl(change.getPosition()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGestures$lambda$5(Function0 function0, PointerInputChange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Function1<? super PointerInputChange, Unit> function1, Function0<Unit> function0, Function0<Boolean> function02, Orientation orientation, Function2<? super PointerInputChange, ? super Offset, Unit> function22, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$9(function02, orientation, function2, function22, function0, function1, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectDragGesturesAfterLongPress$lambda$7;
                    detectDragGesturesAfterLongPress$lambda$7 = DragGestureDetectorKt.detectDragGesturesAfterLongPress$lambda$7((Offset) obj2);
                    return detectDragGesturesAfterLongPress$lambda$7;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectDragGesturesAfterLongPress(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectDragGesturesAfterLongPress$lambda$7(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function0, function02, function2, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x017a -> B:11:0x0180). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9456awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        float f2;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    int m7025getTouchT8wyACA = PointerType.INSTANCE.m7025getTouchT8wyACA();
                    Orientation orientation = Orientation.Vertical;
                    if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m9462pointerSlopE8SPZFQ = m9462pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m7025getTouchT8wyACA);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation);
                    function22 = function2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    f = m9462pointerSlopE8SPZFQ;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f3;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector4;
                    function22 = function23;
                    longRef2 = longRef3;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2 = i3 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    pointerEventPass2 = pointerEventPass;
                    i4 = 1;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj3);
                touchSlopDetector = touchSlopDetector5;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                f = f4;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                if (!pointerInputChange2.isConsumed()) {
                    return pointerEventPass;
                }
                function22 = function24;
                pointerEventPass2 = pointerEventPass;
                i4 = 1;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    float f5 = f;
                    touchSlopDetector2 = touchSlopDetector;
                    obj3 = awaitPointerEvent$default;
                    longRef2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                    f2 = f5;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes2.get(i2);
                        pointerEventPass = pointerEventPass2;
                        i3 = i2;
                        if (PointerId.m6929equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                            break;
                        }
                        i2 = i3 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes3.get(i5);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i5++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef2.element = pointerInputChange3.getId();
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                        longRef = longRef2;
                    } else {
                        Offset m9483addPointerInputChangeGcwITfU = touchSlopDetector2.m9483addPointerInputChangeGcwITfU(pointerInputChange, f2);
                        if (m9483addPointerInputChangeGcwITfU != null) {
                            function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (m9483addPointerInputChangeGcwITfU.m5423unboximpl() & 4294967295L))));
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            touchSlopDetector2.reset();
                            touchSlopDetector = touchSlopDetector2;
                            f = f2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                            longRef = longRef2;
                        } else {
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$2 = longRef2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.F$0 = f2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13) != coroutine_suspended) {
                                function24 = function22;
                                touchSlopDetector = touchSlopDetector2;
                                f = f2;
                                pointerInputChange2 = pointerInputChange;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                longRef = longRef2;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    pointerEventPass2 = pointerEventPass;
                    i4 = 1;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0175 -> B:11:0x017b). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9455awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        float m9462pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        Ref.LongRef longRef2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i3;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i4;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    Orientation orientation = Orientation.Vertical;
                    if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m9462pointerSlopE8SPZFQ = m9462pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    function22 = function2;
                    touchSlopDetector = new TouchSlopDetector(orientation);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    float f2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f = f2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector3;
                    function22 = function23;
                    longRef2 = longRef3;
                    DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    pointerEventPass2 = pointerEventPass;
                    i5 = 1;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj3);
                touchSlopDetector = touchSlopDetector4;
                pointerEventPass = null;
                m9462pointerSlopE8SPZFQ = f3;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                if (!pointerInputChange2.isConsumed()) {
                    return pointerEventPass;
                }
                function22 = function24;
                pointerEventPass2 = pointerEventPass;
                i5 = 1;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector;
                    obj3 = awaitPointerEvent$default;
                    longRef2 = longRef;
                    f = m9462pointerSlopE8SPZFQ;
                    DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes2.get(i3);
                        pointerEventPass = pointerEventPass2;
                        i4 = i3;
                        if (PointerId.m6929equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                            break;
                        }
                        i3 = i4 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes3.get(i6);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef2.element = pointerInputChange3.getId();
                        touchSlopDetector = touchSlopDetector2;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132;
                        m9462pointerSlopE8SPZFQ = f;
                        longRef = longRef2;
                    } else {
                        Offset m9483addPointerInputChangeGcwITfU = touchSlopDetector2.m9483addPointerInputChangeGcwITfU(pointerInputChange, f);
                        if (m9483addPointerInputChangeGcwITfU != null) {
                            function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (m9483addPointerInputChangeGcwITfU.m5423unboximpl() & 4294967295L))));
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            touchSlopDetector2.reset();
                            touchSlopDetector = touchSlopDetector2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132;
                            m9462pointerSlopE8SPZFQ = f;
                            longRef = longRef2;
                        } else {
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132.L$2 = longRef2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132) != coroutine_suspended) {
                                function24 = function22;
                                touchSlopDetector = touchSlopDetector2;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$132;
                                pointerInputChange2 = pointerInputChange;
                                m9462pointerSlopE8SPZFQ = f;
                                longRef = longRef2;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    pointerEventPass2 = pointerEventPass;
                    i5 = 1;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9463verticalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function12;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float intBitsToFloat;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            if ((dragGestureDetectorKt$verticalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$verticalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.label;
                int i2 = 1;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Orientation orientation3 = Orientation.Vertical;
                    j2 = j;
                    if (!m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        function12 = function1;
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        longRef = longRef2;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$4 = longRef;
                        dragGestureDetectorKt$verticalDrag$12.label = i2;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.L$4;
                awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$3;
                orientation2 = (Orientation) dragGestureDetectorKt$verticalDrag$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
                Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$verticalDrag$1.L$0;
                ResultKt.throwOnFailure(obj);
                DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$1;
                function12 = function13;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    if (PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i3++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                PointerInputChange pointerInputChange3 = pointerInputChange;
                if (pointerInputChange3 == 0) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i4);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i4++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange2;
                        if (pointerInputChange4 != null) {
                            longRef.element = pointerInputChange4.getId();
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                            i2 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                            dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                            dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                            dragGestureDetectorKt$verticalDrag$12.L$4 = longRef;
                            dragGestureDetectorKt$verticalDrag$12.label = i2;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$14 = dragGestureDetectorKt$verticalDrag$12;
                            awaitPointerEventScope5 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$verticalDrag$13 = dragGestureDetectorKt$verticalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                        if (orientation2 == null) {
                            intBitsToFloat = Offset.m5411getDistanceimpl(positionChangeIgnoreConsumed);
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        }
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange32 = pointerInputChange;
                    if (pointerInputChange32 == 0) {
                        pointerInputChange32 = 0;
                    }
                }
                if (pointerInputChange32 == 0 || pointerInputChange32.isConsumed()) {
                    pointerEventPass = null;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                    pointerEventPass = pointerInputChange32;
                } else {
                    function12.invoke(pointerInputChange32);
                    orientation = orientation2;
                    j2 = pointerInputChange32.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$13;
                    i2 = 1;
                    pointerEventPass = null;
                    Ref.LongRef longRef22 = new Ref.LongRef();
                    longRef22.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    orientation2 = orientation;
                    longRef = longRef22;
                    dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$verticalDrag$12.L$2 = orientation2;
                    dragGestureDetectorKt$verticalDrag$12.L$3 = awaitPointerEventScope3;
                    dragGestureDetectorKt$verticalDrag$12.L$4 = longRef;
                    dragGestureDetectorKt$verticalDrag$12.label = i2;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, i2, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$verticalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.label;
        int i22 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9454awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r9 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r9);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r9++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                ResultKt.throwOnFailure(obj);
                if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectVerticalDragGestures$lambda$14;
                    detectVerticalDragGestures$lambda$14 = DragGestureDetectorKt.detectVerticalDragGestures$lambda$14((Offset) obj2);
                    return detectVerticalDragGestures$lambda$14;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectVerticalDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectVerticalDragGestures$lambda$14(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0177 -> B:11:0x017d). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9450awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        float f;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        Ref.LongRef longRef2;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
        float f2;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i2;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    int m7025getTouchT8wyACA = PointerType.INSTANCE.m7025getTouchT8wyACA();
                    Orientation orientation = Orientation.Horizontal;
                    if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m9462pointerSlopE8SPZFQ = m9462pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m7025getTouchT8wyACA);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    TouchSlopDetector touchSlopDetector3 = new TouchSlopDetector(orientation);
                    function22 = function2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    f = m9462pointerSlopE8SPZFQ;
                    touchSlopDetector = touchSlopDetector3;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    float f3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f3;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector4;
                    function22 = function23;
                    longRef2 = longRef3;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        i2 = i3 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    pointerEventPass2 = pointerEventPass;
                    i4 = 1;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector5 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj3);
                touchSlopDetector = touchSlopDetector5;
                pointerEventPass = null;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                f = f4;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                if (!pointerInputChange2.isConsumed()) {
                    return pointerEventPass;
                }
                function22 = function24;
                pointerEventPass2 = pointerEventPass;
                i4 = 1;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    float f5 = f;
                    touchSlopDetector2 = touchSlopDetector;
                    obj3 = awaitPointerEvent$default;
                    longRef2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                    f2 = f5;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes2.get(i2);
                        pointerEventPass = pointerEventPass2;
                        i3 = i2;
                        if (PointerId.m6929equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                            break;
                        }
                        i2 = i3 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes3.get(i5);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i5++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef2.element = pointerInputChange3.getId();
                        touchSlopDetector = touchSlopDetector2;
                        f = f2;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                        longRef = longRef2;
                    } else {
                        Offset m9483addPointerInputChangeGcwITfU = touchSlopDetector2.m9483addPointerInputChangeGcwITfU(pointerInputChange, f2);
                        if (m9483addPointerInputChangeGcwITfU != null) {
                            function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (m9483addPointerInputChangeGcwITfU.m5423unboximpl() >> 32))));
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            touchSlopDetector2.reset();
                            touchSlopDetector = touchSlopDetector2;
                            f = f2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                            longRef = longRef2;
                        } else {
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$2 = longRef2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.F$0 = f2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13) != coroutine_suspended) {
                                function24 = function22;
                                touchSlopDetector = touchSlopDetector2;
                                f = f2;
                                pointerInputChange2 = pointerInputChange;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                longRef = longRef2;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    pointerEventPass2 = pointerEventPass;
                    i4 = 1;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i4;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i4, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0172 -> B:11:0x0178). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9449awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        float m9462pointerSlopE8SPZFQ;
        Ref.LongRef longRef;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        TouchSlopDetector touchSlopDetector;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        Ref.LongRef longRef2;
        float f;
        TouchSlopDetector touchSlopDetector2;
        int size;
        int i3;
        PointerEventPass pointerEventPass;
        Object obj;
        PointerInputChange pointerInputChange;
        Object obj2;
        int i4;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i5 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    Orientation orientation = Orientation.Horizontal;
                    if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    m9462pointerSlopE8SPZFQ = m9462pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    longRef = new Ref.LongRef();
                    longRef.element = j;
                    function22 = function2;
                    touchSlopDetector = new TouchSlopDetector(orientation);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    float f2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                    TouchSlopDetector touchSlopDetector3 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                    Ref.LongRef longRef3 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                    Function2<? super PointerInputChange, ? super Float, Unit> function23 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj3);
                    f = f2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector3;
                    function22 = function23;
                    longRef2 = longRef3;
                    DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3 = i4 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    }
                    pointerEventPass2 = pointerEventPass;
                    i5 = 1;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                PointerInputChange pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
                TouchSlopDetector touchSlopDetector4 = (TouchSlopDetector) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                Function2<? super PointerInputChange, ? super Float, Unit> function24 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                ResultKt.throwOnFailure(obj3);
                touchSlopDetector = touchSlopDetector4;
                pointerEventPass = null;
                m9462pointerSlopE8SPZFQ = f3;
                awaitPointerEventScope2 = awaitPointerEventScope4;
                if (!pointerInputChange2.isConsumed()) {
                    return pointerEventPass;
                }
                function22 = function24;
                pointerEventPass2 = pointerEventPass;
                i5 = 1;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                if (awaitPointerEvent$default != coroutine_suspended) {
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                    touchSlopDetector2 = touchSlopDetector;
                    obj3 = awaitPointerEvent$default;
                    longRef2 = longRef;
                    f = m9462pointerSlopE8SPZFQ;
                    DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes2.get(i3);
                        pointerEventPass = pointerEventPass2;
                        i4 = i3;
                        if (PointerId.m6929equalsimpl0(((PointerInputChange) obj).getId(), longRef2.element)) {
                            break;
                        }
                        i3 = i4 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null || pointerInputChange.isConsumed()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes3.get(i6);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        longRef2.element = pointerInputChange3.getId();
                        touchSlopDetector = touchSlopDetector2;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132;
                        m9462pointerSlopE8SPZFQ = f;
                        longRef = longRef2;
                    } else {
                        Offset m9483addPointerInputChangeGcwITfU = touchSlopDetector2.m9483addPointerInputChangeGcwITfU(pointerInputChange, f);
                        if (m9483addPointerInputChangeGcwITfU != null) {
                            function22.invoke(pointerInputChange, Boxing.boxFloat(Float.intBitsToFloat((int) (m9483addPointerInputChangeGcwITfU.m5423unboximpl() >> 32))));
                            if (pointerInputChange.isConsumed()) {
                                return pointerInputChange;
                            }
                            touchSlopDetector2.reset();
                            touchSlopDetector = touchSlopDetector2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132;
                            m9462pointerSlopE8SPZFQ = f;
                            longRef = longRef2;
                        } else {
                            PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132.L$2 = longRef2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132.L$3 = touchSlopDetector2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132.L$4 = pointerInputChange;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass3, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132) != coroutine_suspended) {
                                function24 = function22;
                                touchSlopDetector = touchSlopDetector2;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$132;
                                pointerInputChange2 = pointerInputChange;
                                m9462pointerSlopE8SPZFQ = f;
                                longRef = longRef2;
                                if (!pointerInputChange2.isConsumed()) {
                                }
                            }
                        }
                    }
                    pointerEventPass2 = pointerEventPass;
                    i5 = 1;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0 = function22;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2 = longRef;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3 = touchSlopDetector;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4 = pointerEventPass2;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0 = m9462pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1, i5, pointerEventPass2);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0084 -> B:10:0x008a). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9460horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        Orientation orientation;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Unit> function12;
        Orientation orientation2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        float intBitsToFloat;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            if ((dragGestureDetectorKt$horizontalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$horizontalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                int i2 = 1;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Orientation orientation3 = Orientation.Horizontal;
                    j2 = j;
                    if (!m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        orientation = orientation3;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        function12 = function1;
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        orientation2 = orientation;
                        longRef = longRef2;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                        dragGestureDetectorKt$horizontalDrag$12.label = i2;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longRef = (Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.L$4;
                awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$3;
                orientation2 = (Orientation) dragGestureDetectorKt$horizontalDrag$1.L$2;
                AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
                Function1<? super PointerInputChange, Unit> function13 = (Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
                ResultKt.throwOnFailure(obj);
                DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$1;
                function12 = function13;
                PointerEvent pointerEvent = (PointerEvent) obj;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i3);
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    if (PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef.element)) {
                        break;
                    }
                    i3++;
                    awaitPointerEventScope3 = awaitPointerEventScope4;
                }
                PointerInputChange pointerInputChange3 = pointerInputChange;
                if (pointerInputChange3 == 0) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i4);
                            if (pointerInputChange2.getPressed()) {
                                break;
                            }
                            i4++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange2;
                        if (pointerInputChange4 != null) {
                            longRef.element = pointerInputChange4.getId();
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            awaitPointerEventScope2 = awaitPointerEventScope5;
                            dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                            i2 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                            dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                            dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                            dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                            dragGestureDetectorKt$horizontalDrag$12.label = i2;
                            awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                            if (awaitPointerEvent$default == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$14 = dragGestureDetectorKt$horizontalDrag$12;
                            awaitPointerEventScope5 = awaitPointerEventScope2;
                            obj = awaitPointerEvent$default;
                            dragGestureDetectorKt$horizontalDrag$13 = dragGestureDetectorKt$horizontalDrag$14;
                        }
                    } else {
                        long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3);
                        if (orientation2 == null) {
                            intBitsToFloat = Offset.m5411getDistanceimpl(positionChangeIgnoreConsumed);
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                        }
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                    int size3 = changes3.size();
                    int i32 = 0;
                    while (true) {
                        if (i32 < size3) {
                        }
                        i32++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange32 = pointerInputChange;
                    if (pointerInputChange32 == 0) {
                        pointerInputChange32 = 0;
                    }
                }
                if (pointerInputChange32 == 0 || pointerInputChange32.isConsumed()) {
                    pointerEventPass = null;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                    pointerEventPass = pointerInputChange32;
                } else {
                    function12.invoke(pointerInputChange32);
                    orientation = orientation2;
                    j2 = pointerInputChange32.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$13;
                    i2 = 1;
                    pointerEventPass = null;
                    Ref.LongRef longRef22 = new Ref.LongRef();
                    longRef22.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    orientation2 = orientation;
                    longRef = longRef22;
                    dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                    dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                    dragGestureDetectorKt$horizontalDrag$12.L$2 = orientation2;
                    dragGestureDetectorKt$horizontalDrag$12.L$3 = awaitPointerEventScope3;
                    dragGestureDetectorKt$horizontalDrag$12.L$4 = longRef;
                    dragGestureDetectorKt$horizontalDrag$12.label = i2;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, i2, pointerEventPass);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
                return Boxing.boxBoolean(pointerEventPass == null);
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
        Object obj2 = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        int i22 = 1;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0068 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9448awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef3 = longRef2;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef3.element)) {
                            break;
                        }
                        i2++;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            while (true) {
                                if (r9 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(r9);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                r9++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef3.element = pointerInputChange4.getId();
                                longRef = longRef3;
                            }
                        }
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Ref.LongRef longRef4 = longRef;
                        obj = awaitPointerEvent$default;
                        longRef3 = longRef4;
                        PointerEvent pointerEvent2 = (PointerEvent) obj;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                        return null;
                    }
                    return pointerInputChange32;
                }
                ResultKt.throwOnFailure(obj);
                if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit detectHorizontalDragGestures$lambda$21;
                    detectHorizontalDragGestures$lambda$21 = DragGestureDetectorKt.detectHorizontalDragGestures$lambda$21((Offset) obj2);
                    return detectHorizontalDragGestures$lambda$21;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: com.composables.core.androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        Function0 function03 = function02;
        return detectHorizontalDragGestures(pointerInputScope, function1, function0, function03, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit detectHorizontalDragGestures$lambda$21(Offset offset) {
        return Unit.INSTANCE;
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008e -> B:10:0x0094). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9457dragVnAYq1g(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Orientation orientation, Function1<? super PointerInputChange, Boolean> function12, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Orientation orientation2;
        Function1<? super PointerInputChange, Boolean> function13;
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        Function1<? super PointerInputChange, Unit> function14;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        PointerEventPass pointerEventPass;
        Object obj;
        float intBitsToFloat;
        Object obj2;
        int i2;
        if (continuation instanceof DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (DragGestureDetectorKt$drag$2) continuation;
            if ((dragGestureDetectorKt$drag$2.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$drag$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$2.label;
                int i3 = 1;
                PointerEventPass pointerEventPass2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    j2 = j;
                    if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return null;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    orientation2 = orientation;
                    function13 = function12;
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function14 = function1;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function14;
                    dragGestureDetectorKt$drag$22.L$2 = orientation2;
                    dragGestureDetectorKt$drag$22.L$3 = function13;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i3, pointerEventPass2);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$drag$2.L$5;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$4;
                    Function1<? super PointerInputChange, Boolean> function15 = (Function1) dragGestureDetectorKt$drag$2.L$3;
                    Orientation orientation3 = (Orientation) dragGestureDetectorKt$drag$2.L$2;
                    Function1<? super PointerInputChange, Unit> function16 = (Function1) dragGestureDetectorKt$drag$2.L$1;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$0;
                    ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function14 = function16;
                    Ref.LongRef longRef3 = longRef2;
                    orientation2 = orientation3;
                    function13 = function15;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            pointerEventPass = pointerEventPass2;
                            obj = pointerEventPass;
                            break;
                        }
                        obj = changes.get(i4);
                        pointerEventPass = pointerEventPass2;
                        i2 = i4;
                        if (PointerId.m6929equalsimpl0(((PointerInputChange) obj).getId(), longRef3.element)) {
                            break;
                        }
                        i4 = i2 + 1;
                        pointerEventPass2 = pointerEventPass;
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == 0) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange);
                            if (orientation2 == null) {
                                intBitsToFloat = Offset.m5411getDistanceimpl(positionChangeIgnoreConsumed);
                            } else {
                                intBitsToFloat = Float.intBitsToFloat((int) (orientation2 == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                            }
                        } else {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    obj2 = pointerEventPass;
                                    break;
                                }
                                obj2 = changes2.get(i5);
                                if (((PointerInputChange) obj2).getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            PointerInputChange pointerInputChange2 = (PointerInputChange) obj2;
                            if (pointerInputChange2 != null) {
                                longRef3.element = pointerInputChange2.getId();
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                pointerEventPass2 = pointerEventPass;
                                i3 = 1;
                                longRef = longRef3;
                                dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$drag$22.L$1 = function14;
                                dragGestureDetectorKt$drag$22.L$2 = orientation2;
                                dragGestureDetectorKt$drag$22.L$3 = function13;
                                dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                                dragGestureDetectorKt$drag$22.L$5 = longRef;
                                dragGestureDetectorKt$drag$22.label = i3;
                                awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i3, pointerEventPass2);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Ref.LongRef longRef4 = longRef;
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                obj3 = awaitPointerEvent$default;
                                longRef3 = longRef4;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i42 = 0;
                        while (true) {
                            if (i42 < size3) {
                            }
                            i42 = i2 + 1;
                            pointerEventPass2 = pointerEventPass;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                        if (pointerInputChange3 == 0) {
                            pointerInputChange3 = pointerEventPass;
                        }
                    }
                    if (pointerInputChange3 == 0 || function13.invoke(pointerInputChange3).booleanValue()) {
                        return pointerEventPass;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        return pointerInputChange3;
                    }
                    function14.invoke(pointerInputChange3);
                    j2 = pointerInputChange3.getId();
                    awaitPointerEventScope2 = awaitPointerEventScope4;
                    pointerEventPass2 = pointerEventPass;
                    i3 = 1;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function14;
                    dragGestureDetectorKt$drag$22.L$2 = orientation2;
                    dragGestureDetectorKt$drag$22.L$3 = function13;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = i3;
                    awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass2, dragGestureDetectorKt$drag$22, i3, pointerEventPass2);
                    if (awaitPointerEvent$default == coroutine_suspended) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$2 = new DragGestureDetectorKt$drag$2(continuation);
        Object obj32 = dragGestureDetectorKt$drag$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$2.label;
        int i32 = 1;
        PointerEventPass pointerEventPass22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m9458dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Orientation orientation, Function1<? super PointerInputChange, Boolean> function12, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        float intBitsToFloat;
        long j2 = j;
        if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = j2;
            while (true) {
                PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i);
                    if (Boolean.valueOf(PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (r9 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(r9);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        r9++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.getId();
                } else {
                    long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (orientation == null) {
                        intBitsToFloat = Offset.m5411getDistanceimpl(positionChangeIgnoreConsumed);
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? positionChangeIgnoreConsumed & 4294967295L : positionChangeIgnoreConsumed >> 32));
                    }
                    if (Boolean.valueOf(1 ^ (intBitsToFloat == 0.0f ? 1 : 0)).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || function12.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            j2 = pointerInputChange2.getId();
        }
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m9447awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        while (true) {
            PointerInputChange pointerInputChange3 = null;
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange3 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange3;
                if (pointerInputChange5 == null) {
                    break;
                }
                longRef.element = pointerInputChange5.getId();
            } else if (function1.invoke(pointerInputChange2).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m9452awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Orientation orientation, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float m9462pointerSlopE8SPZFQ = m9462pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (Boolean.valueOf(PointerId.m6929equalsimpl0(pointerInputChange.getId(), longRef.element)).booleanValue()) {
                    break;
                }
                i3++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i2 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i2);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.getId();
            } else {
                Offset m9483addPointerInputChangeGcwITfU = touchSlopDetector.m9483addPointerInputChangeGcwITfU(pointerInputChange3, m9462pointerSlopE8SPZFQ);
                if (m9483addPointerInputChangeGcwITfU != null) {
                    function2.invoke(pointerInputChange3, m9483addPointerInputChangeGcwITfU);
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, continuation);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9451awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitLongPressOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (m9461isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m6929equalsimpl0(pointerInputChange.getId(), j)) {
                            break;
                        }
                        i2++;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 == 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = pointerInputChange2;
                    long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                    try {
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(objectRef3, objectRef2, null);
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (PointerEventTimeoutCancellationException unused) {
                        objectRef = objectRef2;
                        PointerInputChange pointerInputChange3 = (PointerInputChange) objectRef.element;
                        if (pointerInputChange3 != null) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (PointerEventTimeoutCancellationException unused2) {
                        PointerInputChange pointerInputChange32 = (PointerInputChange) objectRef.element;
                        return pointerInputChange32 != null ? pointerInputChange2 : pointerInputChange32;
                    }
                }
                return null;
            }
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        if (i != 0) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m9461isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m6929equalsimpl0(pointerInputChange.getId(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m9462pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m7018equalsimpl0(i, PointerType.INSTANCE.m7023getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }

    static {
        float m8401constructorimpl = Dp.m8401constructorimpl((float) 0.125d);
        mouseSlop = m8401constructorimpl;
        float m8401constructorimpl2 = Dp.m8401constructorimpl(18);
        defaultTouchSlop = m8401constructorimpl2;
        mouseToTouchSlopRatio = m8401constructorimpl / m8401constructorimpl2;
    }
}
