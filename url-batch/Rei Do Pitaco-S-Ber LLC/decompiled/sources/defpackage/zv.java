package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zv extends up {
    public final /* synthetic */ aw q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(aw awVar, Context context) {
        super(context);
        this.q = awVar;
    }

    @Override // defpackage.up
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.up
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.up
    public final void h(View view, xy xyVar) {
        aw awVar = this.q;
        int[] a = awVar.a(awVar.a.getLayoutManager(), view);
        int i = a[0];
        int i2 = a[1];
        int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (ceil > 0) {
            xyVar.a = i;
            xyVar.b = i2;
            xyVar.c = ceil;
            xyVar.e = this.j;
            xyVar.f = true;
        }
    }
}
