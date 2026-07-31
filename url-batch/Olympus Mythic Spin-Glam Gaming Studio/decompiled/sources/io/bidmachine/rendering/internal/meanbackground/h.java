package io.bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import android.view.View;
import io.bidmachine.rendering.internal.meanbackground.f;
import io.bidmachine.util.ImageUtilsKt;
import io.bidmachine.util.taskmanager.SuspendCancellableTask;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes9.dex */
public final class h extends SuspendCancellableTask {
    private final long a;
    private final f b;
    private final l c;
    private final Function0 d;
    private final Function1 e;
    private final WeakReference f;

    static final class a extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Object b;
        final /* synthetic */ h c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, h hVar, Continuation continuation) {
            super(2, continuation);
            this.b = obj;
            this.c = hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.b;
            if (obj2 != null) {
                this.c.e.invoke(obj2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.c.d.mo4828invoke();
            }
            return Unit.INSTANCE;
        }
    }

    static final class b extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return h.this.runTask(null, this);
        }
    }

    static final class c extends SuspendLambda implements Function1 {
        int a;
        final /* synthetic */ long b;
        final /* synthetic */ h c;
        final /* synthetic */ CoroutineContext d;

        static final class a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ h b;
            final /* synthetic */ CoroutineContext c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, CoroutineContext coroutineContext, Continuation continuation) {
                super(2, continuation);
                this.b = hVar;
                this.c = coroutineContext;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    View view = (View) this.b.f.get();
                    if (view == null) {
                        return null;
                    }
                    h hVar = this.b;
                    CoroutineContext coroutineContext = this.c;
                    f fVar = hVar.b;
                    this.a = 1;
                    obj = fVar.a(coroutineContext, view, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (f.a) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j, h hVar, CoroutineContext coroutineContext, Continuation continuation) {
            super(1, continuation);
            this.b = j;
            this.c = hVar;
            this.d = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.b;
                a aVar = new a(this.c, this.d, null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
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

    public h(View view, long j, f meanBackgroundExtractor, l performanceMeasurer, Function0 onFallback, Function1 onFinished) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(meanBackgroundExtractor, "meanBackgroundExtractor");
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        Intrinsics.checkNotNullParameter(onFallback, "onFallback");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        this.a = j;
        this.b = meanBackgroundExtractor;
        this.c = performanceMeasurer;
        this.d = onFallback;
        this.e = onFinished;
        this.f = new WeakReference(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.bidmachine.util.taskmanager.SuspendCancellableTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object runTask(CoroutineContext coroutineContext, Continuation continuation) {
        b bVar;
        int i;
        Object obj;
        CoroutineContext coroutineContext2;
        h hVar;
        f.a aVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    long j = this.a;
                    bVar.a = this;
                    bVar.b = coroutineContext;
                    bVar.e = 1;
                    Object a2 = a(coroutineContext, j, bVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = a2;
                    coroutineContext2 = coroutineContext;
                    hVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hVar = (h) bVar.a;
                        ResultKt.throwOnFailure(obj2);
                        hVar.setCancel(true);
                        return Unit.INSTANCE;
                    }
                    CoroutineContext coroutineContext3 = (CoroutineContext) bVar.b;
                    h hVar2 = (h) bVar.a;
                    ResultKt.throwOnFailure(obj2);
                    coroutineContext2 = coroutineContext3;
                    hVar = hVar2;
                    obj = obj2;
                }
                aVar = (f.a) obj;
                if (aVar != null) {
                    Object b2 = aVar.b();
                    Bitmap a3 = aVar.a();
                    bVar.a = hVar;
                    bVar.b = null;
                    bVar.e = 2;
                    if (hVar.a(coroutineContext2, b2, a3, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                hVar.setCancel(true);
                return Unit.INSTANCE;
            }
        }
        bVar = new b(continuation);
        Object obj22 = bVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
        if (i != 0) {
        }
        aVar = (f.a) obj;
        if (aVar != null) {
        }
        hVar.setCancel(true);
        return Unit.INSTANCE;
    }

    private final Object a(CoroutineContext coroutineContext, long j, Continuation continuation) {
        return this.c.a("Mean background extraction", new c(j, this, coroutineContext, null), continuation);
    }

    private final Object a(CoroutineContext coroutineContext, Object obj, Bitmap bitmap, Continuation continuation) {
        if (bitmap != null) {
            ImageUtilsKt.recycleSafely(bitmap);
        }
        Object withContext = BuildersKt.withContext(coroutineContext.plus(io.bidmachine.rendering.internal.f.i.a().e()), new a(obj, this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
