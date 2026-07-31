package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import com.yandex.div.R;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.Views;

/* loaded from: classes4.dex */
public class OverflowMenuWrapper {

    @DrawableRes
    private int mButtonResourceId;

    @NonNull
    private final Context mContext;

    @Nullable
    private View[] mHorizontallyCompetingViews;

    @Nullable
    private Listener mListener;
    private int mMenuGravity;

    @DimenRes
    private final int mMenuHorizontalMargin;

    @DimenRes
    private final int mMenuVerticalMargin;

    @IntRange
    private int mOverflowAlpha;

    @ColorInt
    private int mOverflowColor;
    private int mOverflowGravity;

    @Nullable
    private ImageView mOverflowMenuImageView;

    @Nullable
    private final ViewGroup mParentView;

    @Nullable
    private PopupMenu mPopupMenu;

    @Nullable
    private View mResultView;
    private boolean mValid;

    @Nullable
    private View[] mVerticallyCompetingViews;

    @NonNull
    private final View mWrappedView;

    public interface Listener {

        public static class Simple implements Listener {
            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            public void onMenuCreated(@NonNull PopupMenu popupMenu) {
            }

            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
            public void onPopupShown() {
            }
        }

        void onMenuCreated(@NonNull PopupMenu popupMenu);

        void onPopupShown();
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup) {
        this(context, view, viewGroup, R.dimen.overflow_menu_margin_horizontal, R.dimen.overflow_menu_margin_vertical);
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup, @DimenRes int i, @DimenRes int i2) {
        this.mOverflowGravity = 51;
        this.mOverflowColor = -1;
        this.mOverflowAlpha = 255;
        this.mMenuGravity = 83;
        this.mButtonResourceId = R.drawable.ic_more_vert_white_24dp;
        this.mHorizontallyCompetingViews = null;
        this.mVerticallyCompetingViews = null;
        this.mValid = false;
        this.mContext = context;
        this.mWrappedView = view;
        this.mParentView = viewGroup;
        this.mMenuHorizontalMargin = i;
        this.mMenuVerticalMargin = i2;
    }

    @NonNull
    public OverflowMenuWrapper overflowGravity(int i) {
        this.mOverflowGravity = i;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper menuGravity(int i) {
        this.mMenuGravity = i;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper color(@ColorInt int i) {
        this.mOverflowColor = i;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper alpha(@IntRange int i) {
        this.mOverflowAlpha = i;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper listener(@NonNull Listener listener) {
        this.mListener = listener;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper horizontallyCompetingViews(@NonNull View... viewArr) {
        this.mHorizontallyCompetingViews = viewArr;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper verticallyCompetingViews(@NonNull View... viewArr) {
        this.mVerticallyCompetingViews = viewArr;
        return this;
    }

    @NonNull
    public OverflowMenuWrapper buttonResourceId(@DrawableRes int i) {
        this.mButtonResourceId = i;
        return this;
    }

    public void invalidate() {
        this.mValid = false;
    }

    @NonNull
    public View getView() {
        View view;
        if (this.mValid && (view = this.mResultView) != null) {
            return view;
        }
        if (this.mResultView == null || this.mOverflowMenuImageView == null) {
            ImageView createOverflowMenuImageView = createOverflowMenuImageView();
            this.mOverflowMenuImageView = createOverflowMenuImageView;
            this.mResultView = createWrapperView(createOverflowMenuImageView);
        }
        Assert.assertFalse(this.mValid);
        ImageView imageView = this.mOverflowMenuImageView;
        imageView.setImageDrawable(createMenuDrawable(imageView));
        this.mOverflowMenuImageView.setOnClickListener(getOnMenuClickListener());
        this.mValid = true;
        return this.mResultView;
    }

    public View.OnClickListener getOnMenuClickListener() {
        return new View.OnClickListener() { // from class: com.yandex.div.internal.widget.menu.OverflowMenuWrapper$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverflowMenuWrapper.this.lambda$getOnMenuClickListener$0(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOnMenuClickListener$0(View view) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, this.mMenuGravity);
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onMenuCreated(popupMenu);
        }
        popupMenu.show();
        Listener listener2 = this.mListener;
        if (listener2 != null) {
            listener2.onPopupShown();
        }
        this.mPopupMenu = popupMenu;
    }

    public void setMenuVisibility(int i) {
        if (this.mValid) {
            Assert.assertNotNull("mResultView is null in setMenuVisibility", this.mResultView);
            this.mOverflowMenuImageView.setVisibility(i);
        }
    }

    public void redrawMenuIcon() {
        if (this.mValid) {
            Assert.assertNotNull("mResultView is null in redrawMenuIcon", this.mResultView);
            ImageView imageView = this.mOverflowMenuImageView;
            imageView.setImageDrawable(createMenuDrawable(imageView));
        }
    }

    @NonNull
    protected Bitmap getBitmapResource(@DrawableRes int i, @NonNull View view) {
        return BitmapFactory.decodeResource(this.mContext.getResources(), i);
    }

    @NonNull
    private Drawable createMenuDrawable(View view) {
        Drawable mutate = new BitmapDrawable(this.mContext.getResources(), getBitmapResource(this.mButtonResourceId, view)).mutate();
        mutate.setColorFilter(this.mOverflowColor, PorterDuff.Mode.SRC_IN);
        mutate.setAlpha(this.mOverflowAlpha);
        return mutate;
    }

    @NonNull
    private View createWrapperView(@NonNull ImageView imageView) {
        FrameLayout frameLayout = new FrameLayout(this.mContext);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(this.mWrappedView);
        frameLayout.addView(imageView);
        View[] viewArr = this.mHorizontallyCompetingViews;
        if (viewArr != null) {
            boolean z = (this.mOverflowGravity & 5) != 0;
            for (View view : viewArr) {
                Views.setPadding(view, R.dimen.overflow_menu_size, z ? 4 : 2);
            }
        }
        View[] viewArr2 = this.mVerticallyCompetingViews;
        if (viewArr2 != null) {
            boolean z2 = (this.mOverflowGravity & 48) != 0;
            for (View view2 : viewArr2) {
                Views.setPadding(view2, R.dimen.overflow_menu_size, z2 ? 8 : 1);
            }
        }
        return frameLayout;
    }

    private ImageView createOverflowMenuImageView() {
        Resources resources = this.mContext.getResources();
        NonScrollImageView nonScrollImageView = new NonScrollImageView(this.mContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = this.mOverflowGravity;
        nonScrollImageView.setLayoutParams(layoutParams);
        nonScrollImageView.setId(R.id.overflow_menu);
        int dimensionPixelSize = resources.getDimensionPixelSize(this.mMenuHorizontalMargin);
        nonScrollImageView.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(this.mMenuVerticalMargin), dimensionPixelSize, 0);
        return nonScrollImageView;
    }

    public void dismiss() {
        PopupMenu popupMenu = this.mPopupMenu;
        if (popupMenu != null) {
            popupMenu.dismiss();
            this.mPopupMenu = null;
        }
    }
}
