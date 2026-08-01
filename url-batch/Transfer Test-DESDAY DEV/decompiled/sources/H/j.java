package H;

import L.t;
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
import g.C0100a;
import g.C0101b;
import g.C0103d;
import g.C0104e;
import g.DialogInterfaceC0105f;
import k.DialogInterfaceOnKeyListenerC0165n;

/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f235a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f236b;

    public j(Context context) {
        int i = DialogInterfaceC0105f.i(context, 0);
        this.f236b = new C0101b(new ContextThemeWrapper(context, DialogInterfaceC0105f.i(context, i)));
        this.f235a = i;
    }

    @Override // L.t
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f236b).B(this.f235a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0105f b() {
        C0101b c0101b = (C0101b) this.f236b;
        DialogInterfaceC0105f dialogInterfaceC0105f = new DialogInterfaceC0105f(c0101b.f2207a, this.f235a);
        View view = c0101b.f2210e;
        C0104e c0104e = dialogInterfaceC0105f.f2236f;
        if (view != null) {
            c0104e.f2225n = view;
        } else {
            CharSequence charSequence = c0101b.d;
            if (charSequence != null) {
                c0104e.d = charSequence;
                TextView textView = c0104e.f2223l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0101b.f2209c;
            if (drawable != null) {
                c0104e.f2221j = drawable;
                ImageView imageView = c0104e.f2222k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0104e.f2222k.setImageDrawable(drawable);
                }
            }
        }
        if (c0101b.f2212g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0101b.f2208b.inflate(c0104e.f2229r, (ViewGroup) null);
            int i = c0101b.i ? c0104e.f2230s : c0104e.f2231t;
            Object obj = c0101b.f2212g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0103d(c0101b.f2207a, i, R.id.text1, null);
            }
            c0104e.f2226o = r7;
            c0104e.f2227p = c0101b.f2213j;
            if (c0101b.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0100a(c0101b, c0104e));
            }
            if (c0101b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0104e.f2218e = alertController$RecycleListView;
        }
        dialogInterfaceC0105f.setCancelable(true);
        dialogInterfaceC0105f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0105f.setOnCancelListener(null);
        dialogInterfaceC0105f.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0165n dialogInterfaceOnKeyListenerC0165n = c0101b.f2211f;
        if (dialogInterfaceOnKeyListenerC0165n != null) {
            dialogInterfaceC0105f.setOnKeyListener(dialogInterfaceOnKeyListenerC0165n);
        }
        return dialogInterfaceC0105f;
    }

    public j(int i, k[] kVarArr) {
        this.f235a = i;
        this.f236b = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f236b = bottomSheetBehavior;
        this.f235a = i;
    }
}
