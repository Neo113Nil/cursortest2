package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import io.intercom.android.sdk.R;

/* loaded from: classes8.dex */
public final class IntercomActivityCarouselBinding implements ViewBinding {
    public final ConstraintLayout intercomCarouselCloseContainer;
    public final ConstraintLayout intercomCarouselRoot;
    public final ImageButton intercomClose;
    public final View intercomCloseBackground;
    public final LinearLayout intercomPageNavigationLayout;
    public final FrameLayout intercomStateContainer;
    public final ViewPager intercomViewPager;
    private final ConstraintLayout rootView;

    private IntercomActivityCarouselBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageButton imageButton, View view, LinearLayout linearLayout, FrameLayout frameLayout, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.intercomCarouselCloseContainer = constraintLayout2;
        this.intercomCarouselRoot = constraintLayout3;
        this.intercomClose = imageButton;
        this.intercomCloseBackground = view;
        this.intercomPageNavigationLayout = linearLayout;
        this.intercomStateContainer = frameLayout;
        this.intercomViewPager = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivityCarouselBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_carousel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomActivityCarouselBinding bind(View view) {
        View findChildViewById;
        int i = R.id.intercom_carousel_close_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i = R.id.intercom_close;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.intercom_close_background))) != null) {
                i = R.id.intercom_page_navigation_layout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.intercom_state_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.intercom_view_pager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                        if (viewPager != null) {
                            return new IntercomActivityCarouselBinding(constraintLayout2, constraintLayout, constraintLayout2, imageButton, findChildViewById, linearLayout, frameLayout, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
