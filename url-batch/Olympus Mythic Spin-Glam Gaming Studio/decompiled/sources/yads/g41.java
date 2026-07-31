package yads;

import java.io.Serializable;

/* loaded from: classes8.dex */
public final class g41 extends z implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object b;
    public final Object c;

    public g41(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
