package io.bidmachine.analytics.internal.h;

import android.content.Context;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.Filter;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.g.AbstractC5904f;
import io.bidmachine.analytics.internal.g.C5902d;
import io.bidmachine.analytics.internal.g.C5903e;
import io.bidmachine.analytics.internal.g.EnumC5899a;
import io.bidmachine.analytics.internal.g.h;
import io.bidmachine.analytics.internal.h.InterfaceC5908c;
import io.bidmachine.analytics.internal.i.AbstractC5912a;
import io.bidmachine.analytics.internal.i.C5913b;
import io.bidmachine.analytics.internal.m.a;
import io.bidmachine.analytics.internal.r.a;
import io.bidmachine.util.conversion.StringTypeConversion;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* renamed from: io.bidmachine.analytics.internal.h.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5910e {
    public static final C5910e a = new C5910e();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final io.bidmachine.analytics.internal.a.e d = new io.bidmachine.analytics.internal.a.e();
    private static Map e = MapsKt.emptyMap();
    private static List f = new ArrayList();

    /* renamed from: io.bidmachine.analytics.internal.h.e$b */
    private static final class b implements InterfaceC5908c {
        private final C5890a a;
        private final String b;

        public b(C5890a c5890a, String str) {
            this.a = c5890a;
            this.b = str;
        }

        @Override // io.bidmachine.analytics.internal.h.InterfaceC5908c
        public void a(List list) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC5908c.a aVar = (InterfaceC5908c.a) it.next();
                String str = this.b;
                long currentTimeMillis = this.a.e().currentTimeMillis();
                String a = aVar.a();
                if (a == null) {
                    a = "";
                }
                arrayList.add(new C5903e(null, str, currentTimeMillis, a, AbstractC5904f.a(aVar.c()), aVar.b(), false, 65, null));
            }
            io.bidmachine.analytics.internal.z.a.a.a(this.b, arrayList);
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.h.e$c */
    static final class c extends Lambda implements Function0 {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File mo4828invoke() {
            return this.a.getFilesDir().getParentFile();
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.h.e$d */
    static final class d extends Lambda implements Function1 {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5906a interfaceC5906a) {
            return interfaceC5906a.a(this.a);
        }
    }

    private C5910e() {
    }

    public final void c(C5890a c5890a) {
        if (b.compareAndSet(false, true) && !io.bidmachine.analytics.internal.I.g.a(c5890a.a())) {
            e = a(c5890a);
        }
    }

    public final void d(C5890a c5890a) {
        if (c.compareAndSet(false, true) && !io.bidmachine.analytics.internal.I.g.a(c5890a.a())) {
            e = MapsKt.plus(e, b(c5890a));
            Iterator it = f.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).mo4828invoke();
            }
            f = new ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b(C5890a c5890a) {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        Object m8023constructorimpl3;
        Object m8023constructorimpl4;
        Object m8023constructorimpl5;
        Object m8023constructorimpl6;
        Object m8023constructorimpl7;
        Object m8023constructorimpl8;
        Object m8023constructorimpl9;
        Object m8023constructorimpl10;
        Context a2 = c5890a.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            io.bidmachine.analytics.internal.p.a aVar = new io.bidmachine.analytics.internal.p.a(c5890a);
            aVar.a(c5890a.a());
            linkedHashMap.put(aVar.a(), aVar);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            f.add(new C5911f(c5890a, "mimp", m8026exceptionOrNullimpl));
        }
        int i = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        try {
            io.bidmachine.analytics.internal.o.a aVar2 = new io.bidmachine.analytics.internal.o.a(c5890a, null, i, 0 == true ? 1 : 0);
            aVar2.a(c5890a.a());
            linkedHashMap.put(aVar2.a(), aVar2);
            m8023constructorimpl2 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m8026exceptionOrNullimpl2 = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
        if (m8026exceptionOrNullimpl2 != null) {
            f.add(new C5911f(c5890a, "isimp", m8026exceptionOrNullimpl2));
        }
        try {
            io.bidmachine.analytics.internal.n.a aVar3 = new io.bidmachine.analytics.internal.n.a(c5890a, null, null, 6, null);
            aVar3.a(c5890a.a());
            linkedHashMap.put(aVar3.a(), aVar3);
            m8023constructorimpl3 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            m8023constructorimpl3 = Result.m8023constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable m8026exceptionOrNullimpl3 = Result.m8026exceptionOrNullimpl(m8023constructorimpl3);
        if (m8026exceptionOrNullimpl3 != null) {
            f.add(new C5911f(c5890a, "bic", m8026exceptionOrNullimpl3));
        }
        try {
            io.bidmachine.analytics.internal.k.a aVar4 = new io.bidmachine.analytics.internal.k.a(c5890a);
            aVar4.a(c5890a.a());
            linkedHashMap.put(aVar4.a(), aVar4);
            m8023constructorimpl4 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.INSTANCE;
            m8023constructorimpl4 = Result.m8023constructorimpl(ResultKt.createFailure(th4));
        }
        Throwable m8026exceptionOrNullimpl4 = Result.m8026exceptionOrNullimpl(m8023constructorimpl4);
        if (m8026exceptionOrNullimpl4 != null) {
            f.add(new C5911f(c5890a, "mia", m8026exceptionOrNullimpl4));
        }
        try {
            io.bidmachine.analytics.internal.l.a aVar5 = new io.bidmachine.analytics.internal.l.a(c5890a);
            aVar5.a(c5890a.a());
            linkedHashMap.put(aVar5.a(), aVar5);
            m8023constructorimpl5 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.INSTANCE;
            m8023constructorimpl5 = Result.m8023constructorimpl(ResultKt.createFailure(th5));
        }
        Throwable m8026exceptionOrNullimpl5 = Result.m8026exceptionOrNullimpl(m8023constructorimpl5);
        if (m8026exceptionOrNullimpl5 != null) {
            f.add(new C5911f(c5890a, "mip", m8026exceptionOrNullimpl5));
        }
        try {
            io.bidmachine.analytics.internal.y.a aVar6 = new io.bidmachine.analytics.internal.y.a(new c(a2));
            aVar6.a(c5890a.a());
            linkedHashMap.put(aVar6.a(), aVar6);
            m8023constructorimpl6 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th6) {
            Result.Companion companion7 = Result.INSTANCE;
            m8023constructorimpl6 = Result.m8023constructorimpl(ResultKt.createFailure(th6));
        }
        Throwable m8026exceptionOrNullimpl6 = Result.m8026exceptionOrNullimpl(m8023constructorimpl6);
        if (m8026exceptionOrNullimpl6 != null) {
            f.add(new g(c5890a, "aints", m8026exceptionOrNullimpl6));
        }
        try {
            io.bidmachine.analytics.internal.x.a aVar7 = new io.bidmachine.analytics.internal.x.a();
            aVar7.a(c5890a.a());
            linkedHashMap.put(aVar7.a(), aVar7);
            m8023constructorimpl7 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th7) {
            Result.Companion companion8 = Result.INSTANCE;
            m8023constructorimpl7 = Result.m8023constructorimpl(ResultKt.createFailure(th7));
        }
        Throwable m8026exceptionOrNullimpl7 = Result.m8026exceptionOrNullimpl(m8023constructorimpl7);
        if (m8026exceptionOrNullimpl7 != null) {
            f.add(new g(c5890a, "aexs", m8026exceptionOrNullimpl7));
        }
        try {
            io.bidmachine.analytics.internal.t.c cVar = new io.bidmachine.analytics.internal.t.c(c5890a, objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
            cVar.a(c5890a.a());
            linkedHashMap.put(cVar.a(), cVar);
            m8023constructorimpl8 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th8) {
            Result.Companion companion9 = Result.INSTANCE;
            m8023constructorimpl8 = Result.m8023constructorimpl(ResultKt.createFailure(th8));
        }
        Throwable m8026exceptionOrNullimpl8 = Result.m8026exceptionOrNullimpl(m8023constructorimpl8);
        if (m8026exceptionOrNullimpl8 != null) {
            f.add(new g(c5890a, "alog", m8026exceptionOrNullimpl8));
        }
        try {
            io.bidmachine.analytics.internal.u.f fVar = new io.bidmachine.analytics.internal.u.f(c5890a, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            fVar.a(c5890a.a());
            linkedHashMap.put(fVar.a(), fVar);
            m8023constructorimpl9 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th9) {
            Result.Companion companion10 = Result.INSTANCE;
            m8023constructorimpl9 = Result.m8023constructorimpl(ResultKt.createFailure(th9));
        }
        Throwable m8026exceptionOrNullimpl9 = Result.m8026exceptionOrNullimpl(m8023constructorimpl9);
        if (m8026exceptionOrNullimpl9 != null) {
            f.add(new g(c5890a, "apur", m8026exceptionOrNullimpl9));
        }
        try {
            io.bidmachine.analytics.internal.s.a aVar8 = new io.bidmachine.analytics.internal.s.a(c5890a);
            aVar8.a(c5890a.a());
            linkedHashMap.put(aVar8.a(), aVar8);
            m8023constructorimpl10 = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th10) {
            Result.Companion companion11 = Result.INSTANCE;
            m8023constructorimpl10 = Result.m8023constructorimpl(ResultKt.createFailure(th10));
        }
        Throwable m8026exceptionOrNullimpl10 = Result.m8026exceptionOrNullimpl(m8023constructorimpl10);
        if (m8026exceptionOrNullimpl10 != null) {
            f.add(new g(c5890a, "aapp", m8026exceptionOrNullimpl10));
        }
        return linkedHashMap;
    }

    public final Map a(C5890a c5890a) {
        return MapsKt.emptyMap();
    }

    public final void a(C5890a c5890a, AnalyticsConfig analyticsConfig) {
        a(c5890a, analyticsConfig.getSessionId(), e.keySet());
        HashSet hashSet = new HashSet();
        a(c5890a, analyticsConfig.getSessionId(), analyticsConfig.getMonitorConfigList(), hashSet);
        a(c5890a, analyticsConfig.getReaderConfigList(), hashSet);
        b(c5890a, analyticsConfig.getSessionId(), hashSet);
    }

    /* renamed from: io.bidmachine.analytics.internal.h.e$a */
    private static final class a implements InterfaceC5907b {
        private final C5890a a;
        private final String b;
        private final String c;
        private final Filter d;

        public a(C5890a c5890a, String str, String str2, Filter filter) {
            this.a = c5890a;
            this.b = str;
            this.c = str2;
            this.d = filter;
        }

        @Override // io.bidmachine.analytics.internal.h.InterfaceC5907b
        public void a(Map map) {
            Filter filter = this.d;
            if (filter == null || C5910e.d.a(filter, map)) {
                io.bidmachine.analytics.internal.z.a.a.a(new C5902d(null, this.b, this.c, this.a.e().currentTimeMillis(), map, null, 33, null));
            }
        }

        @Override // io.bidmachine.analytics.internal.h.InterfaceC5907b
        public void a(h hVar) {
            io.bidmachine.analytics.internal.z.a.a.a(new C5902d(null, this.b, this.c, this.a.e().currentTimeMillis(), null, hVar, 17, null));
        }
    }

    public final Map a(EnumC5899a enumC5899a) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : e.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC5909d abstractC5909d = (AbstractC5909d) entry.getValue();
            if (abstractC5909d instanceof io.bidmachine.analytics.internal.m.a) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                io.bidmachine.analytics.internal.m.a aVar = (io.bidmachine.analytics.internal.m.a) abstractC5909d;
                a.b b2 = aVar.b();
                if (b2 != null) {
                    linkedHashMap2.put("imd", Integer.valueOf(b2.b()));
                    Float c2 = b2.c();
                    if (c2 != null) {
                        linkedHashMap2.put("wp", Float.valueOf(c2.floatValue()));
                    }
                    String e2 = b2.e();
                    if (e2 != null) {
                        if (!StringsKt.isBlank(e2)) {
                            linkedHashMap2.put("agency", e2);
                        }
                        List emptyList = CollectionsKt.emptyList();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : emptyList) {
                            if (obj instanceof StringTypeConversion) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    String a2 = b2.a();
                    if (a2 != null) {
                        if (!StringsKt.isBlank(a2)) {
                            linkedHashMap2.put("imcurl", a2);
                            if (b2.i()) {
                                linkedHashMap2.put("clcurl", a2);
                            }
                        }
                        List emptyList2 = CollectionsKt.emptyList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : emptyList2) {
                            if (obj2 instanceof StringTypeConversion) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                }
                a.b a3 = aVar.a(enumC5899a);
                if (a3 != null) {
                    linkedHashMap2.put("imimd", Integer.valueOf(a3.b()));
                    Float c3 = a3.c();
                    if (c3 != null) {
                        linkedHashMap2.put("imwp", Float.valueOf(c3.floatValue()));
                    }
                    String e3 = a3.e();
                    if (e3 != null) {
                        if (!StringsKt.isBlank(e3)) {
                            linkedHashMap2.put("imagency", e3);
                        }
                        List emptyList3 = CollectionsKt.emptyList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : emptyList3) {
                            if (obj3 instanceof StringTypeConversion) {
                                arrayList3.add(obj3);
                            }
                        }
                    }
                }
                linkedHashMap.put(str, linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    public final Object a(String str) {
        return SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.filterIsInstance(CollectionsKt.asSequence(e.values()), InterfaceC5906a.class), new d(str)));
    }

    private final void a(C5890a c5890a, String str, List list, Set set) {
        Object m8023constructorimpl;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MonitorConfig monitorConfig = (MonitorConfig) it.next();
            String name = monitorConfig.getName();
            try {
                Result.Companion companion = Result.INSTANCE;
                AbstractC5909d abstractC5909d = (AbstractC5909d) e.get(name);
                Unit unit = null;
                r3 = null;
                Filter filter = null;
                if (abstractC5909d != null) {
                    if (abstractC5909d instanceof AbstractC5912a) {
                        Filter filter2 = monitorConfig.getFilter();
                        if (filter2 != null && d.a(filter2)) {
                            filter = filter2;
                        }
                        if (filter == null) {
                            monitorConfig.getFilter();
                        }
                        ((AbstractC5912a) abstractC5909d).a(new AbstractC5912a.b(str, new a(c5890a, name, str, filter), a(monitorConfig.getConfigExtension())));
                    }
                    unit = Unit.INSTANCE;
                }
                m8023constructorimpl = Result.m8023constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                set.add(name);
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                a.a(c5890a, name, str, m8026exceptionOrNullimpl);
            }
        }
    }

    private final AbstractC5912a.InterfaceC1735a a(MonitorConfig.ConfigExtension configExtension) {
        String config;
        if (configExtension == null) {
            return null;
        }
        if (configExtension instanceof MonitorConfig.ImpConfigExtension) {
            MonitorConfig.ImpConfigExtension impConfigExtension = (MonitorConfig.ImpConfigExtension) configExtension;
            return new a.C1739a(impConfigExtension.getIaaQuery(), impConfigExtension.getRecordsTtl(), null);
        }
        if (!(configExtension instanceof MonitorConfig.GenericConfigExtension) || (config = ((MonitorConfig.GenericConfigExtension) configExtension).getConfig()) == null) {
            return null;
        }
        return C5913b.f.a(io.bidmachine.analytics.internal.I.g.b(config));
    }

    private final void a(C5890a c5890a, List list, Set set) {
        Object m8023constructorimpl;
        Unit unit;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReaderConfig readerConfig = (ReaderConfig) it.next();
            String name = readerConfig.getName();
            try {
                Result.Companion companion = Result.INSTANCE;
                AbstractC5909d abstractC5909d = (AbstractC5909d) e.get(name);
                if (abstractC5909d != null) {
                    if (abstractC5909d instanceof io.bidmachine.analytics.internal.r.a) {
                        ((io.bidmachine.analytics.internal.r.a) abstractC5909d).a((Object) new a.C1756a(readerConfig.getInterval(), readerConfig.getRules(), new b(c5890a, name)));
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                m8023constructorimpl = Result.m8023constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                set.add(name);
            }
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null) {
                a.a(c5890a, name, m8026exceptionOrNullimpl);
            }
        }
    }

    private final void a(C5890a c5890a, AbstractC5909d abstractC5909d, String str, Throwable th) {
        if (abstractC5909d instanceof AbstractC5912a) {
            a(c5890a, abstractC5909d.a(), str, th);
        } else if (abstractC5909d instanceof io.bidmachine.analytics.internal.r.a) {
            a(c5890a, abstractC5909d.a(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C5890a c5890a, String str, String str2, Throwable th) {
        io.bidmachine.analytics.internal.z.a.a.a(new C5902d(null, str, str2, c5890a.e().currentTimeMillis(), null, new h(str, h.a.MONITOR_INVALID, io.bidmachine.analytics.internal.I.g.a(th)), 17, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C5890a c5890a, String str, Throwable th) {
        io.bidmachine.analytics.internal.z.a.a.a(new C5903e(null, str, c5890a.e().currentTimeMillis(), "", new C5903e.a.C1734a("", ""), new h(str, h.a.READER_INVALID, io.bidmachine.analytics.internal.I.g.a(th)), false, 65, null));
    }

    private final void a(C5890a c5890a, String str, Set set) {
        Object m8023constructorimpl;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC5909d abstractC5909d = (AbstractC5909d) e.get((String) it.next());
            if (abstractC5909d != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    abstractC5909d.b(c5890a.a());
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    a.a(c5890a, abstractC5909d, str, m8026exceptionOrNullimpl);
                }
            }
        }
    }

    private final void b(C5890a c5890a, String str, Set set) {
        Object m8023constructorimpl;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC5909d abstractC5909d = (AbstractC5909d) e.get((String) it.next());
            if (abstractC5909d != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    abstractC5909d.c(c5890a.a());
                    m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                if (m8026exceptionOrNullimpl != null) {
                    a.a(c5890a, abstractC5909d, str, m8026exceptionOrNullimpl);
                }
            }
        }
    }
}
