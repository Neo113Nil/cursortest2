package C0;

import android.content.Context;
import com.fortuneodd.shadegrid.R;
import i1.k;
import q1.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f75f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f76a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f79e;

    public a(Context context) {
        boolean l02 = l.l0(context, R.attr.elevationOverlayEnabled, false);
        int j2 = k.j(context, R.attr.elevationOverlayColor, 0);
        int j3 = k.j(context, R.attr.elevationOverlayAccentColor, 0);
        int j4 = k.j(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f76a = l02;
        this.f77b = j2;
        this.f78c = j3;
        this.d = j4;
        this.f79e = f2;
    }
}
