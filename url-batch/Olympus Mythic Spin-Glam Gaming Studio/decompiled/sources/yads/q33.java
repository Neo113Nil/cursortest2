package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public final class q33 implements c53 {
    public final ArrayList b;
    public final ArrayList c;

    public q33(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // yads.c53
    public final int a(long j) {
        int i;
        ArrayList arrayList = this.c;
        Long valueOf = Long.valueOf(j);
        int i2 = sb3.a;
        int binarySearch = Collections.binarySearch(arrayList, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = arrayList.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i < this.c.size()) {
            return i;
        }
        return -1;
    }

    @Override // yads.c53
    public final List b(long j) {
        int a = sb3.a(this.c, Long.valueOf(j), false);
        return a == -1 ? Collections.emptyList() : (List) this.b.get(a);
    }

    @Override // yads.c53
    public final int a() {
        return this.c.size();
    }

    @Override // yads.c53
    public final long a(int i) {
        if (i >= 0) {
            if (i < this.c.size()) {
                return ((Long) this.c.get(i)).longValue();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
