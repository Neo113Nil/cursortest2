package sg.bigo.ads.k;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public class x extends sg.bigo.ads.ad.f {
    protected sg.bigo.ads.ai.o l;

    private x(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    public x(@NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.ai.o oVar) {
        this(bVar);
        this.l = oVar;
    }

    public static void a(ViewGroup viewGroup, String str) {
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_ad_label);
        View findViewById = viewGroup.findViewById(R.id.inter_separator);
        if (textView == null || textView2 == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        textView.setVisibility(!isEmpty ? 0 : 8);
        if (findViewById != null) {
            findViewById.setVisibility(isEmpty ? 8 : 0);
        }
        if (isEmpty) {
            return;
        }
        textView.setText(str);
        textView2.setText(R.string.bigo_ad_tag);
    }

    @Override // sg.bigo.ads.ad.f
    public final void a(Context context, ViewGroup viewGroup) {
    }

    public final void a(final View view, final View view2) {
        sg.bigo.ads.common.utils.v.a(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.x.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                sg.bigo.ads.bv.b.a(sg.bigo.ads.common.utils.b.a(2), view);
                sg.bigo.ads.common.utils.b.a(view2);
            }
        });
    }

    public final void c(@NonNull ViewGroup viewGroup) {
        sg.bigo.ads.ai.o oVar = this.l;
        boolean z = oVar != null && oVar.c("video_play_page.media_view_clickable_switch");
        sg.bigo.ads.ai.o oVar2 = this.l;
        boolean z2 = oVar2 != null && oVar2.c("video_play_page.ad_component_clickable_switch");
        sg.bigo.ads.ai.o oVar3 = this.l;
        boolean z3 = oVar3 != null && oVar3.c("video_play_page.other_space_clickable_switch");
        sg.bigo.ads.ai.o oVar4 = this.l;
        a(viewGroup, z, z2, z3, oVar4 != null ? oVar4.a("video_play_page.click_type") : 1);
    }

    public sg.bigo.ads.common.utils.o e(ViewGroup viewGroup) {
        return null;
    }

    @Override // sg.bigo.ads.ad.f
    public final boolean j() {
        sg.bigo.ads.ai.o oVar = this.l;
        if (oVar == null) {
            return false;
        }
        return oVar.c("video_play_page.is_widget");
    }

    @Override // sg.bigo.ads.ad.f
    public final int k() {
        sg.bigo.ads.ai.o oVar = this.l;
        if (oVar == null) {
            return 1;
        }
        return oVar.a("video_play_page.close_button_style");
    }

    @Override // sg.bigo.ads.ad.f
    public final boolean l() {
        sg.bigo.ads.ai.o oVar = this.l;
        if (oVar == null) {
            return false;
        }
        return oVar.c("video_play_page.is_cta_show_animation");
    }

    public final int m() {
        sg.bigo.ads.ai.o oVar = this.l;
        if (oVar == null) {
            return 0;
        }
        return oVar.a("video_play_page.force_staying_time", 0);
    }
}
