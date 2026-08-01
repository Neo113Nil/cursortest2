package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class eh extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile eh b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new r20(cls, charSequence) : super.newEditable(charSequence);
    }
}
