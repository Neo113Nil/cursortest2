package sg.bigo.ads.ad;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.f;
import sg.bigo.ads.common.utils.o;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes15.dex */
public final class d {
    public TextView a;
    public TextView b;
    public ViewGroup c;
    public f.a d;
    public o e;
    boolean f;

    public final void a() {
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
            this.f = false;
        }
    }

    public final void a(ViewGroup viewGroup, int i, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        this.f = false;
        this.d = aVar;
        this.c = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_close_btn);
        this.a = (TextView) viewGroup.findViewById(R.id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.second_text);
        this.b = textView;
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 == null || this.a == null || textView == null) {
            f.a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.d.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.a aVar3 = d.this.d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        });
        this.c.setClickable(false);
        this.a.setTextColor(1728053247);
        this.b.setVisibility(0);
        o oVar = new o(i * 1000) { // from class: sg.bigo.ads.ad.d.2
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                d dVar = d.this;
                dVar.f = true;
                dVar.c.setAlpha(1.0f);
                d.this.c.setClickable(true);
                d.this.b.setVisibility(8);
                d.this.a.setTextColor(-1);
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
                d.this.b.setText(r.a("%ds", Integer.valueOf(Math.round(j / 1000.0f))));
            }
        };
        this.e = oVar;
        oVar.c();
    }
}
