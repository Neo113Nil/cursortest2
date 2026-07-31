package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* loaded from: classes8.dex */
public final class IntercomActivityNoteBinding implements ViewBinding {
    public final LinearLayout appBarLayout;
    public final IntercomToolbar intercomToolbar;
    public final FrameLayout noteComposerContainer;
    public final LinearLayout noteLayout;
    public final View noteTouchTarget;
    public final ContentAwareScrollView noteView;
    public final ReactionInputView reactionInputView;
    private final FrameLayout rootView;

    private IntercomActivityNoteBinding(FrameLayout frameLayout, LinearLayout linearLayout, IntercomToolbar intercomToolbar, FrameLayout frameLayout2, LinearLayout linearLayout2, View view, ContentAwareScrollView contentAwareScrollView, ReactionInputView reactionInputView) {
        this.rootView = frameLayout;
        this.appBarLayout = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.noteComposerContainer = frameLayout2;
        this.noteLayout = linearLayout2;
        this.noteTouchTarget = view;
        this.noteView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivityNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_note, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomActivityNoteBinding bind(View view) {
        View findChildViewById;
        int i = R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.intercom_toolbar;
            IntercomToolbar intercomToolbar = (IntercomToolbar) ViewBindings.findChildViewById(view, i);
            if (intercomToolbar != null) {
                i = R.id.note_composer_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.note_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.note_touch_target))) != null) {
                        i = R.id.note_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) ViewBindings.findChildViewById(view, i);
                        if (contentAwareScrollView != null) {
                            i = R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) ViewBindings.findChildViewById(view, i);
                            if (reactionInputView != null) {
                                return new IntercomActivityNoteBinding((FrameLayout) view, linearLayout, intercomToolbar, frameLayout, linearLayout2, findChildViewById, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
