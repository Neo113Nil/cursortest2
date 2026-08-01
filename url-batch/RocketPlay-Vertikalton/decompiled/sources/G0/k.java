package G0;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f509c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f510e;

    /* renamed from: f, reason: collision with root package name */
    public J0.d f511f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f507a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final B0.b f508b = new B0.b(1, this);
    public boolean d = true;

    public k(B0.f fVar) {
        this.f510e = new WeakReference(null);
        this.f510e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f509c;
        }
        TextPaint textPaint = this.f507a;
        this.f509c = str == null ? RecyclerView.f1949A0 : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f509c;
    }
}
