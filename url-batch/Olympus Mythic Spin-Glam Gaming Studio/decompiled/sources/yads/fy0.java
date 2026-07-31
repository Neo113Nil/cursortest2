package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes14.dex */
public final class fy0 {
    public final c90 a;

    public fy0(c90 c90Var) {
        this.a = c90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ey0 ey0Var;
        int i;
        String str2;
        Iterator it;
        Object obj;
        e40 e40Var;
        u40 u40Var;
        Object obj2;
        Object obj3;
        String str3;
        if (continuationImpl instanceof ey0) {
            ey0Var = (ey0) continuationImpl;
            int i2 = ey0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ey0Var.e = i2 - Integer.MIN_VALUE;
                Object obj4 = ey0Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ey0Var.e;
                String str4 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj4);
                    c90 c90Var = this.a;
                    ey0Var.b = str;
                    ey0Var.e = 1;
                    obj4 = BuildersKt.withContext(c90Var.d, new b90(c90Var, null), ey0Var);
                    if (obj4 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = ey0Var.b;
                    ResultKt.throwOnFailure(obj4);
                }
                z50 z50Var = (z50) obj4;
                it = z50Var.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((e40) obj).c, str2)) {
                        break;
                    }
                }
                e40Var = (e40) obj;
                if (e40Var != null) {
                    return null;
                }
                ArrayList arrayList = z50Var.d.a;
                p40 p40Var = e40Var.d;
                if (p40Var == null) {
                    u40Var = new u40(CollectionsKt.emptyList());
                } else {
                    List<i40> list = p40Var.b;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (i40 i40Var : list) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            if (Intrinsics.areEqual(((g50) obj3).a, i40Var.b)) {
                                break;
                            }
                        }
                        g50 g50Var = (g50) obj3;
                        String str5 = (g50Var == null || (str3 = g50Var.b) == null) ? "" : str3;
                        List<u50> list2 = i40Var.c;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (u50 u50Var : list2) {
                            arrayList3.add(new i80(u50Var.a, u50Var.b));
                        }
                        arrayList2.add(new t40(str5, i40Var.b, arrayList3, i40Var.d, i40Var.e, q40.a));
                    }
                    List<z40> list3 = p40Var.a;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (z40 z40Var : list3) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = str4;
                                break;
                            }
                            obj2 = it3.next();
                            if (Intrinsics.areEqual(((g50) obj2).a, z40Var.b)) {
                                break;
                            }
                        }
                        g50 g50Var2 = (g50) obj2;
                        String str6 = g50Var2 != null ? g50Var2.b : str4;
                        String str7 = str6 == null ? "" : str6;
                        List<ab0> list4 = z40Var.c;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                        for (ab0 ab0Var : list4) {
                            arrayList5.add(new i80(ab0Var.a, ab0Var.b));
                        }
                        arrayList4.add(new t40(str7, z40Var.b, arrayList5, null, z40Var.d, new r40(z40Var.e, z40Var.f)));
                        str4 = null;
                    }
                    u40Var = new u40(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
                }
                return new k40(e40Var.a, e40Var.b, str2, u40Var);
            }
        }
        ey0Var = new ey0(this, continuationImpl);
        Object obj42 = ey0Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ey0Var.e;
        String str42 = null;
        if (i != 0) {
        }
        z50 z50Var2 = (z50) obj42;
        it = z50Var2.g.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        e40Var = (e40) obj;
        if (e40Var != null) {
        }
    }
}
