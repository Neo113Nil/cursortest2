package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g2 implements t0 {
    public int f;
    public final Object g;

    public g2(Context context) {
        int h = h2.h(context, 0);
        this.g = new c2(new ContextThemeWrapper(context, h2.h(context, h)));
        this.f = h;
    }

    @Override // defpackage.t0
    public boolean a(View view) {
        ((BottomSheetBehavior) this.g).E(this.f);
        return true;
    }

    public h2 b() {
        c2 c2Var = (c2) this.g;
        h2 h2Var = new h2(c2Var.a, this.f);
        View view = c2Var.e;
        f2 f2Var = h2Var.l;
        if (view != null) {
            f2Var.n = view;
        } else {
            CharSequence charSequence = c2Var.d;
            if (charSequence != null) {
                f2Var.d = charSequence;
                TextView textView = f2Var.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c2Var.c;
            if (drawable != null) {
                f2Var.j = drawable;
                ImageView imageView = f2Var.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    f2Var.k.setImageDrawable(drawable);
                }
            }
        }
        if (c2Var.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c2Var.b.inflate(f2Var.r, (ViewGroup) null);
            int i = c2Var.i ? f2Var.s : f2Var.t;
            ListAdapter listAdapter = c2Var.g;
            if (listAdapter == null) {
                listAdapter = new e2(c2Var.a, i, R.id.text1, null);
            }
            f2Var.o = listAdapter;
            f2Var.p = c2Var.j;
            if (c2Var.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new b2(c2Var, f2Var));
            }
            if (c2Var.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            f2Var.e = alertController$RecycleListView;
        }
        h2Var.setCancelable(true);
        h2Var.setCanceledOnTouchOutside(true);
        h2Var.setOnCancelListener(null);
        h2Var.setOnDismissListener(null);
        ts tsVar = c2Var.f;
        if (tsVar != null) {
            h2Var.setOnKeyListener(tsVar);
        }
        return h2Var;
    }

    public boolean c() {
        return this.f < ((ArrayList) this.g).size();
    }

    public g2() {
        this.f = 1;
        this.g = Collections.singletonList(null);
    }

    public g2(ArrayList arrayList, int i) {
        switch (i) {
            case 3:
                this.g = arrayList;
                break;
            default:
                this.f = 0;
                this.g = arrayList;
                break;
        }
    }

    public g2(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.g = bottomSheetBehavior;
        this.f = i;
    }
}
