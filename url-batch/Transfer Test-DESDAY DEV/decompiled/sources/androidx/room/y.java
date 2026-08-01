package androidx.room;

import androidx.lifecycle.K;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class y {
    private final t database;
    private final AtomicBoolean lock;
    private final U0.b stmt$delegate;

    public y(t tVar) {
        g1.f.e(tVar, "database");
        this.database = tVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = new U0.g(new K(1, this));
    }

    public j0.e acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (j0.e) ((U0.g) this.stmt$delegate).a();
        }
        return this.database.compileStatement(createQuery());
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(j0.e eVar) {
        g1.f.e(eVar, "statement");
        if (eVar == ((j0.e) ((U0.g) this.stmt$delegate).a())) {
            this.lock.set(false);
        }
    }
}
