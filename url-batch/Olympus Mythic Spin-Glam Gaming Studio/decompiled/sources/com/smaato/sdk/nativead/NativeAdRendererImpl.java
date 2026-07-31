package com.smaato.sdk.nativead;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.nativead.NativeAd;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.NativeAd;
import com.smaato.sdk.ng.utils.NGSDKBitmapDownloader;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public class NativeAdRendererImpl implements NativeAdRenderer, NativeAd.Listener {
    private NativeAdAssets mAssets;
    private final Lifecycle mLifecycle;
    private final NativeAd.Listener mListener;
    private final com.smaato.sdk.ng.models.NativeAd mNativeAd;
    private final boolean mShouldReturnUrlsForImageAssets;
    private final NativeAd mSmaatoNativeAd;
    private boolean mIsTrackingStarted = false;
    private final NGSDKBitmapDownloader mBitmapDownloader = new NGSDKBitmapDownloader();

    public NativeAdRendererImpl(Lifecycle lifecycle, com.smaato.sdk.ng.models.NativeAd nativeAd, NativeAd nativeAd2, boolean z, NativeAd.Listener listener) {
        this.mLifecycle = lifecycle;
        this.mNativeAd = nativeAd;
        this.mSmaatoNativeAd = nativeAd2;
        this.mShouldReturnUrlsForImageAssets = z;
        this.mListener = listener;
        createAssets();
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public NativeAdAssets getAssets() {
        NativeAdAssets nativeAdAssets = this.mAssets;
        return nativeAdAssets != null ? nativeAdAssets : NativeAdAssets.builder().build();
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public String creativeId() {
        com.smaato.sdk.ng.models.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            return nativeAd.getCreativeId();
        }
        return null;
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public String sessionId() {
        com.smaato.sdk.ng.models.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            return nativeAd.getImpressionId();
        }
        return null;
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public void renderInView(NativeAdView nativeAdView) {
        if (this.mNativeAd == null || nativeAdView == null) {
            return;
        }
        if (this.mAssets == null) {
            createAssets();
        }
        renderText(nativeAdView.titleView(), this.mAssets.title());
        renderText(nativeAdView.textView(), this.mAssets.text());
        renderText(nativeAdView.sponsoredView(), this.mAssets.sponsored());
        renderText(nativeAdView.ctaView(), this.mAssets.cta());
        renderRating(nativeAdView.ratingView(), this.mAssets.rating());
        renderImage(nativeAdView.iconView(), this.mAssets.icon());
        if (!this.mAssets.images().isEmpty()) {
            renderImages(nativeAdView.mediaView(), this.mAssets.images());
        }
        renderPrivacyIcon(nativeAdView.privacyView());
    }

    private void renderText(TextView textView, String str) {
        if (textView == null || TextUtils.isEmpty(str)) {
            return;
        }
        textView.setText(str);
    }

    private void renderRating(View view, Double d) {
        if (view == null || d == null) {
            return;
        }
        if (view instanceof RatingBar) {
            ((RatingBar) view).setRating(d.floatValue());
        } else {
            Log.w("", "Attempted to set rating to non RatingBar view.");
        }
    }

    private void renderImages(View view, List<NativeAdAssets.Image> list) {
        if (view == null) {
            return;
        }
        if (list.size() > 1) {
            Log.w("", "Multiple images rendering does not supported yet.");
        }
        if (list.isEmpty()) {
            return;
        }
        renderImage(view, list.get(0));
    }

    private void renderImage(final View view, NativeAdAssets.Image image) {
        if (view == null || image == null) {
            return;
        }
        if (view instanceof ImageView) {
            Drawable drawable = image.drawable();
            if (drawable != null) {
                ((ImageView) view).setImageDrawable(drawable);
                return;
            } else {
                this.mBitmapDownloader.download(image.uri().toString(), new NGSDKBitmapDownloader.DownloadListener() { // from class: com.smaato.sdk.nativead.NativeAdRendererImpl.1
                    @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
                    public void onDownloadFinish(String str, Bitmap bitmap) {
                        if (bitmap != null) {
                            ((ImageView) view).setImageBitmap(bitmap);
                        }
                    }

                    @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
                    public void onDownloadFailed(String str, Exception exc) {
                        NextGen.reportException(exc);
                    }
                });
                return;
            }
        }
        Log.w("", "Attempted to set image to non ImageView view.");
    }

    static void renderPrivacyIcon(View view) {
        if (view instanceof ImageView) {
            renderPrivacyIcon((ImageView) view);
        } else {
            if (view instanceof ViewGroup) {
                ImageButton imageButton = new ImageButton(view.getContext());
                renderPrivacyIcon((ImageView) imageButton);
                ((ViewGroup) view).addView(imageButton);
                return;
            }
            Log.w("", String.format("Attempted to render privacy icon on unknown view (%s).", view));
        }
    }

    private static void renderPrivacyIcon(ImageView imageView) {
        imageView.setBackgroundColor(0);
        imageView.setImageResource(com.smaato.sdk.core.R.drawable.smaato_sdk_native_ic_privacy);
        imageView.setClickable(true);
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public void registerForImpression(View view) {
        com.smaato.sdk.ng.models.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd == null || view == null || this.mIsTrackingStarted) {
            return;
        }
        this.mIsTrackingStarted = true;
        nativeAd.startTracking(view, this);
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public void registerForClicks(View... viewArr) {
        com.smaato.sdk.ng.models.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd == null || viewArr == null || viewArr.length <= 0 || this.mIsTrackingStarted) {
            return;
        }
        this.mIsTrackingStarted = true;
        nativeAd.startTracking(viewArr[0], this);
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public void registerForClicks(Iterable<? extends View> iterable) {
        if (this.mNativeAd == null || iterable == null) {
            return;
        }
        iterable.iterator();
        if (this.mIsTrackingStarted) {
            return;
        }
        this.mIsTrackingStarted = true;
        View next = iterable.iterator().next();
        if (next != null) {
            this.mNativeAd.startTracking(next, this);
        }
    }

    @Override // com.smaato.sdk.nativead.NativeAdRenderer
    public void onDestroyView() {
        com.smaato.sdk.ng.models.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            this.mIsTrackingStarted = false;
            nativeAd.stopTracking();
        }
    }

    private Context findContext(NativeAdView nativeAdView) {
        if (nativeAdView.titleView() != null) {
            return nativeAdView.titleView().getContext();
        }
        if (nativeAdView.textView() != null) {
            return nativeAdView.textView().getContext();
        }
        if (nativeAdView.ctaView() != null) {
            return nativeAdView.ctaView().getContext();
        }
        return null;
    }

    private void createAssets() {
        NativeAdAssets.Builder builder = NativeAdAssets.builder();
        com.smaato.sdk.ng.models.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            String title = nativeAd.getTitle();
            if (!TextUtils.isEmpty(title)) {
                builder.title(title);
            }
            String description = this.mNativeAd.getDescription();
            if (!TextUtils.isEmpty(description)) {
                builder.text(description);
            }
            String callToActionText = this.mNativeAd.getCallToActionText();
            if (!TextUtils.isEmpty(callToActionText)) {
                builder.cta(callToActionText);
            }
            double rating = this.mNativeAd.getRating();
            if (rating != 0.0d) {
                builder.rating(Double.valueOf(rating));
            }
            String iconUrl = this.mNativeAd.getIconUrl();
            if (!TextUtils.isEmpty(iconUrl)) {
                NativeAdAssets.Image create = NativeAdAssets.Image.create(Uri.parse(iconUrl), 0, 0);
                Bitmap iconBitmap = this.mNativeAd.getIconBitmap();
                if (iconBitmap != null) {
                    create = create.withDrawable(new BitmapDrawable(Resources.getSystem(), iconBitmap));
                }
                builder.icon(create);
            }
            String bannerUrl = this.mNativeAd.getBannerUrl();
            if (!TextUtils.isEmpty(bannerUrl)) {
                NativeAdAssets.Image create2 = NativeAdAssets.Image.create(Uri.parse(bannerUrl), 0, 0);
                Bitmap bannerBitmap = this.mNativeAd.getBannerBitmap();
                if (bannerBitmap != null) {
                    create2 = create2.withDrawable(new BitmapDrawable(Resources.getSystem(), bannerBitmap));
                }
                builder.images(Collections.singletonList(create2));
            }
        }
        this.mAssets = builder.build();
    }

    @Override // com.smaato.sdk.ng.models.NativeAd.Listener
    public void onAdImpression(com.smaato.sdk.ng.models.NativeAd nativeAd, View view) {
        NativeAd.Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdImpressed(this.mSmaatoNativeAd);
        }
    }

    @Override // com.smaato.sdk.ng.models.NativeAd.Listener
    public void onAdClick(com.smaato.sdk.ng.models.NativeAd nativeAd, View view) {
        NativeAd.Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdClicked(this.mSmaatoNativeAd);
        }
    }
}
