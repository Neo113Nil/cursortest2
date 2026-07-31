package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.e;
import sg.bigo.ads.ai.f;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.MixtureTextView;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* loaded from: classes14.dex */
public final class c {

    public interface a {
        void a();

        void a(String str);

        void b();

        void b(int i);

        void b(String str);

        void c();

        void c(String str);
    }

    private static double a(int i, int i2) {
        if (i2 == 0) {
            return 1.0d;
        }
        double d = i / i2;
        return (d < 0.25d || d > 1.0d) ? d < 0.25d ? 0.25d : 1.0d : d;
    }

    public static int a(@NonNull Context context, @NonNull e eVar) {
        f j = eVar.j();
        if (j == null) {
            return 0;
        }
        return (int) (context.getResources().getDisplayMetrics().widthPixels * a(j.b(), j.a()));
    }

    public static PrivacyCheckBox a(@NonNull View view, @NonNull e eVar, @Nullable Map<String, Object> map, final a aVar) {
        MixtureTextView mixtureTextView = (MixtureTextView) view.findViewById(R.id.inter_form_privacy_desc);
        final PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) view.findViewById(R.id.inter_form_check_box);
        TextView textView = (TextView) view.findViewById(R.id.inter_form_privacy_notice);
        if (mixtureTextView == null || privacyCheckBox == null || textView == null) {
            return null;
        }
        textView.setText(sg.bigo.ads.common.form.a.a(textView.getContext(), R.string.bigo_ad_form_privacy_notice));
        privacyCheckBox.a(sg.bigo.ads.common.form.a.a(map));
        View findViewById = view.findViewById(R.id.bigo_ad_check_box_expand);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PrivacyCheckBox.this.a(!r2.a);
                }
            });
        }
        e.b l = eVar.l();
        String str = l != null ? l.a : "";
        final String str2 = l != null ? l.b : "";
        String replace = "  ".concat(String.valueOf(sg.bigo.ads.common.utils.a.b(mixtureTextView.getContext(), R.string.bigo_ad_form_privacy_content, sg.bigo.ads.common.form.a.b))).replace("{company_name}", str);
        final SpannableString spannableString = new SpannableString(replace);
        String[] strArr = {str, "BIGO"};
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            spannableString.setSpan(new UnderlineSpan() { // from class: sg.bigo.ads.common.form.render.FormViewHelper$5
                @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                }
            }, replace.lastIndexOf(str3), replace.lastIndexOf(str3) + str3.length(), 33);
        }
        mixtureTextView.setText(spannableString);
        mixtureTextView.setClickListener(new MixtureTextView.a() { // from class: sg.bigo.ads.common.form.render.c.5
            @Override // sg.bigo.ads.common.view.MixtureTextView.a
            public final void a(UnderlineSpan underlineSpan) {
                if (a.this == null || underlineSpan == null) {
                    return;
                }
                if ("BIGO".equals(spannableString.subSequence(spannableString.getSpanStart(underlineSpan), spannableString.getSpanEnd(underlineSpan)).toString())) {
                    a.this.b("https://www.adsbigo.com/privacy.html");
                } else {
                    a.this.a(str2);
                }
            }
        });
        return privacyCheckBox;
    }

    private static void a(@NonNull View view, @NonNull e eVar, final a aVar) {
        final e.a n = eVar.n();
        TextView textView = (TextView) view.findViewById(R.id.inter_feedback_title);
        if (textView != null) {
            textView.setText(n.a);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.inter_feedback_dec);
        if (textView2 != null) {
            textView2.setText(n.b);
        }
        Button button = (Button) view.findViewById(R.id.inter_feedback_cta);
        if (button != null) {
            button.setText(n.c);
            button.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a aVar2 = a.this;
                    if (aVar2 != null) {
                        aVar2.c(n.d);
                    }
                }
            });
        }
    }

    public static void a(@NonNull ViewGroup viewGroup, Context context, @NonNull e eVar, a aVar, int i) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_submit_success_container);
        View a2 = sg.bigo.ads.common.utils.a.a(context, sg.bigo.ads.common.form.render.a.a(7), null, false);
        if (viewGroup2 == null || a2 == null) {
            return;
        }
        v.a(a2, viewGroup2, null, -1);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.inter_form_icon_layout);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(4);
        }
        HeightScrollView heightScrollView = (HeightScrollView) viewGroup.findViewById(R.id.inter_form_scroll);
        if (heightScrollView != null) {
            heightScrollView.setVisibility(4);
        }
        a(a2, eVar, aVar);
        if (aVar == null || i == 5) {
            return;
        }
        aVar.b(i);
    }
}
