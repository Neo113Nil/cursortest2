package yads;

import android.graphics.Bitmap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes14.dex */
public final class q21 implements f31 {
    public final /* synthetic */ s21 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ o21 c;

    public q21(s21 s21Var, String str, o21 o21Var) {
        this.a = s21Var;
        this.b = str;
        this.c = o21Var;
    }

    @Override // yads.vp2
    public final void a(hm3 hm3Var) {
        boolean z = ob1.a;
    }

    @Override // yads.f31
    public final void a(e31 e31Var, boolean z) {
        Bitmap bitmap = e31Var.a;
        if (bitmap != null) {
            s21 s21Var = this.a;
            String str = this.b;
            o21 o21Var = this.c;
            ri2 ri2Var = s21Var.b;
            ri2Var.b.putAll(MapsKt.mapOf(TuplesKt.to(str, bitmap)));
            o21Var.a(bitmap);
        }
    }
}
