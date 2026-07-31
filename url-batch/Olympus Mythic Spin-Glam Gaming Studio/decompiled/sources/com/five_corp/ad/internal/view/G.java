package com.five_corp.ad.internal.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.five_corp.ad.AdReportDialogActivity;

/* loaded from: classes15.dex */
public final class G {
    public final AdReportDialogActivity a;

    public G(AdReportDialogActivity adReportDialogActivity) {
        this.a = adReportDialogActivity;
    }

    public final void a() {
        this.a.finish();
        if (Build.VERSION.SDK_INT < 34) {
            this.a.overridePendingTransition(0, 0);
        }
    }

    public final /* synthetic */ void a(View view) {
        a();
    }

    public final void a(C3843c c3843c) {
        F f = new F(this.a, c3843c);
        f.setOnClickListener(null);
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.content);
        viewGroup.setBackgroundColor(0);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.five_corp.ad.internal.view.G$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                G.this.a(view);
            }
        });
        viewGroup.addView(f);
    }
}
