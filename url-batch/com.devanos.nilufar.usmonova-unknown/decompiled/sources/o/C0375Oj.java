package o;

import android.text.Editable;

/* renamed from: o.Oj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375Oj extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile C0375Oj b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new OS(cls, charSequence) : super.newEditable(charSequence);
    }
}
