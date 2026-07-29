package o;

import java.lang.reflect.Field;

/* renamed from: o.rv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1856rv extends AbstractC0868ct {
    public final Field s;

    public C1856rv(Field field) {
        AbstractC0048Bt.n(field, "field");
        this.s = field;
    }

    @Override // o.AbstractC0868ct
    public final String g() {
        StringBuilder sb = new StringBuilder();
        Field field = this.s;
        String name = field.getName();
        AbstractC0048Bt.m(name, "field.name");
        sb.append(AbstractC0412Pu.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        AbstractC0048Bt.m(type, "field.type");
        sb.append(AbstractC1492mM.b(type));
        return sb.toString();
    }
}
