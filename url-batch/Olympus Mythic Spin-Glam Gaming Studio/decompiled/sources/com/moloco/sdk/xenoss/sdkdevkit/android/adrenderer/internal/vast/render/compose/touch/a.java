package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class a implements PressGestureScope, Density {
    public final /* synthetic */ Density a;
    public boolean b;
    public boolean c;

    @NotNull
    public final Mutex d;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.PressGestureScopeImpl2", f = "Tap.kt", l = {128}, m = "awaitRelease")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a$a, reason: collision with other inner class name */
    public static final class C1658a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public C1658a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return a.this.awaitRelease(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.PressGestureScopeImpl2", f = "Tap.kt", l = {135}, m = "tryAwaitRelease")
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return a.this.tryAwaitRelease(this);
        }
    }

    public a(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.a = density;
        this.d = MutexKt.Mutex(false);
    }

    public final void a() {
        this.c = true;
        Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitRelease(@NotNull Continuation continuation) {
        C1658a c1658a;
        Object obj;
        int i;
        if (continuation instanceof C1658a) {
            c1658a = (C1658a) continuation;
            int i2 = c1658a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1658a.c = i2 - Integer.MIN_VALUE;
                obj = c1658a.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1658a.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    c1658a.c = 1;
                    obj = tryAwaitRelease(c1658a);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new GestureCancellationException("The press gesture was canceled.");
                }
                return Unit.INSTANCE;
            }
        }
        c1658a = new C1658a(continuation);
        obj = c1658a.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1658a.c;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void b() {
        this.b = true;
        Mutex.DefaultImpls.unlock$default(this.d, null, 1, null);
    }

    public final void c() {
        Mutex.DefaultImpls.tryLock$default(this.d, null, 1, null);
        this.b = false;
        this.c = false;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.a.getFontScale();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo264roundToPxR2X_6o(long j) {
        return this.a.mo264roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo265roundToPx0680j_4(float f) {
        return this.a.mo265roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo266toDpGaN1DYA(long j) {
        return this.a.mo266toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo267toDpu2uoSUM(float f) {
        return this.a.mo267toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo269toDpSizekrfVVM(long j) {
        return this.a.mo269toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo270toPxR2X_6o(long j) {
        return this.a.mo270toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo271toPx0680j_4(float f) {
        return this.a.mo271toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.a.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo272toSizeXkaWNTQ(long j) {
        return this.a.mo272toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo273toSp0xMU5do(float f) {
        return this.a.mo273toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo274toSpkPz2Gy4(float f) {
        return this.a.mo274toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAwaitRelease(@NotNull Continuation continuation) {
        b bVar;
        int i;
        a aVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.b && !this.c) {
                        Mutex mutex = this.d;
                        bVar.a = this;
                        bVar.d = 1;
                        if (Mutex.DefaultImpls.lock$default(mutex, null, bVar, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(aVar.b);
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        return Boxing.boxBoolean(aVar.b);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo268toDpu2uoSUM(int i) {
        return this.a.mo268toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo275toSpkPz2Gy4(int i) {
        return this.a.mo275toSpkPz2Gy4(i);
    }
}
