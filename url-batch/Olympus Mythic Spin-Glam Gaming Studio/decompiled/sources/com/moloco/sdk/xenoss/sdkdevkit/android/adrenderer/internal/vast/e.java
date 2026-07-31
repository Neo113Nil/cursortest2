package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.moloco.sdk.common_adapter_internal.ScreenData;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.A;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC5102b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.C5101a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d {

    @NotNull
    public static final c i = new c(null);
    public static final long j = 5000;
    public static final int k = 4;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l b;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l d;

    @NotNull
    public final u e;

    @NotNull
    public final HttpClient f;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p g;

    @NotNull
    public final String h;

    public static final class a {

        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> a;

        @NotNull
        public final List<String> b;

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> impressions, @NotNull List<String> errorUrls, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> creativesPerWrapper) {
            Intrinsics.checkNotNullParameter(impressions, "impressions");
            Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
            Intrinsics.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            this.a = impressions;
            this.b = errorUrls;
            this.c = creativesPerWrapper;
        }

        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> a() {
            return this.a;
        }

        @NotNull
        public final List<String> b() {
            return this.b;
        }

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> c() {
            return this.c;
        }

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> d() {
            return this.c;
        }

        @NotNull
        public final List<String> e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> f() {
            return this.a;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        @NotNull
        public String toString() {
            return "AggregatedWrapperChainAdData(impressions=" + this.a + ", errorUrls=" + this.b + ", creativesPerWrapper=" + this.c + ')';
        }

        @NotNull
        public final a a(@NotNull List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> impressions, @NotNull List<String> errorUrls, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> creativesPerWrapper) {
            Intrinsics.checkNotNullParameter(impressions, "impressions");
            Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
            Intrinsics.checkNotNullParameter(creativesPerWrapper, "creativesPerWrapper");
            return new a(impressions, errorUrls, creativesPerWrapper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a a(a aVar, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.a;
            }
            if ((i & 2) != 0) {
                list2 = aVar.b;
            }
            if ((i & 4) != 0) {
                list3 = aVar.c;
            }
            return aVar.a(list, list2, list3);
        }
    }

    public static final class b {

        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> a;

        @Nullable
        public final A b;

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> c;

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> linearTrackingList, @Nullable A a, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> iconsPerWrapper, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> companionsPerWrapper) {
            Intrinsics.checkNotNullParameter(linearTrackingList, "linearTrackingList");
            Intrinsics.checkNotNullParameter(iconsPerWrapper, "iconsPerWrapper");
            Intrinsics.checkNotNullParameter(companionsPerWrapper, "companionsPerWrapper");
            this.a = linearTrackingList;
            this.b = a;
            this.c = iconsPerWrapper;
            this.d = companionsPerWrapper;
        }

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>> a() {
            return this.d;
        }

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>> b() {
            return this.c;
        }

        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> c() {
            return this.a;
        }

        @Nullable
        public final A d() {
            return this.b;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }

        public final boolean a(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return Intrinsics.areEqual(lowerCase, "video/mp4") || Intrinsics.areEqual(lowerCase, "video/3gpp") || Intrinsics.areEqual(lowerCase, "video/webm");
        }

        public final List<String> a(Map<v, ? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>> map, v vVar) {
            List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list = map.get(vVar);
            if (list != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) it.next()).f());
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        }

        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g> a(Map<v, ? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>> map) {
            List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list = map.get(v.n);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar : list) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar = uVar.e() == null ? null : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g(uVar.f(), uVar.e());
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        }

        public final List<String> a(A a) {
            List<z> b;
            if (a != null && (b = a.b()) != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((z) it.next()).b());
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar) {
            String g = gVar.g();
            return !(g == null || StringsKt.isBlank(g));
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar) {
            String c = eVar.c();
            return !(c == null || StringsKt.isBlank(c));
        }

        public final boolean a(q qVar) {
            String a = qVar.a();
            return !(a == null || StringsKt.isBlank(a));
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar) {
            String a = lVar.a();
            return !(a == null || StringsKt.isBlank(a));
        }

        public final <T> Set<T> a(Set<? extends T> set, T t) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                CollectionsKt.addAll(linkedHashSet, set);
            }
            if (t != null) {
                linkedHashSet.add(t);
            }
            return linkedHashSet;
        }

        public final <T> List<T> a(List<? extends T> list, List<? extends T> list2) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                CollectionsKt.addAll(arrayList, list);
            }
            if (list2 != null) {
                CollectionsKt.addAll(arrayList, list2);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> List<T> a(List<? extends T> list, T t) {
            List<T> a;
            return (t == null || (a = e.i.a((List) list, (List) CollectionsKt.listOf(t))) == null) ? list == 0 ? CollectionsKt.emptyList() : list : a;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h a(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list, A a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                v d = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) obj).d();
                Object obj2 = linkedHashMap.get(d);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(d, obj2);
                }
                ((List) obj2).add(obj);
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h(a(a), a(linkedHashMap, v.a), a(linkedHashMap, v.b), a(linkedHashMap, v.c), a(linkedHashMap, v.d), a(linkedHashMap, v.e), a(linkedHashMap, v.f), a(linkedHashMap, v.g), a(linkedHashMap, v.h), a(linkedHashMap, v.i), a(linkedHashMap, v.k), a(linkedHashMap, v.j), a(linkedHashMap, v.m), a(linkedHashMap, v.l), a(linkedHashMap));
        }
    }

    public static final class d {
        public final int a;

        @NotNull
        public final Set<String> b;
        public final boolean c;

        @NotNull
        public final a d;

        public d(int i, @NotNull Set<String> usedVastAdTagUrls, boolean z, @NotNull a aggregatedWrapperChainData) {
            Intrinsics.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            Intrinsics.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            this.a = i;
            this.b = usedVastAdTagUrls;
            this.c = z;
            this.d = aggregatedWrapperChainData;
        }

        public final int a() {
            return this.a;
        }

        @NotNull
        public final Set<String> b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        @NotNull
        public final a d() {
            return this.d;
        }

        @NotNull
        public final a e() {
            return this.d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.areEqual(this.b, dVar.b) && this.c == dVar.c && Intrinsics.areEqual(this.d, dVar.d);
        }

        public final boolean f() {
            return this.c;
        }

        @NotNull
        public final Set<String> g() {
            return this.b;
        }

        public final int h() {
            return this.a;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode();
        }

        @NotNull
        public String toString() {
            return "WrapperChainParams(wrapperDepth=" + this.a + ", usedVastAdTagUrls=" + this.b + ", followAdditionalWrappers=" + this.c + ", aggregatedWrapperChainData=" + this.d + ')';
        }

        @NotNull
        public final d a(int i, @NotNull Set<String> usedVastAdTagUrls, boolean z, @NotNull a aggregatedWrapperChainData) {
            Intrinsics.checkNotNullParameter(usedVastAdTagUrls, "usedVastAdTagUrls");
            Intrinsics.checkNotNullParameter(aggregatedWrapperChainData, "aggregatedWrapperChainData");
            return new d(i, usedVastAdTagUrls, z, aggregatedWrapperChainData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d a(d dVar, int i, Set set, boolean z, a aVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dVar.a;
            }
            if ((i2 & 2) != 0) {
                set = dVar.b;
            }
            if ((i2 & 4) != 0) {
                z = dVar.c;
            }
            if ((i2 & 8) != 0) {
                aVar = dVar.d;
            }
            return dVar.a(i, set, z, aVar);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {161, 172}, m = "invoke")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$e, reason: collision with other inner class name */
    public static final class C1634e extends ContinuationImpl {
        public Object a;
        public Object b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public C1634e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return e.this.a((String) null, (String) null, false, (Continuation) this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$invoke$renderAdResult$1", f = "VastAdLoader.kt", l = {TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ w c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w wVar, boolean z, String str, Continuation continuation) {
            super(2, continuation);
            this.c = wVar;
            this.d = z;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new f(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                e eVar = e.this;
                w wVar = this.c;
                double b = eVar.b();
                ScreenData invoke = e.this.g.invoke();
                boolean z = this.d;
                String str = this.e;
                this.a = 1;
                obj = eVar.a(wVar, (d) null, b, invoke, z, str, this);
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

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {814, 365, 376}, m = "loadAndParseWrapperVastDocument")
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return e.this.a((B) null, (List<String>) null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {427}, m = "tryLoadInLineRenderAd")
    public static final class h extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public double m;
        public boolean n;
        public /* synthetic */ Object o;
        public int q;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.o = obj;
            this.q |= Integer.MIN_VALUE;
            return e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o) null, (a) null, 0.0d, (ScreenData) null, false, (String) null, (Continuation) this);
        }
    }

    public static final class i implements Flow {
        public final /* synthetic */ Flow a;
        public final /* synthetic */ e b;
        public final /* synthetic */ d c;
        public final /* synthetic */ double d;
        public final /* synthetic */ ScreenData e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Ref$ObjectRef h;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;
            public final /* synthetic */ e b;
            public final /* synthetic */ d c;
            public final /* synthetic */ double d;
            public final /* synthetic */ ScreenData e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ String g;
            public final /* synthetic */ Ref$ObjectRef h;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$tryLoadVastRenderAd$$inlined$mapNotNull$1$2", f = "VastAdLoader.kt", l = {54, 65, 86}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$i$a$a, reason: collision with other inner class name */
            public static final class C1635a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;
                public Object e;

                public C1635a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, e eVar, d dVar, double d, ScreenData screenData, boolean z, String str, Ref$ObjectRef ref$ObjectRef) {
                this.a = flowCollector;
                this.b = eVar;
                this.c = dVar;
                this.d = d;
                this.e = screenData;
                this.f = z;
                this.g = str;
                this.h = ref$ObjectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1635a c1635a;
                int i;
                a<T> aVar;
                FlowCollector flowCollector;
                x xVar;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar2;
                if (continuation instanceof C1635a) {
                    c1635a = (C1635a) continuation;
                    int i2 = c1635a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1635a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1635a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1635a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector2 = this.a;
                            AbstractC5102b a = ((C5101a) obj).a();
                            if (a instanceof AbstractC5102b.C1638b) {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.b.h, "Found Wrapper child element, trying load wrapper render Ad", null, false, 12, null);
                                e eVar = this.b;
                                B a2 = ((AbstractC5102b.C1638b) a).a();
                                d dVar = this.c;
                                double d = this.d;
                                ScreenData screenData = this.e;
                                boolean z = this.f;
                                String str = this.g;
                                c1635a.c = this;
                                c1635a.e = flowCollector2;
                                c1635a.b = 1;
                                Object a3 = eVar.a(a2, dVar, d, screenData, z, str, c1635a);
                                if (a3 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar = this;
                                flowCollector = flowCollector2;
                                obj2 = a3;
                                xVar = (x) obj2;
                            } else {
                                if (!(a instanceof AbstractC5102b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.b.h, "Found InLine child element, trying load render Ad", null, false, 12, null);
                                e eVar2 = this.b;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o a4 = ((AbstractC5102b.a) a).a();
                                d dVar2 = this.c;
                                a e = dVar2 != null ? dVar2.e() : null;
                                double d2 = this.d;
                                ScreenData screenData2 = this.e;
                                boolean z2 = this.f;
                                String str2 = this.g;
                                c1635a.c = this;
                                c1635a.e = flowCollector2;
                                c1635a.b = 2;
                                Object a5 = eVar2.a(a4, e, d2, screenData2, z2, str2, c1635a);
                                if (a5 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar = this;
                                flowCollector = flowCollector2;
                                obj2 = a5;
                                xVar = (x) obj2;
                            }
                        } else if (i == 1) {
                            flowCollector = (FlowCollector) c1635a.e;
                            aVar = (a) c1635a.c;
                            ResultKt.throwOnFailure(obj2);
                            xVar = (x) obj2;
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            flowCollector = (FlowCollector) c1635a.e;
                            aVar = (a) c1635a.c;
                            ResultKt.throwOnFailure(obj2);
                            xVar = (x) obj2;
                        }
                        if (!(xVar instanceof x.a)) {
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            String str3 = aVar.b.h;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to load the ad with error: ");
                            x.a aVar3 = (x.a) xVar;
                            sb.append(aVar3.a());
                            MolocoLogger.error$default(molocoLogger, str3, sb.toString(), null, false, 12, null);
                            aVar.h.element = (T) aVar3.a();
                            aVar2 = null;
                        } else {
                            if (!(xVar instanceof x.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((x.b) xVar).a();
                        }
                        if (aVar2 != null) {
                            c1635a.c = null;
                            c1635a.e = null;
                            c1635a.b = 3;
                            if (flowCollector.emit(aVar2, c1635a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1635a = new C1635a(continuation);
                Object obj22 = c1635a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1635a.b;
                if (i != 0) {
                }
                if (!(xVar instanceof x.a)) {
                }
                if (aVar2 != null) {
                }
                return Unit.INSTANCE;
            }
        }

        public i(Flow flow, e eVar, d dVar, double d, ScreenData screenData, boolean z, String str, Ref$ObjectRef ref$ObjectRef) {
            this.a = flow;
            this.b = eVar;
            this.c = dVar;
            this.d = d;
            this.e = screenData;
            this.f = z;
            this.g = str;
            this.h = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new a(flowCollector, this.b, this.c, this.d, this.e, this.f, this.g, this.h), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    public static final class j<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(((C5101a) t).c(), ((C5101a) t2).c());
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {289}, m = "tryLoadVastRenderAd")
    public static final class k extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return e.this.a((w) null, (d) null, 0.0d, (ScreenData) null, false, (String) null, (Continuation) this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 337}, m = "tryLoadWrapperRenderAd")
    public static final class l extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public double g;
        public boolean h;
        public int i;
        public /* synthetic */ Object j;
        public int l;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return e.this.a((B) null, (d) null, 0.0d, (ScreenData) null, false, (String) null, (Continuation) this);
        }
    }

    public static final class m implements Flow {
        public final /* synthetic */ Flow a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ e c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Ref$ObjectRef e;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ e c;
            public final /* synthetic */ String d;
            public final /* synthetic */ Ref$ObjectRef e;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$tryPrepareInLineRenderLinear$$inlined$mapNotNull$1$2", f = "VastAdLoader.kt", l = {53, 71, 82}, m = "emit")
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$m$a$a, reason: collision with other inner class name */
            public static final class C1636a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;
                public Object c;
                public Object e;
                public Object f;

                public C1636a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, boolean z, e eVar, String str, Ref$ObjectRef ref$ObjectRef) {
                this.a = flowCollector;
                this.b = z;
                this.c = eVar;
                this.d = str;
                this.e = ref$ObjectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C1636a c1636a;
                int i;
                FlowCollector flowCollector;
                q qVar;
                a<T> aVar;
                a<T> aVar2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar;
                Pair pair;
                i.a aVar3;
                if (continuation instanceof C1636a) {
                    c1636a = (C1636a) continuation;
                    int i2 = c1636a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1636a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1636a.a;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c1636a.b;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj2);
                            flowCollector = this.a;
                            qVar = (q) obj;
                            if (this.b) {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar = this.c.c;
                                String g = qVar.g();
                                String str = this.d;
                                c1636a.c = this;
                                c1636a.e = flowCollector;
                                c1636a.f = qVar;
                                c1636a.b = 1;
                                obj2 = iVar.a(g, str, c1636a);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar2 = this;
                                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj2;
                                if (!(cVar instanceof c.a)) {
                                }
                                if (pair != null) {
                                }
                            } else {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i iVar2 = this.c.c;
                                String g2 = qVar.g();
                                c1636a.c = this;
                                c1636a.e = flowCollector;
                                c1636a.f = qVar;
                                c1636a.b = 2;
                                obj2 = iVar2.a(g2, c1636a);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                aVar = this;
                                aVar3 = (i.a) obj2;
                                if (!(aVar3 instanceof i.a.b)) {
                                }
                            }
                        } else if (i == 1) {
                            qVar = (q) c1636a.f;
                            flowCollector = (FlowCollector) c1636a.e;
                            aVar2 = (a) c1636a.c;
                            ResultKt.throwOnFailure(obj2);
                            cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj2;
                            if (!(cVar instanceof c.a)) {
                                pair = TuplesKt.to(qVar, ((c.a) cVar).b());
                            } else if (cVar instanceof c.C1589c) {
                                pair = TuplesKt.to(qVar, ((c.C1589c) cVar).c());
                            } else {
                                if (!(cVar instanceof c.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.e.element = (T) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a(((c.b) cVar).b());
                                pair = null;
                            }
                            if (pair != null) {
                            }
                        } else if (i == 2) {
                            qVar = (q) c1636a.f;
                            flowCollector = (FlowCollector) c1636a.e;
                            aVar = (a) c1636a.c;
                            ResultKt.throwOnFailure(obj2);
                            aVar3 = (i.a) obj2;
                            if (!(aVar3 instanceof i.a.b)) {
                                pair = TuplesKt.to(qVar, ((i.a.b) aVar3).a());
                                if (pair != null) {
                                    c1636a.c = null;
                                    c1636a.e = null;
                                    c1636a.f = null;
                                    c1636a.b = 3;
                                    if (flowCollector.emit(pair, c1636a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (!(aVar3 instanceof i.a.AbstractC1586a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.e.element = (T) com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a((i.a.AbstractC1586a) aVar3);
                                pair = null;
                                if (pair != null) {
                                }
                            }
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
                c1636a = new C1636a(continuation);
                Object obj22 = c1636a.a;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1636a.b;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            }
        }

        public m(Flow flow, boolean z, e eVar, String str, Ref$ObjectRef ref$ObjectRef) {
            this.a = flow;
            this.b = z;
            this.c = eVar;
            this.d = str;
            this.e = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object collect = this.a.collect(new a(flowCollector, this.b, this.c, this.d, this.e), continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {574}, m = "tryPrepareInLineRenderLinear")
    public static final class n extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p) null, (List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>) null, (A) null, (List<String>) null, 0.0d, (Long) null, (ScreenData) null, false, (String) null, (Continuation) this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {100}, m = "waitForAdLoadToStart-8Mi8wO0")
    public static final class o extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return e.this.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$waitForAdLoadToStart$streamStatus$1", f = "VastAdLoader.kt", l = {102}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements Function2 {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$waitForAdLoadToStart$streamStatus$1$1", f = "VastAdLoader.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements Function2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ e c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.c = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar, Continuation continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.c, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.b;
                if (cVar instanceof c.C1589c) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    String str = this.c.h;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Stream status: ");
                    c.C1589c c1589c = (c.C1589c) cVar;
                    sb.append(c1589c.d().c());
                    sb.append('/');
                    sb.append(c1589c.d().d());
                    sb.append(" bytes downloaded");
                    MolocoLogger.info$default(molocoLogger, str, sb.toString(), null, false, 12, null);
                }
                return Boxing.boxBoolean((cVar instanceof c.a) || (cVar instanceof c.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, Continuation continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new p(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow b = e.this.c.b(this.c.j().l());
                a aVar = new a(e.this, null);
                this.a = 1;
                obj = FlowKt.firstOrNull(b, aVar, this);
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

    public e(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i parseVast, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l mediaConfig, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker, @NotNull u connectivityService, @NotNull HttpClient httpClient, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p screenService) {
        Intrinsics.checkNotNullParameter(parseVast, "parseVast");
        Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(screenService, "screenService");
        this.a = parseVast;
        this.b = mediaConfig;
        this.c = mediaCacheRepository;
        this.d = vastTracker;
        this.e = connectivityService;
        this.f = httpClient;
        this.g = screenService;
        this.h = "VastAdLoaderImpl";
    }

    public final double a(long j2, int i2) {
        return (j2 * 8) / (i2 * 1000);
    }

    public final double b() {
        return !this.e.b() ? 10.0d : 2.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, long j2, @NotNull Continuation continuation) {
        o oVar;
        int i2;
        e eVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i3 = oVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.e = i3 - Integer.MIN_VALUE;
                Object obj = oVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = oVar.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, this.h, "Waiting for " + ((Object) Duration.m8170toStringimpl(j2)) + " to load the vast media file: " + this.c, null, false, 12, null);
                    p pVar = new p(aVar, null);
                    oVar.a = this;
                    oVar.b = aVar;
                    oVar.e = 1;
                    obj = TimeoutKt.m8206withTimeoutOrNullKLykuaI(j2, pVar, oVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) oVar.b;
                    eVar = (e) oVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, eVar.h, "Either timeout occurred or media file streaming had terminal status", null, false, 12, null);
                MolocoLogger.info$default(molocoLogger, eVar.h, "Stream status: " + cVar + " on timeout", null, false, 12, null);
                if (cVar != null) {
                    File j3 = aVar.j().j();
                    if (j3.exists() && j3.length() != 0) {
                        MolocoLogger.info$default(molocoLogger, eVar.h, "Local vast media resource exists and has some content. Checking for bitrate information", null, false, 12, null);
                        if (aVar.j().k() != null) {
                            MolocoLogger.info$default(molocoLogger, eVar.h, "Checking for playability of VAST ad with bitrate: " + aVar.j().k(), null, false, 12, null);
                            double a2 = eVar.a(j3.length(), aVar.j().k().intValue());
                            MolocoLogger.info$default(molocoLogger, eVar.h, "VAST ad has playable duration: " + a2 + " seconds", null, false, 12, null);
                            if (a2 < eVar.b.g()) {
                                MolocoLogger.error$default(molocoLogger, eVar.h, "VAST does not have enough playable duration, so failing ", null, false, 12, null);
                                return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.y);
                            }
                        } else {
                            MolocoLogger.info$default(molocoLogger, eVar.h, "VAST ad playable duration cannot be determined due to no bitrate information", null, false, 12, null);
                            return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.z);
                        }
                    } else {
                        MolocoLogger.error$default(molocoLogger, eVar.h, j3.getAbsolutePath() + " does not exist or is empty", null, false, 12, null);
                        MolocoLogger.error$default(molocoLogger, eVar.h, "Failed to start streaming media file, reporting timeout error", null, false, 12, null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.x);
                    }
                } else {
                    if (cVar instanceof c.a) {
                        MolocoLogger.info$default(molocoLogger, eVar.h, "Streamed entire file successfully", null, false, 12, null);
                        return new x.b(aVar);
                    }
                    if (cVar instanceof c.b) {
                        MolocoLogger.info$default(molocoLogger, eVar.h, "Failed to stream file", null, false, 12, null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h.a(((c.b) cVar).b()));
                    }
                }
                MolocoLogger.info$default(molocoLogger, eVar.h, "Media file partially exists and ready for streaming", null, false, 12, null);
                return new x.b(aVar);
            }
        }
        oVar = new o(continuation);
        Object obj2 = oVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = oVar.e;
        if (i2 != 0) {
        }
        cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj2;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, eVar.h, "Either timeout occurred or media file streaming had terminal status", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger2, eVar.h, "Stream status: " + cVar + " on timeout", null, false, 12, null);
        if (cVar != null) {
        }
        MolocoLogger.info$default(molocoLogger2, eVar.h, "Media file partially exists and ready for streaming", null, false, 12, null);
        return new x.b(aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.c.a(url);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation continuation) {
        C1634e c1634e;
        int i2;
        String str3;
        boolean z2;
        e eVar;
        x xVar;
        x xVar2;
        if (continuation instanceof C1634e) {
            c1634e = (C1634e) continuation;
            int i3 = c1634e.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1634e.f = i3 - Integer.MIN_VALUE;
                Object obj = c1634e.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c1634e.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i iVar = this.a;
                    c1634e.a = this;
                    c1634e.b = str2;
                    c1634e.c = z;
                    c1634e.f = 1;
                    obj = iVar.a(str, c1634e);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str2;
                    z2 = z;
                    eVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        xVar2 = (x) obj;
                        if (!(xVar2 instanceof x.a)) {
                            return new x.a(((x.a) xVar2).a());
                        }
                        if (xVar2 instanceof x.b) {
                            return new x.b(((x.b) xVar2).a());
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z3 = c1634e.c;
                    String str4 = (String) c1634e.b;
                    eVar = (e) c1634e.a;
                    ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    str3 = str4;
                }
                xVar = (x) obj;
                if (!(xVar instanceof x.a)) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    String str5 = eVar.h;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to parse vast XML: ");
                    x.a aVar = (x.a) xVar;
                    sb.append(aVar.a());
                    MolocoLogger.error$default(molocoLogger, str5, sb.toString(), null, false, 12, null);
                    return new x.a(aVar.a());
                }
                if (xVar instanceof x.b) {
                    w wVar = (w) ((x.b) xVar).a();
                    CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    f fVar = eVar.new f(wVar, z2, str3, null);
                    c1634e.a = null;
                    c1634e.b = null;
                    c1634e.f = 2;
                    obj = BuildersKt.withContext(coroutineContext, fVar, c1634e);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    xVar2 = (x) obj;
                    if (!(xVar2 instanceof x.a)) {
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        c1634e = new C1634e(continuation);
        Object obj2 = c1634e.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c1634e.f;
        if (i2 != 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof x.a)) {
        }
    }

    public static /* synthetic */ void a(e eVar, List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            xVar = null;
        }
        eVar.a((List<String>) list, xVar);
    }

    public final void a(List<String> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar) {
        l.a.a(this.d, list, xVar, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w wVar, d dVar, double d2, ScreenData screenData, boolean z, String str, Continuation continuation) {
        k kVar;
        int i2;
        e eVar;
        Ref$ObjectRef ref$ObjectRef;
        a e;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i3 = kVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.e = i3 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = kVar2.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, this.h, "Loading vast ad with wrapperChainParams: " + dVar, null, false, 12, null);
                    List<String> a2 = i.a((List<? extends List<String>>) ((dVar == null || (e = dVar.e()) == null) ? null : e.e()), (List<String>) wVar.b());
                    if (wVar.a().isEmpty()) {
                        a(a2, dVar != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.f : null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.d);
                    }
                    d a3 = dVar != null ? d.a(dVar, 0, null, false, a.a(dVar.e(), null, a2, null, 5, null), 7, null) : null;
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.F;
                    List<C5101a> a4 = wVar.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : a4) {
                        C5101a c5101a = (C5101a) obj2;
                        if (c5101a.c() == null || new IntRange(0, 1).contains(c5101a.c().intValue())) {
                            arrayList.add(obj2);
                        }
                    }
                    i iVar = new i(FlowKt.cancellable(FlowKt.asFlow(CollectionsKt.sortedWith(arrayList, new j()))), this, a3, d2, screenData, z, str, ref$ObjectRef2);
                    kVar2.a = this;
                    kVar2.b = ref$ObjectRef2;
                    kVar2.e = 1;
                    obj = FlowKt.firstOrNull(iVar, kVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eVar = this;
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) kVar2.b;
                    eVar = (e) kVar2.a;
                    ResultKt.throwOnFailure(obj);
                }
                aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj;
                if (aVar != null) {
                    x.a aVar2 = new x.a(ref$ObjectRef.element);
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Failed to load linear: " + ref$ObjectRef.element, null, false, 12, null);
                    return aVar2;
                }
                return new x.b(aVar);
            }
        }
        kVar = new k(continuation);
        k kVar22 = kVar;
        Object obj3 = kVar22.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar22.e;
        if (i2 != 0) {
        }
        aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj3;
        if (aVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(B b2, d dVar, double d2, ScreenData screenData, boolean z, String str, Continuation continuation) {
        l lVar;
        int i2;
        double d3;
        boolean z2;
        d dVar2;
        List<String> list;
        String str2;
        B b3;
        int i3;
        e eVar;
        ScreenData screenData2;
        Set<String> g2;
        a e;
        x xVar;
        a e2;
        a e3;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i4 = lVar.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lVar.l = i4 - Integer.MIN_VALUE;
                l lVar2 = lVar;
                Object obj = lVar2.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lVar2.l;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, this.h, "Loading wrapper vast ad: " + b2.f(), null, false, 12, null);
                    int h2 = dVar != null ? dVar.h() + 1 : 0;
                    List<String> a2 = i.a((List) ((dVar == null || (e = dVar.e()) == null) ? null : e.e()), (List) b2.c());
                    if (h2 <= 4 && ((dVar == null || (g2 = dVar.g()) == null || !g2.contains(b2.f())) && (dVar == null || dVar.f()))) {
                        lVar2.a = this;
                        lVar2.b = b2;
                        lVar2.c = dVar;
                        lVar2.d = screenData;
                        lVar2.e = str;
                        lVar2.f = a2;
                        d3 = d2;
                        lVar2.g = d3;
                        z2 = z;
                        lVar2.h = z2;
                        lVar2.i = h2;
                        lVar2.l = 1;
                        Object a3 = a(b2, a2, lVar2);
                        if (a3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dVar2 = dVar;
                        list = a2;
                        str2 = str;
                        b3 = b2;
                        i3 = h2;
                        eVar = this;
                        screenData2 = screenData;
                        obj = a3;
                    } else {
                        a(a2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.e);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.e;
                        MolocoLogger.error$default(molocoLogger, this.h, "Failed to load wrapper vast ad: " + kVar, null, false, 12, null);
                        return new x.a(kVar);
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = lVar2.i;
                    boolean z3 = lVar2.h;
                    d3 = lVar2.g;
                    List<String> list2 = (List) lVar2.f;
                    String str3 = (String) lVar2.e;
                    screenData2 = (ScreenData) lVar2.d;
                    dVar2 = (d) lVar2.c;
                    b3 = (B) lVar2.b;
                    e eVar2 = (e) lVar2.a;
                    ResultKt.throwOnFailure(obj);
                    str2 = str3;
                    z2 = z3;
                    list = list2;
                    eVar = eVar2;
                }
                xVar = (x) obj;
                if (!(xVar instanceof x.a)) {
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    String str4 = eVar.h;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load wrapper vast ad: ");
                    x.a aVar = (x.a) xVar;
                    sb.append(aVar.a());
                    MolocoLogger.error$default(molocoLogger2, str4, sb.toString(), null, false, 12, null);
                    return new x.a(aVar.a());
                }
                if (xVar instanceof x.b) {
                    w wVar = (w) ((x.b) xVar).a();
                    c cVar = i;
                    List a4 = cVar.a((List) ((dVar2 == null || (e3 = dVar2.e()) == null) ? null : e3.f()), (List) b3.e());
                    List a5 = cVar.a((List) ((dVar2 == null || (e2 = dVar2.e()) == null) ? null : e2.d()), CollectionsKt.listOf(b3.b()));
                    Set a6 = cVar.a(dVar2 != null ? dVar2.g() : null, (Set<String>) b3.f());
                    Boolean d4 = b3.d();
                    d dVar3 = new d(i3, a6, d4 != null ? d4.booleanValue() : true, new a(a4, list, a5));
                    lVar2.a = null;
                    lVar2.b = null;
                    lVar2.c = null;
                    lVar2.d = null;
                    lVar2.e = null;
                    lVar2.f = null;
                    lVar2.l = 2;
                    obj = eVar.a(wVar, dVar3, d3, screenData2, z2, str2, lVar2);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        lVar = new l(continuation);
        l lVar22 = lVar;
        Object obj2 = lVar22.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lVar22.l;
        if (i2 != 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof x.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(B b2, List<String> list, Continuation continuation) {
        g gVar;
        Object obj;
        Object coroutine_suspended;
        int i2;
        List<String> list2;
        e eVar;
        List<String> list3;
        e eVar2;
        Exception exc;
        HttpRequestTimeoutException httpRequestTimeoutException;
        List<String> list4;
        e eVar3;
        w wVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.e = i3 - Integer.MIN_VALUE;
                obj = gVar.c;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.h, "Fetching wrapper vast tag url: " + b2.f(), null, false, 12, null);
                        HttpClient httpClient = this.f;
                        String f2 = b2.f();
                        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                        HttpRequestKt.url(httpRequestBuilder, f2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.core.a.a(httpRequestBuilder, 5000L);
                        httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
                        HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                        gVar.a = this;
                        list2 = list;
                        try {
                            gVar.b = list2;
                            gVar.e = 1;
                            obj = httpStatement.execute(gVar);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list3 = list2;
                            eVar2 = this;
                        } catch (HttpRequestTimeoutException e) {
                            e = e;
                            eVar = this;
                            httpRequestTimeoutException = e;
                            list3 = list2;
                            eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.d);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url timed out", httpRequestTimeoutException, false, 8, null);
                            return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                        } catch (Exception e2) {
                            e = e2;
                            eVar = this;
                            exc = e;
                            list3 = list2;
                            eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.c);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url fetch error", exc, false, 8, null);
                            return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                        }
                    } catch (HttpRequestTimeoutException e3) {
                        e = e3;
                        list2 = list;
                    } catch (Exception e4) {
                        e = e4;
                        list2 = list;
                    }
                } else if (i2 == 1) {
                    list3 = (List) gVar.b;
                    eVar2 = (e) gVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (HttpRequestTimeoutException e5) {
                        e = e5;
                        eVar = eVar2;
                        list2 = list3;
                        httpRequestTimeoutException = e;
                        list3 = list2;
                        eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.d);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url timed out", httpRequestTimeoutException, false, 8, null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                    } catch (Exception e6) {
                        e = e6;
                        eVar = eVar2;
                        list2 = list3;
                        exc = e;
                        list3 = list2;
                        eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.c);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url fetch error", exc, false, 8, null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list4 = (List) gVar.b;
                        eVar3 = (e) gVar.a;
                        ResultKt.throwOnFailure(obj);
                        x.b bVar = !(obj instanceof x.b) ? (x.b) obj : null;
                        wVar = bVar != null ? (w) bVar.a() : null;
                        if (wVar != null) {
                            eVar3.a(list4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.b);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar3.h, "Failed to create VAST object from XML", null, false, 12, null);
                            return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.b);
                        }
                        return new x.b(wVar);
                    }
                    list3 = (List) gVar.b;
                    eVar = (e) gVar.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        try {
                            String str = (String) obj;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i iVar = eVar.a;
                            gVar.a = eVar;
                            gVar.b = list3;
                            gVar.e = 3;
                            obj = iVar.a(str, gVar);
                            if (obj != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list4 = list3;
                            eVar3 = eVar;
                            if (!(obj instanceof x.b)) {
                            }
                            if (bVar != null) {
                            }
                            if (wVar != null) {
                            }
                        } catch (HttpRequestTimeoutException e7) {
                            httpRequestTimeoutException = e7;
                            eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.d);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url timed out", httpRequestTimeoutException, false, 8, null);
                            return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                        } catch (Exception e8) {
                            exc = e8;
                            eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.c);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url fetch error", exc, false, 8, null);
                            return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                        }
                    } catch (HttpRequestTimeoutException e9) {
                        e = e9;
                        list2 = list3;
                        httpRequestTimeoutException = e;
                        list3 = list2;
                        eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.d);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url timed out", httpRequestTimeoutException, false, 8, null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                    } catch (Exception e10) {
                        e = e10;
                        list2 = list3;
                        exc = e;
                        list3 = list2;
                        eVar.a(list3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.c);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Fetching wrapper vast tag url fetch error", exc, false, 8, null);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                    }
                }
                gVar.a = eVar2;
                gVar.b = list3;
                gVar.e = 2;
                obj = HttpResponseKt.bodyAsText$default((HttpResponse) obj, null, gVar, 1, null);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar = eVar2;
                String str2 = (String) obj;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.i iVar2 = eVar.a;
                gVar.a = eVar;
                gVar.b = list3;
                gVar.e = 3;
                obj = iVar2.a(str2, gVar);
                if (obj != coroutine_suspended) {
                }
            }
        }
        gVar = new g(continuation);
        obj = gVar.c;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.e;
        if (i2 != 0) {
        }
        gVar.a = eVar2;
        gVar.b = list3;
        gVar.e = 2;
        obj = HttpResponseKt.bodyAsText$default((HttpResponse) obj, null, gVar, 1, null);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0217, code lost:
    
        r7 = r31;
        r16 = r5;
        r5 = r28;
        r4 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x018d -> B:10:0x019d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar, final a aVar, double d2, ScreenData screenData, boolean z, String str, Continuation continuation) {
        h hVar;
        int i2;
        String str2;
        final e eVar;
        Lazy lazy;
        h hVar2;
        List<String> list;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar;
        Iterator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> it;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar;
        double d3;
        final ScreenData screenData2;
        boolean z2;
        a aVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.q = i3 - Integer.MIN_VALUE;
                Object obj = hVar.o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = hVar.q;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = hVar.n;
                    double d4 = hVar.m;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) hVar.l;
                    Iterator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> it2 = (Iterator) hVar.k;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) hVar.j;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c) hVar.i;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) hVar.h;
                    Lazy lazy2 = (Lazy) hVar.g;
                    List<String> list2 = (List) hVar.f;
                    String str3 = (String) hVar.e;
                    ScreenData screenData3 = (ScreenData) hVar.d;
                    a aVar3 = (a) hVar.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o) hVar.b;
                    e eVar2 = (e) hVar.a;
                    ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar4 = oVar3;
                    double d5 = d4;
                    ScreenData screenData4 = screenData3;
                    String str4 = str3;
                    z2 = z3;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar3 = gVar2;
                    Object obj2 = coroutine_suspended;
                    Object a2 = obj;
                    aVar2 = aVar3;
                    x xVar = (x) a2;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar5 = oVar4;
                    if (!(xVar instanceof x.a)) {
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        String str5 = eVar2.h;
                        StringBuilder sb = new StringBuilder();
                        e eVar3 = eVar2;
                        sb.append("Failed to prepare RenderLinear: ");
                        x.a aVar4 = (x.a) xVar;
                        sb.append(aVar4.a());
                        MolocoLogger.error$default(molocoLogger, str5, sb.toString(), null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) aVar4.a();
                        oVar2 = oVar5;
                        gVar = gVar3;
                        it = it2;
                        hVar2 = hVar;
                        screenData2 = screenData4;
                        str2 = str4;
                        eVar = eVar3;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar3 = cVar2;
                        kVar = kVar3;
                        list = list2;
                        lazy = lazy2;
                        fVar = fVar2;
                        cVar = cVar3;
                    } else {
                        e eVar4 = eVar2;
                        if (xVar instanceof x.b) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f) ((x.b) xVar).a();
                            oVar2 = oVar5;
                            gVar = gVar3;
                            cVar = cVar2;
                            kVar = kVar2;
                            it = it2;
                            hVar2 = hVar;
                            screenData2 = screenData4;
                            str2 = str4;
                            eVar = eVar4;
                            Lazy lazy3 = lazy2;
                            fVar = fVar3;
                            list = list2;
                            lazy = lazy3;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (cVar == null && (gVar.h() instanceof h.a)) {
                        cVar = eVar.a(((h.a) gVar.h()).a(), screenData2);
                    }
                    coroutine_suspended = obj2;
                    d3 = d5;
                    while (it.hasNext()) {
                        Object obj3 = coroutine_suspended;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g next = it.next();
                        if (fVar != null && cVar != null) {
                            break;
                        }
                        boolean z4 = z2;
                        if (i.a(next)) {
                            z2 = z4;
                            coroutine_suspended = obj3;
                        } else if (fVar == null && (next.h() instanceof h.b)) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p a3 = ((h.b) next.h()).a();
                            List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> c2 = a(lazy).c();
                            A d6 = a(lazy).d();
                            Long b2 = ((h.b) next.h()).a().b();
                            hVar2.a = eVar;
                            hVar2.b = oVar2;
                            hVar2.c = aVar2;
                            hVar2.d = screenData2;
                            hVar2.e = str2;
                            hVar2.f = list;
                            hVar2.g = lazy;
                            hVar2.h = fVar;
                            hVar2.i = cVar;
                            hVar2.j = kVar;
                            hVar2.k = it;
                            hVar2.l = next;
                            hVar2.m = d3;
                            z2 = z4;
                            hVar2.n = z2;
                            hVar2.q = 1;
                            a2 = eVar.a(a3, c2, d6, list, d3, b2, screenData2, z2, str2, hVar2);
                            d5 = d3;
                            obj2 = obj3;
                            if (a2 == obj2) {
                                return obj2;
                            }
                            gVar3 = next;
                            Lazy lazy4 = lazy;
                            list2 = list;
                            oVar4 = oVar2;
                            eVar2 = eVar;
                            str4 = str2;
                            screenData4 = screenData2;
                            hVar = hVar2;
                            it2 = it;
                            kVar2 = kVar;
                            cVar2 = cVar;
                            fVar2 = fVar;
                            lazy2 = lazy4;
                            x xVar2 = (x) a2;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVar52 = oVar4;
                            if (!(xVar2 instanceof x.a)) {
                            }
                            if (cVar == null) {
                            }
                            coroutine_suspended = obj2;
                            d3 = d5;
                            while (it.hasNext()) {
                            }
                        } else {
                            z2 = z4;
                            d5 = d3;
                            obj2 = obj3;
                            gVar = next;
                            if (cVar == null) {
                                cVar = eVar.a(((h.a) gVar.h()).a(), screenData2);
                            }
                            coroutine_suspended = obj2;
                            d3 = d5;
                            while (it.hasNext()) {
                            }
                        }
                    }
                    if (fVar != null) {
                        eVar.a(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.h);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Failed to load linear: " + kVar, null, false, 12, null);
                        return new x.a(kVar);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, eVar.h, "RenderAd loaded successfully.", null, false, 12, null);
                    if (fVar.i() == null) {
                        fVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f.a(fVar, null, null, null, null, null, null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(CollectionsKt.asReversed(a(lazy).b())), new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return e.a(e.this, (List) obj4);
                            }
                        })), 63, null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f fVar4 = fVar;
                    if (cVar == null) {
                        cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(CollectionsKt.asReversed(a(lazy).a())), new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return e.a(e.this, screenData2, (List) obj4);
                            }
                        }));
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar4 = cVar;
                    List a4 = i.a((List) (aVar2 != null ? aVar2.f() : null), (List) oVar2.g());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a4, 10));
                    Iterator it3 = a4.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) it3.next()).b());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, eVar.h, "Returning RenderAd", null, false, 12, null);
                    return new x.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a(fVar4, cVar4, arrayList, list, null, 16, null));
                }
                ResultKt.throwOnFailure(obj);
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, this.h, "Trying to load RenderAd", null, false, 12, null);
                List<String> a5 = i.a((List) (aVar != null ? aVar.e() : null), (List) oVar.f());
                if (oVar.d().isEmpty()) {
                    a(a5, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.g);
                    MolocoLogger.error$default(molocoLogger2, this.h, "No creatives in InLine", null, false, 12, null);
                    return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.h);
                }
                str2 = str;
                eVar = this;
                lazy = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        return e.a(e.this, aVar);
                    }
                });
                hVar2 = hVar;
                list = a5;
                kVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.i;
                it = oVar.d().iterator();
                cVar = null;
                fVar = null;
                d3 = d2;
                screenData2 = screenData;
                z2 = z;
                aVar2 = aVar;
                oVar2 = oVar;
                while (it.hasNext()) {
                }
                if (fVar != null) {
                }
            }
        }
        hVar = new h(continuation);
        Object obj4 = hVar.o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = hVar.q;
        if (i2 == 0) {
        }
    }

    public static final b a(Lazy lazy) {
        return (b) lazy.getValue();
    }

    public static final b a(e eVar, a aVar) {
        return eVar.a(aVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e a(e eVar, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return eVar.a((List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l>) it);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c a(e eVar, ScreenData screenData, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return eVar.a((List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e>) it, screenData);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p pVar, List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list, A a2, List<String> list2, double d2, Long l2, ScreenData screenData, boolean z, String str, Continuation continuation) {
        n nVar;
        int i2;
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list3;
        A a3;
        Object firstOrNull;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p pVar2;
        e eVar;
        Ref$ObjectRef ref$ObjectRef;
        Pair pair;
        z a4;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i3 = nVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.h = i3 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                Object obj = nVar2.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = nVar2.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, this.h, "Preparing InLine RenderLinear with target linear size: " + d2, null, false, 12, null);
                    List<q> d3 = pVar.d();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : d3) {
                        q qVar = (q) obj2;
                        c cVar = i;
                        if (!cVar.a(qVar) && qVar.k() && cVar.a(qVar.i())) {
                            arrayList.add(obj2);
                        }
                    }
                    List sortedWith = CollectionsKt.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a(d2, l2, Boxing.boxInt(screenData.getWidthPx()), Boxing.boxInt(screenData.getHeightPx())));
                    if (sortedWith.isEmpty()) {
                        a(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.i);
                        return new x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.j);
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.E;
                    m mVar = new m(FlowKt.cancellable(FlowKt.asFlow(sortedWith)), z, this, str, ref$ObjectRef2);
                    nVar2.a = this;
                    nVar2.b = pVar;
                    list3 = list;
                    nVar2.c = list3;
                    a3 = a2;
                    nVar2.d = a3;
                    nVar2.e = ref$ObjectRef2;
                    nVar2.h = 1;
                    firstOrNull = FlowKt.firstOrNull(mVar, nVar2);
                    if (firstOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pVar2 = pVar;
                    eVar = this;
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) nVar2.e;
                    A a5 = (A) nVar2.d;
                    List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> list4 = (List) nVar2.c;
                    pVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p) nVar2.b;
                    eVar = (e) nVar2.a;
                    ResultKt.throwOnFailure(obj);
                    a3 = a5;
                    list3 = list4;
                    firstOrNull = obj;
                }
                pair = (Pair) firstOrNull;
                if (pair != null) {
                    x.a aVar = new x.a(ref$ObjectRef.element);
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, eVar.h, "Failed to load media file: " + ref$ObjectRef.element, null, false, 12, null);
                    return aVar;
                }
                q qVar2 = (q) pair.component1();
                File file = (File) pair.component2();
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, eVar.h, "Found a RenderLinear MediaFile: " + file.getAbsolutePath() + " for url: " + qVar2.g(), null, false, 12, null);
                A g2 = pVar2.g();
                String b2 = (g2 == null || (a4 = g2.a()) == null) ? null : a4.b();
                c cVar2 = i;
                List a6 = cVar2.a((List) pVar2.f(), (List) list3);
                A g3 = pVar2.g();
                z a7 = g3 != null ? g3.a() : null;
                A g4 = pVar2.g();
                List a8 = cVar2.a((List) (g4 != null ? g4.b() : null), (List) (a3 != null ? a3.b() : null));
                A g5 = pVar2.g();
                A a9 = new A(a7, a8, cVar2.a((List) (g5 != null ? g5.c() : null), (List) (a3 != null ? a3.c() : null)));
                MolocoLogger.info$default(molocoLogger, eVar.h, "Returning RenderLinear for url: " + qVar2.g() + ", with bitrate: " + qVar2.b() + ' ', null, false, 12, null);
                return new x.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f(pVar2.e(), file, qVar2.b(), qVar2.g(), b2, cVar2.a((List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u>) a6, a9), eVar.a(pVar2.c())));
            }
        }
        nVar = new n(continuation);
        n nVar22 = nVar;
        Object obj3 = nVar22.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = nVar22.h;
        if (i2 != 0) {
        }
        pair = (Pair) firstOrNull;
        if (pair != null) {
        }
    }

    public final b a(a aVar) {
        List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> d2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (aVar != null && (d2 = aVar.d()) != null) {
            Iterator<T> it = d2.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> arrayList8 = new ArrayList();
                for (Object obj : list) {
                    if (!i.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj)) {
                        arrayList8.add(obj);
                    }
                }
                for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar : arrayList8) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h h2 = gVar.h();
                    if (h2 instanceof h.b) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p a2 = ((h.b) gVar.h()).a();
                        CollectionsKt.addAll(arrayList, a2.f());
                        A g2 = a2.g();
                        if (g2 != null) {
                            CollectionsKt.addAll(arrayList2, g2.b());
                            CollectionsKt.addAll(arrayList3, g2.c());
                        }
                        CollectionsKt.addAll(arrayList6, a2.c());
                    } else if (h2 instanceof h.a) {
                        CollectionsKt.addAll(arrayList7, ((h.a) gVar.h()).a());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList4.add(arrayList6);
                arrayList5.add(arrayList7);
            }
        }
        return new b(arrayList, new A(null, arrayList2, arrayList3), arrayList4, arrayList5);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c a(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> list, ScreenData screenData) {
        List<String> emptyList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) obj;
            if (!i.a(eVar) && !eVar.h().isEmpty()) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e eVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a(Integer.valueOf(screenData.getWidthPx()), Integer.valueOf(screenData.getHeightPx()))));
        if (eVar2 == null) {
            return null;
        }
        y yVar = (y) CollectionsKt.first(CollectionsKt.sortedWith(eVar2.h(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.b()));
        Integer i2 = eVar2.i();
        int intValue = i2 != null ? i2.intValue() : 0;
        Integer f2 = eVar2.f();
        int intValue2 = f2 != null ? f2.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f d2 = eVar2.d();
        String a2 = d2 != null ? d2.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f d3 = eVar2.d();
        if (d3 == null || (emptyList = d3.b()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List<String> list2 = emptyList;
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> e = eVar2.e();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(e, 10));
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u) it.next()).f());
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c(yVar, intValue, intValue2, a2, list2, arrayList2);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e a(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> list) {
        List<String> emptyList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!i.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) obj)) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g.a()));
        if (lVar == null) {
            return null;
        }
        y g2 = lVar.g();
        Integer i2 = lVar.i();
        int intValue = i2 != null ? i2.intValue() : 0;
        Integer d2 = lVar.d();
        int intValue2 = d2 != null ? d2.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m b2 = lVar.b();
        String a2 = b2 != null ? b2.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m b3 = lVar.b();
        if (b3 == null || (emptyList = b3.b()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e(g2, intValue, intValue2, a2, emptyList, lVar.h(), lVar.c(), lVar.e());
    }
}
