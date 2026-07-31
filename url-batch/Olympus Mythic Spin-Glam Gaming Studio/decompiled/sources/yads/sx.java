package yads;

import java.util.Map;

/* loaded from: classes4.dex */
public final class sx extends z {
    public final Object b;
    public int c;
    public final /* synthetic */ ux d;

    public sx(ux uxVar, int i) {
        this.d = uxVar;
        this.b = uxVar.a(i);
        this.c = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map a = this.d.a();
        if (a != null) {
            return a.get(this.b);
        }
        int i = this.c;
        if (i == -1 || i >= this.d.size() || !x92.a(this.b, this.d.a(this.c))) {
            this.c = this.d.a(this.b);
        }
        int i2 = this.c;
        if (i2 == -1) {
            return null;
        }
        return this.d.b(i2);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map a = this.d.a();
        if (a != null) {
            return a.put(this.b, obj);
        }
        int i = this.c;
        if (i == -1 || i >= this.d.size() || !x92.a(this.b, this.d.a(this.c))) {
            this.c = this.d.a(this.b);
        }
        int i2 = this.c;
        if (i2 == -1) {
            this.d.put(this.b, obj);
            return null;
        }
        Object b = this.d.b(i2);
        this.d.a(this.c, obj);
        return b;
    }
}
