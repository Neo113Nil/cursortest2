package yads;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* loaded from: classes13.dex */
public final class o63 extends Spannable.Factory {
    public final Drawable a;
    public final int b;
    public final int c;

    public o63(Drawable drawable, int i, int i2) {
        this.a = drawable;
        this.b = i;
        this.c = i2;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.a != null && this.b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.a;
            int i = this.b;
            drawable.setBounds(0, 0, i, i);
            hd hdVar = new hd(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i2 = this.c;
            colorDrawable.setBounds(0, 0, i2, i2);
            hd hdVar2 = new hd(colorDrawable);
            spannableStringBuilder.setSpan(hdVar, 0, 1, 33);
            spannableStringBuilder.setSpan(hdVar2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
