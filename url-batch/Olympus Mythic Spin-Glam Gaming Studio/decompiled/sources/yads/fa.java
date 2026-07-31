package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class fa {
    public static List a(la0 la0Var) {
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(ia0.a);
        createListBuilder.add(new ja0("Info"));
        if (la0Var.e() == h50.c && la0Var.a() != null) {
            String c = la0Var.c();
            createListBuilder.add(new ka0((c == null || StringsKt.isBlank(c)) ? "ID" : la0Var.c(), la0Var.a()));
        }
        createListBuilder.add(new ka0("Type", la0Var.e().a()));
        List<i80> d = la0Var.d();
        if (d != null) {
            for (i80 i80Var : d) {
                createListBuilder.add(new ka0(i80Var.a(), i80Var.b()));
            }
        }
        List b = la0Var.b();
        if (b != null && !b.isEmpty()) {
            createListBuilder.add(ia0.a);
            createListBuilder.add(new ja0("CPM floors"));
            String c2 = la0Var.c();
            String str = (c2 == null || StringsKt.isBlank(c2)) ? "" : la0Var.c() + ": ";
            for (ua0 ua0Var : la0Var.b()) {
                createListBuilder.add(new ka0(str + ua0Var.b(), "cpm: " + ua0Var.a()));
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
