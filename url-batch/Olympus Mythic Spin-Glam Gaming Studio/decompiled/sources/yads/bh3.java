package yads;

import java.util.List;

/* loaded from: classes14.dex */
public final class bh3 implements vo2 {
    public final vo2 a;
    public final Object b;
    public final /* synthetic */ ch3 c;

    public bh3(ch3 ch3Var, vo2 vo2Var, Object obj) {
        this.c = ch3Var;
        this.a = vo2Var;
        this.b = obj;
    }

    @Override // yads.vo2
    public final void a(le3 le3Var) {
        a();
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        this.c.c.getClass();
        zg3 a = ah3.a((List) obj);
        this.c.d.addAll(a.a);
        List list = a.b;
        if (list.isEmpty()) {
            a();
        } else {
            ch3 ch3Var = this.c;
            ch3Var.b.a(ch3Var.a, list, this, this.b);
        }
    }

    public final void a() {
        if (!this.c.d.isEmpty()) {
            this.a.onSuccess(this.c.d);
            return;
        }
        em0 em0Var = new em0();
        vo2 vo2Var = this.a;
        String message = em0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        vo2Var.a(new le3(message));
    }
}
