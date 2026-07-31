package yads;

import android.view.View;
import android.widget.TextView;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class in3 extends ek3 {
    public in3(TextView textView) {
        super(textView);
    }

    @Override // yads.ek3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.ek3
    public final void b(View view, Object obj) {
        ((TextView) view).setText(((k10) obj).a);
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        k10 k10Var = (k10) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return StringsKt.equals(String.valueOf(text), k10Var.a, true);
        }
        return false;
    }
}
