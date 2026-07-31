package com.moloco.sdk.internal.publisher.nativead.parser;

import android.content.Context;
import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.publisher.nativead.model.c;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final String a = "PrepareNativeAssets";

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", l = {113}, m = "prepareImageAsset")
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return c.b(null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", l = {37, 58}, m = "prepareNativeAssets-exY8QGI")
    public static final class b extends ContinuationImpl {
        public long a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return c.a((Context) null, (List<? extends b.a>) null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedOptionalAssets$1", f = "PrepareNativeAssets.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.c$c, reason: collision with other inner class name */
    public static final class C1551c extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ List<b.a> c;
        public final /* synthetic */ Lazy d;
        public final /* synthetic */ long e;

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedOptionalAssets$1$1$1", f = "PrepareNativeAssets.kt", l = {60}, m = "invokeSuspend")
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.c$c$a */
        public static final class a extends SuspendLambda implements Function2 {
            public Object a;
            public int b;
            public final /* synthetic */ b.a c;
            public final /* synthetic */ Lazy d;
            public final /* synthetic */ long e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b.a aVar, Lazy lazy, long j, Continuation continuation) {
                super(2, continuation);
                this.c = aVar;
                this.d = lazy;
                this.e = j;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.a aVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    b.a aVar2 = this.c;
                    Lazy lazy = this.d;
                    long j = this.e;
                    this.a = aVar2;
                    this.b = 1;
                    Object b = c.b(aVar2, lazy, j, this);
                    if (b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = aVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (b.a) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                return TuplesKt.to(aVar, obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1551c(List<? extends b.a> list, Lazy lazy, long j, Continuation continuation) {
            super(2, continuation);
            this.c = list;
            this.d = lazy;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1551c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1551c c1551c = new C1551c(this.c, this.d, this.e, continuation);
            c1551c.b = obj;
            return c1551c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                List<b.a> list = this.c;
                Lazy lazy = this.d;
                long j = this.e;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((b.a) it.next(), lazy, j, null), 3, null);
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

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedRequiredAssets$1", f = "PrepareNativeAssets.kt", l = {51}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements Function2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ List<b.a> c;
        public final /* synthetic */ Lazy d;
        public final /* synthetic */ long e;

        @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt$prepareNativeAssets$preparedRequiredAssets$1$1$1", f = "PrepareNativeAssets.kt", l = {40}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public final /* synthetic */ b.a b;
            public final /* synthetic */ Lazy c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b.a aVar, Lazy lazy, long j, Continuation continuation) {
                super(2, continuation);
                this.b = aVar;
                this.c = lazy;
                this.d = j;
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
                    b.a aVar = this.b;
                    Lazy lazy = this.c;
                    long j = this.d;
                    this.a = 1;
                    obj = c.b(aVar, lazy, j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                x xVar = (x) obj;
                if (xVar instanceof x.b) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, c.a, "Successfully prepared native asset: " + this.b.a(), null, false, 12, null);
                    return TuplesKt.to(this.b, xVar);
                }
                if (!(xVar instanceof x.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, c.a, "Failed to prepare required native asset: " + this.b.a(), null, false, 12, null);
                throw new com.moloco.sdk.internal.publisher.nativead.parser.b(this.b.a(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((x.a) xVar).a());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends b.a> list, Lazy lazy, long j, Continuation continuation) {
            super(2, continuation);
            this.c = list;
            this.d = lazy;
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = new d(this.c, this.d, this.e, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                List<b.a> list = this.c;
                Lazy lazy = this.d;
                long j = this.e;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a((b.a) it.next(), lazy, j, null), 3, null);
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

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.parser.PrepareNativeAssetsKt", f = "PrepareNativeAssets.kt", l = {148, 155}, m = "prepareVideoAsset-exY8QGI")
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int e;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return c.b((b.a.d) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d) null, 0L, this);
        }
    }

    public static final Object b(b.a aVar, Lazy lazy, long j, Continuation continuation) {
        if (aVar instanceof b.a.C1547a) {
            return new x.b(new c.a((b.a.C1547a) aVar));
        }
        if (aVar instanceof b.a.C1548b) {
            return a((b.a.C1548b) aVar, null, continuation, 2, null);
        }
        if (aVar instanceof b.a.c) {
            return new x.b(new c.C1550c((b.a.c) aVar));
        }
        if (aVar instanceof b.a.d) {
            return b((b.a.d) aVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d) lazy.getValue(), j, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull final Context context, @NotNull List<? extends b.a> list, long j, @NotNull Continuation continuation) {
        b bVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        Lazy lazy;
        List list2;
        List list3;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.e = i2 - Integer.MIN_VALUE;
                    obj = bVar.d;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = bVar.e;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Lazy lazy2 = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.parser.c$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public final Object mo4828invoke() {
                                return c.a(context);
                            }
                        });
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list) {
                            Boolean boxBoolean = Boxing.boxBoolean(((b.a) obj2).b());
                            Object obj3 = linkedHashMap.get(boxBoolean);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(boxBoolean, obj3);
                            }
                            ((List) obj3).add(obj2);
                        }
                        List list4 = (List) linkedHashMap.get(Boxing.boxBoolean(true));
                        if (list4 == null) {
                            list4 = CollectionsKt.emptyList();
                        }
                        List list5 = list4;
                        List list6 = (List) linkedHashMap.get(Boxing.boxBoolean(false));
                        if (list6 == null) {
                            list6 = CollectionsKt.emptyList();
                        }
                        d dVar = new d(list5, lazy2, j, null);
                        bVar.b = lazy2;
                        bVar.c = list6;
                        bVar.a = j;
                        bVar.e = 1;
                        obj = CoroutineScopeKt.coroutineScope(dVar, bVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lazy = lazy2;
                        list2 = list6;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list3 = (List) bVar.b;
                            ResultKt.throwOnFailure(obj);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            ArrayList arrayList = new ArrayList();
                            for (Pair pair : CollectionsKt.plus((Collection) list3, (Iterable) obj)) {
                                b.a aVar = (b.a) pair.component1();
                                x xVar = (x) pair.component2();
                                if (xVar instanceof x.a) {
                                    arrayList.add(TuplesKt.to(aVar, ((x.a) xVar).a()));
                                } else if (xVar instanceof x.b) {
                                    com.moloco.sdk.internal.publisher.nativead.model.c cVar = (com.moloco.sdk.internal.publisher.nativead.model.c) ((x.b) xVar).a();
                                    if (cVar instanceof c.a) {
                                        Pair pair2 = TuplesKt.to(Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                                    } else if (cVar instanceof c.b) {
                                        Pair pair3 = TuplesKt.to(Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap3.put(pair3.getFirst(), pair3.getSecond());
                                    } else if (cVar instanceof c.C1550c) {
                                        Pair pair4 = TuplesKt.to(Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap4.put(pair4.getFirst(), pair4.getSecond());
                                    } else {
                                        if (!(cVar instanceof c.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        Pair pair5 = TuplesKt.to(Boxing.boxInt(cVar.b().a()), cVar);
                                        linkedHashMap5.put(pair5.getFirst(), pair5.getSecond());
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            return new x.b(new com.moloco.sdk.internal.publisher.nativead.model.d(linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, arrayList));
                        }
                        j = bVar.a;
                        List list7 = (List) bVar.c;
                        Lazy lazy3 = (Lazy) bVar.b;
                        ResultKt.throwOnFailure(obj);
                        list2 = list7;
                        lazy = lazy3;
                    }
                    list3 = (List) obj;
                    C1551c c1551c = new C1551c(list2, lazy, j, null);
                    bVar.b = list3;
                    bVar.c = null;
                    bVar.e = 2;
                    obj = CoroutineScopeKt.coroutineScope(c1551c, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap42 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap52 = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    while (r11.hasNext()) {
                    }
                    return new x.b(new com.moloco.sdk.internal.publisher.nativead.model.d(linkedHashMap22, linkedHashMap32, linkedHashMap42, linkedHashMap52, arrayList2));
                }
            }
            if (i != 0) {
            }
            list3 = (List) obj;
            C1551c c1551c2 = new C1551c(list2, lazy, j, null);
            bVar.b = list3;
            bVar.c = null;
            bVar.e = 2;
            obj = CoroutineScopeKt.coroutineScope(c1551c2, bVar);
            if (obj == coroutine_suspended) {
            }
            LinkedHashMap linkedHashMap222 = new LinkedHashMap();
            LinkedHashMap linkedHashMap322 = new LinkedHashMap();
            LinkedHashMap linkedHashMap422 = new LinkedHashMap();
            LinkedHashMap linkedHashMap522 = new LinkedHashMap();
            ArrayList arrayList22 = new ArrayList();
            while (r11.hasNext()) {
            }
            return new x.b(new com.moloco.sdk.internal.publisher.nativead.model.d(linkedHashMap222, linkedHashMap322, linkedHashMap422, linkedHashMap522, arrayList22));
        } catch (com.moloco.sdk.internal.publisher.nativead.parser.b e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, a, "Failed to prepare required assets", e2, false, 8, null);
            return new x.a(e2);
        }
        bVar = new b(continuation);
        obj = bVar.d;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b.a.C1548b c1548b, i iVar, Continuation continuation) {
        a aVar;
        int i;
        i.a aVar2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String e2 = c1548b.e();
                    aVar.a = c1548b;
                    aVar.c = 1;
                    obj = iVar.a(e2, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1548b = (b.a.C1548b) aVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                aVar2 = (i.a) obj;
                if (!(aVar2 instanceof i.a.b)) {
                    try {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, a, "Successfully loaded image asset media", null, false, 12, null);
                        String absolutePath = ((i.a.b) aVar2).a().getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        Uri parse = Uri.parse(absolutePath);
                        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                        return new x.b(new c.b(c1548b, parse));
                    } catch (Exception e3) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, a, "Failed to prepare image asset", e3, false, 8, null);
                        return new x.a(f.c);
                    }
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, a, "Failed to fetch image asset media", null, false, 12, null);
                return new x.a(f.b);
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        if (i != 0) {
        }
        aVar2 = (i.a) obj2;
        if (!(aVar2 instanceof i.a.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b.a.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2, long j, Continuation continuation) {
        e eVar;
        int i;
        x xVar;
        x xVar2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.e = i2 - Integer.MIN_VALUE;
                Object obj = eVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String c = dVar.c();
                    eVar.a = dVar;
                    eVar.b = dVar2;
                    eVar.c = j;
                    eVar.e = 1;
                    obj = d.a.a(dVar2, c, null, true, eVar, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = (b.a.d) eVar.a;
                        ResultKt.throwOnFailure(obj);
                        xVar2 = (x) obj;
                        if (!(xVar2 instanceof x.b)) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, a, "Successfully loaded video asset media", null, false, 12, null);
                            return new x.b(new c.d(dVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar2).a()));
                        }
                        if (xVar2 instanceof x.a) {
                            MolocoLogger.warn$default(MolocoLogger.INSTANCE, a, "Failed to fetch video asset media: " + ((x.a) xVar2).a(), null, false, 12, null);
                            return new x.a(f.d);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    j = eVar.c;
                    dVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d) eVar.b;
                    dVar = (b.a.d) eVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                xVar = (x) obj;
                if (!(xVar instanceof x.b)) {
                    long duration = DurationKt.toDuration(Duration.m8147getInWholeMillisecondsimpl(j) * 0.9d, DurationUnit.MILLISECONDS);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar).a();
                    eVar.a = dVar;
                    eVar.b = null;
                    eVar.e = 2;
                    obj = dVar2.a(aVar, duration, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    xVar2 = (x) obj;
                    if (!(xVar2 instanceof x.b)) {
                    }
                } else {
                    if (xVar instanceof x.a) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, a, "Failed to fetch video asset media: " + ((x.a) xVar).a(), null, false, 12, null);
                        return new x.a(f.e);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.e;
        if (i != 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof x.b)) {
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d a(Context context) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(context);
    }

    public static /* synthetic */ Object a(b.a.C1548b c1548b, i iVar, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = a.g.a.a();
        }
        return b(c1548b, iVar, continuation);
    }
}
