package io.bidmachine.analytics.internal.t;

import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.r.a;
import io.bidmachine.analytics.internal.t.b;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes6.dex */
public final class d {
    private final e a;
    private final b.a b;
    private Map c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements b.a {
        private final e a;

        public a(e eVar) {
            this.a = eVar;
        }

        @Override // io.bidmachine.analytics.internal.t.b.a
        public b a() {
            return new b(this.a, new f(), CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor())));
        }
    }

    public d(e eVar, b.a aVar) {
        this.a = eVar;
        this.b = aVar;
    }

    public final void a(a.C1756a c1756a) {
        List<ReaderConfig.Rule> c = c1756a.c();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig.Rule rule : c) {
            ReaderConfig.Rule.GeneralRule generalRule = rule instanceof ReaderConfig.Rule.GeneralRule ? (ReaderConfig.Rule.GeneralRule) rule : null;
            if (generalRule != null) {
                arrayList.add(generalRule);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ReaderConfig.Rule.GeneralRule) it.next()).getPath());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(obj, this.b.a());
        }
        this.c = MapsKt.toMutableMap(linkedHashMap);
    }

    public final void b() {
        Map map = this.c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ((b) entry.getValue()).a((String) entry.getKey());
            }
        }
    }

    public /* synthetic */ d(e eVar, b.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i & 2) != 0 ? new a(eVar) : aVar);
    }

    public final void a() {
        Map map = this.c;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((b) ((Map.Entry) it.next()).getValue()).a();
            }
        }
    }

    public final String a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            String b = this.a.b(((ReaderConfig.Rule.GeneralRule) rule).getPath());
            if (b != null) {
                return b;
            }
            throw new FileNotFoundException();
        }
        throw new IllegalStateException("Check failed.");
    }
}
