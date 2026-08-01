package androidx.room;

import androidx.lifecycle.K;
import j0.InterfaceC0182e;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class y {
    private final t database;
    private final AtomicBoolean lock;
    private final V0.b stmt$delegate;

    public y(t tVar) {
        i1.f.e(tVar, "database");
        this.database = tVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = new V0.g(new K(1, this));
    }

    public InterfaceC0182e acquire() {
        assertNotMainThread();
        if (this.lock.compareAndSet(false, true)) {
            return (InterfaceC0182e) ((V0.g) this.stmt$delegate).a();
        }
        return this.database.compileStatement(createQuery());
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public abstract String createQuery();

    public void release(InterfaceC0182e interfaceC0182e) {
        i1.f.e(interfaceC0182e, "statement");
        if (interfaceC0182e == ((InterfaceC0182e) ((V0.g) this.stmt$delegate).a())) {
            this.lock.set(false);
        }
    }
}
