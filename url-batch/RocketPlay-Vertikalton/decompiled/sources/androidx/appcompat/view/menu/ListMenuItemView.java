package androidx.appcompat.view.menu;

import K.C0019l;
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
import com.luckycounter.drinkwater.R;
import f.a;
import k.C0204o;
import k.InterfaceC0215z;
import k.MenuC0202m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0215z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0204o f1654a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1655b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1656c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1657e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1658f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1659g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1660j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1661k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1662l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1663m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1664n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1665o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1666p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1667q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0019l i = C0019l.i(getContext(), attributeSet, a.f2573r, R.attr.listMenuViewStyle);
        this.f1660j = i.c(5);
        TypedArray typedArray = (TypedArray) i.f684b;
        this.f1661k = typedArray.getResourceId(1, -1);
        this.f1663m = typedArray.getBoolean(7, false);
        this.f1662l = context;
        this.f1664n = i.c(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1665o = obtainStyledAttributes.hasValue(0);
        i.k();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1666p == null) {
            this.f1666p = LayoutInflater.from(getContext());
        }
        return this.f1666p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1659g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // k.InterfaceC0215z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0204o c0204o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1654a = c0204o;
        int i = 0;
        setVisibility(c0204o.isVisible() ? 0 : 8);
        setTitle(c0204o.f3217e);
        setCheckable(c0204o.isCheckable());
        if (c0204o.f3224n.o()) {
            if ((c0204o.f3224n.n() ? c0204o.f3220j : c0204o.h) != 0) {
                z2 = true;
                c0204o.f3224n.n();
                if (z2) {
                    C0204o c0204o2 = this.f1654a;
                    if (c0204o2.f3224n.o()) {
                        if ((c0204o2.f3224n.n() ? c0204o2.f3220j : c0204o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1658f;
                    C0204o c0204o3 = this.f1654a;
                    char c2 = c0204o3.f3224n.n() ? c0204o3.f3220j : c0204o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0202m menuC0202m = c0204o3.f3224n;
                        Resources resources = menuC0202m.f3187a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0202m.f3187a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0202m.n() ? c0204o3.f3221k : c0204o3.i;
                        C0204o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0204o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0204o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0204o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0204o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0204o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c2 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c2 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c2 != ' ') {
                            sb2.append(c2);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f1658f.getVisibility() != i) {
                    this.f1658f.setVisibility(i);
                }
                setIcon(c0204o.getIcon());
                setEnabled(c0204o.isEnabled());
                setSubMenuArrowVisible(c0204o.hasSubMenu());
                setContentDescription(c0204o.f3227q);
            }
        }
        z2 = false;
        c0204o.f3224n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1658f.getVisibility() != i) {
        }
        setIcon(c0204o.getIcon());
        setEnabled(c0204o.isEnabled());
        setSubMenuArrowVisible(c0204o.hasSubMenu());
        setContentDescription(c0204o.f3227q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // k.InterfaceC0215z
    public C0204o getItemData() {
        return this.f1654a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1660j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1661k;
        if (i != -1) {
            textView.setTextAppearance(this.f1662l, i);
        }
        this.f1658f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1659g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1664n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1655b != null && this.f1663m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1655b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1656c == null && this.f1657e == null) {
            return;
        }
        if ((this.f1654a.f3234x & 4) != 0) {
            if (this.f1656c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1656c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1656c;
            view = this.f1657e;
        } else {
            if (this.f1657e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1657e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1657e;
            view = this.f1656c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1654a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1657e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1656c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1654a.f3234x & 4) != 0) {
            if (this.f1656c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1656c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1656c;
        } else {
            if (this.f1657e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1657e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1657e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1667q = z2;
        this.f1663m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1665o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1654a.f3224n.getClass();
        boolean z2 = this.f1667q;
        if (z2 || this.f1663m) {
            ImageView imageView = this.f1655b;
            if (imageView == null && drawable == null && !this.f1663m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1655b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1663m) {
                this.f1655b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1655b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1655b.getVisibility() != 0) {
                this.f1655b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}
