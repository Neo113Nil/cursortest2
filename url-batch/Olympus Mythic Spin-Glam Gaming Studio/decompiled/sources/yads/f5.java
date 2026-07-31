package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class f5 implements x3 {
    public final x8 a;
    public final WeakReference b;

    public f5(i02 i02Var) {
        x8 x8Var = new x8();
        WeakReference weakReference = new WeakReference(i02Var);
        this.a = x8Var;
        this.b = weakReference;
        x8Var.a(this);
    }

    @Override // yads.x3
    public final void a(int i, Bundle bundle) {
        i02 i02Var = (i02) this.b.get();
        if (i02Var != null) {
            if (i == 19) {
                i02Var.a.b();
                i02Var.b.f.b.b(f1.e);
            }
            if (i == 20) {
                i02Var.b.f.b.a(f1.e);
                return;
            }
            switch (i) {
                case 6:
                    i02Var.a.b();
                    i02Var.b.f.b.b(f1.d);
                    break;
                case 7:
                    i02Var.a.b();
                    i02Var.b.f.c();
                    break;
                case 8:
                    i02Var.b.f.b.a(f1.d);
                    break;
                case 9:
                    boolean z = ob1.a;
                    i02Var.b.f.a();
                    break;
            }
        }
    }
}
