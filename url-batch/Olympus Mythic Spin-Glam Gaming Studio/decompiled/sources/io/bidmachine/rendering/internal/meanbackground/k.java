package io.bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import io.bidmachine.rendering.internal.meanbackground.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes10.dex */
public final class k implements f {
    private final n a;
    private final o b;
    private final io.bidmachine.rendering.internal.meanbackground.a c;
    private final io.bidmachine.rendering.internal.meanbackground.b d;
    private final i e;
    private final l f;

    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return k.this.a(null, null, this);
        }
    }

    static final class b extends SuspendLambda implements Function1 {
        int a;
        final /* synthetic */ CoroutineContext b;
        final /* synthetic */ k c;
        final /* synthetic */ Rect d;
        final /* synthetic */ Bitmap e;

        static final class a extends SuspendLambda implements Function2 {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ k c;
            final /* synthetic */ Rect d;
            final /* synthetic */ CoroutineContext e;
            final /* synthetic */ Bitmap f;

            /* renamed from: io.bidmachine.rendering.internal.meanbackground.k$b$a$a, reason: collision with other inner class name */
            static final class C1805a extends SuspendLambda implements Function2 {
                int a;
                final /* synthetic */ k b;
                final /* synthetic */ Bitmap c;
                final /* synthetic */ Rect d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1805a(k kVar, Bitmap bitmap, Rect rect, Continuation continuation) {
                    super(2, continuation);
                    this.b = kVar;
                    this.c = bitmap;
                    this.d = rect;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C1805a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C1805a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxInt(this.b.e.a(this.c, this.d));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, Rect rect, CoroutineContext coroutineContext, Bitmap bitmap, Continuation continuation) {
                super(2, continuation);
                this.c = kVar;
                this.d = rect;
                this.e = coroutineContext;
                this.f = bitmap;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.c, this.d, this.e, this.f, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Deferred async$default;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.b;
                    List a = this.c.d.a(this.d);
                    CoroutineContext coroutineContext = this.e;
                    k kVar = this.c;
                    Bitmap bitmap = this.f;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, coroutineContext.plus(io.bidmachine.rendering.internal.f.i.a().b()), null, new C1805a(kVar, bitmap, (Rect) it.next(), null), 2, null);
                        arrayList.add(async$default);
                    }
                    this.a = 1;
                    obj = AwaitKt.awaitAll(arrayList, this);
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
        b(CoroutineContext coroutineContext, k kVar, Rect rect, Bitmap bitmap, Continuation continuation) {
            super(1, continuation);
            this.b = coroutineContext;
            this.c = kVar;
            this.d = rect;
            this.e = bitmap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new b(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext coroutineContext = this.b;
                a aVar = new a(this.c, this.d, coroutineContext, this.e, null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineContext, aVar, this);
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

    static final class c extends SuspendLambda implements Function1 {
        int a;
        final /* synthetic */ Bitmap c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, Continuation continuation) {
            super(1, continuation);
            this.c = bitmap;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return k.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                io.bidmachine.rendering.internal.meanbackground.a aVar = k.this.c;
                Bitmap bitmap = this.c;
                this.a = 1;
                obj = io.bidmachine.rendering.internal.meanbackground.a.a(aVar, bitmap, (Rect) null, this, 2, (Object) null);
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

    static final class d extends SuspendLambda implements Function1 {
        int a;
        final /* synthetic */ View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view, Continuation continuation) {
            super(1, continuation);
            this.c = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return k.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = k.this.b;
                View a = k.this.a.a(this.c);
                this.a = 1;
                obj = oVar.b(a, this);
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

    public k(n viewExtractor, o viewScreenshot, io.bidmachine.rendering.internal.meanbackground.a contentBoundsScanner, io.bidmachine.rendering.internal.meanbackground.b contentCornerExtractor, i meanColorCalculator, l performanceMeasurer) {
        Intrinsics.checkNotNullParameter(viewExtractor, "viewExtractor");
        Intrinsics.checkNotNullParameter(viewScreenshot, "viewScreenshot");
        Intrinsics.checkNotNullParameter(contentBoundsScanner, "contentBoundsScanner");
        Intrinsics.checkNotNullParameter(contentCornerExtractor, "contentCornerExtractor");
        Intrinsics.checkNotNullParameter(meanColorCalculator, "meanColorCalculator");
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.a = viewExtractor;
        this.b = viewScreenshot;
        this.c = contentBoundsScanner;
        this.d = contentCornerExtractor;
        this.e = meanColorCalculator;
        this.f = performanceMeasurer;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // io.bidmachine.rendering.internal.meanbackground.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(CoroutineContext coroutineContext, View view, Continuation continuation) {
        a aVar;
        int i;
        CoroutineContext coroutineContext2;
        k kVar;
        Bitmap bitmap;
        CoroutineContext coroutineContext3;
        k kVar2;
        Bitmap bitmap2;
        Rect rect;
        Bitmap bitmap3;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
                Object obj = aVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    l lVar = this.f;
                    d dVar = new d(view, null);
                    aVar.a = this;
                    aVar.b = coroutineContext;
                    aVar.f = 1;
                    obj = lVar.a("Screenshot", dVar, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineContext2 = coroutineContext;
                    kVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bitmap3 = (Bitmap) aVar.a;
                            ResultKt.throwOnFailure(obj);
                            return new f.a((List) obj, bitmap3);
                        }
                        bitmap2 = (Bitmap) aVar.c;
                        CoroutineContext coroutineContext4 = (CoroutineContext) aVar.b;
                        k kVar3 = (k) aVar.a;
                        ResultKt.throwOnFailure(obj);
                        coroutineContext3 = coroutineContext4;
                        kVar2 = kVar3;
                        rect = (Rect) obj;
                        if (rect != null) {
                            return new f.a(null, bitmap2, 1, null);
                        }
                        l lVar2 = kVar2.f;
                        b bVar = new b(coroutineContext3, kVar2, rect, bitmap2, null);
                        aVar.a = bitmap2;
                        aVar.b = null;
                        aVar.c = null;
                        aVar.f = 3;
                        obj = lVar2.a("Extract content corners", bVar, aVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bitmap3 = bitmap2;
                        return new f.a((List) obj, bitmap3);
                    }
                    coroutineContext2 = (CoroutineContext) aVar.b;
                    kVar = (k) aVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new f.a(null, null, 3, null);
                }
                l lVar3 = kVar.f;
                c cVar = kVar.new c(bitmap, null);
                aVar.a = kVar;
                aVar.b = coroutineContext2;
                aVar.c = bitmap;
                aVar.f = 2;
                Object a2 = lVar3.a("Scan bounds", cVar, aVar);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineContext3 = coroutineContext2;
                kVar2 = kVar;
                bitmap2 = bitmap;
                obj = a2;
                rect = (Rect) obj;
                if (rect != null) {
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.f;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
    }
}
