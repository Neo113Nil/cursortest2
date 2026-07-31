package com.my.target;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.common.menu.Menu;
import com.my.target.common.menu.MenuAction;
import com.my.target.k;
import com.my.target.o;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class k extends FrameLayout implements o.a {
    public final ListView a;
    public final View b;
    private final int c;
    private final int d;
    private final List e;
    private final String f;
    private final WeakReference g;
    public View h;
    private WeakReference i;
    private MenuAction j;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    interface b {
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class c implements b {
        final MenuAction a;

        c(MenuAction menuAction) {
            this.a = menuAction;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class d implements b {
        final String a;

        d(String str) {
            this.a = str;
        }
    }

    public k(Context context, List list, String str, WeakReference weakReference) {
        super(context);
        this.j = null;
        this.e = new ArrayList(list);
        this.f = str;
        this.g = weakReference;
        qi g = qi.g(context);
        this.c = g.b(500);
        this.d = g.a(0.5f);
        ListView listView = new ListView(context);
        this.a = listView;
        listView.setSelector(android.R.color.transparent);
        listView.setDivider(null);
        addView(listView);
        View view = new View(context);
        this.b = view;
        view.setBackgroundColor(-5131855);
        addView(view);
    }

    @Override // com.my.target.o.a
    public void a(o oVar, FrameLayout frameLayout) {
        frameLayout.addView(this, -1, -1);
        c();
    }

    @Override // com.my.target.o.a
    public void b(boolean z) {
    }

    public void c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 512.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setFillAfter(true);
        this.a.startAnimation(translateAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.o.a
    public void m() {
        MenuAction menuAction;
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            weakReference.clear();
            this.i = null;
            Menu.Listener listener = (Menu.Listener) this.g.get();
            if (listener == null || (menuAction = this.j) == null) {
                return;
            }
            listener.onActionClick(menuAction);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int measuredHeight;
        int max = Math.max((i3 - this.a.getMeasuredWidth()) / 2, getPaddingLeft());
        View view = this.h;
        if (view != null) {
            view.layout(max, (i4 - getPaddingBottom()) - this.h.getMeasuredHeight(), this.h.getMeasuredWidth() + max, i4 - getPaddingBottom());
            paddingBottom = this.h.getTop();
            measuredHeight = this.b.getMeasuredHeight();
        } else {
            paddingBottom = i4 - getPaddingBottom();
            measuredHeight = this.b.getMeasuredHeight();
        }
        int i5 = paddingBottom - measuredHeight;
        View view2 = this.b;
        view2.layout(max, i5, view2.getMeasuredWidth() + max, paddingBottom);
        this.a.layout(max, this.b.getTop() - this.a.getMeasuredHeight(), this.a.getMeasuredWidth() + max, this.b.getTop());
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = (Math.min(size, this.c) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        View view = this.h;
        if (view != null) {
            view.measure(makeMeasureSpec, paddingTop);
            i3 = this.h.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
        this.a.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((paddingTop - this.d) - i3, Integer.MIN_VALUE));
        setMeasuredDimension(size, size2);
    }

    public void b() {
        if (this.e.isEmpty() || (this.e.size() == 1 && ((MenuAction) this.e.get(0)).style == 1)) {
            mi.a("AdChoicesOptionsView: there are no actions. Can't open dialog");
            return;
        }
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final MenuAction menuAction = (MenuAction) it.next();
            if (menuAction.style != 0) {
                this.j = menuAction;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.k$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k.this.a(menuAction, view);
                    }
                };
                View a2 = a(onClickListener, getContext());
                this.h = a2;
                addView(a2);
                setOnClickListener(onClickListener);
                break;
            }
        }
        MenuAction menuAction2 = this.j;
        if (menuAction2 != null) {
            this.e.remove(menuAction2);
        }
        this.a.setAdapter((ListAdapter) new a(a(this.f, this.e), this.g));
        try {
            o a3 = o.a(this, getContext());
            this.i = new WeakReference(a3);
            a3.show();
        } catch (Throwable th) {
            th.printStackTrace();
            mi.b("AdChoicesOptionsController: Unable to start adchoices dialog");
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MenuAction menuAction, View view) {
        Menu.Listener listener = (Menu.Listener) this.g.get();
        if (listener == null) {
            mi.a("AdChoicesOptionsView: listener is null, can't call on action click.");
        } else {
            listener.onActionClick(menuAction);
        }
    }

    public void a() {
        o oVar;
        WeakReference weakReference = this.i;
        if (weakReference == null || (oVar = (o) weakReference.get()) == null) {
            return;
        }
        oVar.dismiss();
    }

    private View a(View.OnClickListener onClickListener, Context context) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setImageBitmap(a1.a(context));
        qi.a(imageButton, -1, -3158065);
        imageButton.setOnClickListener(onClickListener);
        return imageButton;
    }

    private List a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new d(str));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new c((MenuAction) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class a extends BaseAdapter {
        final List a;
        final WeakReference b;

        public a(List list, WeakReference weakReference) {
            this.a = list;
            this.b = weakReference;
        }

        private static Drawable a(qi qiVar, boolean z) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-3158065, -3158065});
            if (z) {
                float b = qiVar.b(8);
                float[] fArr = {b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f};
                gradientDrawable.setCornerRadii(fArr);
                gradientDrawable2.setCornerRadii(fArr);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
            int[] iArr = StateSet.WILD_CARD;
            stateListDrawable.addState(iArr, gradientDrawable);
            return new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, iArr}, new int[]{qi.a(-3158065), qi.a(-1)}), stateListDrawable, null);
        }

        private static Drawable b(qi qiVar, boolean z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            if (z) {
                float b = qiVar.b(8);
                gradientDrawable.setCornerRadii(new float[]{b, b, b, b, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            return gradientDrawable;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.a.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.my.target.k$a$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    k.a.this.a(i, view2);
                }
            };
            b bVar = (b) this.a.get(i);
            if (bVar instanceof c) {
                return a(((c) bVar).a.title, i == 0, viewGroup.getContext(), onClickListener);
            }
            if (bVar instanceof d) {
                return a(((d) bVar).a, i == 0, viewGroup.getContext());
            }
            mi.b("AdChoicesOptionsView: Unknown subtype of AdChoicesItem - " + bVar.getClass().getName());
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, View view) {
            if (i < 0 || i >= this.a.size()) {
                return;
            }
            b bVar = (b) this.a.get(i);
            Menu.Listener listener = (Menu.Listener) this.b.get();
            if (listener != null && (bVar instanceof c)) {
                listener.onActionClick(((c) bVar).a);
            }
        }

        public View a(String str, boolean z, Context context, View.OnClickListener onClickListener) {
            Button button = new Button(context);
            button.setOnClickListener(onClickListener);
            qi g = qi.g(context);
            int b = g.b(24);
            button.setPadding(b, button.getPaddingTop(), b, button.getPaddingBottom());
            button.setAllCaps(false);
            button.setStateListAnimator(null);
            button.setLines(1);
            button.setTextColor(-16777216);
            button.setEllipsize(TextUtils.TruncateAt.END);
            button.setTypeface(null, 0);
            button.setGravity(8388627);
            button.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            button.setBackground(a(g, z));
            button.setText(str);
            return button;
        }

        public View a(String str, boolean z, Context context) {
            TextView textView = new TextView(context);
            qi g = qi.g(context);
            int b = g.b(24);
            int b2 = g.b(14);
            int b3 = g.b(8);
            textView.setClickable(false);
            textView.setEnabled(false);
            textView.setPadding(b, b2, b, b3);
            textView.setTextColor(-9602939);
            textView.setTypeface(null, 0);
            textView.setTextSize(13.0f);
            textView.setGravity(8388611);
            textView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            textView.setBackground(b(g, z));
            textView.setText(str);
            return textView;
        }
    }
}
