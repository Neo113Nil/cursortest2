package H0;

import A.c;
import android.content.Context;
import com.football.transfertrivia.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f245f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f248c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final float f249e;

    public a(Context context) {
        boolean o02 = c.o0(context, R.attr.elevationOverlayEnabled, false);
        int C2 = c.C(context, R.attr.elevationOverlayColor, 0);
        int C3 = c.C(context, R.attr.elevationOverlayAccentColor, 0);
        int C4 = c.C(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f246a = o02;
        this.f247b = C2;
        this.f248c = C3;
        this.d = C4;
        this.f249e = f2;
    }
}
