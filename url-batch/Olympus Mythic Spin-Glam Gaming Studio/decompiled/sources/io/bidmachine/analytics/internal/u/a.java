package io.bidmachine.analytics.internal.u;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class a {
    private final String a;
    private final C1761a b;
    private final C1761a c;
    private final Lazy d = LazyKt.lazy(new c());
    private final Lazy e = LazyKt.lazy(new b());

    /* renamed from: io.bidmachine.analytics.internal.u.a$a, reason: collision with other inner class name */
    public static final class C1761a {
        private final List a;
        private final List b;
        private final List c;

        public C1761a(List list, List list2, List list3) {
            this.a = list;
            this.b = list2;
            this.c = list3;
        }

        public final C1761a a(List list, List list2, List list3) {
            return new C1761a(list, list2, list3);
        }

        public final List b() {
            return this.c;
        }

        public final List c() {
            return this.b;
        }

        public final boolean d() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1761a)) {
                return false;
            }
            C1761a c1761a = (C1761a) obj;
            return Intrinsics.areEqual(this.a, c1761a.a) && Intrinsics.areEqual(this.b, c1761a.b) && Intrinsics.areEqual(this.c, c1761a.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ C1761a a(C1761a c1761a, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = c1761a.a;
            }
            if ((i & 2) != 0) {
                list2 = c1761a.b;
            }
            if ((i & 4) != 0) {
                list3 = c1761a.c;
            }
            return c1761a.a(list, list2, list3);
        }

        public final List a() {
            return this.a;
        }

        public /* synthetic */ C1761a(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3);
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return a.this.d().hashCode() + '_' + CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(a.this.c().a().size()), Integer.valueOf(a.this.c().c().size()), Integer.valueOf(a.this.c().b().size()), Integer.valueOf(a.this.e().a().size()), Integer.valueOf(a.this.e().c().size()), Integer.valueOf(a.this.e().b().size())}), "_", null, null, 0, null, null, 62, null);
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            JSONObject jSONObject = new JSONObject();
            a aVar = a.this;
            jSONObject.put("ver", aVar.a());
            jSONObject.put("iaa", new JSONArray((Collection) aVar.c().a()));
            jSONObject.put("iah", new JSONArray((Collection) aVar.c().c()));
            jSONObject.put("iad", new JSONArray((Collection) aVar.c().b()));
            jSONObject.put("sua", new JSONArray((Collection) aVar.e().a()));
            jSONObject.put("suh", new JSONArray((Collection) aVar.e().c()));
            jSONObject.put("sud", new JSONArray((Collection) aVar.e().b()));
            return jSONObject.toString();
        }
    }

    public a(String str, C1761a c1761a, C1761a c1761a2) {
        this.a = str;
        this.b = c1761a;
        this.c = c1761a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return (String) this.d.getValue();
    }

    public final String b() {
        return (String) this.e.getValue();
    }

    public final C1761a c() {
        return this.b;
    }

    public final C1761a e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
    }

    public final boolean f() {
        return this.b.d() && this.c.d();
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return d();
    }

    public final String a() {
        return this.a;
    }
}
