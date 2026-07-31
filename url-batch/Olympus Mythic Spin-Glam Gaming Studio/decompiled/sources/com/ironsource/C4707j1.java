package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4707j1 implements InterfaceC4864rf<JSONArray> {

    @NotNull
    private final List<C4690i1> a = new ArrayList();

    /* renamed from: com.ironsource.j1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4847qf.values().length];
            try {
                iArr[EnumC4847qf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4847qf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4624e7
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(@NotNull EnumC4847qf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = a.a[mode.ordinal()];
        if (i == 1) {
            List<C4690i1> b = b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4690i1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C4690i1> a2 = a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it2 = a2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C4690i1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(@NotNull C4690i1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.add(event);
    }

    private final List<C4690i1> a() {
        List<C4690i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4690i1 c4690i1 = (C4690i1) obj;
            if (c4690i1.e() != EnumC4811of.LoadSuccess && c4690i1.e() != EnumC4811of.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4690i1) it.next()).a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<C4690i1> list2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C4690i1 c4690i12 = (C4690i1) obj2;
            if (c4690i12.e() == EnumC4811of.LoadSuccess && !set.contains(c4690i12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C4690i1> b() {
        List<C4690i1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4690i1) obj).e() != EnumC4811of.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
