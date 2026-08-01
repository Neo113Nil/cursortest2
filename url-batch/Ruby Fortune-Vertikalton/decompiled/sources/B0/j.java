package B0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f122a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f128j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f125e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f126f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f127g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f129k = null;

    public j(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f122a = charSequence;
        this.f123b = textPaint;
        this.f124c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f122a == null) {
            this.f122a = "";
        }
        int max = Math.max(0, this.f124c);
        CharSequence charSequence = this.f122a;
        int i = this.f126f;
        TextPaint textPaint = this.f123b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f129k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f128j && this.f126f == 1) {
            this.f125e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f125e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f128j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f129k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f126f);
        float f2 = this.f127g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f126f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
