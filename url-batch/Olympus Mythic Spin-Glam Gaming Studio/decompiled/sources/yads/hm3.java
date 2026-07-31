package yads;

/* loaded from: classes6.dex */
public class hm3 extends Exception {
    public final u82 b;

    public hm3() {
        this.b = null;
    }

    public hm3(u82 u82Var) {
        this.b = u82Var;
    }

    public hm3(String str) {
        super(str);
        this.b = null;
    }

    public hm3(Exception exc) {
        super("Failed to parse response", exc);
        this.b = null;
    }

    public hm3(Throwable th) {
        super(th);
        this.b = null;
    }
}
