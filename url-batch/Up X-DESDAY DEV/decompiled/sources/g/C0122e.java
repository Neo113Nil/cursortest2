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
import com.ratebook.luckyconvert.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0123f f2297b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2298c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2299e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2300f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2301g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2302j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2303k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2304l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2305m;

    /* renamed from: n, reason: collision with root package name */
    public View f2306n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2307o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2309q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2310r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2311s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2312t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2313u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0120c f2314v;

    /* renamed from: p, reason: collision with root package name */
    public int f2308p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2315w = new com.google.android.material.datepicker.j(1, this);

    public C0122e(Context context, DialogInterfaceC0123f dialogInterfaceC0123f, Window window) {
        this.f2296a = context;
        this.f2297b = dialogInterfaceC0123f;
        this.f2298c = window;
        HandlerC0120c handlerC0120c = new HandlerC0120c();
        handlerC0120c.f2295a = new WeakReference(dialogInterfaceC0123f);
        this.f2314v = handlerC0120c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1926e, R.attr.alertDialogStyle, 0);
        this.f2309q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2310r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2311s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2312t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2313u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0123f.f().h(1);
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
