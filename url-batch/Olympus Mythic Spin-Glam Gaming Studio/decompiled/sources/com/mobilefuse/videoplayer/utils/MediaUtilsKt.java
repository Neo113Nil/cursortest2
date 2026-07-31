package com.mobilefuse.videoplayer.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.mobilefuse.videoplayer.model.VastBaseResource;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastCreative;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.mobilefuse.videoplayer.model.VastResourceType;
import com.mobilefuse.videoplayer.network.NetworkType;
import com.mobilefuse.videoplayer.network.NetworkUtils;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MediaUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\f\u001a\u00020\u0005\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0014\u001a\u00020\u0015\u001a4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\u000e0\bH\u0000\u001a,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\u000e0\b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001e0\"H\u0000\u001a0\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\b*\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¨\u0006$"}, d2 = {"convertFromDpToPixels", "", "context", "Landroid/content/Context;", "pixels", "", "convertFromPixelsToDp", "enqueueMediaFilesByCompatibility", "", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "mediaFiles", "", "containerSize", "getAllCompanionsFromVastCreatives", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "creatives", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "getScreenSizeAsDp", "getScreenSizeAsPixels", "removeMediaFilesWithHigherBitrate", "bitrateLimit", "", "selectEndCardCompanions", "companions", "maxCompanionsNumToSelect", "screenDensity", "", "sortMediaFilesByPlayerSizeProximity", "playerContainerSize", "usePixels", "", "getMultipleExplicitEndCardsOrSingle", "preferCompanionAds", "block", "Lkotlin/Function1;", "sortCompanionAdsByPlayerSizeProximity", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes.dex */
public final class MediaUtilsKt {
    public static final void convertFromPixelsToDp(@NotNull Context context, @NotNull int[] pixels) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        float f = resources.getDisplayMetrics().density;
        int length = pixels.length;
        for (int i = 0; i < length; i++) {
            pixels[i] = (int) ((pixels[i] / f) + 0.5f);
        }
    }

    public static final void convertFromDpToPixels(@NotNull Context context, @NotNull int[] pixels) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pixels, "pixels");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        float f = resources.getDisplayMetrics().density;
        int length = pixels.length;
        for (int i = 0; i < length; i++) {
            pixels[i] = (int) ((pixels[i] * f) + 0.5f);
        }
    }

    @NotNull
    public static final int[] getScreenSizeAsPixels(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return new int[]{point.x, point.y};
    }

    @NotNull
    public static final int[] getScreenSizeAsDp(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int[] screenSizeAsPixels = getScreenSizeAsPixels(context);
        convertFromPixelsToDp(context, screenSizeAsPixels);
        return screenSizeAsPixels;
    }

    @NotNull
    public static final List<VastMediaFile> enqueueMediaFilesByCompatibility(@NotNull Context context, @NotNull List<VastMediaFile> mediaFiles, @NotNull int[] containerSize) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(containerSize, "containerSize");
        NetworkType networkType = NetworkUtils.INSTANCE.getNetworkType(context);
        int i = 0;
        for (VastMediaFile vastMediaFile : mediaFiles) {
            if (vastMediaFile.getBitrate() == null || vastMediaFile.getBitrate().intValue() < 32) {
                z = false;
                i = 0;
                break;
            }
            if (vastMediaFile.getBitrate().intValue() > i) {
                i = vastMediaFile.getBitrate().intValue();
            }
        }
        z = true;
        if (networkType == NetworkType.MOBILE_5G) {
            return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, true);
        }
        if (networkType == NetworkType.WIFI) {
            return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, false);
        }
        if (networkType == NetworkType.MOBILE_4G) {
            if (!z || i < 2000) {
                return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, false);
            }
            ArrayList arrayList = new ArrayList(mediaFiles);
            List<VastMediaFile> removeMediaFilesWithHigherBitrate = removeMediaFilesWithHigherBitrate(arrayList, 2000);
            if (removeMediaFilesWithHigherBitrate.size() > 1) {
                CollectionsKt.sortWith(removeMediaFilesWithHigherBitrate, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$enqueueMediaFilesByCompatibility$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((VastMediaFile) t).getBitrate(), ((VastMediaFile) t2).getBitrate());
                    }
                });
            }
            List<VastMediaFile> sortMediaFilesByPlayerSizeProximity = sortMediaFilesByPlayerSizeProximity(context, arrayList, containerSize, false);
            sortMediaFilesByPlayerSizeProximity.addAll(removeMediaFilesWithHigherBitrate);
            return sortMediaFilesByPlayerSizeProximity;
        }
        if (networkType != null && networkType != NetworkType.UNKNOWN && networkType != NetworkType.MOBILE_2G && networkType != NetworkType.MOBILE_3G) {
            return sortMediaFilesByPlayerSizeProximity(context, mediaFiles, containerSize, false);
        }
        if (z) {
            if (mediaFiles.size() > 1) {
                CollectionsKt.sortWith(mediaFiles, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$enqueueMediaFilesByCompatibility$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((VastMediaFile) t).getBitrate(), ((VastMediaFile) t2).getBitrate());
                    }
                });
            }
        } else if (mediaFiles.size() > 1) {
            CollectionsKt.sortWith(mediaFiles, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$enqueueMediaFilesByCompatibility$$inlined$sortBy$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((VastMediaFile) t).getPixelsCount(), ((VastMediaFile) t2).getPixelsCount());
                }
            });
        }
        return mediaFiles;
    }

    private static final List<VastMediaFile> sortMediaFilesByPlayerSizeProximity(Context context, List<VastMediaFile> list, int[] iArr, boolean z) {
        Resources resources;
        DisplayMetrics displayMetrics;
        float f = 1.0f;
        if (!z && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = displayMetrics.density;
        }
        float f2 = iArr[0] / f;
        float f3 = iArr[1] / f;
        float f4 = f2 / f3;
        ArrayList arrayList = new ArrayList();
        for (VastMediaFile vastMediaFile : list) {
            if (vastMediaFile.getWidth() != null && vastMediaFile.getHeight() != null) {
                arrayList.add(new Pair(Float.valueOf((Math.abs(f2 - vastMediaFile.getWidth().intValue()) + Math.abs(f3 - vastMediaFile.getHeight().intValue())) * Math.abs(f4 - vastMediaFile.getSizeRatio())), vastMediaFile));
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$sortMediaFilesByPlayerSizeProximity$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Float) ((Pair) t).first, (Float) ((Pair) t2).first);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((VastMediaFile) ((Pair) it.next()).second);
        }
        return TypeIntrinsics.asMutableList(arrayList2);
    }

    @NotNull
    public static final List<VastMediaFile> removeMediaFilesWithHigherBitrate(@NotNull List<VastMediaFile> mediaFiles, int i) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        ArrayList arrayList = new ArrayList();
        for (VastMediaFile vastMediaFile : CollectionsKt.reversed(mediaFiles)) {
            if (vastMediaFile.getBitrate() != null && vastMediaFile.getBitrate().intValue() > i) {
                arrayList.add(vastMediaFile);
                mediaFiles.remove(vastMediaFile);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<VastCompanion> selectEndCardCompanions(@NotNull List<VastCompanion> companions, int i, @NotNull int[] containerSize, float f) {
        Intrinsics.checkNotNullParameter(companions, "companions");
        Intrinsics.checkNotNullParameter(containerSize, "containerSize");
        if (companions.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (containerSize.length != 2) {
            return CollectionsKt.emptyList();
        }
        return getMultipleExplicitEndCardsOrSingle(CollectionsKt.take(preferCompanionAds(preferCompanionAds(sortCompanionAdsByPlayerSizeProximity(companions, containerSize, f, true), new Function1() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$selectEndCardCompanions$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(invoke((VastCompanion) obj));
            }

            public final boolean invoke(@NotNull VastCompanion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                VastBaseResource resource = it.getResource();
                return (resource != null ? resource.getResourceType() : null) != VastResourceType.STATIC;
            }
        }), new Function1() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$selectEndCardCompanions$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(invoke((VastCompanion) obj));
            }

            public final boolean invoke(@NotNull VastCompanion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Intrinsics.areEqual(it.getRenderingMode(), SafeDKWebAppInterface.e);
            }
        }), i));
    }

    @NotNull
    public static final List<VastCompanion> getMultipleExplicitEndCardsOrSingle(@NotNull List<VastCompanion> getMultipleExplicitEndCardsOrSingle) {
        Intrinsics.checkNotNullParameter(getMultipleExplicitEndCardsOrSingle, "$this$getMultipleExplicitEndCardsOrSingle");
        List<VastCompanion> list = getMultipleExplicitEndCardsOrSingle;
        List arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((VastCompanion) obj).getRenderingMode(), SafeDKWebAppInterface.e)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = CollectionsKt.take(list, 1);
        }
        return arrayList;
    }

    @NotNull
    public static final List<VastCompanion> getAllCompanionsFromVastCreatives(@NotNull List<VastCreative> creatives) {
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        ArrayList arrayList = new ArrayList();
        for (VastCreative vastCreative : creatives) {
            if (!vastCreative.getCompanionList().isEmpty()) {
                arrayList.addAll(vastCreative.getCompanionList());
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<VastCompanion> sortCompanionAdsByPlayerSizeProximity(@NotNull List<VastCompanion> sortCompanionAdsByPlayerSizeProximity, @NotNull int[] playerContainerSize, float f, boolean z) {
        Intrinsics.checkNotNullParameter(sortCompanionAdsByPlayerSizeProximity, "$this$sortCompanionAdsByPlayerSizeProximity");
        Intrinsics.checkNotNullParameter(playerContainerSize, "playerContainerSize");
        if (z) {
            f = 1.0f;
        }
        float f2 = playerContainerSize[0] / f;
        float f3 = playerContainerSize[1] / f;
        float f4 = f2 / f3;
        ArrayList arrayList = new ArrayList();
        for (VastCompanion vastCompanion : sortCompanionAdsByPlayerSizeProximity) {
            if (vastCompanion.getWidth() != null && vastCompanion.getHeight() != null) {
                int intValue = vastCompanion.getWidth().intValue();
                if (vastCompanion.getAssetWidth() != null && vastCompanion.getAssetWidth().intValue() > 0) {
                    intValue = vastCompanion.getAssetWidth().intValue();
                }
                int intValue2 = vastCompanion.getHeight().intValue();
                if (vastCompanion.getAssetHeight() != null && vastCompanion.getAssetHeight().intValue() > 0) {
                    intValue2 = vastCompanion.getAssetHeight().intValue();
                }
                float f5 = intValue;
                float f6 = intValue2;
                arrayList.add(new Pair(Float.valueOf((Math.abs(f2 - f5) + Math.abs(f3 - f6)) * Math.abs(f4 - (f5 / f6))), vastCompanion));
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.mobilefuse.videoplayer.utils.MediaUtilsKt$sortCompanionAdsByPlayerSizeProximity$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Float) ((Pair) t).first, (Float) ((Pair) t2).first);
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((VastCompanion) ((Pair) it.next()).second);
        }
        return TypeIntrinsics.asMutableList(arrayList2);
    }

    @NotNull
    public static final List<VastCompanion> preferCompanionAds(@NotNull List<VastCompanion> preferCompanionAds, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(preferCompanionAds, "$this$preferCompanionAds");
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (VastCompanion vastCompanion : preferCompanionAds) {
            if (((Boolean) block.invoke(vastCompanion)).booleanValue()) {
                arrayList2.add(vastCompanion);
            } else {
                arrayList.add(vastCompanion);
            }
        }
        CollectionsKt.addAll(arrayList2, arrayList);
        return arrayList2;
    }
}
