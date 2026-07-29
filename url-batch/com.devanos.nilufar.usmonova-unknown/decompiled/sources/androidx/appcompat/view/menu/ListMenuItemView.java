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
import com.devanos.nilufar.usmonova.R;
import o.AbstractC1886sL;
import o.C0950e6;
import o.C1284jC;
import o.InterfaceC2273yC;
import o.MenuC0825cC;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC2273yC, AbsListView.SelectionBoundsAdjuster {
    public C1284jC h;
    public ImageView i;
    public RadioButton j;
    public TextView k;
    public CheckBox l;
    public TextView m;
    public ImageView n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f1o;
    public LinearLayout p;
    public final Drawable q;
    public final int r;
    public final Context s;
    public boolean t;
    public final Drawable u;
    public final boolean v;
    public LayoutInflater w;
    public boolean x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0950e6 F = C0950e6.F(getContext(), attributeSet, AbstractC1886sL.r, R.attr.listMenuViewStyle);
        this.q = F.x(5);
        TypedArray typedArray = (TypedArray) F.i;
        this.r = typedArray.getResourceId(1, -1);
        this.t = typedArray.getBoolean(7, false);
        this.s = context;
        this.u = F.x(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.v = obtainStyledAttributes.hasValue(0);
        F.L();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.w == null) {
            this.w = LayoutInflater.from(getContext());
        }
        return this.w;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // o.InterfaceC2273yC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C1284jC c1284jC) {
        boolean z;
        String sb;
        boolean z2;
        this.h = c1284jC;
        int i = 0;
        setVisibility(c1284jC.isVisible() ? 0 : 8);
        setTitle(c1284jC.e);
        setCheckable(c1284jC.isCheckable());
        if (c1284jC.n.o()) {
            if ((c1284jC.n.n() ? c1284jC.j : c1284jC.h) != 0) {
                z = true;
                c1284jC.n.n();
                if (z) {
                    C1284jC c1284jC2 = this.h;
                    if (c1284jC2.n.o()) {
                        if ((c1284jC2.n.n() ? c1284jC2.j : c1284jC2.h) != 0) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.m;
                    C1284jC c1284jC3 = this.h;
                    MenuC0825cC menuC0825cC = c1284jC3.n;
                    Context context = menuC0825cC.a;
                    char c = menuC0825cC.n() ? c1284jC3.j : c1284jC3.h;
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0825cC.n() ? c1284jC3.k : c1284jC3.i;
                        C1284jC.c(sb2, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                        C1284jC.c(sb2, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                        C1284jC.c(sb2, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                        C1284jC.c(sb2, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                        C1284jC.c(sb2, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                        C1284jC.c(sb2, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
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
                if (this.m.getVisibility() != i) {
                    this.m.setVisibility(i);
                }
                setIcon(c1284jC.getIcon());
                setEnabled(c1284jC.isEnabled());
                setSubMenuArrowVisible(c1284jC.hasSubMenu());
                setContentDescription(c1284jC.q);
            }
        }
        z = false;
        c1284jC.n.n();
        if (z) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.m.getVisibility() != i) {
        }
        setIcon(c1284jC.getIcon());
        setEnabled(c1284jC.isEnabled());
        setSubMenuArrowVisible(c1284jC.hasSubMenu());
        setContentDescription(c1284jC.q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1o.getLayoutParams();
        rect.top = this.f1o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // o.InterfaceC2273yC
    public C1284jC getItemData() {
        return this.h;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.q);
        TextView textView = (TextView) findViewById(R.id.title);
        this.k = textView;
        int i = this.r;
        if (i != -1) {
            textView.setTextAppearance(this.s, i);
        }
        this.m = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.u);
        }
        this.f1o = (ImageView) findViewById(R.id.group_divider);
        this.p = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.i != null && this.t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.i.getLayoutParams();
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
        if (!z && this.j == null && this.l == null) {
            return;
        }
        if ((this.h.x & 4) != 0) {
            if (this.j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.j = radioButton;
                LinearLayout linearLayout = this.p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.j;
            view = this.l;
        } else {
            if (this.l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.l = checkBox;
                LinearLayout linearLayout2 = this.p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.l;
            view = this.j;
        }
        if (z) {
            compoundButton.setChecked(this.h.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.l;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.j;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.h.x & 4) != 0) {
            if (this.j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.j = radioButton;
                LinearLayout linearLayout = this.p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.j;
        } else {
            if (this.l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.l = checkBox;
                LinearLayout linearLayout2 = this.p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.l;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.x = z;
        this.t = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1o;
        if (imageView != null) {
            imageView.setVisibility((this.v || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC0825cC menuC0825cC = this.h.n;
        boolean z = this.x;
        if (z || this.t) {
            ImageView imageView = this.i;
            if (imageView == null && drawable == null && !this.t) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.i = imageView2;
                LinearLayout linearLayout = this.p;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.t) {
                this.i.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.i;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.k.getVisibility() != 8) {
                this.k.setVisibility(8);
            }
        } else {
            this.k.setText(charSequence);
            if (this.k.getVisibility() != 0) {
                this.k.setVisibility(0);
            }
        }
    }
}
