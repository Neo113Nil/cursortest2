package com.yandex.mobile.ads.common;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import yads.a2;
import yads.a40;
import yads.e2;
import yads.el3;
import yads.io2;
import yads.n2;
import yads.ob1;
import yads.ta2;
import yads.u1;
import yads.v1;
import yads.w1;
import yads.wa2;
import yads.y1;
import yads.y30;
import yads.yu2;
import yads.z1;
import yads.z30;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/mobile/ads/common/AdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdActivity extends ComponentActivity {
    private ta2 a;
    private u1 b;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.y, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        u1 u1Var = this.b;
        if (u1Var == null || u1Var.c.d()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u1 u1Var = this.b;
        if (u1Var != null) {
            z1 z1Var = u1Var.d;
            int i = configuration.orientation;
            if (i != z1Var.d) {
                Iterator it = z1Var.a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                z1Var.d = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r3 == (-1)) goto L24;
     */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        Long l;
        y1 y1Var;
        super.onCreate(bundle);
        z1 z1Var = new z1(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        y1 y1Var2 = y1.c;
        if (y1Var2 == null) {
            synchronized (y1.b) {
                y1Var = y1.c;
                if (y1Var == null) {
                    y1Var = new y1();
                    y1.c = y1Var;
                }
            }
            y1Var2 = y1Var;
        }
        Unit unit = null;
        try {
            Intent intent = getIntent();
            if (intent != null && intent.hasExtra("data_identifier")) {
                long longExtra = intent.getLongExtra("data_identifier", -1L);
                l = Long.valueOf(longExtra);
            }
        } catch (Exception unused) {
            boolean z = ob1.a;
        }
        l = null;
        w1 a = l != null ? y1Var2.a(l.longValue()) : null;
        if (n2.a == null && a != null) {
            yu2 yu2Var = a.d;
            Context applicationContext = getApplicationContext();
            if (applicationContext == null) {
                applicationContext = this;
            }
            n2.a = new a40(applicationContext, yu2Var, new io2((Map) null, 3));
        }
        a40 a40Var = n2.a;
        z30 z30Var = a40Var != null ? a40Var.a : null;
        if (a != null) {
            if (z30Var != null) {
                z30Var.a(y30.d);
            }
        } else if (z30Var != null) {
            z30Var.a(y30.e);
        }
        e2 a2 = v1.a(this, relativeLayout, z1Var, a);
        u1 u1Var = a2 != null ? new u1(this, relativeLayout, a2, z1Var) : null;
        this.b = u1Var;
        if (u1Var != null) {
            u1Var.c.f();
            u1Var.c.c();
            u1Var.b.setTag(el3.a("root_layout"));
            u1Var.a.setContentView(u1Var.b);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            finish();
        }
        ta2 a3 = wa2.a(this, this.b);
        this.a = a3;
        if (a3 != null) {
            a3.a();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        u1 u1Var = this.b;
        if (u1Var != null) {
            u1Var.c.onAdClosed();
            u1Var.c.g();
            u1Var.b.removeAllViews();
        }
        ta2 ta2Var = this.a;
        if (ta2Var != null) {
            ta2Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        u1 u1Var = this.b;
        if (u1Var != null) {
            u1Var.c.b();
            z1 z1Var = u1Var.d;
            boolean isEmpty = z1Var.c.isEmpty();
            z1Var.c.add("activity");
            if (isEmpty) {
                Iterator it = z1Var.b.iterator();
                while (it.hasNext()) {
                    ((a2) it.next()).b();
                }
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        u1 u1Var = this.b;
        if (u1Var != null) {
            u1Var.c.a();
            z1 z1Var = u1Var.d;
            z1Var.c.remove("activity");
            if (z1Var.c.isEmpty()) {
                Iterator it = z1Var.b.iterator();
                while (it.hasNext()) {
                    ((a2) it.next()).a();
                }
            }
        }
    }
}
