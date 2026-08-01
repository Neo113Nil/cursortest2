package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.fortuneodd.shadegrid.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2302a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0135f f2303b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2304c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2305e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2306f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2307g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2308j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2309k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2310l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2311m;

    /* renamed from: n, reason: collision with root package name */
    public View f2312n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2313o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2315q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2316r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2317s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2318t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2319u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0132c f2320v;

    /* renamed from: p, reason: collision with root package name */
    public int f2314p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2321w = new com.google.android.material.datepicker.j(1, this);

    public C0134e(Context context, DialogInterfaceC0135f dialogInterfaceC0135f, Window window) {
        this.f2302a = context;
        this.f2303b = dialogInterfaceC0135f;
        this.f2304c = window;
        HandlerC0132c handlerC0132c = new HandlerC0132c();
        handlerC0132c.f2301a = new WeakReference(dialogInterfaceC0135f);
        this.f2320v = handlerC0132c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1931e, R.attr.alertDialogStyle, 0);
        this.f2315q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2316r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2317s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2318t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2319u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0135f.f().h(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
