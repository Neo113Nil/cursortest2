package yads;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes13.dex */
public final class vk3 implements View.OnClickListener {
    public final TextView a;

    public vk3(TextView textView) {
        this.a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView = this.a;
        if (textView != null) {
            textView.performClick();
        }
    }
}
