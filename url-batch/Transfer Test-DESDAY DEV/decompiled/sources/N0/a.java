package N0;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f504j = {RecyclerView.f1570A0, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f505k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f506l = {RecyclerView.f1570A0, RecyclerView.f1570A0, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f507a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f508b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f509c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f511f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f512g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f507a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f510e = C.a.d(-16777216, 20);
        this.f511f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f508b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f509c = new Paint(paint3);
    }
}
