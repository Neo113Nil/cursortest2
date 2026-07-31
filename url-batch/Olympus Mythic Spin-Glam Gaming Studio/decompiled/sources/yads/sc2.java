package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class sc2 {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public sc2(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
    }
}
