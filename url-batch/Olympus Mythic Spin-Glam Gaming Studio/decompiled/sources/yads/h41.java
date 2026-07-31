package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class h41 extends d41 {
    /* JADX WARN: Multi-variable type inference failed */
    public final h41 a(List list) {
        if (list instanceof Collection) {
            a(list.size() + this.b);
            if (list instanceof f41) {
                this.b = ((f41) list).a(this.b, this.a);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final um2 a() {
        this.c = true;
        return l41.b(this.b, this.a);
    }

    public final h41 a(Object obj) {
        obj.getClass();
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }
}
