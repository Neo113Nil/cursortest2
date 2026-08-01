package I0;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f249j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f250k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f251l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f252a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f253b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f254c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f255e;

    /* renamed from: f, reason: collision with root package name */
    public final int f256f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f257g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f252a = paint2;
        this.d = C.a.d(-16777216, 68);
        this.f255e = C.a.d(-16777216, 20);
        this.f256f = C.a.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f253b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f254c = new Paint(paint3);
    }
}
