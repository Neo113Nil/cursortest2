package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class v40 implements Map.Entry, j00 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;

    public /* synthetic */ v40(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && nz.l(entry.getKey(), this.e) && nz.l(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.d) {
        }
        return this.e;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.d) {
        }
        return this.f;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.d) {
            case 0:
                Object obj = this.e;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.e);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
