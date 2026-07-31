package io.bidmachine.internal;

import io.bidmachine.DataRestrictionsImpl;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes12.dex */
public final class x {
    public static final b c = new b(null);
    private static final List d = CollectionsKt.listOf((Object[]) new f[]{new c(), new e(), new d(), new a()});
    private volatile G a;
    private volatile A b = new A(null, null, null, null, null, null, null, null, 255, null);

    public static final class a implements f {
        @Override // io.bidmachine.internal.x.f
        public C a(A publisherPrivacySettings, C6024t platformPrivacySettings) {
            Intrinsics.checkNotNullParameter(publisherPrivacySettings, "publisherPrivacySettings");
            Intrinsics.checkNotNullParameter(platformPrivacySettings, "platformPrivacySettings");
            String a = publisherPrivacySettings.a();
            return (a == null && (a = platformPrivacySettings.a()) == null) ? C.NONE : (a.length() == 4 && CharsKt.equals(a.charAt(2), 'Y', true)) ? C.CCPA_OPT_OUT : C.NONE;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements f {
        @Override // io.bidmachine.internal.x.f
        public C a(A publisherPrivacySettings, C6024t platformPrivacySettings) {
            Intrinsics.checkNotNullParameter(publisherPrivacySettings, "publisherPrivacySettings");
            Intrinsics.checkNotNullParameter(platformPrivacySettings, "platformPrivacySettings");
            return Intrinsics.areEqual(publisherPrivacySettings.c(), Boolean.TRUE) ? C.COPPA : C.NONE;
        }
    }

    public static final class e implements f {
        @Override // io.bidmachine.internal.x.f
        public C a(A publisherPrivacySettings, C6024t platformPrivacySettings) {
            Intrinsics.checkNotNullParameter(publisherPrivacySettings, "publisherPrivacySettings");
            Intrinsics.checkNotNullParameter(platformPrivacySettings, "platformPrivacySettings");
            return Intrinsics.areEqual(publisherPrivacySettings.g(), Boolean.TRUE) ? C.NON_PERSONALIZED : C.NONE;
        }
    }

    public interface f {
        C a(A a, C6024t c6024t);
    }

    private final C6024t c() {
        G g = this.a;
        if (g != null) {
            return new C6024t(g.g(), g.e(), g.f(), g.b(), g.d(), g.a(), g.c());
        }
        Logger.w("PrivacyManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.internal.x$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String d2;
                d2 = x.d();
                return d2;
            }
        });
        return new C6024t(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d() {
        return "Access to platform data before init";
    }

    public final void a(A a2) {
        Intrinsics.checkNotNullParameter(a2, "<set-?>");
        this.b = a2;
    }

    public final A b() {
        return this.b;
    }

    public final C6024t a() {
        return c();
    }

    public final void a(G restrictionsDataSource) {
        Intrinsics.checkNotNullParameter(restrictionsDataSource, "restrictionsDataSource");
        this.a = restrictionsDataSource;
    }

    public final void a(Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a((A) action.invoke(b()));
    }

    public final C6025u a(String sessionId, y yVar) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        A a2 = this.b;
        C6024t a3 = a();
        List list = d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f) it.next()).a(a2, a3));
        }
        List distinct = CollectionsKt.distinct(arrayList);
        List minus = CollectionsKt.minus(distinct, C.NONE);
        if (minus.isEmpty()) {
            minus = null;
        }
        List list2 = minus == null ? distinct : minus;
        if (yVar == null) {
            yVar = y.STRICT;
        }
        y yVar2 = yVar;
        w a4 = z.a(yVar2, list2);
        return new C6025u(sessionId, yVar2, a2, a3, list2, a4, new DataRestrictionsImpl(a4, a2, a3), new v(sessionId));
    }

    public static final class d implements f {
        @Override // io.bidmachine.internal.x.f
        public C a(A publisherPrivacySettings, C6024t platformPrivacySettings) {
            Intrinsics.checkNotNullParameter(publisherPrivacySettings, "publisherPrivacySettings");
            Intrinsics.checkNotNullParameter(platformPrivacySettings, "platformPrivacySettings");
            Boolean h = publisherPrivacySettings.h();
            if (h == null) {
                h = platformPrivacySettings.h();
            }
            if (!Intrinsics.areEqual(h, Boolean.TRUE)) {
                return C.NONE;
            }
            if (publisherPrivacySettings.b() != null) {
                return a(publisherPrivacySettings.b().booleanValue());
            }
            O d = platformPrivacySettings.d();
            if (d == null) {
                return C.NONE;
            }
            return a(d.b() && !d.a());
        }

        private final C a(boolean z) {
            if (z) {
                return C.NONE;
            }
            return C.GDPR_NO_CONSENT;
        }
    }
}
