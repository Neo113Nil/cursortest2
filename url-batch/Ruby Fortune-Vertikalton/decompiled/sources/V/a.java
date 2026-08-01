package V;

import T.v;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f759a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f760b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f761c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f761c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
