package io.intercom.android.sdk.conversation;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import coil.request.ImageRequest;
import coil.target.Target;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class ReactionInputView extends LinearLayout {
    private static final float REACTION_SCALE = 2.5f;
    private static final int VIBRATION_DURATION_MS = 10;
    private final ColorFilter deselectedFilter;
    Integer highlightedViewIndex;
    private ReactionListener listener;
    private ReactionReply reactionReply;
    private final List<ImageView> reactionViews;
    int reactionsLoaded;
    private final View.OnTouchListener touchListener;
    private final Twig twig;
    private final Vibrator vibrator;

    public ReactionInputView(Context context) {
        this(context, null, 0);
    }

    public ReactionInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.twig = LumberMill.getLogger();
        this.highlightedViewIndex = null;
        this.reactionsLoaded = 0;
        this.touchListener = new View.OnTouchListener() { // from class: io.intercom.android.sdk.conversation.ReactionInputView.2
            private final Rect touchRect = new Rect();

            /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
            
                if (r3 != 2) goto L10;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        ReactionInputView.this.handleTouchUp();
                    }
                    return true;
                }
                handleTouchMove(motionEvent);
                return true;
            }

            private void handleTouchMove(MotionEvent motionEvent) {
                ReactionInputView.this.getHitRect(this.touchRect);
                if (this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    for (int i2 = 0; i2 < ReactionInputView.this.getChildCount(); i2++) {
                        ReactionInputView.this.getChildAt(i2).getHitRect(this.touchRect);
                        if (this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            if (ReactionInputView.this.highlightedViewIndex == null || ReactionInputView.this.highlightedViewIndex.intValue() != i2) {
                                ReactionInputView.this.vibrateForSelection();
                                ReactionInputView.this.selectViewAtIndex(ReactionInputView.REACTION_SCALE, i2);
                            }
                            if (ReactionInputView.this.highlightedViewIndex == null) {
                                Integer currentSelectedIndex = ReactionInputView.this.getCurrentSelectedIndex();
                                if (currentSelectedIndex != null && currentSelectedIndex.intValue() != i2) {
                                    ReactionInputView.this.deselectViewAtIndex(currentSelectedIndex.intValue());
                                }
                            } else if (ReactionInputView.this.highlightedViewIndex.intValue() != i2) {
                                ReactionInputView reactionInputView = ReactionInputView.this;
                                reactionInputView.deselectViewAtIndex(reactionInputView.highlightedViewIndex.intValue());
                            }
                            ReactionInputView.this.highlightedViewIndex = Integer.valueOf(i2);
                        }
                    }
                    return;
                }
                if (ReactionInputView.this.highlightedViewIndex != null) {
                    ReactionInputView.this.highlightSelectedReaction();
                }
                ReactionInputView.this.highlightedViewIndex = null;
            }
        };
        this.reactionViews = new ArrayList();
        setVisibility(8);
        if (isInEditMode()) {
            this.vibrator = null;
        } else {
            this.vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(this.touchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnTouchListener(null);
    }

    public void setUpReactions(ReactionReply reactionReply, boolean z, ReactionListener reactionListener) {
        final Context context = getContext();
        this.reactionReply = reactionReply;
        this.listener = reactionListener;
        resetView();
        List<Reaction> reactionSet = reactionReply.getReactionSet();
        final int size = reactionSet.size();
        int i = 0;
        while (i < reactionSet.size()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            final ImageView imageView = new ImageView(context);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.intercom_reaction_size);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            imageView.setPivotY(getResources().getDimensionPixelSize(R.dimen.intercom_reaction_offset));
            imageView.setPivotX(dimensionPixelSize / 2);
            this.reactionViews.add(imageView);
            frameLayout.addView(imageView);
            Reaction reaction = reactionSet.get(i);
            final boolean z2 = z;
            IntercomCoilKt.loadIntercomImage(context, new ImageRequest.Builder(context).target(new Target() { // from class: io.intercom.android.sdk.conversation.ReactionInputView.1
                @Override // coil.target.Target
                public void onError(Drawable drawable) {
                }

                @Override // coil.target.Target
                public void onStart(Drawable drawable) {
                }

                @Override // coil.target.Target
                public void onSuccess(Drawable drawable) {
                    imageView.setImageDrawable(drawable);
                    ReactionInputView.this.reactionsLoaded++;
                    if (ReactionInputView.this.reactionsLoaded == size) {
                        if (z2) {
                            ReactionInputView.this.setVisibility(0);
                            ReactionInputView.this.setY(r4.getHeight() + ScreenUtils.dpToPx(60.0f, context));
                            ReactionInputView.this.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
                            return;
                        }
                        ReactionInputView.this.setVisibility(0);
                    }
                }
            }).data(reaction.getImageUrl()).build());
            Integer reactionIndex = reactionReply.getReactionIndex();
            if (reactionIndex != null && !reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                deselectViewAtIndex(i);
            }
            addView(frameLayout);
            i++;
            z = z2;
        }
    }

    public void preloadReactionImages(ReactionReply reactionReply) {
        Iterator<Reaction> it = reactionReply.getReactionSet().iterator();
        while (it.hasNext()) {
            IntercomCoilKt.loadIntercomImage(getContext(), new ImageRequest.Builder(getContext()).data(it.next().getImageUrl()).build());
        }
    }

    void vibrateForSelection() {
        if (DeviceUtils.hasPermission(getContext(), "android.permission.VIBRATE")) {
            this.vibrator.vibrate(10L);
        }
    }

    void handleTouchUp() {
        Reaction reaction;
        Integer num = this.highlightedViewIndex;
        if (num != null && num.intValue() >= 0 && this.highlightedViewIndex.intValue() < this.reactionReply.getReactionSet().size() && (reaction = this.reactionReply.getReactionSet().get(this.highlightedViewIndex.intValue())) != null && (this.reactionReply.getReactionIndex() == null || reaction.getIndex() != this.reactionReply.getReactionIndex().intValue())) {
            this.reactionReply.setReactionIndex(reaction.getIndex());
            ReactionListener reactionListener = this.listener;
            if (reactionListener != null) {
                reactionListener.onReactionSelected(reaction);
            }
        }
        highlightSelectedReaction();
        this.highlightedViewIndex = null;
    }

    void highlightSelectedReaction() {
        for (int i = 0; i < getChildCount(); i++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                selectViewAtIndex(1.0f, i);
            } else {
                deselectViewAtIndex(i);
            }
        }
    }

    Integer getCurrentSelectedIndex() {
        for (int i = 0; i < getChildCount(); i++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    void selectViewAtIndex(float f, int i) {
        ImageView imageView = this.reactionViews.get(i);
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f).scaleY(f).setDuration(200L).start();
        imageView.clearColorFilter();
    }

    void deselectViewAtIndex(int i) {
        ImageView imageView = this.reactionViews.get(i);
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    private void resetView() {
        removeAllViews();
        this.reactionViews.clear();
    }
}
