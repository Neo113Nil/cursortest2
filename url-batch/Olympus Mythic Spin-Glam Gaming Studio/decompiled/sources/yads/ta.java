package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ta {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public ta(int i, int i2, ArrayList arrayList, List list, List list2, List list3) {
        this.a = i;
        this.b = i2;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
