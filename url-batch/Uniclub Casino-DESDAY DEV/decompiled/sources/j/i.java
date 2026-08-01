package j;

import l.d1;

/* loaded from: classes.dex */
public final class i extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2599a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2600b;

    /* renamed from: c, reason: collision with root package name */
    public int f2601c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f2599a = 0;
        this.d = jVar;
        this.f2600b = false;
        this.f2601c = 0;
    }

    @Override // K.a0
    public final void a() {
        switch (this.f2599a) {
            case 0:
                int i = this.f2601c + 1;
                this.f2601c = i;
                j jVar = (j) this.d;
                if (i == jVar.f2602a.size()) {
                    q1.l lVar = jVar.d;
                    if (lVar != null) {
                        lVar.a();
                    }
                    this.f2601c = 0;
                    this.f2600b = false;
                    jVar.f2605e = false;
                    break;
                }
                break;
            default:
                if (!this.f2600b) {
                    ((d1) this.d).f2979a.setVisibility(this.f2601c);
                    break;
                }
                break;
        }
    }

    @Override // q1.l, K.a0
    public void d() {
        switch (this.f2599a) {
            case 1:
                this.f2600b = true;
                break;
        }
    }

    @Override // q1.l, K.a0
    public final void g() {
        switch (this.f2599a) {
            case 0:
                if (!this.f2600b) {
                    this.f2600b = true;
                    q1.l lVar = ((j) this.d).d;
                    if (lVar != null) {
                        lVar.g();
                        break;
                    }
                }
                break;
            default:
                ((d1) this.d).f2979a.setVisibility(0);
                break;
        }
    }

    public i(d1 d1Var, int i) {
        this.f2599a = 1;
        this.d = d1Var;
        this.f2601c = i;
        this.f2600b = false;
    }
}
