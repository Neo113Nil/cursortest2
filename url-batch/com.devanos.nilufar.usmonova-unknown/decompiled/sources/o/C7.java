package o;

/* loaded from: classes.dex */
public final class C7 {
    public final Integer a;

    public C7(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7)) {
            return false;
        }
        C7 c7 = (C7) obj;
        Integer num = this.a;
        return num == null ? c7.a == null : num.equals(c7.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
