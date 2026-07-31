package sg.bigo.ads.core.adview;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.adview.e;
import sg.bigo.ads.core.adview.e.b;

/* loaded from: classes13.dex */
public final class b extends c {
    public b(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
    }

    public final void a(sg.bigo.ads.api.core.b bVar, final String str) {
        if (bVar == null) {
            return;
        }
        this.a.removeAllViews();
        b.e C = bVar.C();
        AdImageView adImageView = new AdImageView(this.a.getContext());
        adImageView.setIconTag(true);
        String a = C != null ? C.a() : "";
        final String b = C != null ? C.b() : "";
        final String d = C != null ? C.d() : "";
        final String e = C != null ? C.e() : "";
        final String g = C != null ? C.g() : "";
        final String h = C != null ? C.h() : "";
        adImageView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                sg.bigo.ads.api.a<?> aVar = b.this.a;
                String str3 = b;
                String str4 = str;
                String str5 = d;
                String str6 = e;
                String str7 = g;
                String str8 = h;
                if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8)) {
                    return;
                }
                e.a aVar2 = new e.a(aVar);
                aVar2.b = str3;
                aVar2.c = str4;
                aVar2.d = str5;
                aVar2.e = str6;
                aVar2.f = str7;
                aVar2.g = str8;
                e eVar = new e(aVar2, (byte) 0);
                Activity a2 = sg.bigo.ads.common.utils.d.a(eVar.a.a);
                if (a2 == null) {
                    str2 = "Cannot find Activity from container view";
                } else {
                    if (!e.b) {
                        e.b bVar2 = eVar.new b(a2);
                        if (r.a((CharSequence) eVar.a.b) && r.a((CharSequence) eVar.a.c) && r.a((CharSequence) eVar.a.d) && r.a((CharSequence) eVar.a.e) && r.a((CharSequence) eVar.a.f) && r.a((CharSequence) eVar.a.g)) {
                            return;
                        }
                        bVar2.show();
                        e.b = true;
                        return;
                    }
                    str2 = "Feedback dialog is showing. Cannot show again.";
                }
                sg.bigo.ads.bn.a.a("Feedback", str2);
            }
        });
        if (TextUtils.isEmpty(a)) {
            this.a.setVisibility(8);
            return;
        }
        adImageView.a(a, bVar.am());
        adImageView.setLayoutParams(new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(this.a.getContext(), 16), sg.bigo.ads.common.utils.f.a(this.a.getContext(), 16), 17));
        adImageView.setTag("ad_options_real_view");
        a(adImageView);
    }
}
