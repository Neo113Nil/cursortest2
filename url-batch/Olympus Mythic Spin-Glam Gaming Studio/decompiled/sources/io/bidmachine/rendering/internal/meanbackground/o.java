package io.bidmachine.rendering.internal.meanbackground;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import io.bidmachine.util.ImageUtilsKt;
import io.bidmachine.util.MathUtils;
import io.bidmachine.util.ViewUtilsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes12.dex */
public final class o {
    private final a a;
    private final io.bidmachine.rendering.internal.f b;
    private final Handler c;

    public static final class a {
        private final Bitmap.Config a;
        private final int b;
        private final int c;
        private final InterfaceC1806a d;

        /* renamed from: io.bidmachine.rendering.internal.meanbackground.o$a$a, reason: collision with other inner class name */
        public interface InterfaceC1806a {

            /* renamed from: io.bidmachine.rendering.internal.meanbackground.o$a$a$a, reason: collision with other inner class name */
            public static final class C1807a implements InterfaceC1806a {
                public static final C1807a a = new C1807a();

                private C1807a() {
                }

                @Override // io.bidmachine.rendering.internal.meanbackground.o.a.InterfaceC1806a
                public int a(Context context, int i, int i2, int i3, int i4) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    return i3;
                }
            }

            /* renamed from: io.bidmachine.rendering.internal.meanbackground.o$a$a$b */
            public static final class b implements InterfaceC1806a {
                public static final b a = new b();

                private b() {
                }

                @Override // io.bidmachine.rendering.internal.meanbackground.o.a.InterfaceC1806a
                public int a(Context context, int i, int i2, int i3, int i4) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    float f = i4;
                    return (int) RangesKt.coerceAtLeast(MathUtils.lerp(i3, f, f / Math.max(i, i2)), 0.0f);
                }
            }

            int a(Context context, int i, int i2, int i3, int i4);
        }

        public a(Bitmap.Config bitmapConfig, int i, int i2, InterfaceC1806a scalingStrategy) {
            Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
            Intrinsics.checkNotNullParameter(scalingStrategy, "scalingStrategy");
            this.a = bitmapConfig;
            this.b = i;
            this.c = i2;
            this.d = scalingStrategy;
        }

        public final Bitmap.Config a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Intrinsics.areEqual(this.d, aVar.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Config(bitmapConfig=" + this.a + ", minDimensionPx=" + this.b + ", maxDimensionPx=" + this.c + ", scalingStrategy=" + this.d + ')';
        }

        public final int a(Context context, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            return this.d.a(context, i, i2, this.b, this.c);
        }

        public final int a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            return a(context, view.getWidth(), view.getHeight());
        }

        public /* synthetic */ a(Bitmap.Config config, int i, int i2, InterfaceC1806a interfaceC1806a, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? Bitmap.Config.RGB_565 : config, i, i2, (i3 & 8) != 0 ? InterfaceC1806a.C1807a.a : interfaceC1806a);
        }
    }

    private static final class b {
        private final int a;

        public b(int i) {
            this.a = i;
        }

        private final Object b(Bitmap bitmap) {
            try {
                Result.Companion companion = Result.INSTANCE;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = this.a;
                if (width <= i && height <= i) {
                    return Result.m8023constructorimpl(bitmap);
                }
                float f = i;
                float f2 = width;
                float f3 = height;
                float min = Math.min(f / f2, f / f3);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f2 * min), (int) (f3 * min), true);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitma…idth, scaledHeight, true)");
                if (createScaledBitmap != bitmap) {
                    ImageUtilsKt.recycleSafely(bitmap);
                }
                return Result.m8023constructorimpl(createScaledBitmap);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
        }

        public final Bitmap a(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Object b = b(bitmap);
            if (Result.m8028isFailureimpl(b)) {
                b = null;
            }
            Bitmap bitmap2 = (Bitmap) b;
            return bitmap2 == null ? bitmap : bitmap2;
        }
    }

    public static final class c implements io.bidmachine.rendering.internal.screenshot.b {
        final /* synthetic */ CancellableContinuation a;

        c(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // io.bidmachine.rendering.internal.screenshot.b
        public void a(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.a.resumeWith(Result.m8023constructorimpl(bitmap));
        }

        @Override // io.bidmachine.rendering.internal.screenshot.b
        public void a() {
            this.a.resumeWith(Result.m8023constructorimpl(null));
        }
    }

    static final class d extends Lambda implements Function1 {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final void a(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    static final class e extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ View c;

        static final class a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ View b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, Continuation continuation) {
                super(2, continuation);
                this.b = view;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    View view = this.b;
                    this.a = 1;
                    obj = ViewUtilsKt.awaitLayout(view, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view, Continuation continuation) {
            super(2, continuation);
            this.c = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new e(this.c, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher d = o.this.b.d();
                a aVar = new a(this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(d, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        return null;
                    }
                    o oVar = o.this;
                    return new b(oVar.a.a(this.c)).a(bitmap);
                }
                ResultKt.throwOnFailure(obj);
            }
            o oVar2 = o.this;
            View view = this.c;
            this.a = 2;
            obj = oVar2.a(view, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            bitmap = (Bitmap) obj;
            if (bitmap != null) {
            }
        }
    }

    public o(a config, io.bidmachine.rendering.internal.f coroutineDispatchers, Handler handler) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = config;
        this.b = coroutineDispatchers;
        this.c = handler;
    }

    public final Object b(View view, Continuation continuation) {
        return BuildersKt.withContext(this.b.c(), new e(view, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(View view, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        io.bidmachine.rendering.internal.screenshot.a.a.a(view, this.c, this.a.a(), new c(cancellableContinuationImpl));
        cancellableContinuationImpl.invokeOnCancellation(d.a);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
