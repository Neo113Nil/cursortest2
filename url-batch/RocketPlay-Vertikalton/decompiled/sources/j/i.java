package j;

import l.e1;

/* loaded from: classes.dex */
public final class i extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3102a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3103b;

    /* renamed from: c, reason: collision with root package name */
    public int f3104c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.f3102a = 0;
        this.d = jVar;
        this.f3103b = false;
        this.f3104c = 0;
    }

    @Override // K.d0
    public final void a() {
        switch (this.f3102a) {
            case 0:
                int i = this.f3104c + 1;
                this.f3104c = i;
                j jVar = (j) this.d;
                if (i == jVar.f3105a.size()) {
                    F1.d dVar = jVar.d;
                    if (dVar != null) {
                        dVar.a();
                    }
                    this.f3104c = 0;
                    this.f3103b = false;
                    jVar.f3108e = false;
                    break;
                }
                break;
            default:
                if (!this.f3103b) {
                    ((e1) this.d).f3414a.setVisibility(this.f3104c);
                    break;
                }
                break;
        }
    }

    @Override // F1.d, K.d0
    public void d() {
        switch (this.f3102a) {
            case 1:
                this.f3103b = true;
                break;
        }
    }

    @Override // F1.d, K.d0
    public final void g() {
        switch (this.f3102a) {
            case 0:
                if (!this.f3103b) {
                    this.f3103b = true;
                    F1.d dVar = ((j) this.d).d;
                    if (dVar != null) {
                        dVar.g();
                        break;
                    }
                }
                break;
            default:
                ((e1) this.d).f3414a.setVisibility(0);
                break;
        }
    }

    public i(e1 e1Var, int i) {
        this.f3102a = 1;
        this.d = e1Var;
        this.f3104c = i;
        this.f3103b = false;
    }
}
