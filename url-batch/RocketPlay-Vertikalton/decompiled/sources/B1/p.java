package B1;

import L.s;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.C0121a;
import g.C0122b;
import g.C0124d;
import g.C0125e;
import g.DialogInterfaceC0126f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0203n;

/* loaded from: classes.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f222a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f223b;

    public p(ArrayList arrayList) {
        this.f223b = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0126f a() {
        C0122b c0122b = (C0122b) this.f223b;
        DialogInterfaceC0126f dialogInterfaceC0126f = new DialogInterfaceC0126f(c0122b.f2630a, this.f222a);
        View view = c0122b.f2633e;
        C0125e c0125e = dialogInterfaceC0126f.f2670f;
        if (view != null) {
            c0125e.f2663u = view;
        } else {
            CharSequence charSequence = c0122b.d;
            if (charSequence != null) {
                c0125e.d = charSequence;
                TextView textView = c0125e.f2661s;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0122b.f2632c;
            if (drawable != null) {
                c0125e.f2659q = drawable;
                ImageView imageView = c0125e.f2660r;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0125e.f2660r.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0122b.f2634f;
        if (charSequence2 != null) {
            c0125e.f2649e = charSequence2;
            TextView textView2 = c0125e.f2662t;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0122b.f2635g;
        if (charSequence3 != null) {
            c0125e.b(-1, charSequence3, c0122b.h);
        }
        CharSequence charSequence4 = c0122b.i;
        if (charSequence4 != null) {
            c0125e.b(-2, charSequence4, null);
        }
        if (c0122b.f2637k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0122b.f2631b.inflate(c0125e.f2667y, (ViewGroup) null);
            int i = c0122b.f2639m ? c0125e.f2668z : c0125e.f2642A;
            Object obj = c0122b.f2637k;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0124d(c0122b.f2630a, i, R.id.text1, null);
            }
            c0125e.f2664v = r7;
            c0125e.f2665w = c0122b.f2640n;
            if (c0122b.f2638l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0121a(c0122b, c0125e));
            }
            if (c0122b.f2639m) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0125e.f2650f = alertController$RecycleListView;
        }
        dialogInterfaceC0126f.setCancelable(true);
        dialogInterfaceC0126f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0126f.setOnCancelListener(null);
        dialogInterfaceC0126f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0203n dialogInterfaceOnKeyListenerC0203n = c0122b.f2636j;
        if (dialogInterfaceOnKeyListenerC0203n != null) {
            dialogInterfaceC0126f.setOnKeyListener(dialogInterfaceOnKeyListenerC0203n);
        }
        return dialogInterfaceC0126f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f223b).B(this.f222a);
        return true;
    }

    public boolean c() {
        return this.f222a < ((ArrayList) this.f223b).size();
    }

    public p(Context context) {
        int i = DialogInterfaceC0126f.i(context, 0);
        this.f223b = new C0122b(new ContextThemeWrapper(context, DialogInterfaceC0126f.i(context, i)));
        this.f222a = i;
    }

    public p(int i, H.j[] jVarArr) {
        this.f222a = i;
        this.f223b = jVarArr;
    }

    public p(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f223b = bottomSheetBehavior;
        this.f222a = i;
    }
}
