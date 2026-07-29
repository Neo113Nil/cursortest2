package o;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* renamed from: o.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728ak implements TransformationMethod {
    public final TransformationMethod h;

    public C0728ak(TransformationMethod transformationMethod) {
        this.h = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.h;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0272Kj.a().b() != 1) {
            return charSequence;
        }
        C0272Kj a = C0272Kj.a();
        a.getClass();
        return a.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.h;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
