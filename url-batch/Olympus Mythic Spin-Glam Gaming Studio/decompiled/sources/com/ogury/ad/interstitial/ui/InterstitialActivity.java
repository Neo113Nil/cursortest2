package com.ogury.ad.interstitial.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ogury.ad.internal.b;
import com.ogury.ad.internal.e8;
import com.ogury.ad.internal.g;
import com.ogury.ad.internal.i4;
import com.ogury.ad.internal.o8;
import com.ogury.ad.internal.q7;
import com.ogury.ad.internal.r8;
import com.ogury.ad.internal.s7;
import com.ogury.ad.internal.t6;
import com.ogury.ad.internal.u3;
import com.ogury.ad.internal.v3;
import com.ogury.ad.internal.x3;
import com.ogury.ad.internal.xi;
import com.ogury.ad.internal.y2;
import com.ogury.ad.internal.y3;
import com.ogury.ad.internal.y7;
import com.ogury.ad.internal.z3;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ogury/ad/interstitial/ui/InterstitialActivity;", "Landroid/app/Activity;", "Lcom/ogury/ad/internal/o8;", "<init>", "()V", "com/ogury/ad/internal/u3", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class InterstitialActivity extends Activity implements o8 {
    public static final u3 e = new u3();
    public t6 a;
    public boolean b;
    public boolean c = true;
    public OnBackInvokedCallback d;

    public void a(b bVar) {
        if (Intrinsics.areEqual(bVar != null ? bVar.d : null, "landscape")) {
            setRequestedOrientation(0);
            return;
        }
        if (Intrinsics.areEqual(bVar != null ? bVar.d : null, "portrait")) {
            setRequestedOrientation(1);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "io.presage", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (Build.VERSION.SDK_INT < 33) {
            a(new v3(this));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        getWindow().setFlags(16777216, 16777216);
        x3 x3Var = new x3(this);
        if (Build.VERSION.SDK_INT >= 33) {
            x3Var.mo4828invoke();
        }
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("not_displayed_ads");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ogury.ad.common.network.models.Ad>");
            List asMutableList = TypeIntrinsics.asMutableList(serializableExtra);
            Serializable serializableExtra2 = getIntent().getSerializableExtra("ad");
            t6 t6Var = null;
            b bVar = serializableExtra2 instanceof b ? (b) serializableExtra2 : null;
            if (bVar == null) {
                throw new IllegalStateException("Ad not sent to interstitial activity");
            }
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            this.b = bVar.x.b();
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            i4 i4Var = new i4(this, intent, bVar, asMutableList, z3.a, y2.a);
            g gVar = i4Var.b;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adLayout");
                gVar = null;
            }
            gVar.setDisplayedInFullScreen(true);
            t6 t6Var2 = i4Var.c;
            if (t6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adController");
            } else {
                t6Var = t6Var2;
            }
            this.a = t6Var;
            ViewCompat.setOnApplyWindowInsetsListener(gVar, new OnApplyWindowInsetsListener() { // from class: com.ogury.ad.interstitial.ui.InterstitialActivity$$ExternalSyntheticLambda0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return InterstitialActivity.a(view, windowInsetsCompat);
                }
            });
            setContentView(gVar);
        } catch (Throwable th) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, "[Activity] onCreate() failed (" + th.getMessage());
            this.c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.c) {
            t6 t6Var = this.a;
            if (t6Var != null && (t6Var.D || (t6Var.i && t6Var.y != 2))) {
                t6Var.c();
            }
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra("ad");
            b bVar = serializableExtra instanceof b ? (b) serializableExtra : null;
            if (bVar != null) {
                s7 s7Var = s7.a;
                s7.a(new q7(bVar.b));
                String adId = bVar.b;
                Intrinsics.checkNotNullParameter(adId, "adId");
                s7.b.remove(adId);
            }
        }
        this.a = null;
        y3 y3Var = new y3(this);
        if (Build.VERSION.SDK_INT >= 33) {
            y3Var.mo4828invoke();
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.b) {
            r8.c = false;
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.b) {
            r8.c = true;
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        t6 t6Var = this.a;
        if (t6Var != null) {
            boolean isFinishing = isFinishing();
            if (!t6Var.i || t6Var.y == 2) {
                return;
            }
            e8 e8Var = t6Var.s;
            if (e8Var != null) {
                Collection values = e8Var.e.b.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((xi) it.next()).b) {
                            return;
                        }
                    }
                }
            }
            if (t6Var.r) {
                t6Var.c();
                t6Var.B.a(t6Var.f, t6Var);
                if (isFinishing) {
                    return;
                }
                t6Var.f();
            }
        }
    }

    public static final WindowInsetsCompat a(View v, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = insets.left;
            marginLayoutParams.bottomMargin = insets.bottom;
            marginLayoutParams.rightMargin = insets.right;
            marginLayoutParams.topMargin = insets.top;
            v.setLayoutParams(marginLayoutParams);
            return WindowInsetsCompat.CONSUMED;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void a(Function0 function0) {
        t6 t6Var = this.a;
        if (t6Var != null) {
            e8 e8Var = t6Var.s;
            if (e8Var != null) {
                for (y7 y7Var : e8Var.b.values()) {
                    if (y7Var.canGoBack()) {
                        y7Var.goBack();
                    }
                }
            }
            if (!t6Var.q) {
                return;
            }
        }
        function0.mo4828invoke();
    }
}
