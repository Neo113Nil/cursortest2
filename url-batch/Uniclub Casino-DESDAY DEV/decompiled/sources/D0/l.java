package D0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public float f157c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f158e;

    /* renamed from: f, reason: collision with root package name */
    public G0.d f159f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f155a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final j f156b = new j(0, this);
    public boolean d = true;

    public l(y0.e eVar) {
        this.f158e = new WeakReference(null);
        this.f158e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f157c;
        }
        TextPaint textPaint = this.f155a;
        this.f157c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f157c;
    }
}
