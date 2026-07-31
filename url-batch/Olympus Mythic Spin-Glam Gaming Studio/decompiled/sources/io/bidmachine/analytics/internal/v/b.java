package io.bidmachine.analytics.internal.v;

import io.bidmachine.analytics.internal.u.a;
import io.bidmachine.analytics.internal.v.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class b {
    public static final b a = new b();
    private static final Lazy b = LazyKt.lazy(C1767b.a);
    private static final Lazy c = LazyKt.lazy(c.a);
    private static final Lazy d = LazyKt.lazy(d.a);
    private static final Lazy e = LazyKt.lazy(a.a);

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("YXV0b1JlbmV3aW5n");
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.v.b$b, reason: collision with other inner class name */
    static final class C1767b extends Lambda implements Function0 {
        public static final C1767b a = new C1767b();

        C1767b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("cHJvZHVjdElk");
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("cHVyY2hhc2VUaW1l");
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return io.bidmachine.analytics.internal.I.g.a("cXVhbnRpdHk=");
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((io.bidmachine.analytics.internal.v.a) obj2).a(), ((io.bidmachine.analytics.internal.v.a) obj).a());
        }
    }

    static final class f extends Lambda implements Function2 {
        public static final f a = new f();

        f() {
            super(2);
        }

        public final List a(JSONObject jSONObject, boolean z) {
            return b.a.a(jSONObject, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((JSONObject) obj, ((Boolean) obj2).booleanValue());
        }
    }

    static final class g extends Lambda implements Function2 {
        public static final g a = new g();

        g() {
            super(2);
        }

        public final List a(JSONObject jSONObject, boolean z) {
            return b.a.b(jSONObject, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((JSONObject) obj, ((Boolean) obj2).booleanValue());
        }
    }

    private b() {
    }

    public final String c() {
        return (String) c.getValue();
    }

    public final String d() {
        return (String) d.getValue();
    }

    public final String a() {
        return (String) e.getValue();
    }

    public final String b() {
        return (String) b.getValue();
    }

    private final List b(a.C1761a c1761a) {
        return a(c1761a, g.a);
    }

    public final List a(io.bidmachine.analytics.internal.u.a aVar) {
        return CollectionsKt.sortedWith(CollectionsKt.plus((Collection) b(aVar.e()), (Iterable) a(aVar.c())), new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List b(JSONObject jSONObject, boolean z) {
        a.EnumC1766a enumC1766a;
        String string = jSONObject.getString(b());
        Date date = new Date(jSONObject.getLong(c()));
        int optInt = jSONObject.optInt(d(), 1);
        if (jSONObject.optBoolean(a(), false)) {
            enumC1766a = a.EnumC1766a.SUBS_AUTO_RENEWABLE;
        } else {
            enumC1766a = a.EnumC1766a.SUBS_NON_AUTO_RENEWABLE;
        }
        io.bidmachine.analytics.internal.v.a aVar = new io.bidmachine.analytics.internal.v.a(string, enumC1766a, date, z);
        IntRange until = RangesKt.until(0, optInt);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(io.bidmachine.analytics.internal.v.a.a(aVar, null, null, null, false, 15, null));
        }
        return arrayList;
    }

    private final List a(a.C1761a c1761a) {
        return a(c1761a, f.a);
    }

    private final List a(a.C1761a c1761a, Function2 function2) {
        List list;
        JSONObject jSONObject;
        List list2;
        List a2 = c1761a.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a2.iterator();
        while (true) {
            JSONObject jSONObject2 = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                jSONObject2 = new JSONObject((String) it.next());
            } catch (Throwable unused) {
            }
            if (jSONObject2 != null) {
                arrayList.add(jSONObject2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                list2 = (List) function2.invoke((JSONObject) it2.next(), Boolean.TRUE);
            } catch (Throwable unused2) {
                list2 = null;
            }
            if (list2 != null) {
                arrayList2.add(list2);
            }
        }
        List c2 = c1761a.c();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = c2.iterator();
        while (it3.hasNext()) {
            try {
                jSONObject = new JSONObject((String) it3.next());
            } catch (Throwable unused3) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                arrayList3.add(jSONObject);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            try {
                list = (List) function2.invoke((JSONObject) it4.next(), Boolean.FALSE);
            } catch (Throwable unused4) {
                list = null;
            }
            if (list != null) {
                arrayList4.add(list);
            }
        }
        return CollectionsKt.plus((Collection) CollectionsKt.flatten(arrayList2), (Iterable) CollectionsKt.flatten(arrayList4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List a(JSONObject jSONObject, boolean z) {
        String string = jSONObject.getString(b());
        Date date = new Date(jSONObject.getLong(c()));
        int optInt = jSONObject.optInt(d(), 1);
        io.bidmachine.analytics.internal.v.a aVar = new io.bidmachine.analytics.internal.v.a(string, a.EnumC1766a.INAPP_CONSUMABLE, date, z);
        IntRange until = RangesKt.until(0, optInt);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(io.bidmachine.analytics.internal.v.a.a(aVar, null, null, null, false, 15, null));
        }
        return arrayList;
    }
}
