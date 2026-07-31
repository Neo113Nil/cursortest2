package io.bidmachine.analytics.internal.z;

import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.C.a;
import io.bidmachine.analytics.internal.D.d;
import io.bidmachine.analytics.internal.H.e;
import io.bidmachine.analytics.internal.I.f;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.g.AbstractC5904f;
import io.bidmachine.analytics.internal.g.C5902d;
import io.bidmachine.analytics.internal.g.C5903e;
import io.bidmachine.analytics.internal.z.b;
import io.bidmachine.analytics.internal.z.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes10.dex */
public final class a {
    public static final a a = new a();
    private static final f b;
    private static final CoroutineScope c;
    private static Map d;
    private static Map e;
    private static final List f;

    /* renamed from: io.bidmachine.analytics.internal.z.a$a, reason: collision with other inner class name */
    static final class C1770a extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ io.bidmachine.analytics.internal.H.c b;
        final /* synthetic */ String c;
        final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1770a(io.bidmachine.analytics.internal.H.c cVar, String str, List list, Continuation continuation) {
            super(2, continuation);
            this.b = cVar;
            this.c = str;
            this.d = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C1770a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1770a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.a(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    static final class b extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ e b;
        final /* synthetic */ List c;
        final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, List list, List list2, Continuation continuation) {
            super(2, continuation);
            this.b = eVar;
            this.c = list;
            this.d = list2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.a(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    static {
        f a2 = f.g.a();
        b = a2;
        c = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(a2.b()));
        d = MapsKt.emptyMap();
        e = MapsKt.emptyMap();
        f = Collections.synchronizedList(new ArrayList());
    }

    private a() {
    }

    public final void a(C5890a c5890a, AnalyticsConfig analyticsConfig) {
        synchronized (this) {
            try {
                io.bidmachine.analytics.internal.H.c e2 = c5890a.c().e();
                e g = c5890a.c().g();
                a aVar = a;
                aVar.a(d);
                d = aVar.a(analyticsConfig, e2);
                e = aVar.a(c5890a, analyticsConfig, g);
                aVar.a(analyticsConfig.getSessionId());
                String sessionId = analyticsConfig.getSessionId();
                List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(monitorConfigList, 10));
                Iterator<T> it = monitorConfigList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MonitorConfig) it.next()).getName());
                }
                aVar.a(e2, sessionId, arrayList);
                a aVar2 = a;
                List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(readerConfigList, 10));
                Iterator<T> it2 = readerConfigList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ReaderConfig) it2.next()).getName());
                }
                List<ReaderConfig> readerConfigList2 = analyticsConfig.getReaderConfigList();
                ArrayList<List> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(readerConfigList2, 10));
                Iterator<T> it3 = readerConfigList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ReaderConfig) it3.next()).getRules());
                }
                ArrayList arrayList4 = new ArrayList();
                for (List list : arrayList3) {
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(AbstractC5904f.a((ReaderConfig.Rule) it4.next()));
                    }
                    CollectionsKt.addAll(arrayList4, arrayList5);
                }
                aVar2.a(g, arrayList2, arrayList4);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void a(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((io.bidmachine.analytics.internal.z.b) it.next()).a();
        }
    }

    private final Map a(AnalyticsConfig analyticsConfig, io.bidmachine.analytics.internal.H.c cVar) {
        List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : monitorConfigList) {
            if (((MonitorConfig) obj).getIsReportEnabled()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new io.bidmachine.analytics.internal.z.b(f.g.a(), new b.C1771b((MonitorConfig) it.next(), analyticsConfig.getSessionId(), analyticsConfig.getExtras()), cVar));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(((io.bidmachine.analytics.internal.z.b) obj2).b(), obj2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Map a(C5890a c5890a, AnalyticsConfig analyticsConfig, e eVar) {
        c cVar;
        a.InterfaceC1722a bVar;
        List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig readerConfig : readerConfigList) {
            String name = readerConfig.getName();
            switch (name.hashCode()) {
                case 2986528:
                    if (name.equals("aapp")) {
                        bVar = new io.bidmachine.analytics.internal.D.b(c5890a.d().a());
                        cVar = new c(f.g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                        break;
                    }
                    cVar = null;
                    break;
                case 2990623:
                    if (name.equals("aexs")) {
                        bVar = new io.bidmachine.analytics.internal.D.a();
                        cVar = new c(f.g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                        break;
                    }
                    cVar = null;
                    break;
                case 2997059:
                    if (name.equals("alog")) {
                        bVar = new d(c5890a.d().b());
                        cVar = new c(f.g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                        break;
                    }
                    cVar = null;
                    break;
                case 3001100:
                    if (name.equals("apur")) {
                        bVar = new io.bidmachine.analytics.internal.D.e(c5890a.d().c());
                        cVar = new c(f.g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                        break;
                    }
                    cVar = null;
                    break;
                case 92819013:
                    if (name.equals("aints")) {
                        bVar = new io.bidmachine.analytics.internal.D.c(c5890a.a().getFilesDir().getParentFile());
                        cVar = new c(f.g.a(), new c.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), bVar), eVar);
                        break;
                    }
                    cVar = null;
                    break;
                default:
                    cVar = null;
                    break;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(((c) obj).a(), obj);
        }
        return linkedHashMap;
    }

    private final void a(String str) {
        List list = f;
        List list2 = CollectionsKt.toList(list);
        list.clear();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a.a(C5902d.a((C5902d) it.next(), null, null, str, 0L, null, null, 59, null));
        }
    }

    private final void a(io.bidmachine.analytics.internal.H.c cVar, String str, List list) {
        BuildersKt__Builders_commonKt.launch$default(c, b.c(), null, new C1770a(cVar, str, list, null), 2, null);
    }

    private final void a(e eVar, List list, List list2) {
        BuildersKt__Builders_commonKt.launch$default(c, b.c(), null, new b(eVar, list, list2, null), 2, null);
    }

    public final void a(C5902d c5902d) {
        if (Intrinsics.areEqual(c5902d.e(), "")) {
            f.add(c5902d);
            return;
        }
        io.bidmachine.analytics.internal.z.b bVar = (io.bidmachine.analytics.internal.z.b) d.get(c5902d.d());
        if (bVar != null) {
            bVar.b(c5902d);
        }
    }

    public final void a(C5903e c5903e) {
        a(c5903e.d(), CollectionsKt.listOf(c5903e));
    }

    public final void a(String str, List list) {
        c cVar = (c) e.get(str);
        if (cVar != null) {
            cVar.b(str, list);
        }
    }
}
