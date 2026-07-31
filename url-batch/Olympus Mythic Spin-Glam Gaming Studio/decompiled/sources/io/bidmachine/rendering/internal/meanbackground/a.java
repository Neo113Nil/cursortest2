package io.bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes15.dex */
public final class a {
    private final C1799a a;
    private final io.bidmachine.rendering.internal.meanbackground.c b;
    private final m c;
    private final CoroutineContext d;

    /* renamed from: io.bidmachine.rendering.internal.meanbackground.a$a, reason: collision with other inner class name */
    public static final class C1799a {
        private final int a;
        private final io.bidmachine.rendering.internal.meanbackground.d b;

        public C1799a(int i, io.bidmachine.rendering.internal.meanbackground.d samplingStrategy) {
            Intrinsics.checkNotNullParameter(samplingStrategy, "samplingStrategy");
            this.a = i;
            this.b = samplingStrategy;
        }

        public final int a(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "rect");
            return this.b.a(rect.width(), rect.height(), this.a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1799a)) {
                return false;
            }
            C1799a c1799a = (C1799a) obj;
            return this.a == c1799a.a && Intrinsics.areEqual(this.b, c1799a.b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Config(minContentDimensionPx=" + this.a + ", samplingStrategy=" + this.b + ')';
        }
    }

    public enum b {
        Horizontal,
        Vertical
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class c {
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        private static final /* synthetic */ c[] f;
        private final b a;

        static {
            b bVar = b.Horizontal;
            b = new c("Left", 0, bVar);
            b bVar2 = b.Vertical;
            c = new c("Top", 1, bVar2);
            d = new c("Right", 2, bVar);
            e = new c("Bottom", 3, bVar2);
            f = a();
        }

        private c(String str, int i, b bVar) {
            this.a = bVar;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{b, c, d, e};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f.clone();
        }

        public final b b() {
            return this.a;
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class e extends SuspendLambda implements Function2 {
        Object a;
        boolean b;
        int c;
        private /* synthetic */ Object d;
        final /* synthetic */ Bitmap f;
        final /* synthetic */ Rect g;

        /* renamed from: io.bidmachine.rendering.internal.meanbackground.a$e$a, reason: collision with other inner class name */
        static final class C1800a extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ a b;
            final /* synthetic */ c c;
            final /* synthetic */ Rect d;
            final /* synthetic */ int[] e;
            final /* synthetic */ boolean f;
            final /* synthetic */ List g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1800a(a aVar, c cVar, Rect rect, int[] iArr, boolean z, List list, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = cVar;
                this.d = rect;
                this.e = iArr;
                this.f = z;
                this.g = list;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1800a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1800a(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.b.a(this.c, this.d, this.e, this.f, new IntRange(((Number) this.g.get(0)).intValue(), ((Number) this.g.get(1)).intValue()));
            }
        }

        static final class b extends SuspendLambda implements Function2 {
            int a;
            final /* synthetic */ a b;
            final /* synthetic */ c c;
            final /* synthetic */ Rect d;
            final /* synthetic */ int[] e;
            final /* synthetic */ boolean f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a aVar, c cVar, Rect rect, int[] iArr, boolean z, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = cVar;
                this.d = rect;
                this.e = iArr;
                this.f = z;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return a.a(this.b, this.c, this.d, this.e, this.f, null, 16, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, Rect rect, Continuation continuation) {
            super(2, continuation);
            this.f = bitmap;
            this.g = rect;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = a.this.new e(this.f, this.g, continuation);
            eVar.d = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0126 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int[] iArr;
            Object awaitAll;
            CoroutineScope coroutineScope;
            boolean z;
            Deferred async$default;
            Object awaitAll2;
            List list;
            Deferred async$default2;
            List filterNotNull;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.d;
                int[] a = a.this.c.a(this.f, this.g);
                boolean hasAlpha = this.f.hasAlpha();
                c[] cVarArr = {c.c, c.e};
                a aVar = a.this;
                Rect rect = this.g;
                ArrayList arrayList = new ArrayList(2);
                int i2 = 0;
                while (i2 < 2) {
                    c cVar = cVarArr[i2];
                    int i3 = i2;
                    ArrayList arrayList2 = arrayList;
                    a aVar2 = aVar;
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, aVar.d, null, new b(aVar, cVar, rect, a, hasAlpha, null), 2, null);
                    arrayList2.add(async$default);
                    hasAlpha = hasAlpha;
                    a = a;
                    rect = rect;
                    arrayList = arrayList2;
                    i2 = i3 + 1;
                    aVar = aVar2;
                }
                iArr = a;
                ArrayList arrayList3 = arrayList;
                boolean z2 = hasAlpha;
                this.d = coroutineScope2;
                this.a = iArr;
                this.b = z2;
                this.c = 1;
                awaitAll = AwaitKt.awaitAll(arrayList3, this);
                if (awaitAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                z = z2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.d;
                    ResultKt.throwOnFailure(obj);
                    awaitAll2 = obj;
                    filterNotNull = CollectionsKt.filterNotNull((Iterable) awaitAll2);
                    if (filterNotNull.size() == 2) {
                        return null;
                    }
                    int a2 = a.this.a.a(this.g);
                    Rect rect2 = new Rect(((Number) filterNotNull.get(0)).intValue(), ((Number) list.get(0)).intValue(), ((Number) filterNotNull.get(1)).intValue() + 1, ((Number) list.get(1)).intValue() + 1);
                    if (rect2.width() < a2 || rect2.height() < a2) {
                        return null;
                    }
                    return rect2;
                }
                z = this.b;
                int[] iArr2 = (int[]) this.a;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.d;
                ResultKt.throwOnFailure(obj);
                awaitAll = obj;
                iArr = iArr2;
                coroutineScope = coroutineScope3;
            }
            List filterNotNull2 = CollectionsKt.filterNotNull((Iterable) awaitAll);
            if (filterNotNull2.size() != 2) {
                return null;
            }
            c[] cVarArr2 = {c.b, c.d};
            a aVar3 = a.this;
            Rect rect3 = this.g;
            ArrayList arrayList4 = new ArrayList(2);
            int i4 = 0;
            while (i4 < 2) {
                ArrayList arrayList5 = arrayList4;
                CoroutineScope coroutineScope4 = coroutineScope;
                async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope4, aVar3.d, null, new C1800a(aVar3, cVarArr2[i4], rect3, iArr, z, filterNotNull2, null), 2, null);
                arrayList5.add(async$default2);
                i4++;
                arrayList4 = arrayList5;
                rect3 = rect3;
                aVar3 = aVar3;
            }
            this.d = filterNotNull2;
            this.a = null;
            this.c = 2;
            awaitAll2 = AwaitKt.awaitAll(arrayList4, this);
            if (awaitAll2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = filterNotNull2;
            filterNotNull = CollectionsKt.filterNotNull((Iterable) awaitAll2);
            if (filterNotNull.size() == 2) {
            }
        }
    }

    public a(CoroutineContext coroutineContext, C1799a config, io.bidmachine.rendering.internal.meanbackground.c detector, m pixelsExtractor) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(pixelsExtractor, "pixelsExtractor");
        this.a = config;
        this.b = detector;
        this.c = pixelsExtractor;
        this.d = coroutineContext.plus(io.bidmachine.rendering.internal.f.i.a().b());
    }

