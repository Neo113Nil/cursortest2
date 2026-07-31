package sg.bigo.ads.be;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.e;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes10.dex */
public abstract class a {

    @NonNull
    protected e.c a;

    @Nullable
    protected Map<String, Object> b;
    protected String c;
    protected String d;
    protected String e;
    protected int f;
    protected String[] g;
    protected Context h;
    protected View i;
    protected InterfaceC1847a j;

    /* renamed from: sg.bigo.ads.be.a$a, reason: collision with other inner class name */
    public interface InterfaceC1847a {
        void a(String str, String str2);
    }

    protected a(@NonNull e.c cVar, @Nullable Map<String, Object> map, @NonNull Context context, InterfaceC1847a interfaceC1847a) {
        this.h = context;
        this.a = cVar;
        this.b = map;
        this.d = cVar.a;
        this.e = cVar.d;
        this.f = cVar.b;
        this.g = cVar.c;
        this.j = interfaceC1847a;
    }

    protected static void a(TextView textView, @Nullable String str) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
    }

    public void a(int i) {
        int a = sg.bigo.ads.common.form.render.a.a();
        int b = sg.bigo.ads.common.form.render.a.b();
        boolean z = false;
        if (i != 2) {
            if (i == 3) {
                a = -45718;
                z = true;
            }
            a(a, b, z);
        }
        a = -16736769;
        b = a;
        a(a, b, z);
    }

    protected final void a(int i, int i2, boolean z) {
        View view = this.i;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.inter_form_edit_content);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(f.a(this.h, 1), i);
            gradientDrawable.setCornerRadius(f.a(this.h, 8));
            findViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.i.findViewById(R.id.inter_form_edit_warning);
        if (textView != null) {
            textView.setText(sg.bigo.ads.common.form.a.a(this.h, R.string.bigo_ad_form_warning));
            textView.setVisibility(z ? 0 : 8);
        }
        TextView textView2 = (TextView) this.i.findViewById(R.id.inter_form_edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    public final boolean a() {
        boolean a = r.a((CharSequence) this.c);
        if (this.a.b == 3) {
            a = !r.g(this.c);
        }
        a(a ? 3 : 1);
        return a;
    }

    public abstract View b();

    public final View c() {
        return this.i;
    }
}
