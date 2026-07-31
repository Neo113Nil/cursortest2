package com.ironsource;

/* loaded from: classes10.dex */
public class Bf extends AbstractC4634f<a> {

    public interface a {
        void a();
    }

    public Bf(long j) {
        super(j);
    }

    public void a(a aVar) {
        a((Bf) aVar);
    }

    @Override // com.ironsource.AbstractC4634f
    protected void b() {
        T t = this.d;
        if (t != 0) {
            ((a) t).a();
        }
    }

    public void e() {
        c();
    }
}
