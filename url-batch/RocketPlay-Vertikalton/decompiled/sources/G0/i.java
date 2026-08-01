package G0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f499a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f501c;
    public int d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f505j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f502e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f503f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f504g = 1.0f;
    public int h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f506k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f499a = charSequence;
        this.f500b = textPaint;
        this.f501c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f499a == null) {
            this.f499a = "";
        }
        int max = Math.max(0, this.f501c);
        CharSequence charSequence = this.f499a;
        int i = this.f503f;
        TextPaint textPaint = this.f500b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f506k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f505j && this.f503f == 1) {
            this.f502e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f502e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f505j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f506k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f503f);
        float f2 = this.f504g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(RecyclerView.f1949A0, f2);
        }
        if (this.f503f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
