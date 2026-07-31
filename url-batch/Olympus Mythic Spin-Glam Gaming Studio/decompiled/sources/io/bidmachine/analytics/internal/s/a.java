package io.bidmachine.analytics.internal.s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.r.a;
import io.bidmachine.util.ReflectionUtilsKt;
import io.bidmachine.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class a extends io.bidmachine.analytics.internal.r.a {
    public static final C1757a j = new C1757a(null);
    private final C5890a g;
    private Context h;
    private final String i = "aapp";

    /* renamed from: io.bidmachine.analytics.internal.s.a$a, reason: collision with other inner class name */
    public static final class C1757a {
        public /* synthetic */ C1757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1757a() {
        }
    }

    public a(C5890a c5890a) {
        this.g = c5890a;
    }

    private final b d() {
        return this.g.d().a();
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.i;
    }

    @Override // io.bidmachine.analytics.internal.r.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    /* renamed from: a */
    public void b(a.C1756a c1756a) {
        super.b(c1756a);
        if (c1756a.c().size() != 1) {
            throw new IllegalStateException(("Reader " + a() + " should contains only one rule, received " + c1756a.c().size()).toString());
        }
        ReaderConfig.Rule rule = (ReaderConfig.Rule) CollectionsKt.first(c1756a.c());
        if (!(rule instanceof ReaderConfig.Rule.GeneralRule)) {
            throw new IllegalStateException("Check failed.");
        }
        b d = d();
        Integer intOrDefault$default = UtilsKt.toIntOrDefault$default(g.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()), null, 1, null);
        d.a(intOrDefault$default != null ? intOrDefault$default.intValue() : 0);
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
        this.h = context;
    }

    @Override // io.bidmachine.analytics.internal.r.a
    public Object a(ReaderConfig.Rule rule, Continuation continuation) {
        Context context = this.h;
        if (context != null) {
            Object findAndInvokeMethod = ReflectionUtilsKt.findAndInvokeMethod(context.getPackageManager(), g.a("cXVlcnlJbnRlbnRBY3Rpdml0aWVz"), new Class[]{Intent.class, Integer.TYPE}, new Object[]{new Intent(g.a("YW5kcm9pZC5pbnRlbnQuYWN0aW9uLk1BSU4=")), Boxing.boxInt(0)});
            Intrinsics.checkNotNull(findAndInvokeMethod, "null cannot be cast to non-null type kotlin.collections.List<android.content.pm.ResolveInfo>");
            List list = (List) findAndInvokeMethod;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.distinct(arrayList));
            d().a(arrayList2);
            return String.valueOf(arrayList2.hashCode());
        }
        throw new IllegalArgumentException("Context is null");
    }
}
