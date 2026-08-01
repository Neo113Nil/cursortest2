package com.ionia.reidopitaco.libya;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.ionia.reidopitaco.libya.MainActivity2;
import defpackage.b3;
import defpackage.br;
import defpackage.bw;
import defpackage.cr;
import defpackage.dg;
import defpackage.g20;
import defpackage.h;
import defpackage.hr;
import defpackage.i20;
import defpackage.ja;
import defpackage.k7;
import defpackage.ko;
import defpackage.l8;
import defpackage.lo;
import defpackage.m80;
import defpackage.oe;
import defpackage.oo;
import defpackage.ua;
import defpackage.va;
import defpackage.vv;
import defpackage.wa;
import defpackage.y5;
import defpackage.z80;
import defpackage.zq;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class MainActivity2 extends b3 {
    public static final List O = va.V("#FF6B6B", "#4ECDC4", "#45B7D1", "#96CEB4", "#FFBE0B", "#C77DFF");
    public static final List P = va.V("🏃", "💪", "📚", "🧘", "💤", "🥗", "💧", "🎯", "🎨", "🎵", "🌿", "🧹", "🛁", "🏋️", "✍️", "📝", "🌅", "🍎");
    public y5 F;
    public m80 G;
    public z80 H;
    public y5 I;
    public final ArrayList J = new ArrayList();
    public List K;
    public SharedPreferences L;
    public br M;
    public br N;

    public static void q(TextView textView, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i);
        ofInt.setDuration(600L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new dg(1, textView));
        ofInt.start();
    }

    public static ArrayList v() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        ko koVar = new ko(6, 0, -1);
        ArrayList arrayList = new ArrayList(wa.Y(koVar));
        Iterator it = koVar.iterator();
        while (true) {
            lo loVar = (lo) it;
            boolean z = loVar.h;
            if (!z) {
                return arrayList;
            }
            int i = loVar.i;
            if (i != loVar.g) {
                loVar.i = loVar.f + i;
            } else {
                if (!z) {
                    throw new NoSuchElementException();
                }
                loVar.h = false;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, -i);
            arrayList.add(simpleDateFormat.format(calendar.getTime()));
        }
    }

    public static void w(cr crVar) {
        List asList;
        LinkedHashSet linkedHashSet = crVar.e;
        int i = 0;
        if (linkedHashSet.isEmpty()) {
            crVar.f = 0;
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String a = oo.a();
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        String format = simpleDateFormat.format(calendar.getTime());
        if (linkedHashSet.size() <= 1) {
            asList = ua.c0(linkedHashSet);
        } else {
            Object[] array = linkedHashSet.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            array.getClass();
            asList = Arrays.asList(array);
            asList.getClass();
        }
        String str = (String) ua.b0(asList);
        if (!oo.b(str, a) && !oo.b(str, format)) {
            crVar.f = 0;
            return;
        }
        Calendar calendar2 = Calendar.getInstance();
        if (oo.b(str, format)) {
            calendar2.add(6, -1);
        }
        while (linkedHashSet.contains(simpleDateFormat.format(calendar2.getTime()))) {
            i++;
            calendar2.add(6, -1);
        }
        crVar.f = i;
        if (i > crVar.g) {
            crVar.g = i;
        }
    }

    @Override // defpackage.b3, defpackage.pb, defpackage.ob, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
        int i = R.id.bottomNav;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) vv.o(inflate, R.id.bottomNav);
        if (bottomNavigationView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) vv.o(inflate, R.id.container);
            if (frameLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.F = new y5(constraintLayout, bottomNavigationView, frameLayout);
                setContentView(constraintLayout);
                SharedPreferences sharedPreferences = getSharedPreferences("win_habit_tracker", 0);
                sharedPreferences.getClass();
                this.L = sharedPreferences;
                this.K = va.V(new zq(R.string.ach_first_habit_title, R.string.ach_first_habit_desc, "first_habit", "🌱"), new zq(R.string.ach_first_done_title, R.string.ach_first_done_desc, "first_done", "✅"), new zq(R.string.ach_streak_3_title, R.string.ach_streak_3_desc, "streak_3", "🔥"), new zq(R.string.ach_streak_7_title, R.string.ach_streak_7_desc, "streak_7", "💪"), new zq(R.string.ach_streak_14_title, R.string.ach_streak_14_desc, "streak_14", "🌙"), new zq(R.string.ach_streak_30_title, R.string.ach_streak_30_desc, "streak_30", "🏆"), new zq(R.string.ach_habits_3_title, R.string.ach_habits_3_desc, "habits_3", "📚"), new zq(R.string.ach_habits_5_title, R.string.ach_habits_5_desc, "habits_5", "🌟"), new zq(R.string.ach_total_10_title, R.string.ach_total_10_desc, "total_10", "🎯"), new zq(R.string.ach_total_50_title, R.string.ach_total_50_desc, "total_50", "💎"), new zq(R.string.ach_total_100_title, R.string.ach_total_100_desc, "total_100", "💯"), new zq(R.string.ach_perfect_day_title, R.string.ach_perfect_day_desc, "perfect_day", "⭐"));
                SharedPreferences sharedPreferences2 = this.L;
                if (sharedPreferences2 == null) {
                    oo.P("prefs");
                    throw null;
                }
                String string = sharedPreferences2.getString("achievements_json", "{}");
                JSONObject jSONObject = new JSONObject(string != null ? string : "{}");
                List<zq> list = this.K;
                if (list == null) {
                    oo.P("achievements");
                    throw null;
                }
                for (zq zqVar : list) {
                    if (jSONObject.optBoolean(zqVar.a, false)) {
                        zqVar.e = true;
                        zqVar.f = jSONObject.optString(zqVar.a.concat("_date"), null);
                    }
                }
                SharedPreferences sharedPreferences3 = this.L;
                if (sharedPreferences3 == null) {
                    oo.P("prefs");
                    throw null;
                }
                String string2 = sharedPreferences3.getString("habits_json", "[]");
                JSONArray jSONArray = new JSONArray(string2 != null ? string2 : "[]");
                ArrayList arrayList = this.J;
                arrayList.clear();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("dates");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        String string3 = jSONArray2.getString(i3);
                        string3.getClass();
                        linkedHashSet.add(string3);
                    }
                    String string4 = jSONObject2.getString("id");
                    string4.getClass();
                    String string5 = jSONObject2.getString("name");
                    string5.getClass();
                    String string6 = jSONObject2.getString("emoji");
                    string6.getClass();
                    String string7 = jSONObject2.getString("colorHex");
                    string7.getClass();
                    arrayList.add(new cr(string4, string5, string6, string7, linkedHashSet, jSONObject2.optInt("currentStreak", 0), jSONObject2.optInt("bestStreak", 0)));
                }
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    w((cr) obj);
                }
                LayoutInflater layoutInflater = getLayoutInflater();
                y5 y5Var = this.F;
                if (y5Var == null) {
                    oo.P("binding");
                    throw null;
                }
                View inflate2 = layoutInflater.inflate(R.layout.view_habits, (ViewGroup) y5Var.c, false);
                int i5 = R.id.emptyState;
                LinearLayout linearLayout = (LinearLayout) vv.o(inflate2, R.id.emptyState);
                if (linearLayout != null) {
                    i5 = R.id.fabAdd;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) vv.o(inflate2, R.id.fabAdd);
                    if (floatingActionButton != null) {
                        i5 = R.id.headerSection;
                        if (((LinearLayout) vv.o(inflate2, R.id.headerSection)) != null) {
                            i5 = R.id.progressToday;
                            ProgressBar progressBar = (ProgressBar) vv.o(inflate2, R.id.progressToday);
                            if (progressBar != null) {
                                i5 = R.id.recyclerHabits;
                                RecyclerView recyclerView = (RecyclerView) vv.o(inflate2, R.id.recyclerHabits);
                                if (recyclerView != null) {
                                    i5 = R.id.tvDate;
                                    TextView textView = (TextView) vv.o(inflate2, R.id.tvDate);
                                    if (textView != null) {
                                        i5 = R.id.tvGreeting;
                                        TextView textView2 = (TextView) vv.o(inflate2, R.id.tvGreeting);
                                        if (textView2 != null) {
                                            i5 = R.id.tvProgress;
                                            TextView textView3 = (TextView) vv.o(inflate2, R.id.tvProgress);
                                            if (textView3 != null) {
                                                i5 = R.id.tvProgressPercent;
                                                TextView textView4 = (TextView) vv.o(inflate2, R.id.tvProgressPercent);
                                                if (textView4 != null) {
                                                    this.G = new m80((ConstraintLayout) inflate2, linearLayout, floatingActionButton, progressBar, recyclerView, textView, textView2, textView3, textView4);
                                                    LayoutInflater layoutInflater2 = getLayoutInflater();
                                                    y5 y5Var2 = this.F;
                                                    if (y5Var2 == null) {
                                                        oo.P("binding");
                                                        throw null;
                                                    }
                                                    View inflate3 = layoutInflater2.inflate(R.layout.view_stats, (ViewGroup) y5Var2.c, false);
                                                    int i6 = R.id.habitStatsContainer;
                                                    LinearLayout linearLayout2 = (LinearLayout) vv.o(inflate3, R.id.habitStatsContainer);
                                                    if (linearLayout2 != null) {
                                                        i6 = R.id.tvBestStreak;
                                                        TextView textView5 = (TextView) vv.o(inflate3, R.id.tvBestStreak);
                                                        if (textView5 != null) {
                                                            i6 = R.id.tvCurrentStreak;
                                                            TextView textView6 = (TextView) vv.o(inflate3, R.id.tvCurrentStreak);
                                                            if (textView6 != null) {
                                                                i6 = R.id.tvHabitsCount;
                                                                TextView textView7 = (TextView) vv.o(inflate3, R.id.tvHabitsCount);
                                                                if (textView7 != null) {
                                                                    i6 = R.id.tvTotalCompletions;
                                                                    TextView textView8 = (TextView) vv.o(inflate3, R.id.tvTotalCompletions);
                                                                    if (textView8 != null) {
                                                                        i6 = R.id.weekContainer;
                                                                        LinearLayout linearLayout3 = (LinearLayout) vv.o(inflate3, R.id.weekContainer);
                                                                        if (linearLayout3 != null) {
                                                                            this.H = new z80((ScrollView) inflate3, linearLayout2, textView5, textView6, textView7, textView8, linearLayout3);
                                                                            LayoutInflater layoutInflater3 = getLayoutInflater();
                                                                            y5 y5Var3 = this.F;
                                                                            if (y5Var3 == null) {
                                                                                oo.P("binding");
                                                                                throw null;
                                                                            }
                                                                            View inflate4 = layoutInflater3.inflate(R.layout.view_achievements, (ViewGroup) y5Var3.c, false);
                                                                            int i7 = R.id.achievementsHeader;
                                                                            if (((LinearLayout) vv.o(inflate4, R.id.achievementsHeader)) != null) {
                                                                                i7 = R.id.recyclerAchievements;
                                                                                RecyclerView recyclerView2 = (RecyclerView) vv.o(inflate4, R.id.recyclerAchievements);
                                                                                if (recyclerView2 != null) {
                                                                                    i7 = R.id.tvUnlockedCount;
                                                                                    TextView textView9 = (TextView) vv.o(inflate4, R.id.tvUnlockedCount);
                                                                                    if (textView9 != null) {
                                                                                        this.I = new y5((ConstraintLayout) inflate4, recyclerView2, textView9);
                                                                                        y5 y5Var4 = this.F;
                                                                                        if (y5Var4 == null) {
                                                                                            oo.P("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        FrameLayout frameLayout2 = (FrameLayout) y5Var4.c;
                                                                                        m80 m80Var = this.G;
                                                                                        if (m80Var == null) {
                                                                                            oo.P("habitsBinding");
                                                                                            throw null;
                                                                                        }
                                                                                        frameLayout2.addView(m80Var.a);
                                                                                        y5 y5Var5 = this.F;
                                                                                        if (y5Var5 == null) {
                                                                                            oo.P("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        FrameLayout frameLayout3 = (FrameLayout) y5Var5.c;
                                                                                        z80 z80Var = this.H;
                                                                                        if (z80Var == null) {
                                                                                            oo.P("statsBinding");
                                                                                            throw null;
                                                                                        }
                                                                                        frameLayout3.addView(z80Var.a);
                                                                                        y5 y5Var6 = this.F;
                                                                                        if (y5Var6 == null) {
                                                                                            oo.P("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        FrameLayout frameLayout4 = (FrameLayout) y5Var6.c;
                                                                                        y5 y5Var7 = this.I;
                                                                                        if (y5Var7 == null) {
                                                                                            oo.P("achievementsBinding");
                                                                                            throw null;
                                                                                        }
                                                                                        frameLayout4.addView((ConstraintLayout) y5Var7.a);
                                                                                        this.M = new br(this, 1);
                                                                                        m80 m80Var2 = this.G;
                                                                                        if (m80Var2 == null) {
                                                                                            oo.P("habitsBinding");
                                                                                            throw null;
                                                                                        }
                                                                                        RecyclerView recyclerView3 = m80Var2.e;
                                                                                        recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                                                                        br brVar = this.M;
                                                                                        if (brVar == null) {
                                                                                            oo.P("habitAdapter");
                                                                                            throw null;
                                                                                        }
                                                                                        recyclerView3.setAdapter(brVar);
                                                                                        int i8 = 0;
                                                                                        recyclerView3.setHasFixedSize(false);
                                                                                        m80 m80Var3 = this.G;
                                                                                        if (m80Var3 == null) {
                                                                                            oo.P("habitsBinding");
                                                                                            throw null;
                                                                                        }
                                                                                        m80Var3.c.setOnClickListener(new ja(2, this));
                                                                                        x();
                                                                                        this.N = new br(this, i8);
                                                                                        y5 y5Var8 = this.I;
                                                                                        if (y5Var8 == null) {
                                                                                            oo.P("achievementsBinding");
                                                                                            throw null;
                                                                                        }
                                                                                        RecyclerView recyclerView4 = (RecyclerView) y5Var8.b;
                                                                                        recyclerView4.setLayoutManager(new GridLayoutManager());
                                                                                        br brVar2 = this.N;
                                                                                        if (brVar2 == null) {
                                                                                            oo.P("achievementAdapter");
                                                                                            throw null;
                                                                                        }
                                                                                        recyclerView4.setAdapter(brVar2);
                                                                                        recyclerView4.setHasFixedSize(false);
                                                                                        y5 y5Var9 = this.F;
                                                                                        if (y5Var9 == null) {
                                                                                            oo.P("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        ((BottomNavigationView) y5Var9.b).setOnItemSelectedListener(new h(2, this));
                                                                                        z(0);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                            throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i7)));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i6)));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i5)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void r() {
        Integer valueOf;
        int i;
        ViewGroup viewGroup;
        String a = oo.a();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i2 += ((cr) obj).e.size();
        }
        Iterator it = this.J.iterator();
        if (it.hasNext()) {
            valueOf = Integer.valueOf(((cr) it.next()).g);
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((cr) it.next()).g);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        ArrayList arrayList2 = this.J;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            i = 0;
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                if (((cr) obj2).e.contains(a) && (i = i + 1) < 0) {
                    va.W();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        bw[] bwVarArr = {new bw("first_habit", Boolean.valueOf(!this.J.isEmpty())), new bw("first_done", Boolean.valueOf(i2 >= 1)), new bw("streak_3", Boolean.valueOf(intValue >= 3)), new bw("streak_7", Boolean.valueOf(intValue >= 7)), new bw("streak_14", Boolean.valueOf(intValue >= 14)), new bw("streak_30", Boolean.valueOf(intValue >= 30)), new bw("habits_3", Boolean.valueOf(this.J.size() >= 3)), new bw("habits_5", Boolean.valueOf(this.J.size() >= 5)), new bw("total_10", Boolean.valueOf(i2 >= 10)), new bw("total_50", Boolean.valueOf(i2 >= 50)), new bw("total_100", Boolean.valueOf(i2 >= 100)), new bw("perfect_day", Boolean.valueOf(!this.J.isEmpty() && i == this.J.size()))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(hr.g0(12));
        for (int i5 = 0; i5 < 12; i5++) {
            bw bwVar = bwVarArr[i5];
            linkedHashMap.put(bwVar.f, bwVar.g);
        }
        List<zq> list = this.K;
        if (list == null) {
            oo.P("achievements");
            throw null;
        }
        boolean z = false;
        for (zq zqVar : list) {
            if (!zqVar.e && oo.b(linkedHashMap.get(zqVar.a), Boolean.TRUE)) {
                zqVar.e = true;
                zqVar.f = a;
                String str = zqVar.b + " " + getString(zqVar.c) + " — " + getString(R.string.achievement_unlocked);
                y5 y5Var = this.F;
                if (y5Var == null) {
                    oo.P("binding");
                    throw null;
                }
                View view = (ConstraintLayout) y5Var.a;
                int[] iArr = g20.A;
                ViewGroup viewGroup2 = null;
                while (true) {
                    if (view instanceof CoordinatorLayout) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    if (view instanceof FrameLayout) {
                        if (view.getId() == 16908290) {
                            viewGroup = (ViewGroup) view;
                            break;
                        }
                        viewGroup2 = (ViewGroup) view;
                    }
                    if (view != null) {
                        Object parent = view.getParent();
                        view = parent instanceof View ? (View) parent : null;
                    }
                    if (view == null) {
                        viewGroup = viewGroup2;
                        break;
                    }
                }
                if (viewGroup == null) {
                    l8.l("No suitable parent found from the given view. Please provide a valid view.");
                    return;
                }
                Context context = viewGroup.getContext();
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(g20.A);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                obtainStyledAttributes.recycle();
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
                g20 g20Var = new g20(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                ((SnackbarContentLayout) g20Var.i.getChildAt(0)).getMessageView().setText(str);
                g20Var.i.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.colorPrimaryDark)));
                ((SnackbarContentLayout) g20Var.i.getChildAt(0)).getMessageView().setTextColor(-1);
                oe o = oe.o();
                int recommendedTimeoutMillis = Build.VERSION.SDK_INT >= 29 ? g20Var.z.getRecommendedTimeoutMillis(0, 3) : 0;
                k7 k7Var = g20Var.s;
                synchronized (o.f) {
                    try {
                        if (o.q(k7Var)) {
                            i20 i20Var = (i20) o.h;
                            i20Var.b = recommendedTimeoutMillis;
                            ((Handler) o.g).removeCallbacksAndMessages(i20Var);
                            o.z((i20) o.h);
                        } else {
                            i20 i20Var2 = (i20) o.i;
                            if (i20Var2 != null && i20Var2.a.get() == k7Var) {
                                ((i20) o.i).b = recommendedTimeoutMillis;
                            } else {
                                o.i = new i20(recommendedTimeoutMillis, k7Var);
                            }
                            i20 i20Var3 = (i20) o.h;
                            if (i20Var3 == null || !o.e(i20Var3, 4)) {
                                o.h = null;
                                o.A();
                            }
                        }
                    } finally {
                    }
                }
                z = true;
            }
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            List<zq> list2 = this.K;
            if (list2 == null) {
                oo.P("achievements");
                throw null;
            }
            for (zq zqVar2 : list2) {
                boolean z2 = zqVar2.e;
                String str2 = zqVar2.a;
                if (z2) {
                    jSONObject.put(str2, true);
                    String str3 = zqVar2.f;
                    if (str3 != null) {
                        jSONObject.put(str2.concat("_date"), str3);
                    }
                }
            }
            SharedPreferences sharedPreferences = this.L;
            if (sharedPreferences == null) {
                oo.P("prefs");
                throw null;
            }
            sharedPreferences.edit().putString("achievements_json", jSONObject.toString()).apply();
        }
    }

    public final int s(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public final void t(LinearLayout linearLayout, int i) {
        int i2;
        int childCount = linearLayout.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = linearLayout.getChildAt(i3);
            Object tag = childAt.getTag();
            String str = tag instanceof String ? (String) tag : null;
            if (str != null) {
                try {
                    i2 = Color.parseColor(str);
                } catch (Exception unused) {
                    i2 = -7829368;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(i2);
                if (i3 == i) {
                    gradientDrawable.setStroke(s(3), -1);
                }
                childAt.setBackground(gradientDrawable);
                float f = i3 == i ? 1.12f : 1.0f;
                childAt.animate().scaleX(f).scaleY(f).setDuration(150L).start();
            }
            i3++;
        }
    }

    public final void u(LinearLayout linearLayout, int i) {
        int childCount = linearLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            linearLayout.getChildAt(i2).setBackground(getDrawable(i2 == i ? R.drawable.bg_emoji_selected : R.drawable.bg_emoji_normal));
            i2++;
        }
    }

    public final void x() {
        int i;
        String string;
        String a = oo.a();
        ArrayList arrayList = this.J;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((cr) obj).e.contains(a) && (i = i + 1) < 0) {
                    va.W();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        int size2 = arrayList.size();
        m80 m80Var = this.G;
        if (m80Var == null) {
            oo.P("habitsBinding");
            throw null;
        }
        TextView textView = m80Var.g;
        int i3 = Calendar.getInstance().get(11);
        if (i3 < 6) {
            string = getString(R.string.greeting_night);
            string.getClass();
        } else if (i3 < 12) {
            string = getString(R.string.greeting_morning);
            string.getClass();
        } else if (i3 < 17) {
            string = getString(R.string.greeting_afternoon);
            string.getClass();
        } else if (i3 < 22) {
            string = getString(R.string.greeting_evening);
            string.getClass();
        } else {
            string = getString(R.string.greeting_night);
            string.getClass();
        }
        textView.setText(string);
        m80 m80Var2 = this.G;
        if (m80Var2 == null) {
            oo.P("habitsBinding");
            throw null;
        }
        TextView textView2 = m80Var2.f;
        String format = new SimpleDateFormat("EEEE, d MMMM", new Locale("ru")).format(new Date());
        format.getClass();
        if (format.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(format.charAt(0));
            valueOf.getClass();
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(format.substring(1));
            format = sb.toString();
        }
        textView2.setText(format);
        m80 m80Var3 = this.G;
        if (m80Var3 == null) {
            oo.P("habitsBinding");
            throw null;
        }
        m80Var3.h.setText(i + " / " + size2);
        int i4 = size2 > 0 ? (i * 100) / size2 : 0;
        m80 m80Var4 = this.G;
        if (m80Var4 == null) {
            oo.P("habitsBinding");
            throw null;
        }
        m80Var4.i.setText(i4 + "%");
        m80 m80Var5 = this.G;
        if (m80Var5 == null) {
            oo.P("habitsBinding");
            throw null;
        }
        ProgressBar progressBar = m80Var5.d;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), i4);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
        m80 m80Var6 = this.G;
        if (m80Var6 == null) {
            oo.P("habitsBinding");
            throw null;
        }
        m80Var6.b.setVisibility(arrayList.isEmpty() ? 0 : 8);
        m80 m80Var7 = this.G;
        if (m80Var7 == null) {
            oo.P("habitsBinding");
            throw null;
        }
        m80Var7.e.setVisibility(arrayList.isEmpty() ? 8 : 0);
        br brVar = this.M;
        if (brVar != null) {
            brVar.a.b();
        } else {
            oo.P("habitAdapter");
            throw null;
        }
    }

    public final void y() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cr crVar = (cr) obj;
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = crVar.e.iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", crVar.a);
            jSONObject.put("name", crVar.b);
            jSONObject.put("emoji", crVar.c);
            jSONObject.put("colorHex", crVar.d);
            jSONObject.put("currentStreak", crVar.f);
            jSONObject.put("bestStreak", crVar.g);
            jSONObject.put("dates", jSONArray2);
            jSONArray.put(jSONObject);
        }
        SharedPreferences sharedPreferences = this.L;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("habits_json", jSONArray.toString()).apply();
        } else {
            oo.P("prefs");
            throw null;
        }
    }

    public final void z(int i) {
        Integer valueOf;
        Integer valueOf2;
        int i2;
        int i3;
        int i4;
        int i5;
        m80 m80Var = this.G;
        Throwable th = null;
        if (m80Var == null) {
            oo.P("habitsBinding");
            throw null;
        }
        m80Var.a.setVisibility(i == 0 ? 0 : 8);
        z80 z80Var = this.H;
        String str = "statsBinding";
        if (z80Var == null) {
            oo.P("statsBinding");
            throw null;
        }
        int i6 = 1;
        z80Var.a.setVisibility(i == 1 ? 0 : 8);
        y5 y5Var = this.I;
        if (y5Var == null) {
            oo.P("achievementsBinding");
            throw null;
        }
        ((ConstraintLayout) y5Var.a).setVisibility(i == 2 ? 0 : 8);
        if (i != 1) {
            if (i != 2) {
                return;
            }
            List list = this.K;
            if (list == null) {
                oo.P("achievements");
                throw null;
            }
            if (list.isEmpty()) {
                i5 = 0;
            } else {
                Iterator it = list.iterator();
                i5 = 0;
                while (it.hasNext()) {
                    if (((zq) it.next()).e && (i5 = i5 + 1) < 0) {
                        va.W();
                        throw null;
                    }
                }
            }
            y5 y5Var2 = this.I;
            if (y5Var2 == null) {
                oo.P("achievementsBinding");
                throw null;
            }
            TextView textView = (TextView) y5Var2.c;
            Integer valueOf3 = Integer.valueOf(i5);
            List list2 = this.K;
            if (list2 == null) {
                oo.P("achievements");
                throw null;
            }
            textView.setText(getString(R.string.unlocked_count, valueOf3, Integer.valueOf(list2.size())));
            br brVar = this.N;
            if (brVar != null) {
                brVar.a.b();
                return;
            } else {
                oo.P("achievementAdapter");
                throw null;
            }
        }
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            i7 += ((cr) obj).e.size();
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            valueOf = Integer.valueOf(((cr) it2.next()).g);
            while (it2.hasNext()) {
                Integer valueOf4 = Integer.valueOf(((cr) it2.next()).g);
                if (valueOf.compareTo(valueOf4) < 0) {
                    valueOf = valueOf4;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            valueOf2 = Integer.valueOf(((cr) it3.next()).f);
            while (it3.hasNext()) {
                Integer valueOf5 = Integer.valueOf(((cr) it3.next()).f);
                if (valueOf2.compareTo(valueOf5) < 0) {
                    valueOf2 = valueOf5;
                }
            }
        } else {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
        z80 z80Var2 = this.H;
        if (z80Var2 == null) {
            oo.P("statsBinding");
            throw null;
        }
        q(z80Var2.f, i7);
        z80 z80Var3 = this.H;
        if (z80Var3 == null) {
            oo.P("statsBinding");
            throw null;
        }
        q(z80Var3.c, intValue);
        z80 z80Var4 = this.H;
        if (z80Var4 == null) {
            oo.P("statsBinding");
            throw null;
        }
        q(z80Var4.d, intValue2);
        z80 z80Var5 = this.H;
        if (z80Var5 == null) {
            oo.P("statsBinding");
            throw null;
        }
        q(z80Var5.e, arrayList.size());
        z80 z80Var6 = this.H;
        if (z80Var6 == null) {
            oo.P("statsBinding");
            throw null;
        }
        LinearLayout linearLayout = z80Var6.g;
        linearLayout.removeAllViews();
        List V = va.V(getString(R.string.day_mon), getString(R.string.day_tue), getString(R.string.day_wed), getString(R.string.day_thu), getString(R.string.day_fri), getString(R.string.day_sat), getString(R.string.day_sun));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String a = oo.a();
        int i9 = 6;
        int i10 = 6;
        while (true) {
            Throwable th2 = th;
            if (-1 >= i10) {
                String str2 = str;
                z80 z80Var7 = this.H;
                if (z80Var7 == null) {
                    oo.P(str2);
                    throw th2;
                }
                z80Var7.b.removeAllViews();
                if (arrayList.isEmpty()) {
                    TextView textView2 = new TextView(this);
                    textView2.setText(getString(R.string.no_habits_stats));
                    textView2.setTextSize(13.0f);
                    textView2.setGravity(17);
                    textView2.setPadding(0, s(8), 0, s(8));
                    textView2.setTextColor(getColor(R.color.colorTextSecondary));
                    z80 z80Var8 = this.H;
                    if (z80Var8 != null) {
                        z80Var8.b.addView(textView2);
                        return;
                    } else {
                        oo.P(str2);
                        throw th2;
                    }
                }
                ArrayList v = v();
                int size2 = arrayList.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    cr crVar = (cr) obj2;
                    if (v.isEmpty()) {
                        i2 = 0;
                    } else {
                        int size3 = v.size();
                        i2 = 0;
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj3 = v.get(i12);
                            i12++;
                            if (crVar.e.contains((String) obj3) && (i2 = i2 + 1) < 0) {
                                va.W();
                                throw th2;
                            }
                        }
                    }
                    int i13 = (i2 * 100) / 7;
                    LayoutInflater from = LayoutInflater.from(this);
                    z80 z80Var9 = this.H;
                    if (z80Var9 == null) {
                        oo.P(str2);
                        throw th2;
                    }
                    View inflate = from.inflate(R.layout.item_habit_stat, (ViewGroup) z80Var9.b, false);
                    ((TextView) inflate.findViewById(R.id.tv_habit_emoji)).setText(crVar.c);
                    ((TextView) inflate.findViewById(R.id.tv_habit_name)).setText(crVar.b);
                    ((TextView) inflate.findViewById(R.id.tv_habit_rate)).setText(i13 + "%");
                    ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progress_habit_week);
                    progressBar.getClass();
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", progressBar.getProgress(), i13);
                    ofInt.setDuration(500L);
                    ofInt.setInterpolator(new DecelerateInterpolator());
                    ofInt.start();
                    try {
                        progressBar.setProgressTintList(ColorStateList.valueOf(Color.parseColor(crVar.d)));
                    } catch (Exception unused) {
                    }
                    z80 z80Var10 = this.H;
                    if (z80Var10 == null) {
                        oo.P(str2);
                        throw th2;
                    }
                    z80Var10.b.addView(inflate);
                }
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.add(i9, -i10);
            String format = simpleDateFormat.format(calendar.getTime());
            switch (calendar.get(7)) {
                case 2:
                    i3 = 0;
                    break;
                case 3:
                    i3 = i6;
                    break;
                case 4:
                    i3 = 2;
                    break;
                case 5:
                    i3 = 3;
                    break;
                case 6:
                    i3 = 4;
                    break;
                case 7:
                    i3 = 5;
                    break;
                default:
                    i3 = i9;
                    break;
            }
            if (arrayList.isEmpty()) {
                i4 = 0;
            } else {
                int size4 = arrayList.size();
                int i14 = 0;
                int i15 = 0;
                while (i14 < size4) {
                    Object obj4 = arrayList.get(i14);
                    i14++;
                    if (((cr) obj4).e.contains(format) && (i15 = i15 + 1) < 0) {
                        va.W();
                        throw th2;
                    }
                }
                i4 = i15;
            }
            int size5 = arrayList.size();
            boolean b = oo.b(format, a);
            Object obj5 = V.get(i3);
            obj5.getClass();
            String str3 = (String) obj5;
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(i6);
            linearLayout2.setGravity(17);
            String str4 = str;
            List list3 = V;
            linearLayout2.setPadding(s(4), s(8), s(4), s(8));
            if (b) {
                linearLayout2.setBackground(linearLayout2.getContext().getDrawable(R.drawable.bg_day_today));
            }
            TextView textView3 = new TextView(this);
            textView3.setText((i4 <= 0 || size5 <= 0) ? "" : String.valueOf(i4));
            textView3.setTextSize(10.0f);
            textView3.setGravity(17);
            textView3.setTextColor(getColor(b ? R.color.colorPrimary : R.color.colorTextSecondary));
            FrameLayout frameLayout = new FrameLayout(this);
            final int s = s(20);
            int s2 = s(56);
            View view = new View(this);
            SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
            int color = getColor(R.color.colorPrimaryLight);
            String str5 = a;
            float s3 = s(6);
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i16 = i10;
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(s3);
            gradientDrawable.setColor(color);
            view.setBackground(gradientDrawable);
            view.setLayoutParams(new FrameLayout.LayoutParams(s, s2));
            int i17 = (int) (s2 * (size5 > 0 ? i4 / size5 : 0.0f));
            int s4 = i4 > 0 ? s(6) : 0;
            if (i17 < s4) {
                i17 = s4;
            }
            int color2 = b ? getColor(R.color.colorPrimary) : getColor(R.color.colorPrimaryDark);
            final View view2 = new View(this);
            float s5 = s(6);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(s5);
            gradientDrawable2.setColor(color2);
            view2.setBackground(gradientDrawable2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(s, i17);
            layoutParams.gravity = 80;
            view2.setLayoutParams(layoutParams);
            frameLayout.addView(view);
            frameLayout.addView(view2);
            if (i17 > 0) {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i17);
                ofInt2.setDuration(400L);
                ofInt2.setInterpolator(new DecelerateInterpolator());
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vq
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        List list4 = MainActivity2.O;
                        valueAnimator.getClass();
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(s, ((Integer) animatedValue).intValue());
                        layoutParams2.gravity = 80;
                        view2.setLayoutParams(layoutParams2);
                    }
                });
                ofInt2.start();
            }
            TextView textView4 = new TextView(this);
            textView4.setText(str3);
            textView4.setTextSize(10.0f);
            textView4.setGravity(17);
            textView4.setTextColor(getColor(b ? R.color.colorPrimary : R.color.colorTextSecondary));
            linearLayout2.addView(textView3);
            linearLayout2.addView(frameLayout);
            linearLayout2.addView(textView4);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
            i10 = i16 - 1;
            i9 = 6;
            th = th2;
            str = str4;
            V = list3;
            simpleDateFormat = simpleDateFormat2;
            a = str5;
            i6 = 1;
        }
    }
}
