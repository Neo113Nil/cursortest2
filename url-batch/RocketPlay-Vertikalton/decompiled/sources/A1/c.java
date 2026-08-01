package A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f31a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f34e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35f;

    public c(f fVar, String str) {
        i1.f.e(fVar, "taskRunner");
        i1.f.e(str, "name");
        this.f31a = fVar;
        this.f32b = str;
        this.f34e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = y1.b.f4648a;
        synchronized (this.f31a) {
            if (b()) {
                this.f31a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f27b) {
            this.f35f = true;
        }
        ArrayList arrayList = this.f34e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f27b) {
                a aVar2 = (a) arrayList.get(size);
                if (f.i.isLoggable(Level.FINE)) {
                    F1.d.h(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        i1.f.e(aVar, "task");
        synchronized (this.f31a) {
            if (!this.f33c) {
                if (d(aVar, j2, false)) {
                    this.f31a.d(this);
                }
            } else if (aVar.f27b) {
                if (f.i.isLoggable(Level.FINE)) {
                    F1.d.h(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (f.i.isLoggable(Level.FINE)) {
                    F1.d.h(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        i1.f.e(aVar, "task");
        c cVar = aVar.f28c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f28c = this;
        }
        d dVar = this.f31a.f41a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f34e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (f.i.isLoggable(Level.FINE)) {
                    F1.d.h(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (f.i.isLoggable(Level.FINE)) {
            F1.d.h(aVar, this, z2 ? "run again after ".concat(F1.d.z(j3 - nanoTime)) : "scheduled after ".concat(F1.d.z(j3 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((a) it.next()).d - nanoTime > j2) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, aVar);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = y1.b.f4648a;
        synchronized (this.f31a) {
            this.f33c = true;
            if (b()) {
                this.f31a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f32b;
    }
}
