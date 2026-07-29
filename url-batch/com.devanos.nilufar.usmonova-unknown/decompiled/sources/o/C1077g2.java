package o;

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
import com.devanos.nilufar.usmonova.R;
import java.lang.ref.WeakReference;

/* renamed from: o.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077g2 {
    public final Context a;
    public final DialogInterfaceC1209i2 b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public Button f;
    public Button g;
    public Button h;
    public NestedScrollView i;
    public Drawable j;
    public ImageView k;
    public TextView l;
    public TextView m;
    public View n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f166o;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final HandlerC0945e2 v;
    public int p = -1;
    public final ViewOnClickListenerC1207i1 w = new ViewOnClickListenerC1207i1(1, this);

    public C1077g2(Context context, DialogInterfaceC1209i2 dialogInterfaceC1209i2, Window window) {
        this.a = context;
        this.b = dialogInterfaceC1209i2;
        this.c = window;
        HandlerC0945e2 handlerC0945e2 = new HandlerC0945e2();
        handlerC0945e2.a = new WeakReference(dialogInterfaceC1209i2);
        this.v = handlerC0945e2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1886sL.e, R.attr.alertDialogStyle, 0);
        this.q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.s = obtainStyledAttributes.getResourceId(7, 0);
        this.t = obtainStyledAttributes.getResourceId(3, 0);
        this.u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC1209i2.c().g(1);
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
