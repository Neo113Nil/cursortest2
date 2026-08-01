package defpackage;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ol, ku, s9, sl, hv {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ol
    public Object a(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return obj == ((l) obj2) ? "(this Collection)" : String.valueOf(obj);
            default:
                obj.getClass();
                return ((v1) obj2).a();
        }
    }

    @Override // defpackage.s9
    public void b() {
        CheckableImageButton checkableImageButton = ((e30) this.g).i;
        m60.c0(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.hv
    public db0 k(View view, db0 db0Var) {
        h40 h40Var = (h40) this.g;
        ArrayList arrayList = h40Var.b;
        ab0 ab0Var = db0Var.a;
        io b = io.b(ab0Var.h(519), ab0Var.h(64));
        io b2 = io.b(ab0Var.i(519), ab0Var.i(64));
        if (!b.equals(h40Var.c) || !b2.equals(h40Var.d)) {
            h40Var.c = b;
            h40Var.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ax axVar = (ax) arrayList.get(size);
                axVar.c = b;
                axVar.d = b2;
                axVar.c();
            }
        }
        return db0Var;
    }
}
