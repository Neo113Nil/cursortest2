package o;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: o.Rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453Rj extends AbstractC0220Ij {
    public final WeakReference a;
    public final WeakReference b;

    public C0453Rj(TextView textView, C0479Sj c0479Sj) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(c0479Sj);
    }

    @Override // o.AbstractC0220Ij
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0272Kj a = C0272Kj.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a.getClass();
                        length = text.length();
                    }
                    CharSequence e = a.e(text, 0, length);
                    if (text == e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e);
                    int selectionEnd = Selection.getSelectionEnd(e);
                    textView.setText(e);
                    if (e instanceof Spannable) {
                        Spannable spannable = (Spannable) e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
