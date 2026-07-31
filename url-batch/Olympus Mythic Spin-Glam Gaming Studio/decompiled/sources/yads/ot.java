package yads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public abstract class ot implements d53 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public mt d;
    public long e;
    public long f;

    public ot() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new mt());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new nt(new gb0() { // from class: yads.ot$$ExternalSyntheticLambda0
                @Override // yads.gb0
                public final void a(h53 h53Var) {
                    ot.this.a((nt) h53Var);
                }
            }));
        }
        this.c = new PriorityQueue();
    }

    public final void a(h53 h53Var) {
        h53Var.b = 0;
        h53Var.d = null;
        this.b.add(h53Var);
    }

    public abstract void a(mt mtVar);

    @Override // yads.bb0
    public final Object b() {
        if (this.d != null) {
            throw new IllegalStateException();
        }
        if (this.a.isEmpty()) {
            return null;
        }
        mt mtVar = (mt) this.a.pollFirst();
        this.d = mtVar;
        return mtVar;
    }

    public abstract pt c();

    @Override // yads.bb0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h53 a() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty()) {
            mt mtVar = (mt) this.c.peek();
            int i = sb3.a;
            if (mtVar.f > this.e) {
                break;
            }
            mt mtVar2 = (mt) this.c.poll();
            if (mtVar2.b(4)) {
                h53 h53Var = (h53) this.b.pollFirst();
                h53Var.b = 4 | h53Var.b;
                mtVar2.b();
                this.a.add(mtVar2);
                return h53Var;
            }
            a(mtVar2);
            if (f()) {
                pt c = c();
                h53 h53Var2 = (h53) this.b.pollFirst();
                long j = mtVar2.f;
                h53Var2.c = j;
                h53Var2.d = c;
                h53Var2.e = j;
                mtVar2.b();
                this.a.add(mtVar2);
                return h53Var2;
            }
            mtVar2.b();
            this.a.add(mtVar2);
        }
        return null;
    }

    public final h53 e() {
        return (h53) this.b.pollFirst();
    }

    public abstract boolean f();

    @Override // yads.bb0
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            mt mtVar = (mt) this.c.poll();
            int i = sb3.a;
            mtVar.b();
            this.a.add(mtVar);
        }
        mt mtVar2 = this.d;
        if (mtVar2 != null) {
            mtVar2.b();
            this.a.add(mtVar2);
            this.d = null;
        }
    }

    @Override // yads.bb0
    public void release() {
    }

    @Override // yads.d53
    public final void a(long j) {
        this.e = j;
    }

    @Override // yads.bb0
    public final void a(g53 g53Var) {
        if (g53Var == this.d) {
            mt mtVar = (mt) g53Var;
            if (mtVar.b(Integer.MIN_VALUE)) {
                mtVar.b();
                this.a.add(mtVar);
            } else {
                long j = this.f;
                this.f = 1 + j;
                mtVar.j = j;
                this.c.add(mtVar);
            }
            this.d = null;
            return;
        }
        throw new IllegalArgumentException();
    }
}
