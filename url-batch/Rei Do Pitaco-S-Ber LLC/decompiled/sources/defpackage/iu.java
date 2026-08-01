package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class iu extends FrameLayout implements eu {
    public final TextView f;
    public boolean g;
    public boolean h;
    public vs i;
    public ColorStateList j;

    public iu(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.f = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void a() {
        vs vsVar = this.i;
        if (vsVar != null) {
            setVisibility((!vsVar.isVisible() || (!this.g && this.h)) ? 8 : 0);
        }
    }

    @Override // defpackage.kt
    public final void c(vs vsVar) {
        this.i = vsVar;
        vsVar.setCheckable(false);
        this.f.setText(vsVar.e);
        a();
    }

    @Override // defpackage.kt
    public vs getItemData() {
        return this.i;
    }

    @Override // defpackage.eu
    public void setExpanded(boolean z) {
        this.g = z;
        a();
    }

    @Override // defpackage.eu
    public void setOnlyShowWhenExpanded(boolean z) {
        this.h = z;
        a();
    }

    public void setTextAppearance(int i) {
        TextView textView = this.f;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.j = colorStateList;
        if (colorStateList != null) {
            this.f.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
