package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class rh implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ rh(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return nz.s(((uz) obj).b, ((uz) obj2).b);
            case 1:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                a70 a70Var = qs.d;
                Object g = a70Var.g(view);
                g.getClass();
                Rect rect = (Rect) g;
                Object g2 = a70Var.g(view2);
                g2.getClass();
                Rect rect2 = (Rect) g2;
                int i = rect.top - rect2.top;
                return i == 0 ? rect.bottom - rect2.bottom : i;
            case 2:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                a70 a70Var2 = qs.d;
                Object g3 = a70Var2.g(view3);
                g3.getClass();
                Rect rect3 = (Rect) g3;
                Object g4 = a70Var2.g(view4);
                g4.getClass();
                Rect rect4 = (Rect) g4;
                int i2 = rect3.left - rect4.left;
                return i2 == 0 ? (rect3.right - rect4.right) * qs.c : i2 * qs.c;
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                pd0 pd0Var = (pd0) obj;
                pd0 pd0Var2 = (pd0) obj2;
                return (((Number) pd0Var.e).intValue() - ((Number) pd0Var.d).intValue()) - (((Number) pd0Var2.e).intValue() - ((Number) pd0Var2.d).intValue());
            default:
                p10 p10Var = (p10) obj;
                p10 p10Var2 = (p10) obj2;
                float f = p10Var.G.o.G;
                float f2 = p10Var2.G.o.G;
                return f == f2 ? nz.s(p10Var.o(), p10Var2.o()) : Float.compare(f, f2);
        }
    }
}
