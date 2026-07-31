package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

/* loaded from: classes8.dex */
public final class IntercomPreviewChatFullOverlayBinding implements ViewBinding {
    public final FrameLayout chatAvatarContainer;
    public final FrameLayout chatFullBody;
    public final ComposeView chatFullComposeView;
    public final View chatOverlayOverflowFade;
    public final ImageView chatheadAvatar;
    public final ComposeView chatheadAvatarComposeView;
    public final FrameLayout chatheadRoot;
    public final LinearLayout chatheadTextContainer;
    public final TextView chatheadTextHeader;
    public final FrameLayout parentCard;
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, ComposeView composeView, View view, ImageView imageView, ComposeView composeView2, FrameLayout frameLayout4, LinearLayout linearLayout, TextView textView, FrameLayout frameLayout5) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatFullComposeView = composeView;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
        this.parentCard = frameLayout5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomPreviewChatFullOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomPreviewChatFullOverlayBinding bind(View view) {
        View findChildViewById;
        int i = R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = R.id.chat_full_compose_view;
                ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
                if (composeView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.chat_overlay_overflow_fade))) != null) {
                    i = R.id.chathead_avatar;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) ViewBindings.findChildViewById(view, i);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i = R.id.chathead_text_container;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.chathead_text_header;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.parent_card;
                                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout4 != null) {
                                        return new IntercomPreviewChatFullOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, findChildViewById, imageView, composeView2, frameLayout3, linearLayout, textView, frameLayout4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
