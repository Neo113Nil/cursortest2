package com.ogury.ad.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.ironsource.C4701ic;
import com.ogury.ad.R;
import com.ogury.ad.async.Completable;
import com.ogury.core.internal.network.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a2 {
    public final t6 a;
    public final ViewGroup b;
    public final z8 c;
    public final String d;
    public final ImageButton e;
    public final Handler f;

    public a2(t6 adController, ViewGroup root, z8 oguryApi, String closeButtonCallUrl) {
        Intrinsics.checkNotNullParameter(adController, "adController");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(oguryApi, "oguryApi");
        Intrinsics.checkNotNullParameter(closeButtonCallUrl, "closeButtonCallUrl");
        this.a = adController;
        this.b = root;
        this.c = oguryApi;
        this.d = closeButtonCallUrl;
        this.e = new ImageButton(root.getContext());
        this.f = new Handler(Looper.getMainLooper());
        a();
    }

    public static final void a(a2 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.a(false);
        if (this$0.d.length() > 0) {
            z8 z8Var = this$0.c;
            String url = this$0.d;
            z8Var.getClass();
            Intrinsics.checkNotNullParameter(url, "url");
            Completable.INSTANCE.fromAction(new u8(z8Var, new NetworkRequest(url, C4701ic.a, "", z8Var.a.b))).doOnError(s8.a).subscribe(t8.a);
        }
    }

    public final void a() {
        this.e.setBackground(null);
        this.e.setImageResource(R.drawable.btn_ogury_mraid_close);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        this.e.setLayoutParams(layoutParams);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.ogury.ad.internal.a2$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a2.a(a2.this, view);
            }
        });
        this.e.setVisibility(8);
        this.b.addView(this.e, layoutParams);
    }

    public final void a(long j) {
        this.f.postDelayed(new Runnable() { // from class: com.ogury.ad.internal.a2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a2.a(a2.this);
            }
        }, j);
    }

    public static final void a(a2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.setVisibility(0);
    }
}
