package I0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f330a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f332c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f336j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f333e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f334f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f335g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f337k = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f330a = charSequence;
        this.f331b = textPaint;
        this.f332c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f330a == null) {
            this.f330a = "";
        }
        int max = Math.max(0, this.f332c);
        CharSequence charSequence = this.f330a;
        int i = this.f334f;
        TextPaint textPaint = this.f331b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f337k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f336j && this.f334f == 1) {
            this.f333e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f333e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f336j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f337k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f334f);
        float f2 = this.f335g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(RecyclerView.f1570A0, f2);
        }
        if (this.f334f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
