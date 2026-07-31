package com.my.target;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class o extends Dialog {
    private final a a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(o oVar, FrameLayout frameLayout);

        void b(boolean z);

        void m();
    }

    private o(a aVar, Context context) {
        super(context);
        this.a = aVar;
    }

    public static o a(a aVar, Context context) {
        return new o(aVar, context);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.a.m();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
        }
        this.a.a(this, frameLayout);
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.a.b(z);
        super.onWindowFocusChanged(z);
    }
}
