package io.bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import io.bidmachine.rendering.internal.meanbackground.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class j implements f {
    private final n a;
    private final o b;
    private final io.bidmachine.rendering.internal.meanbackground.a c;
    private final i d;
    private final l e;

    static final class a extends ContinuationImpl {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return j.this.a(null, null, this);
        }
    }

    static final class b extends SuspendLambda implements Function1 {
        int a;
        final /* synthetic */ Bitmap c;
        final /* synthetic */ Rect d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bitmap bitmap, Rect rect, Continuation continuation) {
            super(1, continuation);
            this.c = bitmap;
            this.d = rect;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxInt(j.this.d.a(this.c, this.d));
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
            return j.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                io.bidmachine.rendering.internal.meanbackground.a aVar = j.this.c;
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
            return j.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = j.this.b;
                View a = j.this.a.a(this.c);
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

    public j(n viewExtractor, o viewScreenshot, io.bidmachine.rendering.internal.meanbackground.a contentBoundsScanner, i meanColorCalculator, l performanceMeasurer) {
        Intrinsics.checkNotNullParameter(viewExtractor, "viewExtractor");
        Intrinsics.checkNotNullParameter(viewScreenshot, "viewScreenshot");
        Intrinsics.checkNotNullParameter(contentBoundsScanner, "contentBoundsScanner");
        Intrinsics.checkNotNullParameter(meanColorCalculator, "meanColorCalculator");
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.a = viewExtractor;
        this.b = viewScreenshot;
        this.c = contentBoundsScanner;
        this.d = meanColorCalculator;
        this.e = performanceMeasurer;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.bidmachine.rendering.internal.meanbackground.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(CoroutineContext coroutineContext, View view, Continuation continuation) {
        a aVar;
        int i;
        j jVar;
        Bitmap bitmap;
        Bitmap bitmap2;
        Rect rect;
        Bitmap bitmap3;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    l lVar = this.e;
                    d dVar = new d(view, null);
                    aVar.a = this;
                    aVar.e = 1;
                    obj = lVar.a("Screenshot", dVar, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bitmap3 = (Bitmap) aVar.a;
                            ResultKt.throwOnFailure(obj);
                            return new f.a(Boxing.boxInt(((Number) obj).intValue()), bitmap3);
                        }
                        bitmap2 = (Bitmap) aVar.b;
                        jVar = (j) aVar.a;
                        ResultKt.throwOnFailure(obj);
                        rect = (Rect) obj;
                        if (rect != null) {
                            return new f.a(null, bitmap2, 1, null);
                        }
                        l lVar2 = jVar.e;
                        b bVar = jVar.new b(bitmap2, rect, null);
                        aVar.a = bitmap2;
                        aVar.b = null;
                        aVar.e = 3;
                        obj = lVar2.a("Mean color", bVar, aVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        bitmap3 = bitmap2;
                        return new f.a(Boxing.boxInt(((Number) obj).intValue()), bitmap3);
                    }
                    j jVar2 = (j) aVar.a;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar2;
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return new f.a(null, null, 3, null);
                }
                l lVar3 = jVar.e;
                c cVar = jVar.new c(bitmap, null);
                aVar.a = jVar;
                aVar.b = bitmap;
                aVar.e = 2;
                Object a2 = lVar3.a("Scan bounds", cVar, aVar);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = a2;
                bitmap2 = bitmap;
                rect = (Rect) obj;
                if (rect != null) {
                }
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
    }
}
