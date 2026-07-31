package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

/* loaded from: classes8.dex */
public final class IntercomProgressBarBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final ProgressBar rootView;

    private IntercomProgressBarBinding(ProgressBar progressBar, ProgressBar progressBar2) {
        this.rootView = progressBar;
        this.progressBar = progressBar2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ProgressBar getRoot() {
        return this.rootView;
    }

    public static IntercomProgressBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomProgressBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_progress_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomProgressBarBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProgressBar progressBar = (ProgressBar) view;
        return new IntercomProgressBarBinding(progressBar, progressBar);
    }
}
