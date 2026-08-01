package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ix extends gx {
    public final Field a;
    public final Field b;
    public final Field c;

    public ix(Field field, Field field2, Field field3) {
        this.a = field;
        this.b = field2;
        this.c = field3;
    }

    @Override // defpackage.gx
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // defpackage.gx
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // defpackage.gx
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
