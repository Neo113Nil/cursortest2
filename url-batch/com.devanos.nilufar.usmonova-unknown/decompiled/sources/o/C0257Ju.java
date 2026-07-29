package o;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.Ju, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257Ju implements InterfaceC2249xs {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(C0257Ju.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(C0257Ju.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C0257Ju.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final OE h;

    public C0257Ju(OE oe, Throwable th) {
        this.h = oe;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c = c();
        if (c == null) {
            j.set(this, th);
            return;
        }
        if (th == c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // o.InterfaceC2249xs
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) j.get(this);
    }

    @Override // o.InterfaceC2249xs
    public final OE d() {
        return this.h;
    }

    public final boolean e() {
        return c() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, EB.l);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(i.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(k.get(this));
        sb.append(", list=");
        sb.append(this.h);
        sb.append(']');
        return sb.toString();
    }
}
