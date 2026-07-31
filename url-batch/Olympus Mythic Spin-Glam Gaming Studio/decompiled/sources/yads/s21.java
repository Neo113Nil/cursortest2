package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes6.dex */
public final class s21 {
    public final n21 a;
    public final ri2 b;
    public final o03 c;
    public final ok0 d;
    public final Resources e;
    public final boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r5.M0 == true) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s21(Context context, n21 n21Var, ri2 ri2Var) {
        vw2 vw2Var;
        h92 h92Var = k92.d;
        o03 o03Var = h92Var.a(context).a;
        ok0 ok0Var = h92Var.a(context).b;
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
        this.a = n21Var;
        this.b = ri2Var;
        this.c = o03Var;
        this.d = ok0Var;
        this.e = context.getResources();
        boolean z = n21Var.a() && (r5 = vw2Var2.a(context)) != null;
        this.f = z;
    }

    public final void a(q31 q31Var, p21 p21Var) {
        ri2 ri2Var = this.b;
        ri2Var.getClass();
        String str = q31Var.g;
        qi2 qi2Var = str != null ? new qi2(str, new j03(q31Var.a, q31Var.b)) : null;
        Bitmap bitmap = qi2Var != null ? (Bitmap) ri2Var.c.get(qi2Var) : null;
        p21Var.a(bitmap != null ? new BitmapDrawable(this.e, bitmap) : null);
        if (this.f) {
            this.d.a(q31Var.c, new r21(p21Var));
        } else {
            b(q31Var, p21Var);
        }
    }

    public final void b(q31 q31Var, final p21 p21Var) {
        o21 o21Var = new o21() { // from class: yads.s21$$ExternalSyntheticLambda0
            @Override // yads.o21
            public final void a(Bitmap bitmap) {
                s21.a(p21.this, this, bitmap);
            }
        };
        Bitmap a = this.b.a(q31Var);
        if (a != null) {
            o21Var.a(a);
            return;
        }
        ri2 ri2Var = this.b;
        ri2Var.getClass();
        String str = q31Var.g;
        qi2 qi2Var = str != null ? new qi2(str, new j03(q31Var.a, q31Var.b)) : null;
        o21Var.a(qi2Var != null ? (Bitmap) ri2Var.c.get(qi2Var) : null);
        if (this.a.a()) {
            String str2 = q31Var.c;
            this.c.a(str2, new q21(this, str2, o21Var), q31Var.a, q31Var.b);
        }
    }

    public static final void a(p21 p21Var, s21 s21Var, Bitmap bitmap) {
        p21Var.a(bitmap != null ? new BitmapDrawable(s21Var.e, bitmap) : null);
    }
}
