package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cu extends ss {
    public final int A;
    public final Class z;

    public cu(Context context, Class cls, int i) {
        super(context);
        this.z = cls;
        this.A = i;
    }

    @Override // defpackage.ss
    public final vs a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size <= i4) {
            w();
            vs a = super.a(i, i2, i3, charSequence);
            v();
            return a;
        }
        String simpleName = this.z.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i4 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // defpackage.ss, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
    }
}
