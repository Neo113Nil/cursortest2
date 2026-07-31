package yads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class rd0 {
    public final qd0 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public rd0(qd0 qd0Var) {
        this.a = qd0Var;
    }

    public final tp0 a(Object... objArr) {
        Constructor a;
        synchronized (this.b) {
            if (!this.b.get()) {
                try {
                    a = this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (tp0) a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
