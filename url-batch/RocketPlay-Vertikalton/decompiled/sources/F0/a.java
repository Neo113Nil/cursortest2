package F0;

import F1.d;
import android.content.Context;
import com.luckycounter.drinkwater.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f399f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f401b;

    /* renamed from: c, reason: collision with root package name */
    public final int f402c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f403e;

    public a(Context context) {
        boolean c02 = d.c0(context, R.attr.elevationOverlayEnabled, false);
        int B2 = d.B(context, R.attr.elevationOverlayColor, 0);
        int B3 = d.B(context, R.attr.elevationOverlayAccentColor, 0);
        int B4 = d.B(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f400a = c02;
        this.f401b = B2;
        this.f402c = B3;
        this.d = B4;
        this.f403e = f2;
    }
}
