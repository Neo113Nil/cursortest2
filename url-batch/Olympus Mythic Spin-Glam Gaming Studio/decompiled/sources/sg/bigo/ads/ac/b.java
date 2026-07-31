package sg.bigo.ads.ac;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBCommonConstants;
import sg.bigo.ads.R;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes14.dex */
public final class b extends a {
    private View h;

    public b(@NonNull sg.bigo.ads.y.b bVar, @NonNull Context context) {
        super(bVar, context);
        sg.bigo.ads.ak.b.a(0);
    }

    @Override // sg.bigo.ads.ac.a
    public final int a() {
        return R.layout.bigo_ad_native_banner_medium;
    }

    @Override // sg.bigo.ads.ac.a
    public final int b() {
        return f.a(this.c, 8);
    }

    @Override // sg.bigo.ads.ac.a
    public final void b(int i) {
        if (this.h != null) {
            this.h.setBackground(new BitmapDrawable(this.c.getResources(), g()));
        }
        super.b(i);
    }

    @Override // sg.bigo.ads.ac.a
    public final int[] c() {
        return new int[]{f.a(this.c, -57), f.a(this.c, 153)};
    }

    @Override // sg.bigo.ads.ac.a
    public final void d() {
        this.b = new FrameLayout(this.c);
        int a = f.a(this.c, 276);
        int a2 = f.a(this.c, 174);
        MediaView mediaView = new MediaView(this.c);
        this.d = mediaView;
        mediaView.setImageBlurBorder(false);
        this.d.setLayoutParams(new ViewGroup.LayoutParams(a, a2));
        View a3 = sg.bigo.ads.common.utils.a.a(this.c, R.layout.bigo_ad_banner_placeholder_img, null, false);
        this.h = a3;
        if (a3 != null) {
            v.a(a3, this.d, null, -1);
            View view = this.h;
            a.a((TextView) view.findViewById(R.id.bigo_ad_banner_background_text), this.a.getTitle(), "");
            a.a((TextView) view.findViewById(R.id.bigo_ad_image_title), this.a.getTitle(), "");
            a.a((TextView) view.findViewById(R.id.bigo_ad_banner_image_description), this.a.getDescription(), "");
            TextView textView = (TextView) view.findViewById(R.id.bigo_ad_banner_image_domain);
            String advertiser = this.a.getAdvertiser();
            if (textView != null) {
                if (TextUtils.isEmpty(advertiser)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(advertiser);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ac.a
    public final int i() {
        return 300;
    }

    @Override // sg.bigo.ads.ac.a
    public final int j() {
        return POBCommonConstants.DEFAULT_MIN_BITRATE;
    }
}
