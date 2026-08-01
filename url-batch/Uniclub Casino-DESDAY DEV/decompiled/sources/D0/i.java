package D0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f145a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f147c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f151j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f148e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f149f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f150g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f152k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f145a = charSequence;
        this.f146b = textPaint;
        this.f147c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f145a == null) {
            this.f145a = "";
        }
        int max = Math.max(0, this.f147c);
        CharSequence charSequence = this.f145a;
        int i = this.f149f;
        TextPaint textPaint = this.f146b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f152k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f151j && this.f149f == 1) {
            this.f148e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f148e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f151j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f152k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f149f);
        float f2 = this.f150g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f149f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
