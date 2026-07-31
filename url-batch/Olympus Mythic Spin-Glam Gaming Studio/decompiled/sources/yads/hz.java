package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class hz implements hg0 {
    public final t8 a;
    public final z1 b;
    public final s3 c;
    public final p42 d;
    public final x63 e;
    public final ri0 f;
    public final iz g;
    public final jf1 h;
    public ww0 i;
    public gz j;

    public hz(t8 t8Var, z1 z1Var, s3 s3Var, p42 p42Var, x63 x63Var, ri0 ri0Var) {
        iz izVar = new iz();
        jf1 jf1Var = new jf1();
        this.a = t8Var;
        this.b = z1Var;
        this.c = s3Var;
        this.d = p42Var;
        this.e = x63Var;
        this.f = ri0Var;
        this.g = izVar;
        this.h = jf1Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        gz gzVar = new gz(this);
        this.b.b.add(gzVar);
        this.j = gzVar;
        jf1 jf1Var = this.h;
        if1 if1Var = jf1Var.a;
        View findViewWithTag = viewGroup.findViewWithTag("linear_progress_view");
        ProgressBar progressBar = findViewWithTag instanceof ProgressBar ? (ProgressBar) findViewWithTag : null;
        qm2 qm2Var = jf1Var.b;
        KProperty kProperty = jf1.c[0];
        qm2Var.getClass();
        qm2Var.a = new WeakReference(progressBar);
        iz izVar = this.g;
        t8 t8Var = this.a;
        s3 s3Var = this.c;
        p42 p42Var = this.d;
        x63 x63Var = this.e;
        ri0 ri0Var = this.f;
        jf1 jf1Var2 = this.h;
        izVar.getClass();
        j62 j62Var = p42Var.a;
        d82 d82Var = p42Var.b;
        String str = ri0Var != null ? ri0Var.a : null;
        ng0[] ng0VarArr = ng0.b;
        ww0 s32Var = Intrinsics.areEqual(str, "pack_shot") ? new s32(s3Var, x63Var, jf1Var2) : j62Var != null ? new i62(t8Var, j62Var, s3Var, jf1Var2) : d82Var != null ? new c82(d82Var, s3Var, x63Var.c, jf1Var2) : new s32(s3Var, x63Var, jf1Var2);
        s32Var.start();
        this.i = s32Var;
    }

    @Override // yads.hg0
    public final void c() {
        gz gzVar = this.j;
        if (gzVar != null) {
            this.b.b.remove(gzVar);
        }
        ww0 ww0Var = this.i;
        if (ww0Var != null) {
            ww0Var.invalidate();
        }
        qm2 qm2Var = this.h.b;
        KProperty kProperty = jf1.c[0];
        qm2Var.getClass();
        qm2Var.a = new WeakReference(null);
    }
}
