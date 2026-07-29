package o;

/* renamed from: o.z00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2325z00 {
    public final String a;
    public final boolean b;

    public AbstractC2325z00(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public Integer a(AbstractC2325z00 abstractC2325z00) {
        AbstractC0048Bt.n(abstractC2325z00, "visibility");
        C2140wB c2140wB = AbstractC2259y00.a;
        if (this == abstractC2325z00) {
            return 0;
        }
        C2140wB c2140wB2 = AbstractC2259y00.a;
        Integer num = (Integer) c2140wB2.get(this);
        Integer num2 = (Integer) c2140wB2.get(abstractC2325z00);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.a;
    }

    public final String toString() {
        return b();
    }

    public AbstractC2325z00 c() {
        return this;
    }
}
