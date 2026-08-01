package L0;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f798j = {RecyclerView.f1949A0, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f799k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f800l = {RecyclerView.f1949A0, RecyclerView.f1949A0, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f801a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f802b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f803c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f804e;

    /* renamed from: f, reason: collision with root package name */
    public final int f805f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f806g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f801a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f804e = C.a.d(-16777216, 20);
        this.f805f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f802b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f803c = new Paint(paint3);
    }
}
