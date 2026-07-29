package o;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.di, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923di {
    public static final /* synthetic */ InterfaceC0937dx[] j;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final PA d;
    public final PA e;
    public final TA f;
    public final SA g;
    public final SA h;
    public final /* synthetic */ AbstractC1054fi i;

    static {
        VM vm = UM.a;
        j = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(C0923di.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), vm.g(new UJ(vm.b(C0923di.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public C0923di(AbstractC1054fi abstractC1054fi, List list, List list2, List list3) {
        AbstractC0048Bt.n(list, "functionList");
        AbstractC0048Bt.n(list2, "propertyList");
        AbstractC0048Bt.n(list3, "typeAliasList");
        this.i = abstractC1054fi;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C0827cE C = AbstractC1052fg.C(abstractC1054fi.b.b, ((C2017uK) ((E) obj)).m);
            Object obj2 = linkedHashMap.get(C);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(C, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.a = a(linkedHashMap);
        AbstractC1054fi abstractC1054fi2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list2) {
            C0827cE C2 = AbstractC1052fg.C(abstractC1054fi2.b.b, ((CK) ((E) obj3)).m);
            Object obj4 = linkedHashMap2.get(C2);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(C2, obj4);
            }
            ((List) obj4).add(obj3);
        }
        this.b = a(linkedHashMap2);
        this.i.b.a.c.getClass();
        AbstractC1054fi abstractC1054fi3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj5 : list3) {
            C0827cE C3 = AbstractC1052fg.C(abstractC1054fi3.b.b, ((OK) ((E) obj5)).l);
            Object obj6 = linkedHashMap3.get(C3);
            if (obj6 == null) {
                obj6 = new ArrayList();
                linkedHashMap3.put(C3, obj6);
            }
            ((List) obj6).add(obj5);
        }
        this.c = a(linkedHashMap3);
        this.d = this.i.b.a.a.b(new C0857ci(this, 0));
        this.e = this.i.b.a.a.b(new C0857ci(this, 1));
        this.f = this.i.b.a.a.c(new C0857ci(this, 2));
        AbstractC1054fi abstractC1054fi4 = this.i;
        VA va = abstractC1054fi4.b.a.a;
        C0792bi c0792bi = new C0792bi(this, abstractC1054fi4, 0);
        va.getClass();
        this.g = new SA(va, c0792bi);
        AbstractC1054fi abstractC1054fi5 = this.i;
        VA va2 = abstractC1054fi5.b.a.a;
        C0792bi c0792bi2 = new C0792bi(this, abstractC1054fi5, 1);
        va2.getClass();
        this.h = new SA(va2, c0792bi2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(EB.E(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<E> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
            for (E e : iterable) {
                int c = e.c();
                int g = M5.g(c) + c;
                if (g > 4096) {
                    g = 4096;
                }
                M5 o2 = M5.o(byteArrayOutputStream, g);
                o2.D(c);
                e.f(o2);
                o2.j();
                arrayList.add(C0782bY.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
