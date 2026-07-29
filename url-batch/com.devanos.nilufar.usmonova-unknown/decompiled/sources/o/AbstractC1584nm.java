package o;

/* renamed from: o.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1584nm {
    public final int a;
    public final int b;

    public AbstractC1584nm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static C1452lm a(AbstractC1584nm abstractC1584nm) {
        return new C1452lm(abstractC1584nm.a + abstractC1584nm.b, 1);
    }

    public static C1452lm b() {
        return new C1452lm(0, 1);
    }
}
