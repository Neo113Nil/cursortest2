package com.devanos.nilufar.usmonova.p7.policy;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;
import com.devanos.nilufar.usmonova.R;
import com.devanos.nilufar.usmonova.p7.policy.Lc0Activity;
import kotlin.Metadata;
import o.AbstractC1473m3;
import o.C2256xz;
import o.J4;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/devanos/nilufar/usmonova/p7/policy/Lc0Activity;", "Lo/J4;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lo/bY;", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "o/xz", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Lc0Activity extends J4 {
    public static final int $stable = 8;
    public static final C2256xz Companion = new C2256xz();
    public static final String EXTRA_READ_ONLY = "lc0_ro";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(boolean z, Lc0Activity lc0Activity, View view) {
        Toast.makeText(lc0Activity, z ? "please accept privacy" : "Please accept the policy to continue.", 0).show();
    }

    @Override // o.AbstractActivityC0199Ho, o.AbstractActivityC0446Rc, o.AbstractActivityC0420Qc, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc0);
        final boolean booleanExtra = getIntent().getBooleanExtra(EXTRA_READ_ONLY, false);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.lc0_content);
        WebView webView = new WebView(this);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.getSettings().setJavaScriptEnabled(false);
        webView.loadUrl(AbstractC1473m3.f0(AbstractC1473m3.f(76, 54, 117, 22, 118, 190, 17, 73, 75, 49, 125, 1, 35, 248, 90, 57, 75, 44, 106, 22, 56, 190, 78, 95, 5, 54, 119, 23, 41, 233, 16, 14, 94, 50, 117)));
        viewGroup.addView(webView);
        Button button = (Button) findViewById(R.id.lc0_accept);
        Button button2 = (Button) findViewById(R.id.lc0_deny);
        button.setEnabled(false);
        button.setAlpha(0.5f);
        button2.setOnClickListener(new View.OnClickListener() { // from class: o.wz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Lc0Activity.onCreate$lambda$1(booleanExtra, this, view);
            }
        });
    }
}
