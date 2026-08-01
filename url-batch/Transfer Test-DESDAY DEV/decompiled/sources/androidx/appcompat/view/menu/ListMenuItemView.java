package androidx.appcompat.view.menu;

import K.C0014m;
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
import com.football.transfertrivia.R;
import f.a;
import k.C0166o;
import k.InterfaceC0177z;
import k.MenuC0164m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0177z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public C0166o f1265a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1266b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f1267c;
    public TextView d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f1268e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f1269f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f1270g;
    public ImageView h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public final Drawable f1271j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1272k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f1273l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1274m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f1275n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1276o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f1277p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1278q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0014m i = C0014m.i(getContext(), attributeSet, a.f2151r, R.attr.listMenuViewStyle);
        this.f1271j = i.c(5);
        TypedArray typedArray = (TypedArray) i.f425b;
        this.f1272k = typedArray.getResourceId(1, -1);
        this.f1274m = typedArray.getBoolean(7, false);
        this.f1273l = context;
        this.f1275n = i.c(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1276o = obtainStyledAttributes.hasValue(0);
        i.k();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1277p == null) {
            this.f1277p = LayoutInflater.from(getContext());
        }
        return this.f1277p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1270g;
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
    @Override // k.InterfaceC0177z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0166o c0166o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1265a = c0166o;
        int i = 0;
        setVisibility(c0166o.isVisible() ? 0 : 8);
        setTitle(c0166o.f2786e);
        setCheckable(c0166o.isCheckable());
        if (c0166o.f2793n.o()) {
            if ((c0166o.f2793n.n() ? c0166o.f2789j : c0166o.h) != 0) {
                z2 = true;
                c0166o.f2793n.n();
                if (z2) {
                    C0166o c0166o2 = this.f1265a;
                    if (c0166o2.f2793n.o()) {
                        if ((c0166o2.f2793n.n() ? c0166o2.f2789j : c0166o2.h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1269f;
                    C0166o c0166o3 = this.f1265a;
                    char c2 = c0166o3.f2793n.n() ? c0166o3.f2789j : c0166o3.h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC0164m menuC0164m = c0166o3.f2793n;
                        Resources resources = menuC0164m.f2756a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC0164m.f2756a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC0164m.n() ? c0166o3.f2790k : c0166o3.i;
                        C0166o.c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C0166o.c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C0166o.c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C0166o.c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C0166o.c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C0166o.c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
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
                if (this.f1269f.getVisibility() != i) {
                    this.f1269f.setVisibility(i);
                }
                setIcon(c0166o.getIcon());
                setEnabled(c0166o.isEnabled());
                setSubMenuArrowVisible(c0166o.hasSubMenu());
                setContentDescription(c0166o.f2796q);
            }
        }
        z2 = false;
        c0166o.f2793n.n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1269f.getVisibility() != i) {
        }
        setIcon(c0166o.getIcon());
        setEnabled(c0166o.isEnabled());
        setSubMenuArrowVisible(c0166o.hasSubMenu());
        setContentDescription(c0166o.f2796q);
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

    @Override // k.InterfaceC0177z
    public C0166o getItemData() {
        return this.f1265a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1271j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.f1272k;
        if (i != -1) {
            textView.setTextAppearance(this.f1273l, i);
        }
        this.f1269f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1270g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1275n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1266b != null && this.f1274m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1266b.getLayoutParams();
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
        if (!z2 && this.f1267c == null && this.f1268e == null) {
            return;
        }
        if ((this.f1265a.f2803x & 4) != 0) {
            if (this.f1267c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1267c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1267c;
            view = this.f1268e;
        } else {
            if (this.f1268e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1268e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1268e;
            view = this.f1267c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1265a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1268e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1267c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1265a.f2803x & 4) != 0) {
            if (this.f1267c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1267c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1267c;
        } else {
            if (this.f1268e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1268e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1268e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1278q = z2;
        this.f1274m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.f1276o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1265a.f2793n.getClass();
        boolean z2 = this.f1278q;
        if (z2 || this.f1274m) {
            ImageView imageView = this.f1266b;
            if (imageView == null && drawable == null && !this.f1274m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1266b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1274m) {
                this.f1266b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1266b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1266b.getVisibility() != 0) {
                this.f1266b.setVisibility(0);
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
