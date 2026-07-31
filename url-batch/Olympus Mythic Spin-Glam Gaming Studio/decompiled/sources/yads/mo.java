package yads;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public final class mo {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final Random d;

    public mo() {
        Random random = new Random();
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final ArrayList a(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a(elapsedRealtime, this.a);
        a(elapsedRealtime, this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            lo loVar = (lo) list.get(i);
            if (!this.a.containsKey(loVar.b) && !this.b.containsKey(Integer.valueOf(loVar.c))) {
                arrayList.add(loVar);
            }
        }
        return arrayList;
    }

    public final lo b(List list) {
        ArrayList a = a(list);
        if (a.size() < 2) {
            Iterator it = a.iterator();
            return (lo) (it.hasNext() ? it.next() : null);
        }
        Collections.sort(a, new Comparator() { // from class: yads.mo$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return mo.a((lo) obj, (lo) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((lo) a.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= a.size()) {
                break;
            }
            lo loVar = (lo) a.get(i3);
            if (i2 == loVar.c) {
                arrayList.add(new Pair(loVar.b, Integer.valueOf(loVar.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (lo) a.get(0);
            }
        }
        lo loVar2 = (lo) this.c.get(arrayList);
        if (loVar2 == null) {
            List subList = a.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((lo) subList.get(i5)).d;
            }
            int nextInt = this.d.nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= subList.size()) {
                    loVar2 = (lo) pc1.a(subList);
                    break;
                }
                lo loVar3 = (lo) subList.get(i);
                i6 += loVar3.d;
                if (nextInt < i6) {
                    loVar2 = loVar3;
                    break;
                }
                i++;
            }
            this.c.put(arrayList, loVar2);
        }
        return loVar2;
    }

    public static void a(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public static int a(lo loVar, lo loVar2) {
        int compare = Integer.compare(loVar.c, loVar2.c);
        return compare != 0 ? compare : loVar.b.compareTo(loVar2.b);
    }
}
