package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes8.dex */
public final class j {

    @NotNull
    public static final a p = new a(null);
    public static final int q = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a a;

    @Nullable
    public List<String> b;

    @Nullable
    public final List<String> c;

    @Nullable
    public final List<String> d;

    @Nullable
    public final List<String> e;

    @Nullable
    public final List<String> f;

    @Nullable
    public final List<String> g;

    @Nullable
    public final List<String> h;

    @Nullable
    public List<String> i;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h j;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l k;

    @NotNull
    public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> l;
    public int m;

    @NotNull
    public final List<l> n;
    public int o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h linearTracking, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService) {
            Intrinsics.checkNotNullParameter(linearTracking, "linearTracking");
            Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
            return new j(customUserEventBuilderService, linearTracking.a(), linearTracking.d(), linearTracking.m(), linearTracking.e(), linearTracking.f(), linearTracking.n(), linearTracking.c(), linearTracking.g(), linearTracking.o(), linearTracking.h(), linearTracking.j(), linearTracking.k(), linearTracking.l(), linearTracking.b(), linearTracking.i(), null, null, 196608, null);
        }

        public a() {
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) t).a()), Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) t2).a()));
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((l) t).a()), Integer.valueOf(((l) t2).a()));
        }
    }

    public j(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable List<String> list5, @Nullable List<String> list6, @Nullable List<String> list7, @Nullable List<String> list8, @Nullable List<String> list9, @Nullable List<String> list10, @Nullable List<String> list11, @Nullable List<String> list12, @Nullable List<String> list13, @Nullable List<String> list14, @Nullable List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g> list15, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.a = customUserEventBuilderService;
        this.b = list;
        this.c = list8;
        this.d = list9;
        this.e = list10;
        this.f = list11;
        this.g = list12;
        this.h = list13;
        this.i = list14;
        this.j = buttonTracker;
        this.k = vastTracker;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it.next(), 0L));
            }
            arrayList.addAll(arrayList3);
        }
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it2.next(), 0L));
            }
            arrayList.addAll(arrayList4);
        }
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new l((String) it3.next(), 25));
            }
            arrayList2.addAll(arrayList5);
        }
        if (list5 != null) {
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            Iterator<T> it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new l((String) it4.next(), 50));
            }
            arrayList2.addAll(arrayList6);
        }
        if (list6 != null) {
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new l((String) it5.next(), 75));
            }
            arrayList2.addAll(arrayList7);
        }
        if (list7 != null) {
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            Iterator<T> it6 = list7.iterator();
            while (it6.hasNext()) {
                arrayList8.add(new l((String) it6.next(), 100));
            }
            arrayList2.addAll(arrayList8);
        }
        if (list15 != null) {
            for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar : list15) {
                r a2 = gVar.a();
                if (a2 instanceof r.b) {
                    arrayList.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a(gVar.b(), ((r.b) gVar.a()).b()));
                } else {
                    if (!(a2 instanceof r.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(new l(gVar.b(), ((r.a) gVar.a()).b()));
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new b());
        }
        this.l = arrayList;
        if (arrayList2.size() > 1) {
            CollectionsKt.sortWith(arrayList2, new c());
        }
        this.n = arrayList2;
    }

    public static /* synthetic */ void a(j jVar, a.AbstractC1677a.f fVar, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        jVar.a(fVar, num, str);
    }

    public static /* synthetic */ void b(j jVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.b(num, str);
    }

    public static /* synthetic */ void c(j jVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.c(num, str);
    }

    public static /* synthetic */ void d(j jVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.d(num, str);
    }

    public static /* synthetic */ void e(j jVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.e(num, str);
    }

    public static /* synthetic */ void f(j jVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.f(num, str);
    }

    public static /* synthetic */ void g(j jVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.g(num, str);
    }

    public final void a(@NotNull a.AbstractC1677a.f lastClickPosition, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        List<String> list = this.b;
        if (list != null) {
            this.k.a(list, null, num, str, this.j.p(), this.a, lastClickPosition);
            this.b = null;
        }
    }

    public final void b(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.c;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void c(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.e;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void d(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void e(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.g;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void f(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.h;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public final void g(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.d;
        if (list != null) {
            this.k.a(list, null, num, str);
        }
    }

    public static /* synthetic */ void a(j jVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        jVar.a(num, str);
    }

    public final void a(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.i;
        if (list != null) {
            this.k.a(list, null, num, str);
            this.i = null;
        }
    }

    public final void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.j.a(button);
    }

    public final void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.j.a(buttonType);
    }

    public static /* synthetic */ void a(j jVar, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = null;
        }
        jVar.a(str, i, i2);
    }

    public final void a(@Nullable String str, int i, int i2) {
        double d = (i / i2) * 100;
        List<l> list = this.n;
        List<l> subList = list.subList(this.o, list.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            if (((l) obj).a() > d) {
                break;
            } else {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar = this.k;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l) it.next()).b());
        }
        lVar.a(arrayList2, null, Integer.valueOf(i), str);
        this.o += arrayList.size();
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> list2 = this.l;
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> subList2 = list2.subList(this.m, list2.size());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : subList2) {
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).a() > i) {
                break;
            } else {
                arrayList3.add(obj2);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar2 = this.k;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) it2.next()).b());
        }
        lVar2.a(arrayList4, null, Integer.valueOf(i), str);
        this.m += arrayList3.size();
    }

    public /* synthetic */ j(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, (i & 65536) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a() : hVar, (i & 131072) != 0 ? n.b() : lVar);
    }
}
