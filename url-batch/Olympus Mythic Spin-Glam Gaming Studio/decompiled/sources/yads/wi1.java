package yads;

import kotlin.Unit;

/* loaded from: classes9.dex */
public final class wi1 {
    public final og1 a;
    public final Object b = new Object();
    public String c;

    public wi1(og1 og1Var) {
        this.a = og1Var;
    }

    public final String a() {
        String str;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    this.c = ((qg1) this.a).c("YmadMauid");
                }
                str = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void a(String str) {
        synchronized (this.b) {
            this.c = str;
            ((qg1) this.a).a("YmadMauid", str);
            Unit unit = Unit.INSTANCE;
        }
    }
}
