package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;
import defpackage.kt;
import defpackage.kx;
import defpackage.ss;
import defpackage.vs;
import defpackage.y5;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements kt, AbsListView.SelectionBoundsAdjuster {
    public vs f;
    public ImageView g;
    public RadioButton h;
    public TextView i;
    public CheckBox j;
    public TextView k;
    public ImageView l;
    public ImageView m;
    public LinearLayout n;
    public final Drawable o;
    public final int p;
    public final Context q;
    public boolean r;
    public final Drawable s;
    public final boolean t;
    public LayoutInflater u;
    public boolean v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y5 l = y5.l(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, kx.r);
        this.o = l.f(5);
        TypedArray typedArray = (TypedArray) l.a;
        this.p = typedArray.getResourceId(1, -1);
        this.r = typedArray.getBoolean(7, false);
        this.q = context;
        this.s = l.f(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.t = obtainStyledAttributes.hasValue(0);
        l.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.u == null) {
            this.u = LayoutInflater.from(getContext());
        }
        return this.u;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        rect.top = this.m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // defpackage.kt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(vs vsVar) {
        boolean z;
        String sb;
        boolean z2;
        this.f = vsVar;
        boolean isVisible = vsVar.isVisible();
        ss ssVar = vsVar.n;
        int i = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(vsVar.e);
        setCheckable(vsVar.isCheckable());
        if (ssVar.o()) {
            if ((ssVar.n() ? vsVar.j : vsVar.h) != 0) {
                z = true;
                ssVar.n();
                if (z) {
                    vs vsVar2 = this.f;
                    ss ssVar2 = vsVar2.n;
                    if (ssVar2.o()) {
                        if ((ssVar2.n() ? vsVar2.j : vsVar2.h) != 0) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.k;
                    vs vsVar3 = this.f;
                    ss ssVar3 = vsVar3.n;
                    Context context = ssVar3.a;
                    char c = ssVar3.n() ? vsVar3.j : vsVar3.h;
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = ssVar3.n() ? vsVar3.k : vsVar3.i;
                        vs.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        vs.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        vs.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        vs.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        vs.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        vs.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c != ' ') {
                            sb2.append(c);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.k.getVisibility() != i) {
                    this.k.setVisibility(i);
                }
                setIcon(vsVar.getIcon());
                setEnabled(vsVar.isEnabled());
                setSubMenuArrowVisible(vsVar.hasSubMenu());
                setContentDescription(vsVar.q);
            }
        }
        z = false;
        ssVar.n();
        if (z) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.k.getVisibility() != i) {
        }
        setIcon(vsVar.getIcon());
        setEnabled(vsVar.isEnabled());
        setSubMenuArrowVisible(vsVar.hasSubMenu());
        setContentDescription(vsVar.q);
    }

    @Override // defpackage.kt
    public vs getItemData() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.i = textView;
        int i = this.p;
        if (i != -1) {
            textView.setTextAppearance(this.q, i);
        }
        this.k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.s);
        }
        this.m = (ImageView) findViewById(R.id.group_divider);
        this.n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.g != null && this.r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.h == null && this.j == null) {
            return;
        }
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
            view = this.j;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
            view = this.h;
        }
        if (z) {
            compoundButton.setChecked(this.f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f.x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.j = checkBox;
                LinearLayout linearLayout2 = this.n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.j;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.v = z;
        this.r = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setVisibility((this.t || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        ss ssVar = this.f.n;
        boolean z = this.v;
        if (z || this.r) {
            ImageView imageView = this.g;
            if (imageView == null && drawable == null && !this.r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.g = imageView2;
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.r) {
                this.g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.g;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.i;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.i.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }
}
