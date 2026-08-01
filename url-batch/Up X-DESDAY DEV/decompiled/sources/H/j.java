package H;

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
import g.C0118a;
import g.C0119b;
import g.C0121d;
import g.C0122e;
import g.DialogInterfaceC0123f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0159n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f227a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f228b;

    public j() {
        this.f228b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0123f a() {
        C0119b c0119b = (C0119b) this.f228b;
        DialogInterfaceC0123f dialogInterfaceC0123f = new DialogInterfaceC0123f(c0119b.f2288a, this.f227a);
        View view = c0119b.f2291e;
        C0122e c0122e = dialogInterfaceC0123f.f2317f;
        if (view != null) {
            c0122e.f2306n = view;
        } else {
            CharSequence charSequence = c0119b.d;
            if (charSequence != null) {
                c0122e.d = charSequence;
                TextView textView = c0122e.f2304l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0119b.f2290c;
            if (drawable != null) {
                c0122e.f2302j = drawable;
                ImageView imageView = c0122e.f2303k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0122e.f2303k.setImageDrawable(drawable);
                }
            }
        }
        if (c0119b.f2293g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0119b.f2289b.inflate(c0122e.f2310r, (ViewGroup) null);
            int i = c0119b.i ? c0122e.f2311s : c0122e.f2312t;
            Object obj = c0119b.f2293g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0121d(c0119b.f2288a, i, R.id.text1, null);
            }
            c0122e.f2307o = r7;
            c0122e.f2308p = c0119b.f2294j;
            if (c0119b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0118a(c0119b, c0122e));
            }
            if (c0119b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0122e.f2299e = alertController$RecycleListView;
        }
        dialogInterfaceC0123f.setCancelable(true);
        dialogInterfaceC0123f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0123f.setOnCancelListener(null);
        dialogInterfaceC0123f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0159n dialogInterfaceOnKeyListenerC0159n = c0119b.f2292f;
        if (dialogInterfaceOnKeyListenerC0159n != null) {
            dialogInterfaceC0123f.setOnKeyListener(dialogInterfaceOnKeyListenerC0159n);
        }
        return dialogInterfaceC0123f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f228b).B(this.f227a);
        return true;
    }

    public int c() {
        if ((this.f227a & 128) != 0) {
            return ((int[]) this.f228b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f227a < ((ArrayList) this.f228b).size();
    }

    public void e(j jVar) {
        X0.e.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f227a) != 0) {
                f(i, ((int[]) jVar.f228b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f228b;
            if (i >= iArr.length) {
                return;
            }
            this.f227a = (1 << i) | this.f227a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f228b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0123f.i(context, 0);
        this.f228b = new C0119b(new ContextThemeWrapper(context, DialogInterfaceC0123f.i(context, i)));
        this.f227a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f227a = i;
        this.f228b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f228b = bottomSheetBehavior;
        this.f227a = i;
    }
}
