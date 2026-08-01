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
import com.football.transfertrivia.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2215a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0105f f2216b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2217c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f2218e;

    /* renamed from: f, reason: collision with root package name */
    public Button f2219f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2220g;
    public Button h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2221j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2222k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f2223l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f2224m;

    /* renamed from: n, reason: collision with root package name */
    public View f2225n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f2226o;

    /* renamed from: q, reason: collision with root package name */
    public final int f2228q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2229r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2230s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2231t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2232u;

    /* renamed from: v, reason: collision with root package name */
    public final HandlerC0102c f2233v;

    /* renamed from: p, reason: collision with root package name */
    public int f2227p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2234w = new com.google.android.material.datepicker.j(1, this);

    public C0104e(Context context, DialogInterfaceC0105f dialogInterfaceC0105f, Window window) {
        this.f2215a = context;
        this.f2216b = dialogInterfaceC0105f;
        this.f2217c = window;
        HandlerC0102c handlerC0102c = new HandlerC0102c();
        handlerC0102c.f2214a = new WeakReference(dialogInterfaceC0105f);
        this.f2233v = handlerC0102c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2140e, R.attr.alertDialogStyle, 0);
        this.f2228q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2229r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2230s = obtainStyledAttributes.getResourceId(7, 0);
        this.f2231t = obtainStyledAttributes.getResourceId(3, 0);
        this.f2232u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0105f.f().f(1);
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
