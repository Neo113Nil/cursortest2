package io.intercom.android.sdk.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.coil.AvatarShapeTransformation;
import io.intercom.android.sdk.views.AvatarDefaultDrawable;
import io.intercom.android.sdk.views.AvatarInitialsDrawable;

/* loaded from: classes8.dex */
public class AvatarUtils {
    public static void preloadAvatar(Avatar avatar, final Runnable runnable, Activity activity) {
        String selectUrlForTheme = ThemeUtils.selectUrlForTheme(activity, avatar.getImageUrl(), avatar.getImageDarkUrl());
        if (selectUrlForTheme == null || selectUrlForTheme.isEmpty()) {
            runnable.run();
        } else {
            IntercomCoilKt.loadIntercomImage(activity, new ImageRequest.Builder(activity).data(selectUrlForTheme).listener(new ImageRequest.Listener() { // from class: io.intercom.android.sdk.utilities.AvatarUtils.1
                @Override // coil.request.ImageRequest.Listener
                public void onCancel(ImageRequest imageRequest) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onStart(ImageRequest imageRequest) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
                    runnable.run();
                }

                @Override // coil.request.ImageRequest.Listener
                public void onSuccess(ImageRequest imageRequest, SuccessResult successResult) {
                    runnable.run();
                }
            }).build());
        }
    }

    public static void loadAvatarIntoView(Avatar avatar, ImageView imageView, AppConfig appConfig) {
        createAvatar(avatar, imageView, 0, appConfig);
    }

    public static void createAvatar(Avatar avatar, ImageView imageView, int i, AppConfig appConfig) {
        Context context = imageView.getContext();
        IntercomCoilKt.loadIntercomImage(context, getAvatarImageRequestBuilder(context, avatar, appConfig).target(imageView).build());
    }

    public static ImageRequest.Builder getAvatarImageRequestBuilder(Context context, Avatar avatar, AppConfig appConfig) {
        Drawable placeHolderDrawable = getPlaceHolderDrawable(context, avatar, appConfig);
        return new ImageRequest.Builder(context).data(ThemeUtils.selectUrlForTheme(context, avatar.getImageUrl(), avatar.getImageDarkUrl())).placeholder(placeHolderDrawable).error(placeHolderDrawable).crossfade(true).transformations(new AvatarShapeTransformation(avatar.getShape()));
    }

    public static Drawable getPlaceHolderDrawable(Context context, Avatar avatar, AppConfig appConfig) {
        if (avatar.getInitials().isEmpty()) {
            return getDefaultDrawable(context, appConfig);
        }
        return getInitialsDrawable(avatar.getInitials(), appConfig);
    }

    public static AvatarInitialsDrawable getInitialsDrawable(String str, AppConfig appConfig) {
        return new AvatarInitialsDrawable(str.toUpperCase(), appConfig.getSecondaryColorDark());
    }

    public static AvatarDefaultDrawable getDefaultDrawable(Context context, AppConfig appConfig) {
        return new AvatarDefaultDrawable(context, appConfig.getSecondaryColorDark());
    }
}
