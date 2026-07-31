package yads;

import android.view.View;
import android.widget.TextView;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class n63 extends ek3 {
    public n63(TextView textView) {
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
        ((TextView) view).setText((String) obj);
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        String str = (String) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return StringsKt.equals(String.valueOf(text), str, true);
        }
        return false;
    }
}
