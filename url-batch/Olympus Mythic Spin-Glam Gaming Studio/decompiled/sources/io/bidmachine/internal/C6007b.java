package io.bidmachine.internal;

import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.BackgroundSource;
import io.bidmachine.rendering.model.Image;
import io.bidmachine.rendering.model.ImageBackgroundSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.cache.MediaFileMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: io.bidmachine.internal.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6007b implements InterfaceC6014i {
    private final CoroutineDispatcher a;
    private final Function0 b;
    private final Lazy c;

    /* renamed from: io.bidmachine.internal.b$a */
    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo4828invoke() {
            return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(C6007b.this.a));
        }
    }

    /* renamed from: io.bidmachine.internal.b$b, reason: collision with other inner class name */
    static final class C1775b extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        int f;
        /* synthetic */ Object g;
        int i;

        C1775b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C6007b.this.a((List) null, 0, (MediaFileCacheManager) null, this);
        }
    }

    /* renamed from: io.bidmachine.internal.b$c */
    static final class c extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return C6007b.this.getCacheParams((UnifiedMediationParams) null, this);
        }
    }

    /* renamed from: io.bidmachine.internal.b$d */
    static final class d extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return C6007b.this.a((AdParams) null, this);
        }
    }

    /* renamed from: io.bidmachine.internal.b$e */
    static final class e extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        /* synthetic */ Object g;
        int i;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C6007b.this.a((AdParams) null, (MediaFileCacheManager) null, this);
        }
    }

    /* renamed from: io.bidmachine.internal.b$f */
    static final class f extends ContinuationImpl {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        /* synthetic */ Object g;
        int i;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return C6007b.this.a((AdPhaseParams) null, (MediaFileCacheManager) null, this);
        }
    }

    /* renamed from: io.bidmachine.internal.b$g */
    static final class g extends ContinuationImpl {
        /* synthetic */ Object a;
        int c;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return C6007b.this.a((AdElementParams) null, (MediaFileCacheManager) null, this);
        }
    }

    /* renamed from: io.bidmachine.internal.b$h */
    static final class h extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ MediaFileCacheManager b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MediaFileCacheManager mediaFileCacheManager, String str, Continuation continuation) {
            super(2, continuation);
            this.b = mediaFileCacheManager;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MediaFileCacheManager mediaFileCacheManager = this.b;
                String str = this.c;
                this.a = 1;
                obj = mediaFileCacheManager.getMediaFileMetadata(str, this);
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

    public C6007b(CoroutineDispatcher ioDispatcher, Function0 function0) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.a = ioDispatcher;
        this.b = function0;
        this.c = LazyKt.lazy(new a());
    }

    public /* synthetic */ C6007b(CoroutineDispatcher coroutineDispatcher, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SdkDispatchers.INSTANCE.getDefault().getIo() : coroutineDispatcher, function0);
    }

    private final CoroutineScope a() {
        return (CoroutineScope) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // io.bidmachine.internal.InterfaceC6014i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCacheParams(UnifiedMediationParams unifiedMediationParams, Continuation continuation) {
        c cVar;
        int i;
        AdParams adParams;
        Map map;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cVar.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Object objectOrNull = unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_RENDERING_CONFIGURATION);
                        if (objectOrNull != null) {
                            if (((objectOrNull instanceof Rendering ? objectOrNull : null) != null ? (Rendering) objectOrNull : null) != null && (adParams = new AdaptiveRenderingParams(unifiedMediationParams).getAdParams()) != null) {
                                cVar.c = 1;
                                obj = a(adParams, cVar);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return MapsKt.emptyMap();
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    map = (Map) obj;
                    if (map != null) {
                        return map;
                    }
                    return MapsKt.emptyMap();
                }
            }
            if (i != 0) {
            }
            map = (Map) obj;
            if (map != null) {
            }
            return MapsKt.emptyMap();
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
        cVar = new c(continuation);
        Object obj2 = cVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdParams adParams, Continuation continuation) {
        d dVar;
        int i;
        List list;
        MediaFileCacheManager mediaFileCacheManager;
        Map createMapBuilder;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.c = i2 - Integer.MIN_VALUE;
                Object obj = dVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Function0 function0 = this.b;
                    if (function0 != null && (mediaFileCacheManager = (MediaFileCacheManager) function0.mo4828invoke()) != null) {
                        dVar.c = 1;
                        obj = a(adParams, mediaFileCacheManager, dVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        list = null;
                        createMapBuilder = MapsKt.createMapBuilder();
                        if (list != null && !list.isEmpty()) {
                            createMapBuilder.put("adaptive_resources_cache", list);
                        }
                        return MapsKt.build(createMapBuilder);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                createMapBuilder = MapsKt.createMapBuilder();
                if (list != null) {
                    createMapBuilder.put("adaptive_resources_cache", list);
                }
                return MapsKt.build(createMapBuilder);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.c;
        if (i != 0) {
        }
        list = (List) obj2;
        createMapBuilder = MapsKt.createMapBuilder();
        if (list != null) {
        }
        return MapsKt.build(createMapBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00d7 -> B:11:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdParams adParams, MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        e eVar;
        int i;
        List createListBuilder;
        C6007b c6007b;
        List list;
        AdParams adParams2;
        MediaFileCacheManager mediaFileCacheManager2;
        List list2;
        List list3;
        MediaFileCacheManager mediaFileCacheManager3;
        Iterator it;
        List list4;
        List list5;
        Collection collection;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.i = i2 - Integer.MIN_VALUE;
                Object obj = eVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    createListBuilder = CollectionsKt.createListBuilder();
                    AdPhaseParams placeholderParams = adParams.getPlaceholderParams();
                    if (placeholderParams != null) {
                        eVar.a = this;
                        eVar.b = adParams;
                        eVar.c = mediaFileCacheManager;
                        eVar.d = createListBuilder;
                        eVar.e = createListBuilder;
                        eVar.f = createListBuilder;
                        eVar.i = 1;
                        Object a2 = a(placeholderParams, mediaFileCacheManager, eVar);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c6007b = this;
                        adParams2 = adParams;
                        mediaFileCacheManager2 = mediaFileCacheManager;
                        list2 = createListBuilder;
                        list3 = list2;
                        obj = a2;
                        list = list3;
                    } else {
                        c6007b = this;
                        list = createListBuilder;
                        Queue<AdPhaseParams> adPhaseParamsQueue = adParams.getAdPhaseParamsQueue();
                        ArrayList arrayList = new ArrayList();
                        mediaFileCacheManager3 = mediaFileCacheManager;
                        it = adPhaseParamsQueue.iterator();
                        list4 = createListBuilder;
                        list5 = list;
                        collection = arrayList;
                        if (it.hasNext()) {
                        }
                    }
                } else if (i == 1) {
                    list2 = (List) eVar.f;
                    list3 = (List) eVar.e;
                    list = (List) eVar.d;
                    mediaFileCacheManager2 = (MediaFileCacheManager) eVar.c;
                    adParams2 = (AdParams) eVar.b;
                    c6007b = (C6007b) eVar.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list4 = (List) eVar.f;
                    it = (Iterator) eVar.e;
                    collection = (Collection) eVar.d;
                    list5 = (List) eVar.c;
                    mediaFileCacheManager3 = (MediaFileCacheManager) eVar.b;
                    c6007b = (C6007b) eVar.a;
                    ResultKt.throwOnFailure(obj);
                    CollectionsKt.addAll(collection, (List) obj);
                    if (it.hasNext()) {
                        AdPhaseParams it2 = (AdPhaseParams) it.next();
                        Intrinsics.checkNotNullExpressionValue(it2, "it");
                        eVar.a = c6007b;
                        eVar.b = mediaFileCacheManager3;
                        eVar.c = list5;
                        eVar.d = collection;
                        eVar.e = it;
                        eVar.f = list4;
                        eVar.i = 2;
                        obj = c6007b.a(it2, mediaFileCacheManager3, eVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        CollectionsKt.addAll(collection, (List) obj);
                        if (it.hasNext()) {
                            list4.addAll((List) collection);
                            return CollectionsKt.build(list5);
                        }
                    }
                }
                Boxing.boxBoolean(list2.addAll((Collection) obj));
                createListBuilder = list3;
                mediaFileCacheManager = mediaFileCacheManager2;
                adParams = adParams2;
                Queue<AdPhaseParams> adPhaseParamsQueue2 = adParams.getAdPhaseParamsQueue();
                ArrayList arrayList2 = new ArrayList();
                mediaFileCacheManager3 = mediaFileCacheManager;
                it = adPhaseParamsQueue2.iterator();
                list4 = createListBuilder;
                list5 = list;
                collection = arrayList2;
                if (it.hasNext()) {
                }
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.i;
        if (i != 0) {
        }
        Boxing.boxBoolean(list2.addAll((Collection) obj2));
        createListBuilder = list3;
        mediaFileCacheManager = mediaFileCacheManager2;
        adParams = adParams2;
        Queue<AdPhaseParams> adPhaseParamsQueue22 = adParams.getAdPhaseParamsQueue();
        ArrayList arrayList22 = new ArrayList();
        mediaFileCacheManager3 = mediaFileCacheManager;
        it = adPhaseParamsQueue22.iterator();
        list4 = createListBuilder;
        list5 = list;
        collection = arrayList22;
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdPhaseParams adPhaseParams, MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        f fVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        List createListBuilder;
        C6007b c6007b;
        MediaFileCacheManager mediaFileCacheManager2;
        List list;
        Object obj2;
        List list2;
        List list3;
        List list4;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.i = i2 - Integer.MIN_VALUE;
                obj = fVar.g;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fVar.i;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    createListBuilder = CollectionsKt.createListBuilder();
                    List<AdElementParams> adsList = adPhaseParams.getAdsList();
                    int sequence = adPhaseParams.getSequence();
                    fVar.a = this;
                    fVar.b = adPhaseParams;
                    fVar.c = mediaFileCacheManager;
                    fVar.d = createListBuilder;
                    fVar.e = createListBuilder;
                    fVar.f = createListBuilder;
                    fVar.i = 1;
                    Object a2 = a(adsList, sequence, mediaFileCacheManager, fVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c6007b = this;
                    mediaFileCacheManager2 = mediaFileCacheManager;
                    list = createListBuilder;
                    obj2 = a2;
                    list2 = list;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list3 = (List) fVar.b;
                        list4 = (List) fVar.a;
                        ResultKt.throwOnFailure(obj);
                        list3.addAll((Collection) obj);
                        return CollectionsKt.build(list4);
                    }
                    List list5 = (List) fVar.f;
                    list = (List) fVar.e;
                    list2 = (List) fVar.d;
                    mediaFileCacheManager2 = (MediaFileCacheManager) fVar.c;
                    AdPhaseParams adPhaseParams2 = (AdPhaseParams) fVar.b;
                    c6007b = (C6007b) fVar.a;
                    ResultKt.throwOnFailure(obj);
                    createListBuilder = list5;
                    adPhaseParams = adPhaseParams2;
                    obj2 = obj;
                }
                createListBuilder.addAll((Collection) obj2);
                List<AdElementParams> controlsList = adPhaseParams.getControlsList();
                int sequence2 = adPhaseParams.getSequence();
                fVar.a = list2;
                fVar.b = list;
                fVar.c = null;
                fVar.d = null;
                fVar.e = null;
                fVar.f = null;
                fVar.i = 2;
                obj = c6007b.a(controlsList, sequence2, mediaFileCacheManager2, fVar);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                list3 = list;
                list4 = list2;
                list3.addAll((Collection) obj);
                return CollectionsKt.build(list4);
            }
        }
        fVar = new f(continuation);
        obj = fVar.g;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fVar.i;
        if (i != 0) {
        }
        createListBuilder.addAll((Collection) obj2);
        List<AdElementParams> controlsList2 = adPhaseParams.getControlsList();
        int sequence22 = adPhaseParams.getSequence();
        fVar.a = list2;
        fVar.b = list;
        fVar.c = null;
        fVar.d = null;
        fVar.e = null;
        fVar.f = null;
        fVar.i = 2;
        obj = c6007b.a(controlsList2, sequence22, mediaFileCacheManager2, fVar);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa A[LOOP:0: B:11:0x00a4->B:13:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008a -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, int i, MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        C1775b c1775b;
        C6007b c6007b;
        int i2;
        ArrayList arrayList;
        C6007b c6007b2;
        Iterator it;
        int i3;
        C1775b c1775b2;
        MediaFileCacheManager mediaFileCacheManager2;
        if (continuation instanceof C1775b) {
            c1775b = (C1775b) continuation;
            int i4 = c1775b.i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1775b.i = i4 - Integer.MIN_VALUE;
                c6007b = this;
                Object obj = c1775b.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c1775b.i;
                int i5 = 1;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    c6007b2 = c6007b;
                    it = list.iterator();
                    i3 = i;
                    c1775b2 = c1775b;
                    mediaFileCacheManager2 = mediaFileCacheManager;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = c1775b.f;
                    AdElementParams adElementParams = (AdElementParams) c1775b.e;
                    Iterator it2 = (Iterator) c1775b.d;
                    ?? r8 = (Collection) c1775b.c;
                    MediaFileCacheManager mediaFileCacheManager3 = (MediaFileCacheManager) c1775b.b;
                    c6007b2 = (C6007b) c1775b.a;
                    ResultKt.throwOnFailure(obj);
                    C1775b c1775b3 = c1775b;
                    mediaFileCacheManager2 = mediaFileCacheManager3;
                    ArrayList arrayList2 = r8;
                    Iterator it3 = it2;
                    AdElementParams adElementParams2 = adElementParams;
                    Iterable<MediaFileMetadata> iterable = (Iterable) obj;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (MediaFileMetadata mediaFileMetadata : iterable) {
                        arrayList3.add(MapsKt.mapOf(TuplesKt.to("view", adElementParams2.getName()), TuplesKt.to("phase", Boxing.boxInt(i6)), TuplesKt.to("cache", MapsKt.mapOf(TuplesKt.to("size", Boxing.boxLong(mediaFileMetadata.getSizeBytes())), TuplesKt.to("mime", mediaFileMetadata.getMimeType()), TuplesKt.to("asset_usage_frequency", Boxing.boxLong(mediaFileMetadata.getUsageFrequency())), TuplesKt.to("created_at", Boxing.boxLong(mediaFileMetadata.getCreatedAt().getTime())), TuplesKt.to("last_used_at", Boxing.boxLong(mediaFileMetadata.getLastUsedTime().getTime())), TuplesKt.to("ping", Boxing.boxLong(Duration.m8147getInWholeMillisecondsimpl(mediaFileMetadata.m7957getPingTimeUwyO8pc()))), TuplesKt.to("download_time", Boxing.boxLong(Duration.m8147getInWholeMillisecondsimpl(mediaFileMetadata.m7956getDownloadTimeUwyO8pc())))))));
                    }
                    CollectionsKt.addAll(arrayList2, arrayList3);
                    i3 = i6;
                    c1775b2 = c1775b3;
                    it = it3;
                    arrayList = arrayList2;
                    i5 = 1;
                    if (it.hasNext()) {
                        AdElementParams adElementParams3 = (AdElementParams) it.next();
                        c1775b2.a = c6007b2;
                        c1775b2.b = mediaFileCacheManager2;
                        c1775b2.c = arrayList;
                        c1775b2.d = it;
                        c1775b2.e = adElementParams3;
                        c1775b2.f = i3;
                        c1775b2.i = i5;
                        Object a2 = c6007b2.a(adElementParams3, mediaFileCacheManager2, c1775b2);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        C1775b c1775b4 = c1775b2;
                        i6 = i3;
                        obj = a2;
                        arrayList2 = arrayList;
                        it3 = it;
                        adElementParams2 = adElementParams3;
                        c1775b3 = c1775b4;
                        Iterable<MediaFileMetadata> iterable2 = (Iterable) obj;
                        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                        while (r0.hasNext()) {
                        }
                        CollectionsKt.addAll(arrayList2, arrayList32);
                        i3 = i6;
                        c1775b2 = c1775b3;
                        it = it3;
                        arrayList = arrayList2;
                        i5 = 1;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        c6007b = this;
        c1775b = c6007b.new C1775b(continuation);
        Object obj2 = c1775b.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c1775b.i;
        int i52 = 1;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AdElementParams adElementParams, MediaFileCacheManager mediaFileCacheManager, Continuation continuation) {
        g gVar;
        int i;
        Deferred async$default;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.c = i2 - Integer.MIN_VALUE;
                Object obj = gVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Set a2 = a(adElementParams);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        async$default = BuildersKt__Builders_commonKt.async$default(a(), null, null, new h(mediaFileCacheManager, (String) it.next(), null), 3, null);
                        arrayList.add(async$default);
                    }
                    gVar.c = 1;
                    obj = AwaitKt.awaitAll(arrayList, gVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return CollectionsKt.filterNotNull((Iterable) obj);
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gVar.c;
        if (i != 0) {
        }
        return CollectionsKt.filterNotNull((Iterable) obj2);
    }

    private final Set a(AdElementParams adElementParams) {
        BackgroundSource source;
        Image image;
        Resource resource;
        ResourceSource source2;
        ResourceSource source3;
        Set createSetBuilder = SetsKt.createSetBuilder();
        Resource resource2 = adElementParams.getResource();
        if (resource2 != null && (source3 = resource2.getSource()) != null) {
            UrlResourceSource urlResourceSource = (source3 instanceof UrlResourceSource ? source3 : null) != null ? (UrlResourceSource) source3 : null;
            if (urlResourceSource != null) {
                createSetBuilder.addAll(urlResourceSource.getUrls());
            }
        }
        String source4 = adElementParams.getSource();
        if (source4 != null) {
            if (!UtilsKt.isHttpUrl(source4)) {
                source4 = null;
            }
            if (source4 != null) {
                createSetBuilder.add(source4);
            }
        }
        String placeholder = adElementParams.getPlaceholder();
        if (placeholder != null) {
            if (!UtilsKt.isHttpUrl(placeholder)) {
                placeholder = null;
            }
            if (placeholder != null) {
                createSetBuilder.add(placeholder);
            }
        }
        Background background = adElementParams.getAppearanceParams().getIo.appmetrica.analytics.impl.M2.g java.lang.String();
        if (background != null && (source = background.getSource()) != null) {
            ImageBackgroundSource imageBackgroundSource = (source instanceof ImageBackgroundSource ? source : null) != null ? (ImageBackgroundSource) source : null;
            if (imageBackgroundSource != null && (image = imageBackgroundSource.getImage()) != null && (resource = image.getResource()) != null && (source2 = resource.getSource()) != null) {
                UrlResourceSource urlResourceSource2 = (source2 instanceof UrlResourceSource ? source2 : null) != null ? (UrlResourceSource) source2 : null;
                if (urlResourceSource2 != null) {
                    createSetBuilder.addAll(urlResourceSource2.getUrls());
                }
            }
        }
        return SetsKt.build(createSetBuilder);
    }
}
