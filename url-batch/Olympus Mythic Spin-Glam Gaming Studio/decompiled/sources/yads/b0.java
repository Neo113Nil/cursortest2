package yads;

/* loaded from: classes4.dex */
public abstract class b0 implements ay1 {
    public transient p b;
    public transient a0 c;
    public transient m d;

    public abstract m a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ay1) {
            return ((i) this).a().equals(((i) ((ay1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().d.hashCode();
    }

    public final String toString() {
        return a().d.toString();
    }
}
