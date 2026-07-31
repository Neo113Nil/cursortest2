package sg.bigo.ads.core.adview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.t;

/* loaded from: classes12.dex */
public final class e {
    static volatile boolean b;

    @NonNull
    final a a;

    public static class a {

        @NonNull
        final ViewGroup a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;

        public a(@NonNull ViewGroup viewGroup) {
            this.a = viewGroup;
        }
    }

    class b extends Dialog {
        public b(Context context) {
            super(context, R.style.BigoAd_Feedback_Dialog_FullScreen);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public final void dismiss() {
            super.dismiss();
            e.a();
        }

        @Override // android.app.Dialog
        protected final void onCreate(Bundle bundle) {
            View findViewById;
            super.onCreate(bundle);
            View a = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_optionview_feedback, null, false);
            setContentView(a);
            e.a(getWindow());
            if (!TextUtils.isEmpty(e.this.a.b)) {
                View findViewById2 = findViewById(R.id.bigo_ad_btn_why_this_ad);
                findViewById2.setVisibility(0);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.d(view.getContext(), e.this.a.b);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.a.c)) {
                final View findViewById3 = findViewById(R.id.inter_option_btn_copy_ru_ad_marker);
                if (findViewById3 != null) {
                    TextView textView = (TextView) findViewById3.findViewById(R.id.inter_option_text_copy_ru_ad_marker);
                    if (textView != null) {
                        textView.setText(sg.bigo.ads.common.utils.a.a(getContext(), R.string.bigo_ad_feedback_copy_ad_id, e.this.a.c));
                    }
                    findViewById3.setVisibility(0);
                    findViewById3.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (sg.bigo.ads.common.utils.d.g(findViewById3.getContext(), e.this.a.c)) {
                                Toast.makeText(findViewById3.getContext(), sg.bigo.ads.common.utils.a.a(findViewById3.getContext(), R.string.bigo_ad_feedback_copied, new Object[0]), 0).show();
                            }
                            b.this.dismiss();
                        }
                    });
                }
                if (findViewById3 != null && (findViewById = findViewById3.findViewById(R.id.inter_option_line)) != null) {
                    findViewById.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(e.this.a.d)) {
                findViewById(R.id.inter_option_ll_ad_info).setVisibility(0);
                ((TextView) findViewById(R.id.inter_option_tv_ad_info)).setText(e.this.a.d);
            }
            if (!TextUtils.isEmpty(e.this.a.e)) {
                View findViewById4 = findViewById(R.id.bigo_ad_btn_ad_copy_link);
                findViewById4.setVisibility(0);
                final Context context = findViewById4.getContext();
                findViewById4.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (sg.bigo.ads.common.utils.d.g(context, e.this.a.e)) {
                            Context context2 = context;
                            Toast.makeText(context2, sg.bigo.ads.common.utils.a.a(context2, R.string.bigo_ad_feedback_link_copied, new Object[0]), 0).show();
                        }
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.a.f)) {
                View findViewById5 = findViewById(R.id.bigo_ad_btn_rec_rule);
                findViewById5.setVisibility(0);
                findViewById5.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.d(view.getContext(), e.this.a.f);
                        b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(e.this.a.g)) {
                View findViewById6 = findViewById(R.id.bigo_ad_btn_user_privacy);
                findViewById6.setVisibility(0);
                findViewById6.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        sg.bigo.ads.core.landing.a.d(view.getContext(), e.this.a.g);
                        b.this.dismiss();
                    }
                });
            }
            a.findViewById(R.id.bigo_ad_feedback_background).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.e.b.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.dismiss();
                }
            });
        }
    }

    private e(@NonNull a aVar) {
        this.a = aVar;
    }

    /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }

    static /* synthetic */ void a(Window window) {
        if (window != null) {
            t.a(window);
        }
    }

    static /* synthetic */ boolean a() {
        b = false;
        return false;
    }
}
