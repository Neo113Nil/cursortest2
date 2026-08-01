package l1;

import X0.e;
import i1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l.C0242k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f3173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3174b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3175c;
    public a d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3176e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3177f;

    public c(d dVar, String str) {
        e.e(dVar, "taskRunner");
        e.e(str, "name");
        this.f3173a = dVar;
        this.f3174b = str;
        this.f3176e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = j1.b.f2600a;
        synchronized (this.f3173a) {
            if (b()) {
                this.f3173a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.f3169b) {
            this.f3177f = true;
        }
        ArrayList arrayList = this.f3176e;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3169b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void c(a aVar, long j2) {
        e.e(aVar, "task");
        synchronized (this.f3173a) {
            if (!this.f3175c) {
                if (d(aVar, j2, false)) {
                    this.f3173a.d(this);
                }
            } else if (aVar.f3169b) {
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j2, boolean z2) {
        e.e(aVar, "task");
        c cVar = aVar.f3170c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f3170c = this;
        }
        C0242k c0242k = this.f3173a.f3178a;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f3176e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j3) {
                if (d.i.isLoggable(Level.FINE)) {
                    s.a(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j3;
        if (d.i.isLoggable(Level.FINE)) {
            s.a(aVar, this, z2 ? "run again after ".concat(s.g(j3 - nanoTime)) : "scheduled after ".concat(s.g(j3 - nanoTime)));
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
        byte[] bArr = j1.b.f2600a;
        synchronized (this.f3173a) {
            this.f3175c = true;
            if (b()) {
                this.f3173a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3174b;
    }
}
