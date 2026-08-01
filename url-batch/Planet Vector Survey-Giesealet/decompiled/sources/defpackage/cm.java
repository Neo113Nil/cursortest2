package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cm extends RuntimeException {
    public final List d;

    public cm(List list) {
        this.d = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        j30 j30Var = new j30(10);
        List list = this.d;
        list.getClass();
        yk0 yk0Var = new yk0(list);
        if (yk0Var.a() > 0) {
            ((ch) yk0Var.get(0)).getClass();
            throw null;
        }
        j30 l = px0.l(j30Var);
        l.getClass();
        yk0 yk0Var2 = new yk0(l);
        int a = yk0Var2.a();
        for (int i = 0; i < a; i++) {
            sb.append("\tat " + ((String) yk0Var2.get(i)));
            sb.append('\n');
        }
        return sb.toString();
    }
}
