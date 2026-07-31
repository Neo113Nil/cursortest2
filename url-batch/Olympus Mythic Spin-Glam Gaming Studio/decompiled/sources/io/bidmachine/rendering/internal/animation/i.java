package io.bidmachine.rendering.internal.animation;

import android.view.View;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.util.ViewUtilsKt;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes15.dex */
public final class i implements io.bidmachine.rendering.internal.animation.b {
    private final CoroutineScope a;
    private final io.bidmachine.rendering.internal.f b;
    private final Map c;

    static final class a extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.b c;
        final /* synthetic */ boolean d;
        final /* synthetic */ AnimationEventType e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(io.bidmachine.rendering.internal.b bVar, boolean z, AnimationEventType animationEventType, Continuation continuation) {
            super(2, continuation);
            this.c = bVar;
            this.d = z;
            this.e = animationEventType;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar = i.this;
                io.bidmachine.rendering.internal.b bVar = this.c;
                this.a = 1;
                obj = iVar.a(bVar, this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            View view = (View) obj;
            if (view != null) {
                io.bidmachine.rendering.internal.b bVar2 = this.c;
                boolean z = this.d;
                i iVar2 = i.this;
                AnimationEventType animationEventType = this.e;
                io.bidmachine.rendering.internal.animation.a a = io.bidmachine.rendering.internal.animation.d.a(bVar2.g(), z);
                boolean h = bVar2.h();
                this.a = 2;
                if (iVar2.a(view, a, animationEventType, h, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class b extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.c c;
        final /* synthetic */ AnimationEventType d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType, Continuation continuation) {
            super(2, continuation);
            this.c = cVar;
            this.d = animationEventType;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar = i.this;
                io.bidmachine.rendering.internal.c cVar = this.c;
                this.a = 1;
                obj = iVar.a(cVar, this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            View view = (View) obj;
            if (view != null) {
                io.bidmachine.rendering.internal.c cVar2 = this.c;
                i iVar2 = i.this;
                AnimationEventType animationEventType = this.d;
                io.bidmachine.rendering.internal.animation.a a = io.bidmachine.rendering.internal.animation.d.a(cVar2.b());
                this.a = 2;
                if (iVar2.a(view, a, animationEventType, true, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class c extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return i.this.a((View) null, (io.bidmachine.rendering.internal.animation.a) null, (AnimationEventType) null, false, (Continuation) this);
        }
    }

    static final class d extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.b c;
        final /* synthetic */ AnimationEventType d;
        final /* synthetic */ boolean e;
        final /* synthetic */ Runnable f;
        final /* synthetic */ Runnable g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(io.bidmachine.rendering.internal.b bVar, AnimationEventType animationEventType, boolean z, Runnable runnable, Runnable runnable2, Continuation continuation) {
            super(2, continuation);
            this.c = bVar;
            this.d = animationEventType;
            this.e = z;
            this.f = runnable;
            this.g = runnable2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new d(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar = i.this;
                io.bidmachine.rendering.internal.b bVar = this.c;
                this.a = 1;
                obj = iVar.a(bVar, this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            View view = (View) obj;
            if (view != null) {
                i iVar2 = i.this;
                AnimationEventType animationEventType = this.d;
                boolean z = this.e;
                io.bidmachine.rendering.internal.b bVar2 = this.c;
                Runnable runnable = this.f;
                Runnable runnable2 = this.g;
                boolean h = bVar2.h();
                this.a = 2;
                if (iVar2.a(view, animationEventType, z, h, runnable, runnable2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class e extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.c c;
        final /* synthetic */ AnimationEventType d;
        final /* synthetic */ boolean e;
        final /* synthetic */ Runnable f;
        final /* synthetic */ Runnable g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(io.bidmachine.rendering.internal.c cVar, AnimationEventType animationEventType, boolean z, Runnable runnable, Runnable runnable2, Continuation continuation) {
            super(2, continuation);
            this.c = cVar;
            this.d = animationEventType;
            this.e = z;
            this.f = runnable;
            this.g = runnable2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new e(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar = i.this;
                io.bidmachine.rendering.internal.c cVar = this.c;
                this.a = 1;
                obj = iVar.a(cVar, this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            View view = (View) obj;
            if (view != null) {
                i iVar2 = i.this;
                AnimationEventType animationEventType = this.d;
                boolean z = this.e;
                Runnable runnable = this.f;
                Runnable runnable2 = this.g;
                this.a = 2;
                if (iVar2.a(view, animationEventType, z, true, runnable, runnable2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class f extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        boolean f;
        /* synthetic */ Object g;
        int i;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return i.this.a(null, null, false, false, null, null, this);
        }
    }

    static final class g extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ View b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(View view, Continuation continuation) {
            super(2, continuation);
            this.b = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new g(this.b, continuation);
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

    static final class h extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(io.bidmachine.rendering.internal.b bVar, Continuation continuation) {
            super(2, continuation);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.b.i();
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.animation.i$i, reason: collision with other inner class name */
    static final class C1787i extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1787i(io.bidmachine.rendering.internal.c cVar, Continuation continuation) {
            super(2, continuation);
            this.b = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1787i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1787i(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.b.c();
        }
    }

    static final class j extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.b c;
        final /* synthetic */ AnimationEventType d;
        final /* synthetic */ boolean e;
        final /* synthetic */ Runnable f;
        final /* synthetic */ Runnable g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(io.bidmachine.rendering.internal.b bVar, AnimationEventType animationEventType, boolean z, Runnable runnable, Runnable runnable2, Continuation continuation) {
            super(2, continuation);
            this.c = bVar;
            this.d = animationEventType;
            this.e = z;
            this.f = runnable;
            this.g = runnable2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new j(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar = i.this;
                io.bidmachine.rendering.internal.b bVar = this.c;
                this.a = 1;
                obj = iVar.a(bVar, this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            View view = (View) obj;
            if (view != null) {
                i iVar2 = i.this;
                AnimationEventType animationEventType = this.d;
                boolean z = this.e;
                io.bidmachine.rendering.internal.b bVar2 = this.c;
                Runnable runnable = this.f;
                Runnable runnable2 = this.g;
                boolean h = bVar2.h();
                this.a = 2;
                if (iVar2.b(view, animationEventType, z, h, runnable, runnable2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class k extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        boolean f;
        /* synthetic */ Object g;
        int i;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return i.this.b(null, null, false, false, null, null, this);
        }
    }

    static final class l extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(io.bidmachine.rendering.internal.b bVar, Continuation continuation) {
            super(2, continuation);
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new l(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar = i.this;
                io.bidmachine.rendering.internal.b bVar = this.c;
                this.a = 1;
                obj = iVar.a(bVar, this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            View view = (View) obj;
            if (view != null) {
                i iVar2 = i.this;
                this.a = 2;
                if (iVar2.b(view, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class m extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.rendering.internal.c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(io.bidmachine.rendering.internal.c cVar, Continuation continuation) {
            super(2, continuation);
            this.c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new m(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar = i.this;
                io.bidmachine.rendering.internal.c cVar = this.c;
                this.a = 1;
                obj = iVar.a(cVar, this);
                if (obj == coroutine_suspended) {
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
                ResultKt.throwOnFailure(obj);
            }
            View view = (View) obj;
            if (view != null) {
                i iVar2 = i.this;
                this.a = 2;
                if (iVar2.b(view, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        int a;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Iterator it = i.this.c.entrySet().iterator();
            while (it.hasNext()) {
                ((io.bidmachine.rendering.internal.animation.a) ((Map.Entry) it.next()).getValue()).a();
            }
            i.this.c.clear();
            return Unit.INSTANCE;
        }
    }

    public i(CoroutineScope coroutineScope, io.bidmachine.rendering.internal.f coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.a = coroutineScope;
        this.b = coroutineDispatchers;
        this.c = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(View view, AnimationEventType animationEventType, boolean z, boolean z2, Runnable runnable, Runnable runnable2, Continuation continuation) {
        k kVar;
        int i;
        View view2;
        AnimationEventType animationEventType2;
        boolean z3;
        Runnable runnable3;
        Runnable runnable4;
        io.bidmachine.rendering.internal.animation.a aVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.i = i2 - Integer.MIN_VALUE;
                Object obj = kVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kVar.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    io.bidmachine.rendering.internal.animation.a aVar2 = (io.bidmachine.rendering.internal.animation.a) this.c.get(Boxing.boxInt(view.getId()));
                    if (aVar2 == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        return Unit.INSTANCE;
                    }
                    if (z2) {
                        kVar.a = view;
                        kVar.b = animationEventType;
                        kVar.c = runnable;
                        kVar.d = runnable2;
                        kVar.e = aVar2;
                        kVar.f = z;
                        kVar.i = 1;
                        if (a(view, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    view2 = view;
                    animationEventType2 = animationEventType;
                    z3 = z;
                    runnable3 = runnable;
                    runnable4 = runnable2;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z4 = kVar.f;
                    io.bidmachine.rendering.internal.animation.a aVar3 = (io.bidmachine.rendering.internal.animation.a) kVar.e;
                    Runnable runnable5 = (Runnable) kVar.d;
                    Runnable runnable6 = (Runnable) kVar.c;
                    AnimationEventType animationEventType3 = (AnimationEventType) kVar.b;
                    View view3 = (View) kVar.a;
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                    animationEventType2 = animationEventType3;
                    z3 = z4;
                    view2 = view3;
                    runnable3 = runnable6;
                    runnable4 = runnable5;
                }
                aVar.a(view2, animationEventType2);
                aVar.a(view2, animationEventType2, runnable3, runnable4, z3);
                return Unit.INSTANCE;
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kVar.i;
        if (i != 0) {
        }
        aVar.a(view2, animationEventType2);
        aVar.a(view2, animationEventType2, runnable3, runnable4, z3);
        return Unit.INSTANCE;
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public boolean a(int i) {
        io.bidmachine.rendering.internal.animation.a aVar = (io.bidmachine.rendering.internal.animation.a) this.c.get(Integer.valueOf(i));
        return aVar != null && aVar.b();
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.b adElement, boolean z, AnimationEventType eventType) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.d(), null, new a(adElement, z, eventType, null), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c adPhase, AnimationEventType eventType) {
        Intrinsics.checkNotNullParameter(adPhase, "adPhase");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.d(), null, new b(adPhase, eventType, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(View view, io.bidmachine.rendering.internal.animation.a aVar, AnimationEventType animationEventType, boolean z, Continuation continuation) {
        c cVar;
        int i;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f = i2 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.c.put(Boxing.boxInt(view.getId()), aVar);
                    if (z) {
                        cVar.a = view;
                        cVar.b = aVar;
                        cVar.c = animationEventType;
                        cVar.f = 1;
                        if (a(view, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    animationEventType = (AnimationEventType) cVar.c;
                    aVar = (io.bidmachine.rendering.internal.animation.a) cVar.b;
                    view = (View) cVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                aVar.a(view, animationEventType);
                return Unit.INSTANCE;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.f;
        if (i != 0) {
        }
        aVar.a(view, animationEventType);
        return Unit.INSTANCE;
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void b(io.bidmachine.rendering.internal.b adElement, AnimationEventType eventType, boolean z, Runnable runnable, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.d(), null, new d(adElement, eventType, z, runnable, runnable2, null), 2, null);
    }

    public Object b(View view, Continuation continuation) {
        io.bidmachine.rendering.internal.animation.a aVar = (io.bidmachine.rendering.internal.animation.a) this.c.remove(Boxing.boxInt(view.getId()));
        if (aVar != null) {
            aVar.a();
        }
        return Unit.INSTANCE;
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.b adElement, AnimationEventType eventType, boolean z, Runnable runnable, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.d(), null, new j(adElement, eventType, z, runnable, runnable2, null), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c adPhase, AnimationEventType eventType, boolean z, Runnable runnable, Runnable runnable2) {
        Intrinsics.checkNotNullParameter(adPhase, "adPhase");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.e(), null, new e(adPhase, eventType, z, runnable, runnable2, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(View view, AnimationEventType animationEventType, boolean z, boolean z2, Runnable runnable, Runnable runnable2, Continuation continuation) {
        f fVar;
        int i;
        View view2;
        AnimationEventType animationEventType2;
        boolean z3;
        Runnable runnable3;
        Runnable runnable4;
        io.bidmachine.rendering.internal.animation.a aVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.i = i2 - Integer.MIN_VALUE;
                Object obj = fVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fVar.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    io.bidmachine.rendering.internal.animation.a aVar2 = (io.bidmachine.rendering.internal.animation.a) this.c.get(Boxing.boxInt(view.getId()));
                    if (aVar2 == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        return Unit.INSTANCE;
                    }
                    if (z2) {
                        fVar.a = view;
                        fVar.b = animationEventType;
                        fVar.c = runnable;
                        fVar.d = runnable2;
                        fVar.e = aVar2;
                        fVar.f = z;
                        fVar.i = 1;
                        if (a(view, fVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    view2 = view;
                    animationEventType2 = animationEventType;
                    z3 = z;
                    runnable3 = runnable;
                    runnable4 = runnable2;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z4 = fVar.f;
                    io.bidmachine.rendering.internal.animation.a aVar3 = (io.bidmachine.rendering.internal.animation.a) fVar.e;
                    Runnable runnable5 = (Runnable) fVar.d;
                    Runnable runnable6 = (Runnable) fVar.c;
                    AnimationEventType animationEventType3 = (AnimationEventType) fVar.b;
                    View view3 = (View) fVar.a;
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                    animationEventType2 = animationEventType3;
                    z3 = z4;
                    view2 = view3;
                    runnable3 = runnable6;
                    runnable4 = runnable5;
                }
                aVar.a(view2, animationEventType2, runnable3, runnable4, z3);
                return Unit.INSTANCE;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fVar.i;
        if (i != 0) {
        }
        aVar.a(view2, animationEventType2, runnable3, runnable4, z3);
        return Unit.INSTANCE;
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.b adElement) {
        Intrinsics.checkNotNullParameter(adElement, "adElement");
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.d(), null, new l(adElement, null), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a(io.bidmachine.rendering.internal.c adPhase) {
        Intrinsics.checkNotNullParameter(adPhase, "adPhase");
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.d(), null, new m(adPhase, null), 2, null);
    }

    @Override // io.bidmachine.rendering.internal.animation.b
    public void a() {
        BuildersKt__Builders_commonKt.launch$default(this.a, this.b.d(), null, new n(null), 2, null);
    }

    private final Object a(View view, Continuation continuation) {
        return BuildersKt.withContext(this.b.e(), new g(view, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.rendering.internal.b bVar, Continuation continuation) {
        return BuildersKt.withContext(this.b.e(), new h(bVar, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.rendering.internal.c cVar, Continuation continuation) {
        return BuildersKt.withContext(this.b.e(), new C1787i(cVar, null), continuation);
    }
}
