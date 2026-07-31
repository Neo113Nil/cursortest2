package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class b {

    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public float a;
        public float b;
        public final /* synthetic */ Function2 c;

        public a(Function2 function2) {
            this.c = function2;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.a = e.getX();
            this.b = e.getY();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.c.invoke(b.b(this.a, this.b), b.b(e.getX(), e.getY()));
            return false;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2", f = "Tap.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b, reason: collision with other inner class name */
    public static final class C1659b extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a c;
        public final /* synthetic */ Function2 d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1", f = "Tap.kt", l = {49}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b$a */
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a b;
            public final /* synthetic */ PointerInputScope c;
            public final /* synthetic */ Function2 d;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt$detectTapUnconsumed$2$1$1", f = "Tap.kt", l = {50, 53}, m = "invokeSuspend")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b$a$a, reason: collision with other inner class name */
            public static final class C1660a extends RestrictedSuspendLambda implements Function2 {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a c;
                public final /* synthetic */ Function2 d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1660a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, Function2 function2, Continuation continuation) {
                    super(2, continuation);
                    this.c = aVar;
                    this.d = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
                    return ((C1660a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C1660a c1660a = new C1660a(this.c, this.d, continuation);
                    c1660a.b = obj;
                    return c1660a;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AwaitPointerEventScope awaitPointerEventScope;
                    PointerInputChange pointerInputChange;
                    PointerInputChange pointerInputChange2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (AwaitPointerEventScope) this.b;
                        this.b = awaitPointerEventScope;
                        this.a = 1;
                        obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pointerInputChange = (PointerInputChange) this.b;
                            ResultKt.throwOnFailure(obj);
                            pointerInputChange2 = (PointerInputChange) obj;
                            if (pointerInputChange2 != null) {
                                this.c.a();
                            } else {
                                this.c.b();
                                this.d.invoke(Offset.m1288boximpl(pointerInputChange.getPosition()), Offset.m1288boximpl(pointerInputChange2.getPosition()));
                            }
                            return Unit.INSTANCE;
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    PointerInputChange pointerInputChange3 = (PointerInputChange) obj;
                    if (pointerInputChange3.getPressed() != pointerInputChange3.getPreviousPressed()) {
                        pointerInputChange3.consume();
                    }
                    this.b = pointerInputChange3;
                    this.a = 2;
                    Object b = b.b(awaitPointerEventScope, this);
                    if (b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pointerInputChange = pointerInputChange3;
                    obj = b;
                    pointerInputChange2 = (PointerInputChange) obj;
                    if (pointerInputChange2 != null) {
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = pointerInputScope;
                this.d = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b.c();
                    PointerInputScope pointerInputScope = this.c;
                    C1660a c1660a = new C1660a(this.b, this.d, null);
                    this.a = 1;
                    if (pointerInputScope.awaitPointerEventScope(c1660a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1659b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.c = aVar;
            this.d = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            return ((C1659b) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1659b c1659b = new C1659b(this.c, this.d, continuation);
            c1659b.b = obj;
            return c1659b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.c, (PointerInputScope) this.b, this.d, null);
                this.a = 1;
                if (CoroutineScopeKt.coroutineScope(aVar, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.TapKt", f = "Tap.kt", l = {67, 82}, m = "waitForUpOrCancellationInitial")
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return b.b((AwaitPointerEventScope) null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a0 -> B:11:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(AwaitPointerEventScope awaitPointerEventScope, Continuation continuation) {
        c cVar;
        int i;
        int size;
        int i2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.c = i3 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    cVar.a = awaitPointerEventScope;
                    cVar.c = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, cVar);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) cVar.a;
                    ResultKt.throwOnFailure(obj);
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    List changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent2.getChanges().get(0);
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) cVar.a;
                ResultKt.throwOnFailure(obj);
                List changes3 = ((PointerEvent) obj).getChanges();
                int size2 = changes3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((PointerInputChange) changes3.get(i4)).isConsumed()) {
                        return null;
                    }
                }
                PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                cVar.a = awaitPointerEventScope;
                cVar.c = 1;
                obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, cVar);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerEvent pointerEvent22 = (PointerEvent) obj;
                List changes22 = pointerEvent22.getChanges();
                size = changes22.size();
                i2 = 0;
                while (i2 < size) {
                    if (PointerEventKt.changedToUp((PointerInputChange) changes22.get(i2))) {
                        i2++;
                    } else {
                        List changes4 = pointerEvent22.getChanges();
                        int size3 = changes4.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            PointerInputChange pointerInputChange = (PointerInputChange) changes4.get(i5);
                            if (pointerInputChange.isConsumed() || PointerEventKt.m1850isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope.mo1834getSizeYbymL2g(), awaitPointerEventScope.mo1833getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        cVar.a = awaitPointerEventScope;
                        cVar.c = 2;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass3, cVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        List changes32 = ((PointerEvent) obj).getChanges();
                        int size22 = changes32.size();
                        while (i4 < size22) {
                        }
                        PointerEventPass pointerEventPass22 = PointerEventPass.Initial;
                        cVar.a = awaitPointerEventScope;
                        cVar.c = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass22, cVar);
                        if (obj == coroutine_suspended) {
                        }
                        PointerEvent pointerEvent222 = (PointerEvent) obj;
                        List changes222 = pointerEvent222.getChanges();
                        size = changes222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent222.getChanges().get(0);
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.c;
        if (i != 0) {
        }
    }

    public static final <T> void c(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    @Nullable
    public static final Object a(@NotNull PointerInputScope pointerInputScope, @NotNull Function2 function2, @NotNull Continuation continuation) {
        Object forEachGesture = ForEachGestureKt.forEachGesture(pointerInputScope, new C1659b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a(pointerInputScope), function2, null), continuation);
        return forEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? forEachGesture : Unit.INSTANCE;
    }

    @NotNull
    public static final GestureDetector a(@NotNull Context context, @NotNull Function2 onTap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        return new GestureDetector(context, new a(onTap));
    }

    public static final <T> boolean a(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) function1.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final a.AbstractC1677a.f b(float f, float f2) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a;
        return new a.AbstractC1677a.f(cVar.a((int) f), cVar.a((int) f2));
    }

    public static final <T> boolean b(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) function1.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
