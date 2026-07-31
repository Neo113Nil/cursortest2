package yads;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dw extends ek3 {
    public dw(TextView textView) {
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
        TextView textView = (TextView) view;
        bw bwVar = (bw) obj;
        if (aw.b == bwVar.a) {
            textView.setText(bwVar.b);
        }
    }

    @Override // yads.ek3
    public final boolean a(View view, Object obj) {
        TextView textView = (TextView) view;
        bw bwVar = (bw) obj;
        if (aw.b == bwVar.a) {
            return Intrinsics.areEqual(textView.getText().toString(), bwVar.b);
        }
        return true;
    }
}
