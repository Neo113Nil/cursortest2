package j;

import l.c1;

/* loaded from: classes.dex */
public final class i extends A.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2671e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2672f;

    /* renamed from: g, reason: collision with root package name */
    public int f2673g;
    public final /* synthetic */ Object h;

    public i(j jVar) {
        this.f2671e = 0;
        this.h = jVar;
        this.f2672f = false;
        this.f2673g = 0;
    }

    @Override // K.d0
    public final void a() {
        switch (this.f2671e) {
            case 0:
                int i = this.f2673g + 1;
                this.f2673g = i;
                j jVar = (j) this.h;
                if (i == jVar.f2674a.size()) {
                    A.c cVar = jVar.d;
                    if (cVar != null) {
                        cVar.a();
                    }
                    this.f2673g = 0;
                    this.f2672f = false;
                    jVar.f2677e = false;
                    break;
                }
                break;
            default:
                if (!this.f2672f) {
                    ((c1) this.h).f2982a.setVisibility(this.f2673g);
                    break;
                }
                break;
        }
    }

    @Override // A.c, K.d0
    public void b() {
        switch (this.f2671e) {
            case 1:
                this.f2672f = true;
                break;
        }
    }

    @Override // A.c, K.d0
    public final void c() {
        switch (this.f2671e) {
            case 0:
                if (!this.f2672f) {
                    this.f2672f = true;
                    A.c cVar = ((j) this.h).d;
                    if (cVar != null) {
                        cVar.c();
                        break;
                    }
                }
                break;
            default:
                ((c1) this.h).f2982a.setVisibility(0);
                break;
        }
    }

    public i(c1 c1Var, int i) {
        this.f2671e = 1;
        this.h = c1Var;
        this.f2673g = i;
        this.f2672f = false;
    }
}
