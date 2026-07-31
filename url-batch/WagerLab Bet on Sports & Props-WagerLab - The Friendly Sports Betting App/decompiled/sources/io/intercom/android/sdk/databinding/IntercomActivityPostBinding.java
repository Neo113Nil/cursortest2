package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* loaded from: classes8.dex */
public final class IntercomActivityPostBinding implements ViewBinding {
    public final LinearLayout appBarLayout;
    public final FrameLayout conversationCoordinator;
    public final IntercomToolbar intercomToolbar;
    public final FrameLayout postContainer;
    public final View postTouchTarget;
    public final ContentAwareScrollView postView;
    public final ReactionInputView reactionInputView;
    private final RelativeLayout rootView;

    private IntercomActivityPostBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout, IntercomToolbar intercomToolbar, FrameLayout frameLayout2, View view, ContentAwareScrollView contentAwareScrollView, ReactionInputView reactionInputView) {
        this.rootView = relativeLayout;
        this.appBarLayout = linearLayout;
        this.conversationCoordinator = frameLayout;
        this.intercomToolbar = intercomToolbar;
        this.postContainer = frameLayout2;
        this.postTouchTarget = view;
        this.postView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivityPostBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityPostBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_post, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomActivityPostBinding bind(View view) {
        View findChildViewById;
        int i = R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.conversation_coordinator;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.intercom_toolbar;
                IntercomToolbar intercomToolbar = (IntercomToolbar) ViewBindings.findChildViewById(view, i);
                if (intercomToolbar != null) {
                    i = R.id.post_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.post_touch_target))) != null) {
                        i = R.id.post_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) ViewBindings.findChildViewById(view, i);
                        if (contentAwareScrollView != null) {
                            i = R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) ViewBindings.findChildViewById(view, i);
                            if (reactionInputView != null) {
                                return new IntercomActivityPostBinding((RelativeLayout) view, linearLayout, frameLayout, intercomToolbar, frameLayout2, findChildViewById, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
