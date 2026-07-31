package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes15.dex */
public final class wy1 implements uy1 {
    @Override // yads.uy1
    public final TextView a(View view) {
        View findViewWithTag = view.findViewWithTag("body");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final CheckBox b(View view) {
        View findViewWithTag = view.findViewWithTag("mute_button");
        if (findViewWithTag instanceof CheckBox) {
            return (CheckBox) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final CustomizableMediaView c(View view) {
        View findViewWithTag = view.findViewWithTag("media");
        if (findViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView d(View view) {
        View findViewWithTag = view.findViewWithTag("price");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView e(View view) {
        View findViewWithTag = view.findViewWithTag("call_to_action");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView f(View view) {
        View findViewWithTag = view.findViewWithTag("warning");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final ImageView g(View view) {
        View findViewWithTag = view.findViewWithTag("favicon");
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView h(View view) {
        View findViewWithTag = view.findViewWithTag("age");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final View i(View view) {
        View findViewWithTag = view.findViewWithTag("rating");
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView j(View view) {
        View findViewWithTag = view.findViewWithTag("title");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final ProgressBar k(View view) {
        View findViewWithTag = view.findViewWithTag("video_progress");
        if (findViewWithTag instanceof ProgressBar) {
            return (ProgressBar) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final ImageView l(View view) {
        View findViewWithTag = view.findViewWithTag("feedback");
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView m(View view) {
        View findViewWithTag = view.findViewWithTag("sponsored");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView n(View view) {
        View findViewWithTag = view.findViewWithTag("domain");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final ImageView o(View view) {
        View findViewWithTag = view.findViewWithTag("icon");
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final TextView p(View view) {
        View findViewWithTag = view.findViewWithTag("review_count");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // yads.uy1
    public final View a(View view, String str) {
        View findViewWithTag = view.findViewWithTag(str);
        if (findViewWithTag != null) {
            return findViewWithTag;
        }
        return null;
    }
}
