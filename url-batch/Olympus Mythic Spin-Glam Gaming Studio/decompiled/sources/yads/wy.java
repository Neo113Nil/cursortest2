package yads;

/* loaded from: classes4.dex */
public abstract class wy {
    public static final Boolean a(og1 og1Var, String str) {
        qg1 qg1Var = (qg1) og1Var;
        if (!qg1Var.a(str)) {
            qg1Var = null;
        }
        if (qg1Var != null) {
            return Boolean.valueOf(qg1Var.a(str, false));
        }
        return null;
    }

    public static final Integer b(og1 og1Var, String str) {
        qg1 qg1Var = (qg1) og1Var;
        if (!qg1Var.a(str)) {
            qg1Var = null;
        }
        if (qg1Var != null) {
            return Integer.valueOf(qg1Var.a(0, str));
        }
        return null;
    }

    public static final Long c(og1 og1Var, String str) {
        qg1 qg1Var = (qg1) og1Var;
        if (!qg1Var.a(str)) {
            qg1Var = null;
        }
        if (qg1Var != null) {
            return Long.valueOf(qg1Var.b(str));
        }
        return null;
    }

    public static final void a(og1 og1Var, String str, Boolean bool) {
        if (bool == null) {
            ((qg1) og1Var).d(str);
        } else {
            ((qg1) og1Var).b(str, bool.booleanValue());
        }
    }

    public static final void a(og1 og1Var, String str, Integer num) {
        if (num != null) {
            ((qg1) og1Var).b(num.intValue(), str);
        } else {
            ((qg1) og1Var).d(str);
        }
    }
}