    public static /* synthetic */ Object a(a aVar, Bitmap bitmap, Rect rect, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        return aVar.a(bitmap, rect, continuation);
    }

    public final Object a(Bitmap bitmap, Rect rect, Continuation continuation) {
        return BuildersKt.withContext(this.d, new e(bitmap, rect, null), continuation);
    }

    static /* synthetic */ Integer a(a aVar, c cVar, Rect rect, int[] iArr, boolean z, IntProgression intProgression, int i, Object obj) {
        if ((i & 16) != 0) {
            intProgression = null;
        }
        return aVar.a(cVar, rect, iArr, z, intProgression);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer a(c cVar, Rect rect, int[] iArr, boolean z, IntProgression intProgression) {
        Integer valueOf;
        Integer valueOf2;
        Pair a = a(cVar, rect, intProgression);
        IntProgression intProgression2 = (IntProgression) a.component1();
        IntProgression intProgression3 = (IntProgression) a.component2();
        int width = rect.width();
        int first = intProgression2.getFirst();
        int last = intProgression2.getLast();
        int step = intProgression2.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (true) {
            int first2 = intProgression3.getFirst();
            int last2 = intProgression3.getLast();
            int step2 = intProgression3.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    if (cVar.b() == b.Horizontal) {
                        valueOf = Integer.valueOf(first);
                        valueOf2 = Integer.valueOf(first2);
                    } else {
                        valueOf = Integer.valueOf(first2);
                        valueOf2 = Integer.valueOf(first);
                    }
                    Pair pair = TuplesKt.to(valueOf, valueOf2);
                    int intValue = ((Number) pair.component1()).intValue();
                    if (!this.b.a(iArr[((((Number) pair.component2()).intValue() - rect.top) * width) + (intValue - rect.left)], z)) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return Integer.valueOf(first);
                    }
                }
            }
            if (first == last) {
                return null;
            }
            first += step;
        }
    }

    private final Pair a(c cVar, Rect rect, IntProgression intProgression) {
        int i = d.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i == 1) {
            return new Pair(RangesKt.until(rect.top, rect.bottom), RangesKt.until(rect.left, rect.right));
        }
        if (i == 2) {
            return new Pair(RangesKt.downTo(rect.bottom - 1, rect.top), RangesKt.until(rect.left, rect.right));
        }
        if (i == 3) {
            IntRange until = RangesKt.until(rect.left, rect.right);
            if (intProgression == null) {
                intProgression = RangesKt.until(rect.top, rect.bottom);
            }
            return new Pair(until, intProgression);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        IntProgression downTo = RangesKt.downTo(rect.right - 1, rect.left);
        if (intProgression == null) {
            intProgression = RangesKt.until(rect.top, rect.bottom);
        }
        return new Pair(downTo, intProgression);
    }
}
