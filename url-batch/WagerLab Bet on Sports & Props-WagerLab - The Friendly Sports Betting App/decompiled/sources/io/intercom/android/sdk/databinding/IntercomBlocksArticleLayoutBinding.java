package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

/* loaded from: classes8.dex */
public final class IntercomBlocksArticleLayoutBinding implements ViewBinding {
    private final LinearLayout rootView;

    private IntercomBlocksArticleLayoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IntercomBlocksArticleLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomBlocksArticleLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_blocks_article_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomBlocksArticleLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IntercomBlocksArticleLayoutBinding((LinearLayout) view);
    }
}
