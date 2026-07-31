package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class Ad extends AbstractC5208ah {
    public final ArrayList b;

    public Ad(@NotNull C5532n5 c5532n5) {
        super(c5532n5);
        String b = c5532n5.a().b();
        b = b == null ? "empty" : b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b}, 1));
        LinkedHashMap a = Ka.k().o().a(b);
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry entry : a.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getValue(), new C5540nd(c5532n5, (String) entry.getKey())));
        }
        this.b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NotNull C5326f6 c5326f6) {
        if (!this.a.t.c()) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.component1();
            C5540nd c5540nd = (C5540nd) pair.component2();
            if (moduleServiceEventHandler.handle(new C5619qd(c5540nd.b, c5540nd.a, new C5592pd(c5540nd.e, c5540nd.d, c5540nd.c, c5326f6)), c5326f6)) {
                return true;
            }
        }
        return false;
    }
}
