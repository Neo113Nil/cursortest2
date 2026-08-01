package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nh extends vh {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final ce0 f = new ce0(gf0.g, b2.K);
    public final /* synthetic */ qh g;

    public nh(qh qhVar, long j, boolean z, boolean z2, y7 y7Var) {
        this.g = qhVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.vh
    public final void a(bi biVar, eg egVar) {
        this.g.b.a(biVar, egVar);
    }

    @Override // defpackage.vh
    public final void b() {
        qh qhVar = this.g;
        qhVar.z--;
    }

    @Override // defpackage.vh
    public final boolean c() {
        return this.g.b.c();
    }

    @Override // defpackage.vh
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.vh
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.vh
    public final long f() {
        return this.a;
    }

    @Override // defpackage.vh
    public final uh g() {
        return this.g.g;
    }

    @Override // defpackage.vh
    public final gf0 h() {
        return (gf0) this.f.getValue();
    }

    @Override // defpackage.vh
    public final rj i() {
        return this.g.b.i();
    }

    @Override // defpackage.vh
    public final void j(bi biVar) {
        qh qhVar = this.g;
        qhVar.b.j(qhVar.g);
        qhVar.b.j(biVar);
    }

    @Override // defpackage.vh
    public final h60 k(i60 i60Var) {
        return this.g.b.k(i60Var);
    }

    @Override // defpackage.vh
    public final void l(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.vh
    public final void m(qh qhVar) {
        this.e.add(qhVar);
    }

    @Override // defpackage.vh
    public final void n(bi biVar) {
        this.g.b.n(biVar);
    }

    @Override // defpackage.vh
    public final void o() {
        this.g.z++;
    }

    @Override // defpackage.vh
    public final void p(qh qhVar) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(qhVar.c);
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        if (!(linkedHashSet instanceof j00) || (linkedHashSet instanceof k00)) {
            linkedHashSet.remove(qhVar);
        } else {
            px0.U(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // defpackage.vh
    public final void q(bi biVar) {
        this.g.b.q(biVar);
    }

    public final void r() {
        LinkedHashSet<qh> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (qh qhVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(qhVar.c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
