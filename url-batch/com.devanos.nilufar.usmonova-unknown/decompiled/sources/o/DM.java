package o;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final class DM extends FM {
    public final Field a;

    public DM(Field field) {
        AbstractC0048Bt.n(field, "member");
        this.a = field;
    }

    @Override // o.FM
    public final Member b() {
        return this.a;
    }
}
