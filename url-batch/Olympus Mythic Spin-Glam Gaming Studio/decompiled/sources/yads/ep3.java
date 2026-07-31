package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ep3 implements vo2 {
    public final hp3 a;
    public final fp3 b;

    public ep3(Context context, fe3 fe3Var, hp3 hp3Var) {
        fp3 fp3Var = new fp3(context, fe3Var);
        this.a = hp3Var;
        this.b = fp3Var;
    }

    @Override // yads.vo2
    public final void a(le3 le3Var) {
        this.a.a(le3Var);
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        List list = ((nc3) obj).a.b;
        fp3 fp3Var = this.b;
        jp3 jp3Var = fp3Var.a.a.m;
        if (jp3Var != null) {
            if (!jp3Var.b) {
                fp3Var.b.getClass();
                list = ah3.a(list).a;
            }
            if (!jp3Var.a) {
                list = CollectionsKt.take(list, 1);
            }
            ap3 ap3Var = fp3Var.c;
            ap3Var.getClass();
            int i = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fe3 fe3Var = (fe3) it.next();
                ArrayList arrayList2 = ap3Var.b.a.b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList3, ((d20) it2.next()).d);
                }
                ArrayList arrayList4 = fe3Var.b;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, i));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    d20 d20Var = (d20) it3.next();
                    ArrayList arrayList6 = d20Var.c;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, i));
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(((o11) it4.next()).a);
                    }
                    Set mutableSet = CollectionsKt.toMutableSet(arrayList7);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        CollectionsKt.addAll(arrayList8, ((d20) it5.next()).c);
                    }
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        if (mutableSet.add(((o11) next).a)) {
                            arrayList9.add(next);
                        }
                    }
                    List list2 = d20Var.d;
                    List plus = CollectionsKt.plus((Collection) d20Var.a, (Iterable) d20Var.b);
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it7 = it;
                    String str = d20Var.h;
                    if (plus == null) {
                        plus = CollectionsKt.emptyList();
                    }
                    arrayList10.addAll(plus);
                    List list3 = d20Var.c;
                    if (list3 == null) {
                        list3 = CollectionsKt.emptyList();
                    }
                    arrayList11.addAll(list3);
                    arrayList12.addAll(arrayList3);
                    String str2 = d20Var.f;
                    ArrayList arrayList13 = arrayList2;
                    w03 w03Var = d20Var.g;
                    ArrayList arrayList14 = arrayList3;
                    int i2 = d20Var.i;
                    arrayList11.addAll(arrayList9);
                    if (list2 == null) {
                        list2 = CollectionsKt.emptyList();
                    }
                    arrayList12.addAll(list2);
                    String str3 = d20Var.j;
                    ArrayList arrayList15 = new ArrayList();
                    Iterator it8 = arrayList10.iterator();
                    while (it8.hasNext()) {
                        Iterator it9 = it3;
                        Object next2 = it8.next();
                        Iterator it10 = it8;
                        if (next2 instanceof gl1) {
                            arrayList15.add(next2);
                        }
                        it8 = it10;
                        it3 = it9;
                    }
                    Iterator it11 = it3;
                    ArrayList arrayList16 = new ArrayList();
                    Iterator it12 = arrayList10.iterator();
                    while (it12.hasNext()) {
                        Object next3 = it12.next();
                        Iterator it13 = it12;
                        if (next3 instanceof fb1) {
                            arrayList16.add(next3);
                        }
                        it12 = it13;
                    }
                    arrayList5.add(new d20(arrayList15, arrayList16, arrayList11, arrayList12, null, str2, w03Var, str, i2, str3));
                    it = it7;
                    arrayList2 = arrayList13;
                    arrayList3 = arrayList14;
                    it3 = it11;
                    i = 10;
                }
                Iterator it14 = it;
                zo3 zo3Var = ap3Var.c;
                fe3 fe3Var2 = ap3Var.a;
                zo3Var.getClass();
                ne3 ne3Var = fe3Var.d;
                ne3 ne3Var2 = fe3Var2.d;
                ne3 ne3Var3 = new ne3(CollectionsKt.plus((Collection) ne3Var.a, (Iterable) ne3Var2.a), CollectionsKt.plus((Collection) ne3Var.b, (Iterable) ne3Var2.b));
                bp3 bp3Var = ap3Var.d;
                fe3 fe3Var3 = ap3Var.a;
                bp3Var.getClass();
                List listOf = CollectionsKt.listOf((Object[]) new fe3[]{fe3Var, fe3Var3});
                ArrayList arrayList17 = new ArrayList();
                Iterator it15 = listOf.iterator();
                while (it15.hasNext()) {
                    ll3 ll3Var = ((fe3) it15.next()).j;
                    List list4 = ll3Var != null ? ll3Var.a : null;
                    if (list4 == null) {
                        list4 = CollectionsKt.emptyList();
                    }
                    CollectionsKt.addAll(arrayList17, list4);
                }
                ll3 ll3Var2 = new ll3(arrayList17);
                LinkedHashMap linkedHashMap = fe3Var.c;
                fe3 fe3Var4 = ap3Var.a;
                LinkedHashMap linkedHashMap2 = fe3Var4.c;
                List plus2 = CollectionsKt.plus((Collection) fe3Var.n, (Iterable) fe3Var4.n);
                ee3 ee3Var = new ee3(ap3Var.e, fe3Var.a);
                ee3Var.k = fe3Var.l;
                ee3Var.l.addAll(arrayList5);
                ee3 a = ee3Var.a(linkedHashMap);
                a.d = fe3Var.e;
                a.e = fe3Var.f;
                a.f = fe3Var.g;
                a.g = fe3Var.h;
                a.h = fe3Var.i;
                a.o = ne3Var3;
                a.i = ll3Var2;
                a.c = fe3Var.m;
                ee3 a2 = a.a(linkedHashMap2);
                ArrayList arrayList18 = a2.m;
                if (plus2 == null) {
                    plus2 = CollectionsKt.emptyList();
                }
                arrayList18.addAll(plus2);
                arrayList.add(a2.a());
                it = it14;
                i = 10;
            }
            list = arrayList;
        }
        this.a.onSuccess(list);
    }
}
