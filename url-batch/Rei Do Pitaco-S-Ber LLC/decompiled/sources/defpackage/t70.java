package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t70 extends j40 {
    public final /* synthetic */ int e;

    public t70(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.j40
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(a80.c(view));
            case 1:
                return a80.a(view);
            default:
                return Boolean.valueOf(a80.b(view));
        }
    }

    @Override // defpackage.j40
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                a80.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                a80.e(view, (CharSequence) obj);
                break;
            default:
                a80.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.j40
    public final boolean e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
