package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class u40 extends x {
    public final TextInputLayout d;

    public u40(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.x
    public final void d(View view, k0 k0Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.A0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence3 = !isEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            co coVar = textInputLayout.p;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (coVar.o == 2 && coVar.y != null && !TextUtils.isEmpty(coVar.w)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = helperText.toString();
                } else {
                    charSequence3 = charSequence3 + ", " + ((Object) helperText);
                }
            }
        }
        e30 e30Var = textInputLayout.g;
        p5 p5Var = e30Var.g;
        if (p5Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(p5Var);
            accessibilityNodeInfo.setTraversalAfter(p5Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(e30Var.i);
        }
        if (!isEmpty) {
            k0Var.j(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            k0Var.j(charSequence3);
            if (!z && placeholderText != null) {
                k0Var.j(charSequence3 + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            k0Var.j(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            accessibilityNodeInfo.setHintText(charSequence3);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            accessibilityNodeInfo.setError(!isEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.h.b().m(k0Var);
    }

    @Override // defpackage.x
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.h.b().n(accessibilityEvent);
    }
}
