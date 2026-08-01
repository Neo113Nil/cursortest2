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
import g.C0130a;
import g.C0131b;
import g.C0133d;
import g.C0134e;
import g.DialogInterfaceC0135f;
import java.util.ArrayList;
import k.DialogInterfaceOnKeyListenerC0169n;

/* loaded from: classes.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public int f220a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f221b;

    public j() {
        this.f221b = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0135f a() {
        C0131b c0131b = (C0131b) this.f221b;
        DialogInterfaceC0135f dialogInterfaceC0135f = new DialogInterfaceC0135f(c0131b.f2294a, this.f220a);
        View view = c0131b.f2297e;
        C0134e c0134e = dialogInterfaceC0135f.f2323f;
        if (view != null) {
            c0134e.f2312n = view;
        } else {
            CharSequence charSequence = c0131b.d;
            if (charSequence != null) {
                c0134e.d = charSequence;
                TextView textView = c0134e.f2310l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0131b.f2296c;
            if (drawable != null) {
                c0134e.f2308j = drawable;
                ImageView imageView = c0134e.f2309k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0134e.f2309k.setImageDrawable(drawable);
                }
            }
        }
        if (c0131b.f2299g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0131b.f2295b.inflate(c0134e.f2316r, (ViewGroup) null);
            int i = c0131b.i ? c0134e.f2317s : c0134e.f2318t;
            Object obj = c0131b.f2299g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0133d(c0131b.f2294a, i, R.id.text1, null);
            }
            c0134e.f2313o = r7;
            c0134e.f2314p = c0131b.f2300j;
            if (c0131b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0130a(c0131b, c0134e));
            }
            if (c0131b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0134e.f2305e = alertController$RecycleListView;
        }
        dialogInterfaceC0135f.setCancelable(true);
        dialogInterfaceC0135f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0135f.setOnCancelListener(null);
        dialogInterfaceC0135f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0169n dialogInterfaceOnKeyListenerC0169n = c0131b.f2298f;
        if (dialogInterfaceOnKeyListenerC0169n != null) {
            dialogInterfaceC0135f.setOnKeyListener(dialogInterfaceOnKeyListenerC0169n);
        }
        return dialogInterfaceC0135f;
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f221b).B(this.f220a);
        return true;
    }

    public int c() {
        if ((this.f220a & 128) != 0) {
            return ((int[]) this.f221b)[7];
        }
        return 65535;
    }

    public boolean d() {
        return this.f220a < ((ArrayList) this.f221b).size();
    }

    public void e(j jVar) {
        X0.d.e(jVar, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & jVar.f220a) != 0) {
                f(i, ((int[]) jVar.f221b)[i]);
            }
        }
    }

    public void f(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f221b;
            if (i >= iArr.length) {
                return;
            }
            this.f220a = (1 << i) | this.f220a;
            iArr[i] = i2;
        }
    }

    public j(ArrayList arrayList) {
        this.f221b = arrayList;
    }

    public j(Context context) {
        int i = DialogInterfaceC0135f.i(context, 0);
        this.f221b = new C0131b(new ContextThemeWrapper(context, DialogInterfaceC0135f.i(context, i)));
        this.f220a = i;
    }

    public j(int i, k[] kVarArr) {
        this.f220a = i;
        this.f221b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f221b = bottomSheetBehavior;
        this.f220a = i;
    }
}
