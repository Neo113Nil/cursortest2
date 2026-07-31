package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes5.dex */
public final class w92 implements uy1 {
    public final int a;

    public w92(int i) {
        this.a = i;
    }

    @Override // yads.uy1
    public final TextView a(View view) {
        View findViewWithTag = view.findViewWithTag("body_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final CheckBox b(View view) {
        View findViewWithTag = view.findViewWithTag("mute_button_" + this.a);
        if (findViewWithTag instanceof CheckBox) {
            return (CheckBox) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final CustomizableMediaView c(View view) {
        View findViewWithTag = view.findViewWithTag("media_" + this.a);
        if (findViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView d(View view) {
        View findViewWithTag = view.findViewWithTag("price_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView e(View view) {
        View findViewWithTag = view.findViewWithTag("call_to_action_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView f(View view) {
        View findViewWithTag = view.findViewWithTag("warning_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final ImageView g(View view) {
        View findViewWithTag = view.findViewWithTag("favicon_" + this.a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView h(View view) {
        View findViewWithTag = view.findViewWithTag("age_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final View i(View view) {
        View findViewWithTag = view.findViewWithTag("rating_" + this.a);
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView j(View view) {
        View findViewWithTag = view.findViewWithTag("title_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final ProgressBar k(View view) {
        return (ProgressBar) view.findViewWithTag("video_progress_" + this.a);
    }

    @Override // yads.uy1
    public final ImageView l(View view) {
        View findViewWithTag = view.findViewWithTag("feedback_" + this.a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView m(View view) {
        View findViewWithTag = view.findViewWithTag("sponsored_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView n(View view) {
        View findViewWithTag = view.findViewWithTag("domain_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final ImageView o(View view) {
        View findViewWithTag = view.findViewWithTag("icon_" + this.a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView p(View view) {
        View findViewWithTag = view.findViewWithTag("review_count_" + this.a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final View a(View view, String str) {
        View findViewWithTag = view.findViewWithTag(str + "_" + this.a);
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }
}
