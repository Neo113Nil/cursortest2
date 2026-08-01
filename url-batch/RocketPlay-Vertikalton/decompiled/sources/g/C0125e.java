package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
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
import com.luckycounter.drinkwater.R;
import java.lang.ref.WeakReference;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125e {

    /* renamed from: A, reason: collision with root package name */
    public final int f2642A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f2643B;

    /* renamed from: C, reason: collision with root package name */
    public final HandlerC0123c f2644C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2646a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0126f f2647b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f2648c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2649e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f2650f;

    /* renamed from: g, reason: collision with root package name */
    public Button f2651g;
    public CharSequence h;
    public Message i;

    /* renamed from: j, reason: collision with root package name */
    public Button f2652j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2653k;

    /* renamed from: l, reason: collision with root package name */
    public Message f2654l;

    /* renamed from: m, reason: collision with root package name */
    public Button f2655m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f2656n;

    /* renamed from: o, reason: collision with root package name */
    public Message f2657o;

    /* renamed from: p, reason: collision with root package name */
    public NestedScrollView f2658p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f2659q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f2660r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f2661s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f2662t;

    /* renamed from: u, reason: collision with root package name */
    public View f2663u;

    /* renamed from: v, reason: collision with root package name */
    public ListAdapter f2664v;

    /* renamed from: x, reason: collision with root package name */
    public final int f2666x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2667y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2668z;

    /* renamed from: w, reason: collision with root package name */
    public int f2665w = -1;

    /* renamed from: D, reason: collision with root package name */
    public final com.google.android.material.datepicker.j f2645D = new com.google.android.material.datepicker.j(1, this);

    public C0125e(Context context, DialogInterfaceC0126f dialogInterfaceC0126f, Window window) {
        this.f2646a = context;
        this.f2647b = dialogInterfaceC0126f;
        this.f2648c = window;
        HandlerC0123c handlerC0123c = new HandlerC0123c();
        handlerC0123c.f2641a = new WeakReference(dialogInterfaceC0126f);
        this.f2644C = handlerC0123c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f2562e, R.attr.alertDialogStyle, 0);
        this.f2666x = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f2667y = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f2668z = obtainStyledAttributes.getResourceId(7, 0);
        this.f2642A = obtainStyledAttributes.getResourceId(3, 0);
        this.f2643B = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0126f.f().h(1);
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

    public final void b(int i, CharSequence charSequence, S0.k kVar) {
        Message obtainMessage = kVar != null ? this.f2644C.obtainMessage(i, kVar) : null;
        if (i == -3) {
            this.f2656n = charSequence;
            this.f2657o = obtainMessage;
        } else if (i == -2) {
            this.f2653k = charSequence;
            this.f2654l = obtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.h = charSequence;
            this.i = obtainMessage;
        }
    }
}
