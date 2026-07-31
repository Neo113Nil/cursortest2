package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tr2 implements hg0 {
    public final t8 a;
    public final z1 b;
    public final pr2 c;
    public final p42 d;
    public final x63 e;
    public final ri0 f;
    public ww0 g;
    public rr2 h;

    public tr2(t8 t8Var, z1 z1Var, pr2 pr2Var, rz1 rz1Var, p42 p42Var, x63 x63Var, ri0 ri0Var) {
        this.a = t8Var;
        this.b = z1Var;
        this.c = pr2Var;
        this.d = p42Var;
        this.e = x63Var;
        this.f = ri0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r0.F == true) goto L24;
     */
    @Override // yads.hg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ViewGroup viewGroup) {
        vw2 vw2Var;
        View findViewWithTag = viewGroup.findViewWithTag("close");
        if (findViewWithTag != null) {
            rr2 rr2Var = new rr2(this);
            this.b.b.add(rr2Var);
            this.h = rr2Var;
            Context context = findViewWithTag.getContext();
            vw2 vw2Var2 = vw2.l;
            if (vw2Var2 == null) {
                synchronized (vw2.k) {
                    vw2Var = vw2.l;
                    if (vw2Var == null) {
                        vw2Var = new vw2();
                        vw2.l = vw2Var;
                    }
                }
                vw2Var2 = vw2Var;
            }
            bu2 a = vw2Var2.a(context);
            boolean z = a != null;
            mg0[] mg0VarArr = mg0.b;
            if (!Intrinsics.areEqual("divkit", this.a.k) || !z) {
                findViewWithTag.setOnClickListener(new qr2(this.c));
            }
            findViewWithTag.setVisibility(8);
            sr2 sr2Var = new sr2(findViewWithTag);
            t8 t8Var = this.a;
            p42 p42Var = this.d;
            x63 x63Var = this.e;
            ri0 ri0Var = this.f;
            j62 j62Var = p42Var.a;
            d82 d82Var = p42Var.b;
            ww0 ww0Var = null;
            String str = ri0Var != null ? ri0Var.a : null;
            ng0[] ng0VarArr = ng0.b;
            ww0 p32Var = (Intrinsics.areEqual(str, "pack_shot") && x63Var.d.a()) ? new p32(t8Var, sr2Var, x63Var) : j62Var != null ? new d62(t8Var, j62Var, sr2Var, x63Var) : d82Var != null ? new a82(d82Var, sr2Var) : x63Var.d.a() ? new p32(t8Var, sr2Var, x63Var) : null;
            if (p32Var != null) {
                p32Var.start();
                ww0Var = p32Var;
            }
            this.g = ww0Var;
        }
    }

    @Override // yads.hg0
    public final void c() {
        rr2 rr2Var = this.h;
        if (rr2Var != null) {
            this.b.b.remove(rr2Var);
        }
        ww0 ww0Var = this.g;
        if (ww0Var != null) {
            ww0Var.invalidate();
        }
    }
}
